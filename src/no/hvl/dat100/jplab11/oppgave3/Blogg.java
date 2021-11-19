package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.oppgave1.*;

public class Blogg {

	Innlegg[] innleggtabell;
	int nesteledig = 0;

	public Blogg() {

		innleggtabell = new Innlegg[20];

	}

	public Blogg(int lengde) {

		innleggtabell = new Innlegg[lengde];

	}

	public int getAntall() {

		return nesteledig;
		
	}

	public Innlegg[] getSamling() {

		return innleggtabell;

	}

	public int finnInnlegg(Innlegg innlegg) {

		for (int i = 0; i < nesteledig; i++) {

			if (innleggtabell[i].erLik(innlegg)) {

				return i;

			}

		}

		return -1;

	}

	public boolean finnes(Innlegg innlegg) {

		for (int i = 0; i < nesteledig; i++) {

			if (innleggtabell[i].erLik(innlegg)) {

				return true;

			}

		}

		return false;

	}

	public boolean ledigPlass() {

		return nesteledig < innleggtabell.length;

	}

	public boolean leggTil(Innlegg innlegg) {

		if (ledigPlass() && !finnes(innlegg)) {

			innleggtabell[nesteledig++] = innlegg;
			return true;

		} else {

			return false;

		}

	}

	public String toString() {

		String out = "";
		out += getAntall() + "\n";

		for (Innlegg i : innleggtabell) {
			if (i != null) {
				out += i.toString();
			} else {
				break;
			}
		}

		return out;

	}

	// valgfrie oppgaver nedenfor

	public void utvid() {

		int lengde = innleggtabell.length * 2;
		Innlegg[] mid = getSamling().clone();

		innleggtabell = new Innlegg[lengde];

		for (int i = 0; i < getAntall(); i++) {

			innleggtabell[i] = mid[i];

		}

	}

	public boolean leggTilUtvid(Innlegg innlegg) {

		if (!finnes(innlegg)) {

			if (getAntall() == innleggtabell.length) {

				utvid();
				leggTil(innlegg);

			} else {

				leggTil(innlegg);

			}

			return true;

		}

		return false;

	}

	public boolean slett(Innlegg innlegg) {

		if (finnes(innlegg)) {

			int i = finnInnlegg(innlegg);

			innleggtabell[i] = innleggtabell[--nesteledig];
			innleggtabell[nesteledig] = null;

		}

		return false;

	}

	public int[] search(String keyword) {

		int[] ider = new int[nesteledig];
		int pos = 0;

		for (Innlegg i : innleggtabell) {

			if (i.toString().contains(keyword)) {

				ider[pos++] = i.getId();

			}

		}

		return ider;

	}
}
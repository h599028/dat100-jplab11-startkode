package no.hvl.dat100.jplab11.oppgave1;

public abstract class Innlegg {

	private int id;
	private String bruker;
	private String dato;
	private int likes;

	public Innlegg() {

	}

	public Innlegg(int id, String bruker, String dato) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;

	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;

	}

	public String getBruker() {

		return bruker;

	}

	public void setBruker(String bruker) {

		this.bruker = bruker;

	}

	public String getDato() {

		return dato;

	}

	public void setDato(String dato) {

		this.dato = dato;

	}

	public int getId() {

		return id;

	}

	public void setId(int id) {

		this.id = id;

	}

	public int getLikes() {

		return likes;

	}

	public void doLike() {

		likes++;

	}

	public boolean erLik(Innlegg innlegg) {

		return innlegg.getId() == this.id;
		
	}

	@Override
	public String toString() {

		return getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		return String.format("\t\t<h2>%s@%s [%d]</h2>\n\t\t<br>\n", getBruker(), getDato(), getLikes());

	}

//	public abstract String getTekst();
}

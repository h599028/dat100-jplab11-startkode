package no.hvl.dat100.jplab11.oppgave2;

import no.hvl.dat100.jplab11.oppgave1.*;

public class Tekst extends Innlegg {

	String tekst;
	
	public Tekst () {
		
	}
	
	public Tekst(int id, String bruker, String dato, String tekst) {

		super(id, bruker, dato);
		this.tekst = tekst;
		
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		
		super(id, bruker, dato, likes);
		this.tekst = tekst;
		
	}
	
	public String getTekst() {

		return tekst;

	}

	public void setTekst(String tekst) {

		this.tekst = tekst;
	}

	@Override
	public String toString() {

		return "TEKST\n" + getId() + "\n" + getBruker() + "\n" + getDato() + "\n" + getLikes() + "\n" + getTekst() + "\n";

	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {

		return String.format("\t\t<h2>%s@%s [%d]</h2>\n\t\t<p>%s</p>\n\t\t<br>\n", getBruker(), getDato(), getLikes(), getTekst());
				
	}
}

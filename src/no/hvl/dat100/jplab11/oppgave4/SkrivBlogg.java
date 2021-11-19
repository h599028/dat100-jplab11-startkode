package no.hvl.dat100.jplab11.oppgave4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import no.hvl.dat100.jplab11.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {

		File file = new File(mappe + filnavn);
		
		try {
			
			PrintWriter writer = new PrintWriter(file);
			String text = samling.toString();
			
			writer.print(text);
			
			writer.close();
			
			return true;
			
		} catch (FileNotFoundException e) {
			return false;
		} finally {
		}

	}
}

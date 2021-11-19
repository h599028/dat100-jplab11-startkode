package no.hvl.dat100.jplab11.oppgave5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.*;
import no.hvl.dat100.jplab11.oppgave3.*;

import javax.swing.JOptionPane;

public class LesBlogg {

	private static String TEKST = "TEKST";
	private static String BILDE = "BILDE";

	public static Blogg les(String mappe, String filnavn) {

		Blogg blogg = new Blogg();

		File file = new File(mappe + filnavn);

		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));

			String[] line = new String[6];
			String type;
			int antallInnlegg = Integer.parseInt(reader.readLine());
			int n = 1;
			
			while (n <= antallInnlegg) {
				
				type = reader.readLine();
				
				if (type.equals(TEKST)) {
					
					for (int i = 0; i < 5; i++) {
						
						line[i] = reader.readLine();
						
					}
					
					blogg.leggTil(new Tekst(
									Integer.parseInt(line[0]), 
									line[1],
									line[2], 
									Integer.parseInt(line[3]), 
									line[4]));
					
				} else if (type.equals(BILDE)) {
					
					for (int i = 0; i < 6; i++) {
						
						line[i] = reader.readLine();
						
					}
					
					blogg.leggTil(new Bilde(
									Integer.parseInt(line[0]), 
									line[1], 
									line[2], 
									Integer.parseInt(line[3]), 
									line[4], 
									line[5]));
					
				}
				
				n++;

			}
			
			reader.close();

		} catch (Exception e) {

		}
		
		return blogg;

	}
}

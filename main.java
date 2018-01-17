//Inserite in un vettore 24 misurazioni di temperatura calcolare il valore medio
//Calcolare valore minimo e massimo con relativa ora

import java.io.*;
public class MediaTemperatura {
	public static void main (String args[])
	{
		//Dichiarazione variabili
		int v[];
		v = new int[24];
		int i, s = 0, min = 100, max = v[0], k = 0;
		float m;
		
		//Impostazione standard input
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		//Inserimento elementi nel vettore
		for (i=0; i<24; i++)
		{
			try {
				System.out.print("Inserisci misurazione n. " + i + ": ");
				String numeroLetto = tastiera.readLine();
				v[i] = Integer.valueOf(numeroLetto).intValue();
			}	
			catch (Exception e)
			{
				System.out.println("Il valore inserito non è corretto!");
				return;
			}
		}
		
		//Calcolo misurazione media
		for (i=0; i<24; i++)
		{
			s = s + v[i];
		}
		m = s / 24;
		System.out.println("La temperatura media misurata è di "+m+"° ");
		System.out.println();
		
		//Calcolo misurazione minima
		for (i=0; i<24; i++)
		{
			if (v[i] <= min)
			{
				min = v[i];
				k = i;
			}
		}
		System.out.println("La temperatura minima è di " + min + "°");
		System.out.println("Orario: "+ k);
		System.out.println();
		
		//Calcolo misurazione massima
		for (i=0; i<24; i++)
		{
			if (v[i] > max)
			{
				max = v[i];
				k = i;
			}
		}
		System.out.println("La temperatura massima è di " + max + "°");
		System.out.println("Orario: "+ k);
	}
}

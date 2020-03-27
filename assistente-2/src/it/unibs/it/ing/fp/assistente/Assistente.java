package it.unibs.it.ing.fp.assistente;

import java.io.*;

public class Assistente {
	
	public static void readme() {
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(new File("readme.txt")));
			String line = null;
			
			while((line =reader.readLine()) != null){
					System.out.println(line);
			}
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			}
	public static void writeme() {
		PrintWriter p = null;
		
		try {
			p = new PrintWriter (new File ("writeme.txt"));
			p.print("La stringa inserita verrà inserita nel file");
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			p.close();
		}
	}
}

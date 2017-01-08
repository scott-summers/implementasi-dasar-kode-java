import java.util.Scanner;

public class File6 {
	
	public static void main (String[] args) {
		
		System.out.println("<< XX untuk keluar >>");
		System.out.print("DNA: ");
		Scanner input = new Scanner (System.in);
		String dna = input.nextLine();
		
		while (!"XX".equals(dna)) { // perulangan terus dilanjutkan selama "XX" tidak sama dengan konten variabel dna
			if (!validasi(dna)) { // memvalidasi String dna menggunakan method validasi
				System.out.println("DNA tidak valid.\n");
				System.out.println("<< XX untuk keluar >>");
				System.out.print("DNA: ");
				dna = input.nextLine(); // mengambil input dari user
			} //end if
			else {
				int p = dna.length(); // menghitung panjang String dna
				int pA = dna.length() - dna.replace("A","").length(); // menghitung banyaknya A dalam String dna
				int pG = dna.length() - dna.replace("G","").length(); // menghitung banyaknya G dalam String dna
				int pC = dna.length() - dna.replace("C","").length(); // menghitung banyaknya C dalam String dna
				int pT = dna.length() - dna.replace("T","").length(); // menghitung banyaknya T dalam String dna
				System.out.println("Jumlah protein basa: "+p);
				System.out.println("Jumlah Adenin: "+pA);
				System.out.println("Jumlah Guanin: "+pG);
				System.out.println("Jumlah Cytosine: "+pC);
				System.out.println("Jumlah Timin: "+pT);
				
				// Proses transkripsi DNA ke RNA melalui proses replikasi lebih dahulu
				// double helix:   A <-> T    G <-> C
				// 		* A = Adenin, G = Guanin, C = Cytosine, T = Timin, U = Urasil
				// contoh: 
				// 	  DNA:--------------TGCAGA
				// 		* A menjadi T dan sebaliknya. Kemudian G menjadi C dan sebaliknya.
				//    Replikasi DNA:----ACGTCT
				// 		* T menjadi U
				//    RNA:--------------ACGUCU
				String a = dna.replace("A","1"); // replikasi DNA
				String b = a.replace("T","A"); // replikasi DNA
				String c = b.replace("G","2"); // replikasi DNA
				String d = c.replace("C","G"); // replikasi DNA
				String e = d.replace("1","T"); // replikasi DNA
				String f = e.replace("2","C"); // replikasi DNA
				String rna = f.replace("T","U"); // transkripsi RNA
				System.out.println("RNA: "+rna);
				
				System.out.println();
				System.out.println("<< XX untuk keluar >>");
				System.out.print("DNA: ");
				dna = input.nextLine();
			} //end else
		} //end while
		
		input.close();
		
	} //end main
	
	
	// validasi input apakah mengandung karakter AGCT atau tidak
	public static boolean validasi (String dna) {
		return dna.matches("[AGCT]*");
	}
	
} // end class

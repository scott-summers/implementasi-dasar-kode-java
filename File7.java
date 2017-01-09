// Demo program: mencari nilai terbesar, nilai terkecil, modus tunggal dan ganda
// dan nilai standar deviasi dari input berupa String

// cat: jumlah maksimal modus yang bisa dihitung hanya sampai 2 modus saja
// jika ada lebih dari 2 modus, hanya nilai modus pertama dan terakhir yang tersimpan

import java.util.Scanner;

public class File7 {
	
	public static void main (String[] args) {
	
		System.out.print("Masukkan angka (pisahkan dengan spasi): "); // Contoh: 5 4 3 1 2 3
		
		// mengambil input sbg String
		Scanner input = new Scanner(System.in);
		String bil = input.nextLine();
		input.close();
		
		// menghapus karakter spasi di dalam input dan menjadikannya sbg array1
		String[] pisah = bil.split(" ");
		
		
		// membuat array untuk konversi input (dari String) ke integer
		int[] array = new int[pisah.length];
		// konversi input ke integer
		for (int i=0; i<array.length; i++) {
			array[i] = Integer.valueOf(pisah[i]);
		}
		
		
		// Pembandingan untuk mencari bil terkecil
		int min = array[0];  // nilai min awal diinisialisasikan dg nilai elemen array pertama
		for (int i=0; i<array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}
		System.out.println("Angka paling kecil: " + min);
		
		
		// Pembandingan untuk mencari bil terbesar
		int max = array[0]; // nilai max awal diinisialisasikan dg nilai elemen array pertama
		for (int i=0; i<array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("Angka paling besar: " + max);
		
		
		// Pembandingan untuk mencari nilai modus
		int modus1 = 0, x = 0; // x akan digunakan sebagai total jumlah bilangan modus
		for (int i=0; i<array.length; i++) {
	        int h1 = 0; // h digunakan sebagai penanda -> jumlah munculnya bilangan atau elemen array
	        for (int j = 0; j < array.length; ++j) {
	            if (array[j] == array[i]) ++h1;
	            // elemen array[j] dan array[i] dibandingkan,
	            // jika sama maka nilai elemen h akan ditambah 1 pada perulangan berikutnya (bukan pada saat ini)  
	        }
	        if (h1 > x) { // jika total jumlah munculnya suatu bilangan > jumlah bilangan modus
	        	x = h1; // jumlah bilangan modus = jumlah munculnya bilangan tersebut
	        	modus1 = array[i]; // modus1 = elemen array tersebut (yang paling banyak muncul)
	        }
		}
		System.out.print("Modus: " + modus1);
		
		// Pembandingan untuk mencari nilai modus kedua (jika ada)
		int modus2 = 0;
		for (int i=0; i<array.length; i++) {
	        int h2 = 0;
	        for (int j = 0; j < array.length; ++j) {
	            if (array[j] == array[i] && array[j] != modus1) ++h2;
	            // && di sini digunakan untuk mengecualikan nilai modus1
	            // dalam penghitungan nilai modus2
	        }
	        if (h2 == x) { // jika total jumlah munculnya suatu bilangan > jumlah bilangan modus
	        	modus2 = array[i]; // modus2 = elemen array tersebut (yang paling banyak muncul) selain nilai modus1
	        }
	    }
		if (modus2 != 0) {
			System.out.print(" dan "+modus2);
		}
    	
		
		// Standar Deviasi
		// menghitung total bilangan
		double tot=0;
		for (int i=0; i<array.length; i++) {
			tot = tot+array[i];
		}
		
		// mencari rata-rata
		double rerata = tot/array.length;
		
		// menghitung rata-rata dikurangi bilangan ke-1 sampai bilangan ke-n,
		// kemudian total jumlahnya dipangkatkan dengan dua
		double p = 0;
		for (int i=0; i<array.length; i++) {
			double q1 = rerata - array[i];
			double q2 = Math.pow(q1,2); // pemangkatan
			p = p + q2;
		}
		
		// nilai standar deviasi
		double ak = p / (array.length - 1);
		double std = Math.sqrt(ak);
		
		System.out.printf("\nStandar deviasi = %.2f\n", std);	
		
	} //end main

} // end class

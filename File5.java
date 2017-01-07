// Pemisahan bilangan dengan menambahkan unit/satuan
// batas digit maksimal dari angka yang diinput = 7
// menggunakan exception class (try..catch statement) untuk karakter ilegal

import java.util.Scanner;
import java.util.InputMismatchException;

public class File5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in );
		boolean lanjutLoop = true; // untuk menentukan apakah diperlukan input ulang/lagi
		do {
			try {
				System.out.print("Masukkan bilangan (max 7 digit): ");
				int bil = sc.nextInt();
				int pjgBil = String.valueOf(bil).length();
				
				if (pjgBil>7) {
					System.out.println("Bilangan harus berupa digit, jml digit maksimal 7.\n");
					lanjutLoop = true; // input gagal; looping diulang
				} // end if
				else {
					int i=1, j=10; // i untuk pembagian, j untuk mod
					// menentukan nilai i yang sesuai
					for (int o=1; o<pjgBil; o++) {
						i=i*10;
					} // end for
					
					// menetapkan unit yg sesuai
					String[] s = new String [pjgBil];
					for (int x=0; x<pjgBil; x++) {
						String unit="";
						if (x==6) {unit = "jutaan";}
						if (x==5) {unit = "ratusan ribu";}
						if (x==4) {unit = "puluhan ribu";}
						if (x==3) {unit = "ribuan";}
						if (x==2) {unit = "ratusan";}
						if (x==1) {unit = "puluhan";}
						if (x==0) {unit = "satuan";}
						s[x]= unit;
					} // end for
					
					// memicu nilai k untuk bisa mencapai nilai pjgBil
					int k=0;
					for (int o=pjgBil-1; o>=0; o--) {
						k=k+1;
					} //end for

					// Mengubah nilai variabel bil menjadi array
					int[] array = new int [pjgBil];
					for (int o=0; o<pjgBil; o++) {
						array[o] = (bil / i % j);
						i=i/10;
					} //end for					
					
					// Mencetak bil per digit (sbg array)
					for (int o=0; o<pjgBil; o++) {
						System.out.print(array[o]);
						k--;
						System.out.printf(" %s, ", s[k]);
					} //end for
					lanjutLoop = false; // input sukses; end looping
				} // end else
			} // end try
			
			catch (InputMismatchException karakterIlegal) {
				sc.nextLine(); // mengabaikan input agar user bisa mencoba lagi
				System.out.println("Bilangan harus berupa digit, jml digit maksimal 7.\n");
			} // end catch
		
		} while (lanjutLoop); // end do...while
		sc.close();	

	} //end main
	
} //end class

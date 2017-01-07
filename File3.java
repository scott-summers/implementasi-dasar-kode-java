// Sorting dan Median

import java.util.Scanner;

public class File3 {

	public static void main(String[] args) {
		
		System.out.print("Masukkan beberapa bilangan: "); // misalkan 2 1 4 2 (pisahkan dengan spasi)
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		
		String[] s = input.split(" "); // memisah-misahkan string "input" ke dlm array "s" dengan 'spasi' sbg pemisah
		
		// Konversi String ke integer
		int[] a = new int[s.length];
		for (int i=0; i<a.length; i++) {
			a[i] = Integer.parseInt(s[i]); // konversi String ke integer (dari array s[] ke a[])
		} //end for
		
		// Insertion Sort
		for (int i=1; i < a.length; i++) {
			int copyArray = a[i];
			int j = i;
			while (j > 0 && copyArray < a[j-1]) {
				a[j] = a[j-1];
				j--;
			} //end while
	        	a[j] = copyArray;
		} //end for

   		 // menampilkan bilangan yg sudah diurutkan
		System.out.print("Bilangan setelah diurutkan: ");
		for (int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		} //end for
		
		// Median
		if (a.length%2==1) { //Median Ganjil
			int x = a.length/2;
			System.out.println("\nMed.Gj: "+a[x]);
		} // end if
		else { //Median Genap
			float x1 = (a[a.length/2]);
			float x2 = (a[(a.length/2)-1]);
			float x = (x1+x2)/2;
			System.out.println("\nMed.Gp: "+x);
		} // end else

	} // end main

} // end class

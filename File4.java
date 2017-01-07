// Pemisahan Bilangan

import java.util.Scanner;

public class File4 {
	
	public static void main(String[] args) {
	
		// input angka integer
		Scanner sc = new Scanner(System.in);
		System.out.print("Masukkan bilangan: ");
		int input = sc.nextInt();
		sc.close();

		int length = String.valueOf(input).length(); // hitung panjang digit integer sebagai String
		
		// PEMISAHAN
		// Inisialisasi x (untuk pembagian) menurut panjang string dari integer num
		int x=1, y=10; //x utk pembagian, y utk mod (lih catatan di bawah)
		for (int j=1; j<length; j++) {
			x=x*10;
		} //end for
		
		// Cetak num 'per digit'
		int[] array = new int [length];
		for (int i=0; i<length; i++) {
			array[i] = (input / x % y);
			x=x/10;
			System.out.println(array[i]);
		} //end for
		
	} //end main

} //end class

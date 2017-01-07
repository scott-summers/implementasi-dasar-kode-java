// Konversi Kilometer ke Mil
// dengan pembulatan dua angka di belakang koma

import java.text.DecimalFormat;
import java.util.Scanner;

public class File2 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("input angka (Kilometer): ");
		double input = sc.nextDouble();
		sc.close();

		// konversi input ke mil; 1 km = 1.60934;
		double inputKv = input*1.60934;
		
		// pembulatan dua angka di belakang koma dengan cara 1: Math.round
		double y = (Math.round(inputKv*100)/100.0);
		System.out.println("setara dengan " + y + " mil");

		// pembulatan dua angka di belakang koma dengan cara 2: DecimalFormat
		DecimalFormat df = new DecimalFormat("#.##");
		double z = Double.valueOf(df.format(inputKv));
		System.out.println("sama juga dengan " + z + " mil");
	
	}
	
}

import java.util.Scanner; // memanggil kelas Scanner dari paket java.util

//deklarasi kelas
public class File1 {

	// deklarasi main 
	public static void main(String[]args) {
	
		// inisialisasi objek Scanner
		Scanner sc = new Scanner(System.in);
		
		// mencetak String
		System.out.print("Masukkan kalimat: "); 
		
		// mengambil inputan dari user menggunakan variabel sc dari objek Scanner
		String input = sc.nextLine(); //gunakan .next() jika karakter setelah spasi (dari inputan) tidak ingin disertakan
		sc.close(); // menutup Scanner sc
		
		// mencetak kalimat + String inputan
		System.out.println("Selamat belajar java \"" + input + "\"!"); // \" untuk menampilkan tanda petik
			
	}
	
}

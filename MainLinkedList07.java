import java.util.Scanner;

public class MainLinkedList07 {
    public static void main(String[] args) {
        LinkedListMahasiswa07 llm = new LinkedListMahasiswa07();

        llm.tambahMahasiswa(new Mahasiswa07("101", "Alice", "2000-01-01"));
        llm.tambahMahasiswa(new Mahasiswa07("102", "Bob", "2000-02-02"));
        llm.tambahMahasiswa(new Mahasiswa07("103", "Charlie", "2000-03-03"));
        llm.tambahMahasiswa(new Mahasiswa07("104", "David", "2000-04-04"));

        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Cari Mahasiswa");
            System.out.println("4. Cetak Semua Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = scanner.nextLine();
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Tanggal Lahir: ");
                    String tglLahir = scanner.nextLine();
                    llm.tambahMahasiswa(new Mahasiswa07(nim, nama, tglLahir));
                    break;
                case 2:
                    System.out.print("NIM: ");
                    nim = scanner.nextLine();
                    llm.hapusMahasiswa(nim);
                    break;
                case 3:
                    System.out.print("NIM: ");
                    nim = scanner.nextLine();
                    Mahasiswa07 mhs = llm.cariMahasiswa(nim);
                    if (mhs != null) {
                        System.out.println(mhs);
                    } else {
                        System.out.println("Mahasiswa tidak ditemukan");
                    }
                    break;
                case 4:
                    llm.cetakSemuaMahasiswa();
                    break;
                case 0:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilihan != 0);

        scanner.close();
    }
}

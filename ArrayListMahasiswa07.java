import java.util.ArrayList;
import java.util.List;

public class ArrayListMahasiswa07 {
    private List<Mahasiswa07> listMahasiswa;

    public ArrayListMahasiswa07() {
        listMahasiswa = new ArrayList<>();
    }

    public void tambahMahasiswa(Mahasiswa07 mhs) {
        listMahasiswa.add(mhs);
    }

    public void hapusMahasiswa(String nim) {
        listMahasiswa.removeIf(mhs -> mhs.getNim().equals(nim));
    }

    public Mahasiswa07 cariMahasiswa(String nim) {
        for (Mahasiswa07 mhs : listMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                return mhs;
            }
        }
        return null;
    }

    public void cetakSemuaMahasiswa() {
        for (Mahasiswa07 mhs : listMahasiswa) {
            System.out.println(mhs);
        }
    }
}

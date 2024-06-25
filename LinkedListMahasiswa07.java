public class LinkedListMahasiswa07 {
    private Node07 head;

    public void tambahMahasiswa(Mahasiswa07 mhs) {
        Node07 newNode = new Node07(mhs);
        if (head == null) {
            head = newNode;
        } else {
            Node07 temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void hapusMahasiswa(String nim) {
        if (head == null) {
            return;
        }
        if (head.data.getNim().equals(nim)) {
            head = head.next;
            return;
        }
        Node07 temp = head;
        while (temp.next != null && !temp.next.data.getNim().equals(nim)) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }

    public Mahasiswa07 cariMahasiswa(String nim) {
        Node07 temp = head;
        while (temp != null) {
            if (temp.data.getNim().equals(nim)) {
                return temp.data;
            }
            temp = temp.next;
        }
        return null;
    }

    public void cetakSemuaMahasiswa() {
        Node07 temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

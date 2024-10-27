public class Main {
    public static void main(String[] args) {
        DoubleLinkedList prak = new DoubleLinkedList();
        prak.addLast("Nayla");
        prak.addLast("Nini");
        prak.addLast("Wira");
        prak.addLast("Ananta");
        prak.addLast("Salsa");
        prak.addLast("Raja");
        prak.addLast("Alfath");
        prak.addLast("Nopal");

        System.out.println("============================");
        System.out.println("Daftar Praktikan Kelompok 11");
        System.out.println("============================");
        prak.display();

        prak.remove("Wira");
        System.out.println("======================================");
        System.out.println("List Presensi Setelah Wira Tidak Hadir");
        System.out.println("======================================");
        prak.display();

        // Swap Nini with Alfath and Ananta with Raja
        prak.swapNodes("Nini", "Alfath");
        prak.swapNodes("Ananta", "Raja");

        System.out.println("====================================");
        System.out.println("List Presensi Setelah Dibalik Tengah");
        System.out.println("====================================");
        prak.display();

        prak.remove("Nayla");
        prak.remove("Nini");
        prak.remove("Ananta");
        prak.remove("Salsa");
        prak.remove("Raja");
        prak.remove("Alfath");
        prak.remove("Nopal");

        prak.addLast("Nopal");
        prak.addLast("Nini");
        prak.addLast("Ananta");
        prak.addLast("Salsa");
        prak.addLast("Raja");
        prak.addLast("Alfath");
        prak.addLast("Nayla");

        System.out.println("=============================");
        System.out.println("List Presensi Setelah Disusun Ulang");
        System.out.println("=============================");
        prak.display();
    }
}
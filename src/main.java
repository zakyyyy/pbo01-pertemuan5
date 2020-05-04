public class main {
    public static void main(String[] args) {
        Mouse mahasiswa1 = new Mouse();
        Mouse mahasiswa2 = new Mouse();

        mahasiswa1.KampusData();
        mahasiswa1.DataPribadi();
        mahasiswa1.userName = "Zaky";
        mahasiswa1.nilai = 100;

        System.out.println(mahasiswa1.nilai);
        mahasiswa1.Punch(mahasiswa2);
        System.out.println(mahasiswa1.nilai);
    }
}

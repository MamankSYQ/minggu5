package BruteForceDivideConquer;
public class MainMahasiswa {
    public static void main(String[] args) {
        Mahasiswa[] dataMhs = new Mahasiswa[8];

        dataMhs[0] = new Mahasiswa("Ahmad","220101001",2022,78,82);
        dataMhs[1] = new Mahasiswa("Budi","220101002",2022,85,88);
        dataMhs[2] = new Mahasiswa("Cindy","220101003",2021,90,87);
        dataMhs[3] = new Mahasiswa("Dian","220101004",2021,76,79);
        dataMhs[4] = new Mahasiswa("Eko","220101005",2023,92,95);
        dataMhs[5] = new Mahasiswa("Fajar","220101006",2020,88,85);
        dataMhs[6] = new Mahasiswa("Gina","220101007",2023,80,83);
        dataMhs[7] = new Mahasiswa("Hadi","220101008",2020,82,84);

        Mahasiswa mhs = new Mahasiswa();

        int utsTinggi = mhs.utsTertinggi(dataMhs, 0, dataMhs.length-1);
        int utsRendah = mhs.utsTerendah(dataMhs, 0, dataMhs.length-1);
        double rataUAS = mhs.ratauas(dataMhs);

        System.out.println("Nilai UTS tertinggi : "+utsTinggi);
        System.out.println("Nilai UTS terendah : "+utsRendah);
        System.out.println("Rata-rata nilai UAS : "+rataUAS);
    }
}

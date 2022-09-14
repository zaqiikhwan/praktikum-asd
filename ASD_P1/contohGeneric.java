package ASD_P1;

public class contohGeneric {
    public static void main(String[] args){
        //Membuat Instance dan Mendefinisikan Tipe Data String
        generic<String> nama = new generic<>();
        nama.setObjek("Ariz");
        System.out.printf("%-30s: %s\n", "Nama saya", nama.getObjek());

        //Membuat Instance dan Mendefinisikan Tipe Data Integer
        generic<Integer> umur = new generic<>();
        umur.setObjek(19);
        System.out.printf("%-30s: %s Tahun\n", "Usia Saya", umur.getObjek());

        //Membuat Instance dan Mendefinisikan Tipe Data Boolean
        generic<Boolean> kondisi = new generic<>();
        kondisi.setObjek(true);
        System.out.printf("%-30s: %s\n", "Saya Sedang Belajar Java", kondisi.getObjek());

        //Membuat Instance dan Mendefinisikan Tipe Data Float
        generic<Float> IPK = new generic<>();
        IPK.setObjek(3.5f);
        System.out.printf("%-30s: %s\n", "Nilai IPK Saya", IPK.getObjek());

        //Membuat Instance dan Mendefinisikan Tipe Data Character
        generic<Character> Karakter = new generic<>();
        Karakter.setObjek('A');
        System.out.printf("%-30s: %s\n", "Huruf Awalan Nama Saya Adalah", Karakter.getObjek());
    }
}

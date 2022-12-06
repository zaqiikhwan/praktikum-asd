package Materi.ASD_P1;
//import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // linkedlist using library from java
//        LinkedList<Object> l1 = new LinkedList<>();
//        l1.add(1);
//        l1.add("aaa");
//        l1.add(true);
//        l1.add(0.34);
//        l1.add('a');
//
//        l1.remove(0);
//        l1.add(1, 2);
//        l1.addFirst(1);
//        l1.addLast(false);
//
//        for (Object output : l1) {
//            System.out.println(output);
//        }

        Mahasiswa new1 = new Mahasiswa("Nama", "SI", 1);
        new1.Perkenalan();
        System.out.println(new1.Umur());
        System.out.println(new1.sebutUmur());
    }
}

class Mahasiswa {
    String nama, prodi;
    int age;

    public Mahasiswa(String nama, String prodi, int age) {
        this.nama = nama;
        this.prodi = prodi;
        this.age = age;
    }

    public void Perkenalan() {
        System.out.println("nama saya: " + nama);
    }

    public int Umur() {
        return age;
    }

    public String sebutUmur() {
        return "umurnya: " + age + " tahun";
    }
}
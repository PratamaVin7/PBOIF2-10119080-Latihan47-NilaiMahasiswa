/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119080.latihan47.nilaimahasiswa;

/**
 *
 * @author
 * NAMA     : Kevin Pratama Sinaga
 * KELAS    : PBOIF2
 * NIM      : 10119080
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * (OBJECT ORIENTED) Nilai Mahasiswa
 */
public class PBOIF210119080Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        NilaiMahasiswa nilaimahasiswa = new NilaiMahasiswa();
        
        nilaimahasiswa.setNilaiQuiz(75.0);
        nilaimahasiswa.setNilaiUts(45.0);
        nilaimahasiswa.setNilaiUas(34.0);
        
        double quiz = nilaimahasiswa.getNilaiQuiz();
        double uts = nilaimahasiswa.getNilaiUts();
        double uas = nilaimahasiswa.getNilaiUas();
        double nilaiAkhir = nilaimahasiswa.nilaiAkhir(quiz, uts, uas);
        char index = nilaimahasiswa.index(nilaiAkhir);
        // Konversi dari char ke string
        String str = String.valueOf(index);
        String keterangan = nilaimahasiswa.keterangan(str);
        
        System.out.println("QUIZ\t\t = " + quiz);
        System.out.println("UTS\t\t = " + uts);
        System.out.println("UAS\t\t = " + uas);
        System.out.println();
        System.out.println("Nilai Akhir\t = " + nilaiAkhir);
        System.out.println();
        System.out.println("Index = " + str);
        System.out.println("Keterangan = " + keterangan);
    }
    
}
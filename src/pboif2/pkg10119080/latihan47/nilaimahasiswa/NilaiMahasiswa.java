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
class NilaiMahasiswa {
    private double uts, uas, quiz, nilaiAkhir;
    
    public double getNilaiUts() {
        return this.uts;
    }
    
    public void setNilaiUts(double uts) {
        this.uts = uts;
    }
    
    public double getNilaiUas() {
        return this.uas;
    }
    
    public void setNilaiUas(double uas) {
        this.uas = uas;
    }
    
    public double getNilaiQuiz() {
        return this.quiz;
    }
    
    public void setNilaiQuiz(double quiz) {
        this.quiz = quiz;
    }
    
    public double nilaiAkhir(double quiz, double uts, double uas) {
        return (0.20 * quiz) + (0.30 * uts) + (0.50 * uas);
    }
    
    public char index(double nilaiAkhir) {
        char index;
        
        if (nilaiAkhir >= 80 && nilaiAkhir <= 100) {
            index = 'A';
        } else if (nilaiAkhir > 68 && nilaiAkhir <= 80) {
            index = 'B';
        } else if (nilaiAkhir > 56 && nilaiAkhir <= 68) {
            index = 'C';
        } else if (nilaiAkhir > 45 && nilaiAkhir <= 56) {
            index = 'D';
        } else {
            index = 'E';
        }
        return index;
    }
    
    public String keterangan(String index) {
        String keterangan;
        
        keterangan = switch (index) {
            case "A" -> "Sangat Baik";
            case "B" -> "Baik";
            case "C" -> "Cukup";
            case "D" -> "Kurang";
            default -> "Sangat Kurang";
        };
        return keterangan;
    }
    
}
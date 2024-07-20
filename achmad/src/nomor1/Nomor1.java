/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nomor3;
import java.util.Scanner;
/**
*
* @author keukeufinkanursanda
*/
public class Nomor3 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
String namaSiswa;
double nilaiPertandinganI, nilaiPertandinganII, nilaiPertandinganIII, nilaiRataRata;
 System.out.println("PROGRAM HITUNG NILAI RATA-RATA");
 System.out.print("Nama Siswa: ");
 namaSiswa = scanner.nextLine();
 System.out.print("Nilai Pertandingan I: ");
 nilaiPertandinganI = scanner.nextDouble();
 System.out.print("Nilai Pertandingan II: ");
 nilaiPertandinganII = scanner.nextDouble();
 System.out.print("Nilai Pertandingan III: ");
 nilaiPertandinganIII = scanner.nextDouble();
 // Menghitung nilai rata-rata
 nilaiRataRata = (nilaiPertandinganI + nilaiPertandinganII + nilaiPertandinganIII) / 3;
 // Menentukan hadiah
 String hadiah;
 if (nilaiRataRata >= 85) {
 hadiah = "laptop";
 } else if (nilaiRataRata >= 70) {
 hadiah = "Seperangkat Uang sebesar Rp. 500,000";
 } else {
 hadiah = "hadiah Hiburan";
 }
 System.out.printf("Siswa yang Bernama %s Memperoleh nilai rata-rata %.2f dari hasil
perlombaan yang diikutinya dan mendapatkan %s.\n", namaSiswa, nilaiRataRata, hadiah);
 }
}
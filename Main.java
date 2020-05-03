import koneksi.Database2;
import model.Dosen;
import model.Mahasiswa;
import model.MataKuliah;

public class Main{
 public static void main(String [] args){
  System.out.println("Ini program main");
  Database2.hubungkan();
  Dosen.tampilaninfo();
  Mahasiswa.tampilaninfo();
  MataKuliah.tampilaninfo();
 }
}

/**
 *
 * @author Mas Syahrul
 */
public class Pewarisan {

public static void main(String[] args) {
  //       INIT CLASS Mahasiswa
 Mahasiswa Syahrul = new Mahasiswa("Syahrul", 201951226, 
                        "Prak PBO", "MTI505A");
 Mahasiswa Imron = new Mahasiswa("Imron", 201951226, 
                         "Teori PBO", "MTI504A");
       
       
       System.out.print("Pembayaran telah dikonfirmasi oleh " 
               + Syahrul.getNama() 
               + " NIM " + Syahrul.getNim() 
               + " Matkul " + Syahrul.getMatkul() 
               + " " + Syahrul.getNomerMatkul() 
               + "\n"
       );
       
       System.out.print("Pembayaran telah dikonfirmasi oleh " 
               + Imron.getNama() 
               + " NIM " + Imron.getNim() 
               + " Matkul " + Imron.getMatkul() 
               + " " + Imron.getNomerMatkul()
       );
    }
}


/**
 *
 * @author Mas Syahrul 
 */
public class Mahasiswa extends Matkul {
    String namaMahasiswa;
    int nim;
    
    public Mahasiswa(String nama, 
            int nim, 
            String matkul, 
            String nomerMatkul) {
        this.nomerMatkul = nomerMatkul;
        this.namaMatkul = matkul;
        this.namaMahasiswa = nama;
        this.nim = nim;
    }
    
    public String getNama() {
        return namaMahasiswa;
    }
    
    public int getNim() {
        return nim;
    }
    
    public String getMatkul() {
        return this.namaMatkul;
    }
    
    public String getNomerMatkul() {
        return this.nomerMatkul;
    }
}

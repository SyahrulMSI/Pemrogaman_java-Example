/**
 *
 * @author Mas Syahrul
 */
public class Karyawan extends Tunjangan {
    String nama;
    int nip;
    String tgl_diterima;
    int gaji_pokok;
    int total_gaji;
    String jabatan;
    String tunjangan;
    
    public Karyawan(String nama_kar, 
            int nip_kar, 
            String tgl_diterima_kar, 
            int gaji_pokok_kar, 
            String jabatan_kar, 
            String fungsional_kar, 
            String transport_kar) {
//        super(jenisTunjangan);
        
        this.nama = nama_kar;
        this.gaji_pokok = gaji_pokok_kar;
        this.nip = nip_kar;
        this.tgl_diterima = tgl_diterima_kar;
        this.total_gaji = gaji_pokok_kar;
        
 if(jabatan_kar != null) {
  total_gaji = total_gaji + this.getTunjanganJabatan(jabatan_kar);
  }
 if(fungsional_kar != null) {
  total_gaji = total_gaji + this.getTunjanganFungsional(fungsional_kar);
        }
 if(transport_kar != null) {
  total_gaji = total_gaji + this.getTunjanganTransport(transport_kar);
        }
    }
}

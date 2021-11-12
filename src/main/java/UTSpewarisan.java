/**
 * @author Mas Syahrul
 */
public class UTSpewarisan {

 public static void main(String[] args) {
     Karyawan AhmadMuzani = new Karyawan("Ahmad Muzani", 
     600654651, "21 Juni 2011", 2500000, "Wakil Dekan 3", "Lektor", null);
     Karyawan MuryaArifBasuki = new Karyawan("Murya Arif Basuki", 
     600652512, "11 Juli 2015", 3500000, null, "Asisten Ahli", null);        
     Karyawan RirinDwiAryanti = new Karyawan("Ririn Dwi Aryanti", 
     600679546, "8 Mei 2011", 1500000, null, null, "Akademik");

        System.out.println("Karyawan dengan nama " + 
                AhmadMuzani.nama + 
                " NIP " + AhmadMuzani.nip + 
                " terdaftar pada tanggal " + 
                AhmadMuzani.tgl_diterima + 
                " memiliki gaji pokok Rp." + 
                AhmadMuzani.gaji_pokok + 
                " menjabat sebagai Wakil Dekan 3 memiliki total gaji " + 
                AhmadMuzani.total_gaji
        );
        System.out.println("Karyawan dengan nama " + 
                MuryaArifBasuki.nama + " NIP " + 
                MuryaArifBasuki.nip + " terdaftar pada tanggal " + 
                MuryaArifBasuki.tgl_diterima + " memiliki gaji pokok Rp." + 
                MuryaArifBasuki.gaji_pokok + " memiliki total gaji " + 
                AhmadMuzani.total_gaji
        );
        System.out.println(
                "Karyawan dengan nama " + 
                RirinDwiAryanti.nama + 
                " NIP " + RirinDwiAryanti.nip + 
                " terdaftar pada tanggal " + 
                RirinDwiAryanti.tgl_diterima + 
                " memiliki gaji pokok Rp." + 
                RirinDwiAryanti.gaji_pokok + 
                " memiliki total gaji " + 
                RirinDwiAryanti.total_gaji
        );
    }
}

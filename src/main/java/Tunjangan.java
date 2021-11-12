

/**
 *
 * @author Mas Syahrul
 */
public class Tunjangan {
    String jenisTunjangan;
    
    int nominalTunjangan;
    
    public void setNamaTunjangan(String tunjangan) {
        jenisTunjangan = tunjangan;
    }
    
    public void getTunjangan(String jenisTunjangan) {
        if(jenisTunjangan == "Jabatan") {
            getTunjanganJabatan(jenisTunjangan);
        } else if(jenisTunjangan == "Fungsional") {
            getTunjanganFungsional(jenisTunjangan);
        } else if(jenisTunjangan == "Transport") {
            getTunjanganTransport(jenisTunjangan);
        }
    }
    
    public int getTunjanganJabatan(String jenis) {
        if(jenis == "Dekan") {
            nominalTunjangan = 1500000;
            return 1500000;
        } else if(jenis == "Wakil Dekan 1") {
            nominalTunjangan = 1000000;
            return 1000000;
        } else if(jenis == "Wakil Dekan 2") {
            nominalTunjangan = 1000000;
            return 1000000;
        } else if(jenis == "Wakil Dekan 3") {
            nominalTunjangan = 1000000;
            return 1000000;
        } else if(jenis == "Kaprodi") {
            nominalTunjangan = 900000;
            return 900000;
        }
        
        return 0;
    }
    
    public int getTunjanganFungsional(String jenis) {
        if(jenis == "Asisten Ahli") {
            nominalTunjangan = 250000;
            return 250000;
        } else if(jenis == "Lektor") {
            nominalTunjangan = 500000;
            return 500000;
        } else if(jenis == "Lektor Kepala") {
            nominalTunjangan = 900000;
            return 900000;
        } else if(jenis == "Guru Besar") {
            nominalTunjangan = 2000000;
            return 2000000;
        }
        
        return 0;
    }
    
    public int getTunjanganTransport(String jenis) {
        if(jenis == "Akademik") {
            nominalTunjangan = 250000;
            return 250000;
        } else if(jenis == "Keuangan") {
            nominalTunjangan = 300000;
            return 300000;
        }
        
        return 0;
    }
}

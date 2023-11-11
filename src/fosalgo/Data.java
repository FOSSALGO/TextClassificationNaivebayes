package fosalgo;

public class Data {
    String judul;
    String namaDosenPembimbing;
    String[] tokens = null;

    public Data(String judul, String namaDosenPembimbing) {
        this.judul = judul;
        this.namaDosenPembimbing = namaDosenPembimbing;
    }
    
    public String[] tokenizing(){
        if(judul!=null&&judul.length()>0){
            tokens = judul.split("\\s+");
        }
        return tokens;
    }
    
    
}

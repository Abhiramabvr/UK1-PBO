public class HewanJurrasic {
    private String nama;

    public HewanJurrasic(String nama){
        this.nama = nama;
    }

    public HewanJurrasic() {
    }

    public String suara(){
        return "Suara Dinosaurus belum ditemukan!";
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
}

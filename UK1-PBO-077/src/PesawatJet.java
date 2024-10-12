public class PesawatJet {
        private String merk;


    public PesawatJet(String merk) {
        this.merk = merk;
    }

    public String info() {
        return "Informasi Pesawat Not found!";
    }

    public String getMerk() {
    return merk;
    }

    public void setMerk(String merk){
        this.merk = merk;
    }
}

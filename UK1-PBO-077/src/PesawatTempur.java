public class PesawatTempur extends PesawatJet{
    public PesawatTempur(String merk){
        super(merk);
    }

    @Override
    public String info(){
        return "Pesawat Tempur Merek " + getMerk() + ".";
    }
}

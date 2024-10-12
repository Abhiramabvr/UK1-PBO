public class Main {
    public static void main(String[] args) {
            trex Trex = new trex("T-REX");
            megalodon Megalodon = new megalodon("Megalodon");
            PesawatTempur pesawatTempur = new PesawatTempur("Sukhoi SU-35");

        System.out.println(Trex.getNama() + " Memiliki Suara : " + Trex.suara() + "\n");
        System.out.println(Megalodon.getNama() + " Memiliki Suara : " + Megalodon.suara() + "\n");
        System.out.println(pesawatTempur.info());

    }
}
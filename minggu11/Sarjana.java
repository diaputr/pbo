package minggu11;
public class Sarjana extends Mahasiswa implements ICumlaude, IBerprestasi {
    public Sarjana(String nama) {
        super(nama);
    }
    @Override
    public void salamKenal() {
        super.kuliahDiKampus(); 
    }
    @Override
    public void lulus() {
        System.out.println("Aku sudah menyelesaikan SKRIPSI");
    }
    @Override
    public void meraihIPKTinggi() {
        System.err.println("IPK-ku lebih dari 3,51");
    }
    
    @Override
    public void membuatPublikasiIlmiah() {
        System.out.println("Saya telah menjuarai kompetisi NASIONAL");
    }

    @Override
    public void menjuaraiKompetisi() {
        System.out.println("Saya menerbitkan artikel di jurnal NASIONAL");
    }
}
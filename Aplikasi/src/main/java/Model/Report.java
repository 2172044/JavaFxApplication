package Model;

public class Report {
    private Integer TglPembelian;
    private String NoFaktur;
    private String NoPelanggan;
    private String NamaPelanggan;
    private Integer Jumlahtagihan;
    private String UntukPembayaran;

    public Integer getTglPembelian() {
        return TglPembelian;
    }

    public void setTglPembelian(Integer tglPembelian) {
        TglPembelian = tglPembelian;
    }

    public String getNoFaktur() {
        return NoFaktur;
    }

    public void setNoFaktur(String noFaktur) {
        NoFaktur = noFaktur;
    }

    public String getNoPelanggan() {
        return NoPelanggan;
    }

    public void setNoPelanggan(String noPelanggan) {
        NoPelanggan = noPelanggan;
    }

    public String getNamaPelanggan() {
        return NamaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        NamaPelanggan = namaPelanggan;
    }

    public Integer getJumlahtagihan() {
        return Jumlahtagihan;
    }

    public void setJumlahtagihan(Integer jumlahtagihan) {
        Jumlahtagihan = jumlahtagihan;
    }

    public String getUntukPembayaran() {
        return UntukPembayaran;
    }

    public void setUntukPembayaran(String untukPembayaran) {
        UntukPembayaran = untukPembayaran;
    }
}
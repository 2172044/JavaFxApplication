package Model;



public class Property {
    private String NamaProperty ;
    private String Lokasi ;
    private Float  Harga ;
    private String LuasBangunan;
    private  String JenisProperty;
    private  Integer Bedrooms;
    private  Integer JumlahKamarMandi;
    private  Integer TahunPembuatanbangunan;
    private  String Detail;
    private String Gambar ;

    public String getNamaProperty() {
        return NamaProperty;
    }

    public void setNamaProperty(String namaProperty) {
        NamaProperty = namaProperty;
    }

    public String getLokasi() {
        return Lokasi;
    }

    public void setLokasi(String lokasi) {
        Lokasi = lokasi;
    }

    public Float getHarga() {
        return Harga;
    }

    public void setHarga(Float harga) {
        Harga = harga;
    }

    public String getLuasBangunan() {
        return LuasBangunan;
    }

    public void setLuasBangunan(String luasBangunan) {
        LuasBangunan = luasBangunan;
    }





    public Integer getJumlahKamarMandi() {
        return JumlahKamarMandi;
    }

    public void setJumlahKamarMandi(Integer jumlahKamarMandi) {
        JumlahKamarMandi = jumlahKamarMandi;
    }

    public Integer getTahunPembuatanbangunan() {
        return TahunPembuatanbangunan;
    }

    public void setTahunPembuatanbangunan(Integer tahunPembuatanbangunan) {
        TahunPembuatanbangunan = tahunPembuatanbangunan;
    }

    public String getDetail() {
        return Detail;
    }

    public void setDetail(String detail) {
        Detail = detail;
    }

    public String getGambar() {
        return Gambar;
    }

    public void setGambar(String gambar) {
        Gambar = gambar;
    }

    public String getJenisProperty() {
        return JenisProperty;
    }

    public void setJenisProperty(String jenisProperty) {
        JenisProperty = jenisProperty;
    }

    public Integer getBedrooms() {
        return Bedrooms;
    }

    public void setBedrooms(Integer bedrooms) {
        Bedrooms = bedrooms;
    }
}

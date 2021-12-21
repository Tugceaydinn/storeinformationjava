
public class Magaza implements Imagaza{
	private int fiyat;
	private String renk;
	private String kategori;
	
	
	public Magaza() {
		fiyat=99999; renk="xxxx"; kategori="xxxxx"; //Fabrika ayarları verilmiş
		
	}
	public Magaza(int fiyat1, String renk1, String kategori1) {
		fiyat=fiyat1;
		renk=renk1;
		kategori=kategori1;
	}
	
	public void setUrun(int fiyat1, String renk1, String kategori1) {
	fiyat=fiyat1;
	renk=renk1;
	kategori=kategori1;
	
	}
	public void print() {
		System.out.println("Fiyat:"+fiyat+"Renk:"+renk+"Kategori:"+kategori);
	}
	public void setFiyat(int fiyat) {
		this.fiyat=fiyat;
		
	}
	public void setRenk(String renk) {
		this.renk=renk;
		
	}
	public void setKategori(String k) {
		kategori=k;
		
	}
	public int getFiyat(){
		return fiyat;
	}
	public String getRenk() {
		return renk;
		
	}
	public String getKategori() {
		return kategori;
	}
	public class Aksesuar extends Magaza{
		private String sekil;

		public String getSekil() {
			return sekil;
		}

		public void setSekil(String sekil) {
			this.sekil = sekil;
		}
	public boolean compare (Magaza b) {
		if(this.fiyat()>b.fiyat())
			return true;
		else
			return false;
	}
	@Override
	public int fiyat() {
		
		return 0;
	}
	@Override
	public String kategori() {
		
		return null;
	}
	@Override
	public String renk() {
		
		return null;
	}
	
}
	@Override
	public int fiyat() {
		
		return 0;
	}
	@Override
	public String kategori() {
		
		return null;
	}
	@Override
	public String renk() {
		
		return null;
	}
	@Override
	public boolean compare(Magaza b) {
		
		return false;

}
}
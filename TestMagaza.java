
public class TestMagaza {
	public static void main(String args[]) {
		Magaza b1=new Magaza(60,"kýrmýzý","kazak");
		b1.print();
		Magaza b2;
		b2=new Magaza(50,"siyah","etek");
		b2.print();
		
		 System.out.println("****");
		
  	  Magaza a1= new Magaza();
		 a1.setKategori("etek");
	         a1.setRenk("siyah");
	         a1.setFiyat(50);
	         
	         System.out.println("Kategori="+a1.getKategori());
	         System.out.println("Renk="+a1.getRenk());
	         System.out.println("Fiyat="+a1.getFiyat());
	         
	         System.out.println("***");
	         
	         System.out.println("Kategori="+b1.getKategori());
	         System.out.println("Renk="+b1.getRenk());
	         System.out.println("Fiyat="+b1.getFiyat());
	         
	         System.out.println("***");
	         
	         Magaza a2 = new Magaza();
	         Magaza.Aksesuar c1 = a2.new Aksesuar();
	         c1.setFiyat(35);
	         c1.setKategori("günes gozlügü");
	         c1.setRenk("kahverengi");
	         c1.setSekil("oval");
	         
	         System.out.println("Kategori="+c1.getKategori());
	         System.out.println("Rengi="+c1.getRenk());
	         System.out.println("Fiyati="+c1.getFiyat());
	         System.out.println("Sekli="+c1.getSekil());
	         
	         
	         System.out.println("***");
	        
	
		if (b2.compare(b1))
			System.out.println("Eteðin fiyatý kazaktan fazladýr.");
		else
			System.out.print("Kazaðýn fiyatý etekten fazladýr.\n\n");
		
		      System.out.println("***");
		
		Stok x1= new Stok();
		x1.stokDurumu();
		
		Stok etek= new Etek();
		Stok kazak=new Kazak();
		
		etek.stokDurumu();
		kazak.stokDurumu();
		
		



	}
}

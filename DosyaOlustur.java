import java.io.File;
import java.io.IOException;

public class DosyaOlustur {
	 public DosyaOlustur(String URL){
		 File f = new File(URL);
		 try {
			 if(!f.exists()){ // eðer dosya yoksa
			 f.createNewFile(); // dosyamýzý oluþturur.
			 System.out.println(f.getName()+ " adlý dosya Oluþturuldu..");
			 }else{
			 System.out.println("Dosya olduðundan oluþturma iþlemi yapýlmayacaktýr. ");
			 }
			 } catch (IOException e) { // hata yakalama
			 e.printStackTrace();
			 }
			 }
			

}

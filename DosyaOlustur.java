import java.io.File;
import java.io.IOException;

public class DosyaOlustur {
	 public DosyaOlustur(String URL){
		 File f = new File(URL);
		 try {
			 if(!f.exists()){ // e�er dosya yoksa
			 f.createNewFile(); // dosyam�z� olu�turur.
			 System.out.println(f.getName()+ " adl� dosya Olu�turuldu..");
			 }else{
			 System.out.println("Dosya oldu�undan olu�turma i�lemi yap�lmayacakt�r. ");
			 }
			 } catch (IOException e) { // hata yakalama
			 e.printStackTrace();
			 }
			 }
			

}

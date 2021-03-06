import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResource {
	static void createFile(String filePath) {
		File file =new File(filePath);
		FileWriter fw=null;
		try {                                                                 //checked exceptions
			if(file.createNewFile()){
				System.out.println("file creates...");
			fw=new FileWriter(file);
			fw.write("Hello this is sample data");
			}
		} catch (IOException e) {
			System.out.println("Exception Raised in File Creation");
			
			e.printStackTrace();
		}
		finally{
			try{
				if(fw!=null){
					fw.close();
				}
			}
			catch(IOException e){
				System.out.println("Error During File Close");
			}
		}
	}
	
	
	/*static void createFile2(String filePath){
		File file = new File(filePath);
		//FileWriter fw  = null;
		
		try {
			if(file.createNewFile()){
				System.out.println("File Created...");
				try(FileWriter fw = new FileWriter(file)){
					fw.write("Hello this is Sample Data");
				}
				
				
				
			}
		} catch (IOException e) {
			System.out.println("Exception Raised in File Creation");
		}
		/*finally{
			try {
				if(fw!=null){
				fw.close();
				}
			} catch (IOException e) {
				System.out.println("Error During File Close");
			}
		}
	}	*/
	
	public static void main(String[] args) {
		createFile("F:\\Test999.txt");
	}

}

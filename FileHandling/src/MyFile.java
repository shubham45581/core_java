import java.io.File;
import java.io.IOException;

public class MyFile {

	public static void main(String[] args) { 
    File file=new File("F:\\tayal\\sn\\st\\ns");
    file.mkdirs();
    try {
    	/*if(file.exists()){
    		file.delete();
    		File f=new File("F:\\tayal\\sn\\st\\ns");
    		file.renameTo(f);
    		System.out.println("file rename");
    	}
    	else{*/
    		File g=new File("F:\\tayal\\sn\\st\\ns\\a.txt");
		g.createNewFile();
		System.out.println("File Created");
    	//}
	} catch (IOException e) {
		e.printStackTrace();
	}

	}

}

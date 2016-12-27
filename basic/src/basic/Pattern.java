package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Pattern {
	//int i;
	int j;

	public static void main(String[] args) throws NumberFormatException, IOException {
		int i;
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter size");
		int size=Integer.parseInt(reader.readLine());
		for(i=1;i<=size;i++){
			System.out.println("*");
		}
		System.out.println();
		for(i=1;i<=size;i++){
		System.out.println("*");
		}
	}

}

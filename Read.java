package vocTest;
import java.util.*;
import java.io.*;
public class Read {

	public static void main(String[] args) throws FileNotFoundException {
		
		File file =new File("voc.txt");
		Scanner cout = new Scanner(new FileInputStream(file));
		Scanner cin = new Scanner(System.in);
		String [] eng = new String [1001];
		boolean [] judge = new boolean [1001];
		
		int start=0;
		while(cout.hasNext()) {
			eng[start]=cout.next();
			start++;
		}
		
		while(cin.hasNext()) {
			String n=cin.next();
			
			int random = (int) (Math.random()*142)+1;
			
			if(!judge[random]) {
				System.out.println(eng[random].charAt(0)+"_____"+eng[random].charAt(eng[random].length()-1));
				String m=cin.next();
				System.out.println(eng[random]);
				judge[random]=true;
			}
		}
	}

}

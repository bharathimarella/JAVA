import java.io.BufferedReader;

import java.io.FileReader;


public class fileread {
	private static BufferedReader br;

	public static void main(String[] args){
		/**
		 * filereader object & bufferreader is created to read the stream of data from the file
		 */
		try{
			FileReader fr=new FileReader("C:\\Users\\bharathi\\Desktop\\Hello\\new.txt");
			br = new BufferedReader(fr);
			System.out.println("reading lins from the file....  "+br.readLine());
		}catch(Exception e){}
	}

}

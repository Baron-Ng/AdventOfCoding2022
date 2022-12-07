import java.util.*;
import java.io.*;

public class Part1{
	public static HashMap<String, Integer> cd (String directory){
		Scanner sc = new Scanner (System.in);
		HashMap<String, Integer> dir = new HashMap <>();
		while (sc.hasNextLine()){
			String s = sc.hasNextLine();
			String i = s.split (" ");
			while (i[0] != '$'){
				if (i[0].equals("dir")){
					// make another hashmap????
				}
				int size = Integer.parseInt(i[0]);
				int name = i[1];
				dir.put(name, size);
			}
			}

		}
	}
} // might be better to just detect when there is a number and add it to a total sum instead

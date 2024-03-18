
import java.io.*;
import java.util.*;

class GFG {

	static void traverseString(String str)
	{
		
		for (int i = 0; i < str.length(); i++) {

			
			System.out.print(str.charAt(i) + " ");
		}
	}

	public static void main(String[] args)
	{
		String str = "GeeksforGeeks";

		traverseString(str);
	}
}

package me.arpitag.core.utilities;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

import org.antlr.v4.runtime.ANTLRFileStream;

public class MoveStream {

	public int skip(File fis2){
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(fis2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
		
		int count = 0;
		
		String line = null;
		
		try {
			while((line = reader.readLine()) != null){
				//System.out.println(line + " " + line.length());
				if(line.toLowerCase().contains("create or replace"))
					break;
				else
					count += line.length();
			}
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println("Seek index is: " + count);
		
		return count;
	}
}

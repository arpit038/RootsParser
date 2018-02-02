package me.arpitag.plsqlparser.driver;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;

public class FileContentMatcher {
	
	private ArrayList<String> paths = new ArrayList<String>();
	private int found = 0;
	private int notFound = 0;
	private HashMap<String,Integer> extension = new HashMap<String,Integer>();
	private String array1[] = {"pls","fmb","mmb","sql","pc","h","sh","ksh","lib","cfg","seq","pkb","pks","xml","java","jsff"};
	private String array[] = {"pls","fmb","mmb","sql"};
	private String textToMatch;
	
	public boolean checkFormat(String fileName) {
		String s = FilenameUtils.getExtension(fileName);
		if(extension.get(s) != null) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void showFiles(File[] files) throws IOException {
		
	    for (File file : files) {
	        if (file.isDirectory()) {
	        	if(file.getName().equals(".svn")||file.getName().equals("Hotfix"))
	        		continue;
	            showFiles(file.listFiles()); // Calls same method again.
	        } else {
	        	if(checkFormat(file.getName()))
	        		checkOccurance(file);
	        }
	    }
	}
	
	public void checkOccurance(File file) throws IOException {
		String content = FileUtils.readFileToString(file);
		Pattern p = Pattern.compile(textToMatch,Pattern.CASE_INSENSITIVE);
		Matcher m = p.matcher(content);
		if(m.find()) {
			paths.add(file.getAbsolutePath());
			found++;
		}
		else
			notFound++;
		
	}
	
	public ArrayList<String> getFilePaths(File path,String matchString) throws IOException {
		
		setExtension();
		
		textToMatch = matchString;
		showFiles(path.listFiles());
		return paths;
	}

	public void setExtension() {
		int p=0;
		for(String s: array) {
			extension.put(s, p++);
		}
	}

	public String getTextToMatch() {
		return textToMatch;
	}

	public void setTextToMatch(String textToMatch) {
		this.textToMatch = textToMatch;
	}
}
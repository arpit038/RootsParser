package me.arpitag.plsqlparser.driver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.commons.io.FilenameUtils;
import org.json.JSONObject;

public class Driver {

	private File path = new File("D://RMS/Code/RMS 14.1.x/");
	private ArrayList<String> listOfMatchedFiles;
	private String textToMatch = "ITEM_LOC_SOH";
	private ArrayList<String> listofFormsFiles;
	private ArrayList<String> listofPackageSpecFiles;
	private ArrayList<String> listofSqlScripts;
	
	
	public void getFilePaths() throws IOException {
		FileContentMatcher fcm = new FileContentMatcher();
		fcm.setTextToMatch(textToMatch);
		listOfMatchedFiles = fcm.getFilePaths(path,textToMatch);
	}
	
	public JSONObject getJSONResponse() throws Exception {
		
		FindTargetFunctions ftf = new FindTargetFunctions();
		ftf.setTextToMatch(textToMatch);
		
		Iterator<String> iter = listOfMatchedFiles.iterator();
		System.out.println(listOfMatchedFiles.size());
		while(iter.hasNext()) {
			String str=  iter.next();
			
			String extension = FilenameUtils.getExtension(str);
			
			if(extension.equalsIgnoreCase("pls")) {
				if(str.endsWith("s.pls"))
					listofPackageSpecFiles.add(str);
				else
					ftf.handlePackages(str);
			}
			else if(extension.equalsIgnoreCase("fmb") || extension.equalsIgnoreCase("mmb"))
				listofFormsFiles.add(str);
			else if(extension.equalsIgnoreCase("sql"))
				listofSqlScripts.add(str);
		}
		
		if(listofFormsFiles.size()>0)
			ftf.handleForms(listofFormsFiles);
		
		if(listofPackageSpecFiles.size()>0)
			ftf.handlePackageSpecs(listofPackageSpecFiles);
		
		if(listofSqlScripts.size()>0)
			ftf.handleSqlScripts(listofSqlScripts);
		
		return ftf.getRootJson();
	}
	
	public void printFilePaths() {
		Iterator<String> iter = listOfMatchedFiles.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public static void main(String[] args) throws Exception {
		
		long l1 = System.currentTimeMillis();
		Driver driver = new Driver();
		driver.getFilePaths();
		
		driver.listofFormsFiles = new ArrayList<>();
		driver.listofPackageSpecFiles = new ArrayList<>();
		driver.listofSqlScripts = new ArrayList<>();
		
		JSONObject result = driver.getJSONResponse();

		System.out.println();
		System.out.println(result.toString());
		
		l1 = System.currentTimeMillis() - l1;
		System.out.println("time"+l1);
	}
}

package me.arpitag.plsqlparser.driver;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.io.FilenameUtils;
import org.jdom2.Document;
import org.jdom2.Element;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import me.arpitag.core.plsqlLexer;
import me.arpitag.core.plsqlParser;
import me.arpitag.core.utilities.MoveStream;
import me.arpitag.listeners.SimpleListener;

public class FindTargetFunctions {
	
	private String textToMatch="";
	private JSONObject rootJson = new JSONObject();
	private JSONArray rootArray = new JSONArray();

	public String getTextToMatch() {
		return textToMatch;
	}

	public void setTextToMatch(String textToMatch) {
		this.textToMatch = textToMatch;
	}
	
	public void handlePackages(String file) throws Exception{
		ANTLRFileStream fis = new ANTLRFileStream(file);
		MoveStream moveStream = new MoveStream();
		int skip = moveStream.skip(new File(file));
		fis.seek(skip);
		
		plsqlLexer lexer = new plsqlLexer(fis);
		lexer.removeErrorListeners();
		
		Document document = new Document();
		document.setRootElement(new Element("ROOT"));
		
		Element element = new Element("LINK");
		element.addContent(file);
		document.getRootElement().addContent(element);
		
		CommonTokenStream tokens = new CommonTokenStream(lexer);
		plsqlParser parser = new plsqlParser(tokens);
		parser.removeErrorListeners();
		
		SimpleListener simpleListener = new SimpleListener(parser, document.getRootElement());
		simpleListener.setTextToMatch(textToMatch);

		ParseTreeWalker walker = new ParseTreeWalker();
		walker.walk(simpleListener, parser.compilation_unit());
		
		
		Element root = document.getRootElement();

		List<Element> children = root.getChildren();
		
		
		String name,content;
		JSONObject json = new JSONObject();
		JSONArray array_function = new JSONArray();
		JSONArray array_proc = new JSONArray();

		for(Element child : children){
			name = child.getName();
			content = child.getText();
			if(name.equalsIgnoreCase("link") || name.equalsIgnoreCase("name")) {
				content = content.replaceAll("\\\\", "/");
				json.put(name, content);
			}
			else if(name.equalsIgnoreCase("function"))
				array_function.put(content);
			else if(name.equalsIgnoreCase("procedure"))
				array_proc.put(content);
		}
		json.put("function", array_function);
		json.put("procedure", array_proc);
		
		rootArray.put(json);
		rootJson.put("packages", rootArray);
		
	}
	
	public JSONObject getRootJson() {
		return rootJson;
	}

	public void handlePackageSpecs(ArrayList<String> list) throws JSONException {
		
		JSONArray array = createDocument(list);
	
		rootJson.put("packageSpecs", array);
	}

	public void handleForms(ArrayList<String> list) throws JSONException {
		
		JSONArray array= createDocument(list);
		
		rootJson.put("forms", array);
		
	}
	
	public void handleSqlScripts(ArrayList<String> list) throws JSONException {

		JSONArray array= createDocument(list);
		
		rootJson.put("sqlScripts", array);
	}
	
	public JSONArray createDocument(ArrayList<String> list) throws JSONException {
		
		rootArray = new JSONArray();
		JSONObject json = new JSONObject();
		
		for(String entry: list) {
			json.put("NAME", FilenameUtils.getName(entry));
			entry = entry.replaceAll("\\\\", "/");
			json.put("LINK", entry);
			rootArray.put(json);
		}
		
		return rootArray;
	}
}
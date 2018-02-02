package me.arpitag.listeners;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.antlr.v4.runtime.tree.ParseTree;
import org.jdom2.Element;

import me.arpitag.core.plsqlBaseListener;
import me.arpitag.core.plsqlParser;
import me.arpitag.core.plsqlParser.BodyContext;
import me.arpitag.core.plsqlParser.Create_function_bodyContext;
import me.arpitag.core.plsqlParser.Create_packageContext;
import me.arpitag.core.plsqlParser.Create_procedure_bodyContext;
import me.arpitag.core.plsqlParser.Function_specContext;
import me.arpitag.core.plsqlParser.Package_bodyContext;
import me.arpitag.core.plsqlParser.Package_nameContext;
import me.arpitag.core.plsqlParser.Package_specContext;
import me.arpitag.plsqlparser.driver.Driver;
import me.arpitag.plsqlparser.driver.FindTargetFunctions;

public class SimpleListener extends plsqlBaseListener{

	private plsqlParser parser;
	private Element rootElement;
	private Element parent;
	private Element childElement;
	private  String textToMatch;
	private boolean flag= false;
	private boolean name_flag= false;
	
	public String getTextToMatch() {
		return textToMatch;
	}

	public void setTextToMatch(String textToMatch) {
		this.textToMatch = textToMatch.replaceAll(" ", "");
	}


	public SimpleListener(plsqlParser parser, Element rootElement) {
		this.parser = parser;
		this.rootElement = rootElement;
		this.parent = rootElement;
		setSimpleListenr(this);
	}
	
	public SimpleListener(Element rootElement) {
		this.rootElement = rootElement;
		this.parent = rootElement;
	}
	
	public boolean checkTextToMatchOccurance(String body){
		Pattern pattern = Pattern.compile(textToMatch,Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(body);
        if(matcher.find())
      		return true;
      	else
      		return false;
	}
	
//	@Override
//	public void enterBody(BodyContext ctx) {
//		// TODO Auto-generated method stub
//		super.enterBody(ctx);
//		if(flag)
//		{
//			StringBuilder builder = new StringBuilder();
//			SimpleListener.deepParse(builder, ctx);
//			
//			Element element = new Element("FUNCTION-BODY");
//			element.addContent(builder.toString());
//			rootElement.addContent(element);
//		}
//	}
	
	
	@Override
	public void enterPackage_body(Package_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterPackage_body(ctx);
		
		Element element = new Element("NAME");
		element.addContent(ctx.package_name().get(0).getText());
		rootElement.addContent(element);
		rootElement = element;
	}
	
	@Override
	public void exitPackage_body(Package_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.exitPackage_body(ctx);
		rootElement = parent;
	}
	
	@Override
	public void enterCreate_function_body(Create_function_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterCreate_function_body(ctx);
		flag = false;
		if(checkTextToMatchOccurance(ctx.getText()))
		{
			Element element = new Element("FUNCTION");
			element.addContent(ctx.function_name().getText());
			rootElement.addContent(element);
			flag = true;
		}
	}
	
	@Override
	public void exitCreate_function_body(Create_function_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.exitCreate_function_body(ctx);
		//System.out.println("Exiting function");
		flag=false;
	}
	
	@Override
	public void enterCreate_procedure_body(Create_procedure_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.enterCreate_procedure_body(ctx);
		flag = false;
		if(checkTextToMatchOccurance(ctx.getText()))
		{
			Element element = new Element("PROCEDURE");
			element.addContent(ctx.procedure_name().getText());
			rootElement.addContent(element);
			flag=true;
		}
	}
	
	@Override
	public void exitCreate_procedure_body(Create_procedure_bodyContext ctx) {
		// TODO Auto-generated method stub
		super.exitCreate_procedure_body(ctx);
		flag=false;
	}
	
	@Override
	public void enterFunction_spec(Function_specContext ctx) {
		// TODO Auto-generated method stub
		super.enterFunction_spec(ctx);
		if(checkTextToMatchOccurance(ctx.getText())) {
			Element element = new Element("FUNCTION");
			element.addContent(ctx.function_name().getText());
			rootElement.addContent(element);
			rootElement = element;
			flag = true;
		}
	}
	
	@Override
	public void exitFunction_spec(Function_specContext ctx) {
		// TODO Auto-generated method stub
		super.exitFunction_spec(ctx);
		if(flag) {
			rootElement = parent;
			flag = false;
		}
	}
	
	public static void deepParse(StringBuilder builder, ParseTree node){
		
		if(node.getChildCount()==0){
			builder.append(node.getText() + " ");
			return;
		}
		
		for(int i = 0; i < node.getChildCount(); i++){
			deepParse(builder, node.getChild(i));
		}
	
	}
	
	private void addToXml(Element element, Element root, String data){
		element.addContent(data);
		root.addContent(element);
	}
	
//	@Override
//	public void enterPackage_call(Package_callContext ctx) {
//		// TODO Auto-generated method stub
//		super.enterPackage_call(ctx);
//		Element element = new Element("PACKAGE-CALL");
//		element.addContent(ctx.getText());
//		rootElement.addContent(element);
//	}
//	
//	@Override
//	public void enterFunction_call(Function_callContext ctx) {
//		// TODO Auto-generated method stub
//		super.enterFunction_call(ctx);
//		Element element = new Element("FUNCTION-CALL");
//		element.addContent(ctx.getText());
//		rootElement.addContent(element);
//	}
}

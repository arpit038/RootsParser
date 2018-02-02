package me.arpitag.core.utilities;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

public class DuplicateNodeRemover {

	public Document removeDuplicates(Document document) {
		
		treeParser(document.getRootElement(), new HashSet<CustomElement>());
		return document;
	}
	
	public void treeParser(Element root, Set<CustomElement> set) {
		Iterator<Element> iterator = root.getChildren().iterator();
		while(iterator.hasNext()) {
			Element element = iterator.next();
			treeParser(element, new HashSet<CustomElement>());
			if(!set.add(new CustomElement(element))) {
				iterator.remove();
			}
		}
	}
	
	/*
	 * Two nodes are equal if their string outputs are equal. CustomElement equal
	 * method uses this fact.
	 */
	
	public static class CustomElement{
		private Element element;

		public CustomElement(Element element) {
			this.element = element;
		}
		
		@Override
		public boolean equals(Object obj) {
			// TODO Auto-generated method stub
			if(!(obj instanceof CustomElement))
				return false;
			
			CustomElement ce2 = (CustomElement)obj;
			String output1 = new XMLOutputter().outputString(ce2.getElement());
			String output2 = new XMLOutputter().outputString(this.getElement());
			
			return output1.equals(output2);
		}
		
		public Element getElement() {
			return element;
		}
		
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 1;
		}
		
	}
}

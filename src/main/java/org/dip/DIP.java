package org.dip;

public class DIP {
	public static void main(String[] args) {
		Editor pythonEditor= new PythonEditor();
		IDE ide= new IDE(pythonEditor);
		ide.editCode();
		Editor javaEditor= new JavaEditor();
		IDE ide2= new IDE(javaEditor);
		ide2.editCode();;		
	}
}

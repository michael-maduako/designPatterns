package org.dip;

public class IDE {
	private Editor editor;
	
	public IDE(Editor editor) {
		this.editor=editor;
	}
	
	public void editCode() {
		this.editor.edit();
	}
}

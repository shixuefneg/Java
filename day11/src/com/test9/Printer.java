package com.test9;

/**
 * 打印机
 *
 */
public class Printer {
	//用对象作为属性
	private InkBox inkBox;
	private Paper paper;
	
	public InkBox getInkBox() {
		return inkBox;
	}
	public void setInkBox(InkBox inkBox) {
		this.inkBox = inkBox;
	}
	public Paper getPaper() {
		return paper;
	}
	public void setPaper(Paper paper) {
		this.paper = paper;
	}
	
	/**
	 * 打印
	 */
	public void print(){
		inkBox.printInk();
		paper.printPaper();
	}
}

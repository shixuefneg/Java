package com.test9;

/**
 * ��ӡ��
 *
 */
public class Printer {
	//�ö�����Ϊ����
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
	 * ��ӡ
	 */
	public void print(){
		inkBox.printInk();
		paper.printPaper();
	}
}

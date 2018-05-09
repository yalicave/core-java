package com.yali.day10;

public class MatrixExample {

	public static void main(String[] args) {
		MatrixDisplay d = new MatrixDisplay();
		d.doit();
		d.display();
	}
}
class MatrixDisplay{
	int r = 3;
	int c = 3;
	int[][] a = new int[r][c];
	void doit(){
		int count =0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				a[i][j]=++count;
			}
		}
	}
	
	void display(){
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				System.out.print(a[i][j]+"-");
			}
			System.out.println();
		}
	}
}

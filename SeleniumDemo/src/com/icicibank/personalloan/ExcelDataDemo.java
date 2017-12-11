package com.icicibank.personalloan;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ExcelDataDemo {

	public void main(String[] args) throws BiffException, IOException {
		File f = new File("/Users/vadlakondamadhu/Desktop");
		Workbook w = Workbook.getWorkbook(f);
		Sheet s = w.getSheet("Sheet1");
		
		int rows = s.getRows();
		int coloumns = s.getColumns();
		System.out.println(rows);
		System.out.println(coloumns);
		
		String inputData [] [] = new String [rows] [coloumns];
		
		for (int i=0;i< rows;i++){
			for(int j =0; j<coloumns;j++){
				Cell c = s.getCell(j,i);
				inputData [i][j] = c.getContents();
				System.out.println(inputData [i][j]);
			}
		}
		
		
}
}

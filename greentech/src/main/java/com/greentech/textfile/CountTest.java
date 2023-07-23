package com.greentech.textfile;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class CountTest {
	static String readtxtno;
	public static int txtFileNumber() throws IOException, FileNotFoundException {
		PropertyConfigurator.configure("D:/xls2mdb/log4j.properties");
		Logger rootLogger = Logger.getRootLogger();
		Logger logger = Logger.getLogger(CountTest.class);
		String strFilePath = "D://xls2mdb//CounMarker//Config_rowcount.txt";
		FileInputStream fin = new FileInputStream(strFilePath);
		DataInputStream din = new DataInputStream(fin);
		readtxtno = din.readLine();
		int i = Integer.parseInt(readtxtno.trim());
		din.close();
		return i;
	
	}

	static int UpdatedNumberInTextFile() throws IOException {
		PrintWriter out = new PrintWriter("D://xls2mdb//CounMarker//Config_rowcount.txt");
		return ReadingConfigDataFromExcelSheet.updateRowNum;
	}
}

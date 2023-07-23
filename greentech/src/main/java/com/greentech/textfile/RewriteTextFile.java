package com.greentech.textfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class RewriteTextFile {

	public static void modifyFile(String filePath, int newReadRowNum) {
		PropertyConfigurator.configure("D:/xls2mdb/log4j.properties");
		Logger rootLogger = Logger.getRootLogger();
		Logger logger = Logger.getLogger(RewriteTextFile.class);
		File fileToBeModified = new File(filePath);
		FileWriter writer;
		try {
			writer = new FileWriter(fileToBeModified);
			BufferedWriter bw = new BufferedWriter(writer);
			bw.write(String.valueOf(newReadRowNum));
			bw.close();
		} catch (IOException e) {
			logger.error(e);
		}
	}
}

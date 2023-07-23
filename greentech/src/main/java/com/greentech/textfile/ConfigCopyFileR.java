package com.greentech.textfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class ConfigCopyFileR {
	static File infile = new File("D:\\xls2mdb\\DM262-678470\\CSS PRIME A.txt");
	public static void copyFile() {
		PropertyConfigurator.configure("D:/xls2mdb/log4j.properties");
		Logger rootLogger = Logger.getRootLogger();
		Logger logger = Logger.getLogger(ConfigCopyFileR.class);
		FileInputStream instream = null;
		FileOutputStream outstream;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
			File outfile = new File("D:\\xls2mdb\\Pasted\\CSS PRIME A_" + infile.lastModified() + ".txt");
			instream = new FileInputStream(infile);
			outstream = new FileOutputStream(outfile);
			byte[] buffer = new byte[1024];
			int length;
			while ((length = instream.read(buffer)) > 0) {
				outstream.write(buffer, 0, length);
			}
		
			logger.info("File copied successfully!!");
			instream.close();
			outstream.close();
		} catch (IOException ioe) {
			logger.error(ioe);
		}
	}
}

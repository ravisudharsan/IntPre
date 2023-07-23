package com.greentech.textfile;

import java.awt.Button;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class ReadingConfigDataFromExcelSheet {
	public String inFileXlsx = "D://xls2mdb//Pasted//CSS PRIME A_" + ConfigCopyFileR.infile.lastModified() + ".txt";
	static int updateRowNum;
	static String write;

	static void loadConfigMethod() throws ParseException {
		ReadingConfigDataFromExcelSheet a = new ReadingConfigDataFromExcelSheet();
		int newReadRowNum = 0;
		PropertyConfigurator.configure("D:/xls2mdb/log4j.properties");
		Logger rootLogger = Logger.getRootLogger();
		Logger logger = Logger.getLogger(ReadingConfigDataFromExcelSheet.class);
		try {
			File in = new File(a.inFileXlsx);
			BufferedReader bReader = new BufferedReader(new FileReader(in));
			LineNumberReader lCount = new LineNumberReader(new FileReader(a.inFileXlsx));
			lCount.skip(Long.MAX_VALUE);
			int lastReadRowNum = rowCount();
			newReadRowNum = lCount.getLineNumber();
			logger.info("lastReadRowNum: " + lastReadRowNum);
			logger.info("newReadRowNum: " + newReadRowNum);

			for (int i = 0; i <= newReadRowNum; ++i) {
				String data = bReader.readLine();

				if (i < lastReadRowNum) {
					continue;
				}

				try {
					String[] entireText = data.split("\\|");
					String barCodeNumber = entireText[0];
					String bDate = entireText[1];
					@SuppressWarnings("deprecation")
					Date scannedDate = new Date(bDate);
					java.sql.Date sqlDate = new java.sql.Date(scannedDate.getTime());
					String databaseURL = "jdbc:ucanaccess://D://xls2mdb//MDBData.mdb";
					Connection connection = DriverManager.getConnection(databaseURL);
					String sql = "INSERT INTO CSS PRIME A (BarcodeNumber, ScannedDate) VALUES (?, ?)";
					PreparedStatement preparedStatement = connection.prepareStatement(sql);
					preparedStatement.setString(1, barCodeNumber);
					preparedStatement.setDate(2, (sqlDate));
					int count = preparedStatement.executeUpdate();
					if (count > 1) {
						logger.info("A row has been inserted successfully.");
					}
					connection.close();
				} catch (SQLException | NullPointerException ex) {
					logger.error(ex);
				}
			}
			lCount.close();
			bReader.close();
			in.delete();
			RewriteTextFile.modifyFile("D://xls2mdb//CounMarker//Config_rowcount.txt", newReadRowNum);
		} catch (IOException e) {
			logger.error(e);
		}
	}

	static int rowCount() throws IOException {
		File file = new File("D://xls2mdb//CounMarker//Config_rowcount.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		int count = 0;
		while ((st = br.readLine()) != null)
			count = Integer.parseInt(st.trim());
		br.close();
		return count;

	}
}

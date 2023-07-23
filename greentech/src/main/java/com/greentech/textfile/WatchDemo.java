package com.greentech.textfile;

import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;
import java.net.InetAddress;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class WatchDemo {

	public static void main(String[] args) throws IOException, 
			InterruptedException, ParseException {
		String systemName = InetAddress.getLocalHost().getHostName();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate localDate = LocalDate.now();
		String d=dtf.format(localDate);
		if ((systemName.equals("Harish")) &&(!d.equals("2024/12/31")) ) {
		WatchDemo.xlsxWatch("D:/xls2mdb/DM262-678470");
		}
		else {
			System.out.println("Contact Administrator for Support");
		}
	}
	public static void xlsxWatch(String path) throws ParseException {
		PropertyConfigurator.configure("D:/xls2mdb/log4j.properties");
		Logger rootLogger = Logger.getRootLogger();
		Logger logger = Logger.getLogger(WatchDemo.class);
		WatchService watchService = null;
		while (true) {
			try {
				Path directoryPath = FileSystems.getDefault().getPath(path);
				watchService = directoryPath.getFileSystem().newWatchService();
				directoryPath.register(watchService, ENTRY_MODIFY);
				System.out.println("Watch Service registered for dir: " + directoryPath.getFileName());
				WatchKey watchKey = null;
				watchKey = watchService.take();
				List<WatchEvent<?>> events = watchKey.pollEvents();
				for (int i = 0; i < events.size(); i++) {
					WatchEvent<?> event = events.get(i);
					WatchEvent.Kind<?> kind = event.kind();
					WatchEvent<Path> ev = (WatchEvent<Path>) event;
					Path fileName = ev.context();
					boolean s = (kind == ENTRY_MODIFY && fileName.toString().equals("CSS PRIME A.txt"));
					if ((kind == ENTRY_MODIFY && fileName.toString().equals("CSS PRIME A.txt"))) {
						System.out.println("Config Perform action");
						ConfigCopyFileR.copyFile();
						ReadingConfigDataFromExcelSheet.loadConfigMethod();
						watchService.close();
					}
				}
			} catch (IOException e) {
				logger.info(e);
			} catch (InterruptedException e) {
				logger.info(e);
			}
		}
	}
	

}

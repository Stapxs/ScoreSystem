package Features;

import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SysClass {
	
	public static class SysData {
		public static int uid ;
		public static String uname;
		public static Connection conn;
	}
	
	public static void printLog(String log) {
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
    	System.out.println("["+ df.format(new Date()) + "] " + log);
	}
	
	public static void printErr(String err) {
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
    	System.err.println("["+ df.format(new Date()) + "] " + err);
	}
}

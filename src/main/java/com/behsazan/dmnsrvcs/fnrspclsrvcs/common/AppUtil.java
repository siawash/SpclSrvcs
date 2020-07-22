package com.behsazan.dmnsrvcs.fnrspclsrvcs.common;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.GsonBuilder;
public class AppUtil {
		
private static Calendar cal = Calendar.getInstance();
	
	private static Gson gson = new GsonBuilder().excludeFieldsWithModifiers(Modifier.TRANSIENT).create();
	
	public static <T> T fromJson(String json, Class<T> classOfT) {
		return gson.fromJson(json, classOfT);
	}
	
	public static String toJson(Object object) {
		return gson.toJson(object);
	}

	public static JsonElement toJsonElement(Object object) {
		return gson.fromJson(gson.toJson(object), JsonElement.class);
	}
	
	public static String get_Date() {
		return cal.get(Calendar.YEAR) + "-" + (cal.get(Calendar.MONTH) < 10 ? "0" + cal.get(Calendar.MONTH) : cal.get(Calendar.MONTH)) + "-" + cal.get(Calendar.DATE);
	}
	
	public static String get_Time() {	
		return cal.get(Calendar.HOUR_OF_DAY) + ":" + (cal.get(Calendar.MINUTE) < 10 ? "0" + cal.get(Calendar.MINUTE) : cal.get(Calendar.MINUTE)) + ":" + cal.get(Calendar.SECOND);
	}
	 
	public static String get_TimeZone() {
		return "IRDT";
	}
	
	public static int get_DayOfWeek() {
		return cal.get(Calendar.DAY_OF_WEEK);
	}

	public static boolean isNullOrEmpty(String value) {
		return value == null || value.isEmpty();
	}
	
    public static String convertBytesTo1256(byte[] bytes) {
        if (bytes == null || bytes.length == 0) {
            return "";
        }
        String result = "";
        try { result = new String(bytes, "Cp1256"); }
        catch(Exception e){result = "";}
        return result.replace((char) 1740, (char) 1610).replace((char) 1705, (char) 1603).trim();
    }

    private static Integer[] cp1256 = { 1662, 1670, 1580, 1581, 1582, 1607, 1593, 1594, 1601, 1602, 1579, 1589, 1590, 1711, 1705, 1605, 1606, 1578, 1575, 1604, 1576, 1587, 1588, 1608, 1574, 1583, 1584, 1585, 1586, 1591, 1592, 1563, 1548, 1613, 1612, 1611, 1600, 1570, 1617, 1616, 1615, 1614, 1567, 1569, 1571, 1573, 1572, 1688, 1610, 1577, 1740 };
    private static int[] cp1252     = { 129, 141, 204, 205, 206, 229, 218, 219, 221, 222, 203, 213, 214, 144, 223, 227, 228, 202, 199, 225, 200, 211, 212, 230, 198, 207, 208, 209, 210, 216, 217, 186, 161, 242, 241, 240, 220, 194, 248, 246, 245, 243, 191, 193, 195, 197, 196, 142, 237, 201,  246 };
    private static List<Integer> cp1256List = Arrays.asList(cp1256);
    
	public static String convert1256To1252(String value) {
		
		if (value == null || value.length() == 0) {
			return "";
		}
		
		StringBuffer stringBuffer = new StringBuffer(value);

        for (int i = 0; i < stringBuffer.length(); i++) {
            int charIndexInCp1256List = cp1256List.indexOf((int) stringBuffer.charAt(i));
            if (charIndexInCp1256List > -1)
            	stringBuffer.replace(i, i + 1 , String.valueOf((char)cp1252[charIndexInCp1256List]));            	
        }
        
        return stringBuffer.toString().replace((char) 223, (char) 732).replace((char) 1603, (char) 732).replace((char) 1740, (char) 237).replace((char) 1610, (char) 237);
	}

	public static boolean isAccountingMessageEmpty(Object accountingMessage) {
		return accountingMessage == null || accountingMessage.toString().isEmpty() ||  accountingMessage.equals("<EmptyMessage>");
	}
}


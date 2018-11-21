package cn.yufei.ssm.system.utils;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.security.MessageDigest;
import java.util.Random;

public class MD5Util {

	private static final String[] hexDigits = { "0", "1", "2", "3", "4", "5",
			"6", "7", "8", "9", "a", "b", "c", "d", "e", "f" };

	public static final Random random = new Random(System.currentTimeMillis());

	public static String encode(String origin) {
		String resultString = null;
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			resultString = byteArrayToHexString(md.digest(origin.getBytes()));
		} catch (Exception localException) {
		}

		return resultString;
	}

	private static String byteArrayToHexString(byte[] b) {
		StringBuffer resultSb = new StringBuffer();
		for (int i = 0; i < b.length; i++) {
			resultSb.append(byteToHexString(b[i]));
		}
		return resultSb.toString().toUpperCase();
	}

	private static String byteToHexString(byte b) {
		int n = b;
		if (n < 0)
			n += 256;
		int d1 = n / 16;
		int d2 = n % 16;
		return hexDigits[d1] + hexDigits[d2];
	}

	public static String getHashCode(Object object) throws IOException {
		if (object == null)
			return "";

		String ss = null;
		ObjectOutputStream s = null;
		ByteArrayOutputStream bo = new ByteArrayOutputStream();
		try {
			s = new ObjectOutputStream(bo);
			s.writeObject(object);
			s.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (s != null) {
				s.close();
				s = null;
			}
		}
		ss = encode(bo.toString());
		return ss;
	}

	public static void main(String[] args) {
		String str = "serviceLocator = getDefaultClassLoader().loadClass(SERVICE_LOCATOR_CLASS)serviceLocator = getDefaultClassLoader().loadClass(SERVICE_LOCATOR_CLASS)serviceLocator = getDefaultClassLoader().loadClass(SERVICE_LOCATOR_CLASS)serviceLocator = getDefaultClassLoader().loadClass(SERVICE_LOCATOR_CLASS)serviceLocator = getDefaultClassLoader().loadClass(SERVICE_LOCATOR_CLASS)serviceLocator = getDefaultClassLoader().loadClass(SERVICE_LOCATOR_CLASS)serviceLocator = getDefaultClassLoader().loadClass(SERVICE_LOCATOR_CLASS)";
		System.out.println(encode(str));
	}
}

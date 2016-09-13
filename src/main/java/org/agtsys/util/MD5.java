package org.agtsys.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5 {
	private static String[] hexDigits={"0","1","2","3","4","5","6","7","8","9","a","b","d","e","f"};
	private static String byteToHexString(byte b){
		int n=b;
		if(n<0)
			n=256+n;
		int d1=n/16;
		int d2=n%16;
		return hexDigits[d1]+hexDigits[d2];
	}
	public static String bytesToHexString(byte[] src){
		StringBuilder stringBuilder = new StringBuilder("");
		if(src==null||src.length<=0){
			return null;
		}
		for(int i=0;i<src.length;i++){
			int v=src[i] & 0xFF;
			String hv = Integer.toHexString(v);
			if(hv.length()<2){
			stringBuilder.append(0);
		}
			stringBuilder.append(hv);
	}
		return stringBuilder.toString();
	}
	public static String md5encode(String src){
		try{
			MessageDigest md = MessageDigest.getInstance("MD5");
			return MD5.bytesToHexString(md.digest(src.getBytes()));
		} catch (NoSuchAlgorithmException e){
			e.printStackTrace();
			return null;
		}
	}
}

package org.interviewpractice;

public class Preparation {

	public static void main(String[] args) {
		String str = "WELCOME TO JAVA";
		String[] s1 = str.split(" ");
		String fin="";
		String total="";
		for (int i = 0; i < s1.length; i++) {
			String s=s1[i];
			
			char fLetter = s.charAt(0);
			String sub = s.substring(1);
			String remLetter = sub.toLowerCase();
			total=fLetter+remLetter;
			fin=fin+total+" ";
		}
		
		System.out.println(fin+ " ");
		
	}

}

package singlelinkedlist;

import java.util.ArrayList;
import java.util.Scanner;

public class oddevenswap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<Character> al=new ArrayList<Character>();
		char a=s.charAt(0);
		char c='$';
		char b=s.charAt(s.length()-1);
		s=s.replace(s.charAt(0), c);
		s=s.replace(s.charAt(s.length()-1),a);
		s=s.replace(s.charAt(0),b);
		System.out.println(s);
		
	}

}

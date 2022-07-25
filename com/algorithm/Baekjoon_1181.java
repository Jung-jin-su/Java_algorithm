package com.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Baekjoon_1181 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] s = new String[n];
		
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			String word = sc.nextLine();
			s[i] = word;
		}
		
		Arrays.sort(s, new Comparator<String>() {		//문자열 길이로 정렬하는 코드
			public int compare(String s1, String s2) {
				// 단어 길이가 같을 경우 
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				} 
				// 그 외의 경우 
				else {
					return s1.length() - s2.length();
				}
			}
		});
		
		System.out.println(s[0]);
		
		for(int i = 1; i<n; i++) {
			if (!s[i].equals(s[i-1])) {
				System.out.println(s[i]);
			}
		}
	}

}

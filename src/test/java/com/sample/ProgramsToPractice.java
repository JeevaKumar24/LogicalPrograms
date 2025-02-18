package com.sample;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramsToPractice {
	/*
	 * Missing element in Given Array
	 */	
	public static void missingArrayElement(int [] oddNum, int finalNum) {
         Set oddNumbers = new HashSet();
         for (int i = 0; i <=finalNum; i++) {
        	 if(i%2!=0) {
			oddNumbers.add(i);
        	 }
        	 }
         Set givenNumbers =new HashSet();
         for (int givenArray: oddNum) {
			givenNumbers.add(givenArray);
		}
		oddNumbers.removeAll(givenNumbers);
		System.out.println(oddNumbers);
	}
	/*
	 * Separate the words, special characters, digits with ascee values
	 */
	
public static void separateCharacters (String words) {
	int sma=0; 
   String small="",caps ="",digits="",specs="";
   for (int i = 0; i < words.length(); i++) {
	char a=words.charAt(i);

   if(a>=97&&a<=122) {
	   sma++;
	   small=small+a;
   }
   else if(a>=65&&a<=90) {
	   caps=caps+a;
   }
   else if(a>=48&&a<=57) {
	   digits=digits+a;
   }
   else {
	   specs=specs+a;
   }
   }
   System.out.println("Small Letters: "+small+ " And Small Letter count: "+ sma);
   System.out.println("Caps letters: "+caps);
   System.out.println("Digits: "+digits);
   System.out.println(specs);
}
    /*
	 * Separate the words, special characters, digits with Character method
	 */
public static void separateCharacPredefined (String words) {
	int sma=0; 
   String small="",caps ="",digits="",specs="";
   for (int i = 0; i < words.length(); i++) {
	char a=words.charAt(i);

   if( Character.isLowerCase(a)) {
	 sma++;
	 small=small+a;
   }
   else if(Character.isUpperCase(a)) {
	   caps=caps+a;
   }
   else if(Character.isDigit(a)) {
	   digits=digits+a;
   }
   else {
	   specs=specs+a;
   }
   
   }
   System.out.println("Small Letters: "+small+ " And Small Letter count: "+ sma);
   System.out.println("Caps letters: "+caps);
   System.out.println("Digits: "+digits);
   System.out.println(specs);
}
    /*
	 * Generate Permutaion of a word using recursion
	 */
    public static void generatePermutations(String str, String perm) {
    	if(str.isEmpty()) {
    		System.out.println(perm);
    	}
    	for (int i = 0; i < str.length(); i++) {
    		char ch = str.charAt(i);
    		String remaining = str.substring(0, i)+str.substring(i+1);
    		generatePermutations(remaining, perm+ch);
			}
    	
    }
    
    /*
	 * Occurrence of characters using Map
	 */
    public static void characOccurrenceMap(String str) {
    	
    	//String lowerCase = str.toLowerCase();
    	char[] ch = str.toCharArray();
    	Map<Character,Integer> m=new TreeMap<>();
    	for (int i = 0; i < ch.length; i++) {
    		char c = ch[i];
    		if(Character.isAlphabetic(c)) {
			if (m.containsKey(c)) {
				 Integer count = m.get(c);
				m.put(c, count+1);
			}
			else {
				m.put(c, 1);
			}
    		}
		}
    	System.out.println(m);
    }

	/* 
	 * Occurrence of a word using regex 
	 */
    public static void letterOcuurance(String str) {
    	char[] ch = str.toCharArray();
    }
    
    public static void wordOcuurance(String str,String word) {
    	String lowcase = str.toLowerCase();
    	Pattern p = Pattern.compile(word);
    	Matcher m= p.matcher(lowcase);
    	int count =0;
    	while (m.find()) {
			count++;
		//	System.out.println(m.group());
		}
    System.out.println(word+" appears: "+ count + " times");
    	
    }

	
	public static void main(String[] args) {
		int [] odd = {1,3,5,7,15};
		missingArrayElement(odd,15);
		String s="Hi";
		separateCharacters("cdccA3433!@#");
		//separateCharacPredefined("Adsac456#$%");
		//generatePermutations("abc", "");
		//characOccurrenceMap("Java is super java");
		//letterOcuurance("Java is super Program");
		//wordOcuurance("In the following Java program, we have used Java HashMap to count the occurrence of each character in the given string. We know that the HashMap stores key and value pairs and does not hold the duplicate key. The program stores character as a key and the occurrence of character as a value","java");
	}
	

}

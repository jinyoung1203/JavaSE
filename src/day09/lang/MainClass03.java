package day09.lang;
/*
 * [[String class]]
 *  불변의 객체 - 문자열 값이 변경되지 않는다.
 *  1. 메모리 절약
 *  2.Security Up
 *  3.Thread Safe
 *  
 * 
 * 
 * 
 * 
 */
public class MainClass03 {
	public static void main(String[] args) {
		String str1 = "abc";    //불변
		String str2 = "abc";    //불변
		String str3 = new String ("abc");    //불변
		
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	
		str1 = "def";
		
		System.out.println(System.identityHashCode(str1));
		
		//length 길이
		String txt = "ABCDEFGHIJK";
		System.out.println("The length of the txt string is: "+txt.length());
		
		//문자열이 저장한 문자로 시작하는지 판단
		String str4 = "apple";
		boolean starWith = str4.startsWith("a");
		System.out.println("starwith:" +starWith);
		
		
		//문자열 마지막에 저장한 문자가 있는지 판단
		String str5 = "test";
		boolean endWith = str5.endsWith("t");
		System.out.println("endWith:"+endWith);
		
		//문자 인덱스번호 반환
		String str6 = "abcdef";
		int indexOf = str6.indexOf("d");
		System.out.println("indexOf:"+indexOf);
		
		//문자열에 지정한 문자가 마지막 몇번째에 있는지 int를 반환한다
		String str7 = "AndroidApp";
		int lastIndexOf = str7.lastIndexOf("A");
		System.out.println("lastIndexOf:"+lastIndexOf);
		
		
		//문자 치환
		String str8 = "a*b*c*c";
		String replace = str8.replace("*", "-");
		System.out.println("replace:" +replace);
		
		//문자열 나누기 (배열로변환)
		String str9 = "A:B:C:D:abcd";
		String[]split= str9.split(" : ");
		for(int i = 0; i<split.length; i++) {
			System.out.println("split["+i+"]:" + split[i]);
		}
		
		//문자열 절식
		String str10 = "ABCDEF";
		String substirng = str10.substring(0, 2);
		System.out.println("substirng:" + str10);
		
		
	//소문자변홤ㄴ
		String str11= "abcDEF";
		String toLowerCase = str11.toLowerCase();
		System.out.println("toLowerCase:"+str11);
		
		//대문자변환
		String str12 = "absDEF";
		String toUpperCass = str12.toUpperCase();
		System.out.println("toUpperCase:"+str12);
		
		//공백제거
		String s= "  java java java    ";
		String v;
		v = s.trim();
		System.out.println("trim:" +v);
		
		//공백제거
				String s2= "  java java java    ";
				String v2;
				v = s2.replace(" "," ");
				System.out.println("replac로 공백제거:" +v);
		
		//문자비교
		String str13 = "A";
		String str14= "B";
		int compareTo = str13.compareTo(str14);
		if(compareTo > 0) {
			System.out.println(str13+ " >" + str14);
		}else if (compareTo == 0 ) {
				System.out.println(str13 + " = "+str14);
			}else {
				System.out.println(str13+ " < "+str14);
			}
				
			
			//문자포함여부
			String str15 = "abcd";
			String str16 = "c";
			boolean contains = str15.contains(str16);
			System.out.println("contains:" +contains);
			
			
			//문자열 추가 변경할떄 주로 사용하는 자료형
			//Thread Safe
			StringBuffer sb = new StringBuffer();
			//문자열 추가
			sb.append("abc");
			System.out.println(System.identityHashCode(sb));
			sb.append("def");
			System.out.println(System.identityHashCode(sb));
			
			//StringBuffer 동일 그러니 s
			StringBuilder sBuilder = new StringBuilder();
			sBuilder.append("abc");
			sBuilder.append("def");		
			
			
			String str17 = "abc";
			str17+="def";
			
			
			}
			
		
		
		
		
		
		
		
		
		
	
	}


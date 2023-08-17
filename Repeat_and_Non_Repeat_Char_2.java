package InterviewQes_1;

import java.util.HashSet;
import java.util.Set;

public class Repeat_and_Non_Repeat_Char_2 {
    public static void main(String[] args) {
    	String val="onesofttechnology";
		//String val="hi from mathan welcome to eclipse";
//		char ch[]=val.toCharArray();
//		int count=1;
//		for(int i=0;i<ch.length;i++) {
//			count=1;
//			for(int j=i+1;j<ch.length;j++) {
//				if(ch[i]==ch[j]&&ch[i]!=' ') {
//					count++;
//					ch[j]=' ';
//				}
//			}
//			if(count>1) {
//				System.out.println("Dublicate Element is--> "+ch[i]+"  -  "+count);
//			}
//			else if(count==1&&ch[i]!=' ') {
//				System.out.println("Uniq Character is-->" +ch[i]);
//				}
//		}
    	
    	// Another Way
    	
    	
		Set<Character>duplicate=new HashSet<>();
		Set<Character>uniq=new HashSet<>();
		for(char c:val.toCharArray()) {
			if(!uniq.add(c)) {
				duplicate.add(c);
			}}
			for(char d:duplicate) {
				System.out.println(d);
			}
		}
	
}

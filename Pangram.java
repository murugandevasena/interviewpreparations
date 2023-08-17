 package InterviewQes_1;

public class Pangram {
public static void main(String[] args) {
	String a="abcdefghijklmnopqrstuwvxyz";
	if(isPangram(a)) {System.out.println("It is Pangram");}
	else System.out.println("It is Not Pangram");
}
public static boolean isPangram(String a) {
	if(a.length()<26) {return false;}
	for(char i='a';i<='z';i++) {
		if(a.indexOf(i)<0) {
			return false;
		}
	}
	return true;
}
}

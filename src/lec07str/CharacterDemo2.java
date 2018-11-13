package lec07str;

public class CharacterDemo2 {
	public static void main(String[] args) {
		char c='Y';
		System.out.println('a'<=c&&c<='z');
		System.out.println(Character.isLowerCase(c));
		System.out.println((char)(c-'A'+'a'));
		System.out.println(Character.toLowerCase(c));
	}
}

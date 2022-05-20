package Ch07;

public class StringTest {

	public static void main(String[] args) {
		
		String poverb = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println("문자열의 길이 = " + poverb.length());
		
		s1 = poverb.concat(" never Bites!");	// 문자열 결합
		s2 = poverb.replace('A', 'a');			// 문자 교환
		s3 = poverb.substring(2, 5);			// 부분 문자열 추출
		s4 = poverb.toUpperCase();				// 대문자로 변환
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}

package Ch07;

public class StringTest {

	public static void main(String[] args) {
		
		String poverb = "A barking dog";
		String s1, s2, s3, s4;
		
		System.out.println("���ڿ��� ���� = " + poverb.length());
		
		s1 = poverb.concat(" never Bites!");	// ���ڿ� ����
		s2 = poverb.replace('A', 'a');			// ���� ��ȯ
		s3 = poverb.substring(2, 5);			// �κ� ���ڿ� ����
		s4 = poverb.toUpperCase();				// �빮�ڷ� ��ȯ
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}
}

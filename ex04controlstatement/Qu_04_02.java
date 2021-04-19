package ex04controlstatement;

import java.io.IOException;

public class Qu_04_02 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("하나의 문자를 입력하세요:");
		int num = System.in.read();
		
		String numresult = (num>=48 && num<=57) ? "숫자입니다.":"숫자가아닙니다.";
		
		System.out.println(numresult);
				
	
	}

}

package com.operative.lcd;

public class DigitalConverter {

	public static char[][] convToDigital(String number) {
		int j = 0;
		int i;
		char[][] charArray = new char[3][3 * number.length()];
		for (int x = 0; x < number.length(); x++) {
			char[][] str = DigRepresentationOfNumber.digiRepofNum((number.charAt(x)));
			i = 0;
			for(;i<3;i++) {
				for(int k =0 ;k<3;j++,k++) {
					charArray[i][j] = str[i][k];
				}
				j=j-3;
			}
			j = j+3;
		}
		return charArray;
	}
}

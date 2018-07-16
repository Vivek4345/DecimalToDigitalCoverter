package com.operative.lcd;

public class DigRepresentationOfNumber {

	static char[][] ch0 = { { '.', '_', '.' }, { '|', '.', '|' }, { '|', '_', '|' } };
	static char[][] ch1 = { { '.', '.', '.' }, { '.', '.', '|' }, { '.', '.', '|' } };
	static char[][] ch2 = { { '.', '_', '.' }, { '.', '_', '|' }, { '|', '_', '.' } };
	static char[][] ch3 = { { '.', '_', '.' }, { '.', '_', '|' }, { '.', '_', '|' } };
	static char[][] ch4 = { { '.', '.', '.' }, { '|', '_', '|' }, { '.', '.', '|' } };
	static char[][] ch5 = { { '.', '_', '.' }, { '|', '_', '.' }, { '.', '_', '|' } };
	static char[][] ch6 = { { '.', '_', '.' }, { '|', '_', '.' }, { '|', '_', '|' } };
	static char[][] ch7 = { { '.', '_', '.' }, { '.', '.', '|' }, { '.', '.', '|' } };
	static char[][] ch8 = { { '.', '_', '.' }, { '|', '_', '|' }, { '|', '_', '|' } };
	static char[][] ch9 = { { '.', '_', '.' }, { '|', '_', '|' }, { '.', '.', '|' } };

	public static char[][] digiRepofNum(char ch) {
		
		switch (ch) {
		case 48:
			return ch0;
		case 49:
			return ch1;
		case 50:
			return ch2;
		case 51:
			return ch3;
		case 52:
			return ch4;
		case 53:
			return ch5;
		case 54:
			return ch6;
		case 55:
			return ch7;
		case 56:
			return ch8;
		case 57:
			return ch9;
		default :return null;
		}
	}
}

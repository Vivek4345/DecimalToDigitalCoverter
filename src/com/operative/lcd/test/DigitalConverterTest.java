package com.operative.lcd.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.operative.lcd.DigitalConverter;

public class DigitalConverterTest {

	@Test
	public void testConvToDigital() {
		char[] ch1 = { '.', '_', '.', '.', '_', '.', '.', '.', '.' };
		char[] ch2 = { '|', '.', '|', '|', '.', '|', '.', '.', '|' };
		char[] ch3 = { '|', '_', '|', '|', '_', '|', '.', '.', '|' };

		assertArrayEquals(ch1, (DigitalConverter.convToDigital("001")[0]));
		assertArrayEquals(ch2, (DigitalConverter.convToDigital("001")[1]));
		assertArrayEquals(ch3, (DigitalConverter.convToDigital("001")[2]));
	}

}

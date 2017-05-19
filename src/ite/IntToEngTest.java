package ite;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

import org.junit.Test;

public class IntToEngTest {

	@Test
	public void numberメソッドで正しいアルファベットが取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "one";
		String actual = ite.number(1);
	}
	
	@Test
	public void number10メソッドで正しいアルファベットが取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "ten";
		String actual = ite.number10(1);
	}
	
	@Test
	public void translateEngメソッドで正しいアルファベットが取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "twenty one";
		String actual = ite.translateEng(21);
	}
}

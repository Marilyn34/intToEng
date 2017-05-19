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
		assertThat(actual,is(expected));
	}
	
	@Test
	public void number10メソッドで正しいアルファベットが取得できる() {
		IntToEng ite = new IntToEng();
		String expected = "ten";
		String actual = ite.number10(1);
		assertThat(actual,is(expected));
	}
	
	@Test
	public void translateEngメソッドで正しいアルファベットが取得できる() {
		IntToEng ite = new IntToEng();
		String expected1 = "twenty one";
		String actual1 = ite.translateEng(21);
		assertThat(actual1,is(expected1));
		String expected2 = "nine";
		String actual2 = ite.translateEng(9);
		assertThat(actual2,is(expected2));
		String expected3 = "one hunderd twenty two";
		String actual3 = ite.translateEng(122);
		assertThat(actual3,is(expected3));
	}
}

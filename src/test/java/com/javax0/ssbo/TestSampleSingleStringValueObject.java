package com.javax0.ssbo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestSampleSingleStringValueObject {

	@Test
	public void canBeCreatedFromString() {
		final SampleSingleStringValueObject abc = SampleSingleStringValueObject
				.fromString("abc");
		assertTrue(abc.equals(abc));
	}

	@Test
	public void doesNotEqualString() {
		final SampleSingleStringValueObject abc = SampleSingleStringValueObject
				.fromString("abc");
		assertNotEquals(abc, "abc");
	}

	@Test
	public void canConcatenateWithString() {
		final SampleSingleStringValueObject abc = SampleSingleStringValueObject
				.fromString("abc");
		final String x = abc + "bcd";
		assertEquals(x, "abcbcd");
	}

	private static void staticMethod(final CharSequence s) {
	}

	@Test
	public void canPassedToCharSequenceArgument() {
		final SampleSingleStringValueObject abc = SampleSingleStringValueObject
				.fromString("abc");
		staticMethod(abc);
	}

	@Test
	public void keepsTheString() {
		final String abcString = "abc";
		final SampleSingleStringValueObject abc = SampleSingleStringValueObject
				.fromString(abcString);
		final String abcSame = abc.toString();
		assertTrue(abcString == abcSame);
	}

}

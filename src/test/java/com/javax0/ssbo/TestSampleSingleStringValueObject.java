package com.javax0.ssbo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TestSampleSingleStringValueObject {

	@Test
	public void canBeCreatedFromString() {
		final SampleSingleStringValueObject abc = SampleSingleStringValueObject
				.fromString("abc");
		assertTrue(abc.equals(abc));
	}

	@Test
	public void equalsString() {
		final SampleSingleStringValueObject abc = SampleSingleStringValueObject
				.fromString("abc");
		assertEquals(abc, "abc");
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

	@Test
	public void hasTheStringHashCode() {
		final SampleSingleStringValueObject abc = SampleSingleStringValueObject
				.fromString("abc");
		Assert.assertEquals("abc".hashCode(), abc.hashCode());
	}

	@Test
	public void canBeUsedAsKeyToGetWithStringKeyPut() {
		final Map<CharSequence, Object> map = new HashMap<>();
		final SampleSingleStringValueObject abc = SampleSingleStringValueObject
				.fromString("abc");
		map.put("abc", abc);
		assertTrue(abc == map.get(abc));
	}

	@Test
	public void cantBeUsedAsKeyToPutWithStringKeyGet() {
		final Map<CharSequence, Object> map = new HashMap<>();
		final SampleSingleStringValueObject abc = SampleSingleStringValueObject
				.fromString("abc");
		map.put(abc, abc);
		assertFalse(abc == map.get("abc"));
	}

}

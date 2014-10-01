package com.javax0.ssbo;

import org.junit.Assert;
import org.junit.Test;

public class TestSampleSingleStringBusinessObject {

	@Test
	public void canBeCreatedFromString() {
		SampleSingleStringBusinessObject abc = SampleSingleStringBusinessObject
				.fromString("abc");
	}

	@Test
	public void equalsString() {
		SampleSingleStringBusinessObject abc = SampleSingleStringBusinessObject
				.fromString("abc");
		Assert.assertEquals(abc, "abc");
	}

	@Test
	public void canConcatenateWithString() {
		SampleSingleStringBusinessObject abc = SampleSingleStringBusinessObject
				.fromString("abc");
		String x = abc + "bcd";
		Assert.assertEquals(abc, "abc");
	}

	static void staticMethod(CharSequence s){}
	@Test
	public void canPassedToCharSequenceArgument() {
		SampleSingleStringBusinessObject abc = SampleSingleStringBusinessObject
				.fromString("abc");
		staticMethod(abc);
	}
	
}

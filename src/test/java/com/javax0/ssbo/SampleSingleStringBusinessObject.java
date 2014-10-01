package com.javax0.ssbo;

public class SampleSingleStringBusinessObject extends
		SingleStringBusinessObject {

	protected static SampleSingleStringBusinessObject fromString(
			CharSequence string) {
		return (SampleSingleStringBusinessObject) SingleStringBusinessObject
				.fromString(new SampleSingleStringBusinessObject(), string);
	}

}

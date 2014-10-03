package com.javax0.ssbo;

public class SampleSingleStringValueObject extends
		SingleStringValueObject {

	protected static SampleSingleStringValueObject fromString(
			CharSequence string) {
		return (SampleSingleStringValueObject) SingleStringValueObject
				.fromString(new SampleSingleStringValueObject(), string);
	}

}

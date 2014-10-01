package com.javax0.ssbo;

public abstract class SingleStringBusinessObject implements CharSequence {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((string == null) ? 0 : string.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return string == null;
		if (!(obj instanceof CharSequence))
			return false;
		CharSequence other = (CharSequence) obj;
		if (string == null) {
			if (other.toString() != null)
				return false;
		} else if (!string.equals(other.toString()))
			return false;
		return true;
	}

	private String string;

	protected static SingleStringBusinessObject fromString(
			SingleStringBusinessObject it, CharSequence string) {
		it.string = string.toString();
		return it;
	}

	public char charAt(int index) {
		return string.charAt(index);
	}

	public int length() {
		return string.length();
	}

	public CharSequence subSequence(int start, int end) {
		return string.subSequence(start, end);
	}
}

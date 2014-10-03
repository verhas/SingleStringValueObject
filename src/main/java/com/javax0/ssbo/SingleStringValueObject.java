package com.javax0.ssbo;

/**
 * A SingleStringValueObject can be used instead of String. For each separate
 * value type a subclass of SingleStringValueObject can be created and the
 * objects can be treated almost identical as if they were strings. This makes
 * it easy to refactor business code that is already full of String fields.
 * <p>
 * For example a business object has taxType, cutomerId, address, city and other
 * fields all as Strings. When an imagined method {@code sendMail(String to)} is
 * used how do you know that the `to` argument is the customerId or the address.
 * Documentation may help but having all these fields String we throw away the
 * typed nature of Java.
 * <p>
 * Using classes TaxType, CustomerId, Address, City and other fields it is
 * possible to refactor the method to be {@code sendMail(CustomerId to)} and you
 * will not accidentally pass an address to the method, even if you miss the
 * documentation.
 * 
 * 
 * @author verhasp
 *
 */
public abstract class SingleStringValueObject implements CharSequence {

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
			return false;
		if (getClass() != obj.getClass())
			return false;
		SingleStringValueObject other = (SingleStringValueObject) obj;
		if (string == null) {
			if (other.string != null)
				return false;
		} else if (!string.equals(other.string))
			return false;
		return true;
	}

	private String string;

	protected static SingleStringValueObject fromString(
			SingleStringValueObject it, CharSequence string) {
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
	
	@Override
	public String toString(){
		return string;
	}
}

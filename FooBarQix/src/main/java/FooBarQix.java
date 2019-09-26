public class FooBarQix {

	private static final String QIX = "Qix";
	private static final String BAR = "Bar";
	private static final String FOO = "Foo";

	public static void main(String[] args) {
		final FooBarQix fooBarQix = new FooBarQix();
		for(int i=1;i<=100;i++){
			System.out.println(i + " => " + fooBarQix.valueOf(i));
		}
	}

	public String valueOf(int number) {
		final StringBuilder result = new StringBuilder();
		if (number % 3 == 0) {
			result.append(FOO);
		}
		if (number % 5 == 0) {
			result.append(BAR);
		}
		if (number % 7 == 0) {
			result.append(QIX);
		}
		final String numberStr = Integer.toString(number).replaceAll("[^357]", "");
		result.append(numberStr.replaceAll("3", FOO).
								replaceAll("5", BAR).
								replaceAll("7", QIX));
		if (result.length() == 0) {
			result.append(number);
		}
		return result.toString();
	}

}
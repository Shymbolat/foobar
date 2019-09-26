import org.junit.*;

import java.util.HashMap;
import java.util.Map;

public class FooBarQixTest {

	private FooBarQix fooBarQix = new FooBarQix();

	@Test
	public void testFromOneToHundred() {
		for (Integer testInput : oneToHundredTest.keySet()) {
			Assert.assertEquals(oneToHundredTest.get(testInput), fooBarQix.valueOf(testInput));
		}
	}
	private final static Map<Integer, String> oneToHundredTest = new HashMap<Integer, String>() {
		private static final long serialVersionUID = 1L;
		{
			put(1, "1");
			put(2, "2");
			put(3, "FooFoo");
			put(4, "4");
			put(5, "BarBar");
			put(6, "Foo");
			put(7, "QixQix");
			put(8, "8");
			put(9, "Foo");
			put(10, "Bar");
			put(11, "11");
			put(12, "Foo");
			put(13, "Foo");
			put(14, "Qix");
			put(15, "FooBarBar");
			put(16, "16");
			put(17, "Qix");
			put(18, "Foo");
			put(19, "19");
			put(20, "Bar");
			put(21, "FooQix");
			put(22, "22");
			put(23, "Foo");
			put(24, "Foo");
			put(25, "BarBar");
			put(26, "26");
			put(27, "FooQix");
			put(28, "Qix");
			put(29, "29");
			put(30, "FooBarFoo");
			put(31, "Foo");
			put(32, "Foo");
			put(33, "FooFooFoo");
			put(34, "Foo");
			put(35, "BarQixFooBar");
			put(36, "FooFoo");
			put(37, "FooQix");
			put(38, "Foo");
			put(39, "FooFoo");
			put(40, "Bar");
			put(41, "41");
			put(42, "FooQix");
			put(43, "Foo");
			put(44, "44");
			put(45, "FooBarBar");
			put(46, "46");
			put(47, "Qix");
			put(48, "Foo");
			put(49, "Qix");
			put(50, "BarBar");
			put(51, "FooBar");
			put(52, "Bar");
			put(53, "BarFoo");
			put(54, "FooBar");
			put(55, "BarBarBar");
			put(56, "QixBar");
			put(57, "FooBarQix");
			put(58, "Bar");
			put(59, "Bar");
			put(60, "FooBar");
			put(61, "61");
			put(62, "62");
			put(63, "FooQixFoo");
			put(64, "64");
			put(65, "BarBar");
			put(66, "Foo");
			put(67, "Qix");
			put(68, "68");
			put(69, "Foo");
			put(70, "BarQixQix");
			put(71, "Qix");
			put(72, "FooQix");
			put(73, "QixFoo");
			put(74, "Qix");
			put(75, "FooBarQixBar");
			put(76, "Qix");
			put(77, "QixQixQix");
			put(78, "FooQix");
			put(79, "Qix");
			put(80, "Bar");
			put(81, "Foo");
			put(82, "82");
			put(83, "Foo");
			put(84, "FooQix");
			put(85, "BarBar");
			put(86, "86");
			put(87, "FooQix");
			put(88, "88");
			put(89, "89");
			put(90, "FooBar");
			put(91, "Qix");
			put(92, "92");
			put(93, "FooFoo");
			put(94, "94");
			put(95, "BarBar");
			put(96, "Foo");
			put(97, "Qix");
			put(98, "Qix");
			put(99, "Foo");
			put(100, "Bar");
		}
	};
}

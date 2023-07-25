package Reflect;

import static java.lang.System.out;

import java.lang.reflect.Field;
import java.util.Arrays;

enum Tweedle {
	DEE, DUM
}

/**
 * 官方example，获取和修改字段值
 * @author Tian
 * @since  2023-02-28 20:52:47
 */
public class Book {
	public long chapters = 0;
	public String[] characters = { "Alice", "White Rabbit" };
	public Tweedle twin = Tweedle.DEE;

	public static void main(String... args) {
		Book book = new Book();
		String fmt = "%6S:  %-12s = %s%n";

		try {
			// 获取对象
			Class<?> c = book.getClass();

			// 获取字段值
			Field chap = c.getDeclaredField("chapters");
			// 输出字段值
			out.format(fmt, "before", "chapters", book.chapters);
			// 重新设置字段值
			chap.setLong(book, 12);
			// 输出修改后的值
			out.format(fmt, "after", "chapters", chap.getLong(book));

			Field chars = c.getDeclaredField("characters");
			out.format(fmt, "before", "characters", Arrays.asList(book.characters));
			String[] newChars = { "Queen", "King" };
			chars.set(book, newChars);
			out.format(fmt, "after", "characters", Arrays.asList(book.characters));

			Field t = c.getDeclaredField("twin");
			out.format(fmt, "before", "twin", book.twin);
			t.set(book, Tweedle.DUM);
			out.format(fmt, "after", "twin", t.get(book));

			// production code should handle these exceptions more gracefully
		} catch (NoSuchFieldException x) {
			x.printStackTrace();
		} catch (IllegalAccessException x) {
			x.printStackTrace();
		}
	}
}

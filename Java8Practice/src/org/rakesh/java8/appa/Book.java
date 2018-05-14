package org.rakesh.java8.appa;

import java.util.Arrays;

@Author(name = "Raoul")
@Author(name = "Mario")
@Author(name = "Alan")
public class Book {

	public static void main(String... strings) {
		Author[] authors = Book.class.getAnnotationsByType(Author.class);
		Arrays.asList(authors).stream().forEach(a -> {
			System.out.println(a.name());
		});
	}

}

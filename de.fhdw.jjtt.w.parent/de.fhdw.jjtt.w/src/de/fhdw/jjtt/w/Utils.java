package de.fhdw.jjtt.w;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Utils {
	public static <T> List<T> concat(List<T>... lists) {
		return Stream.of(lists).flatMap(List::stream).collect(Collectors.toList());
	}
}

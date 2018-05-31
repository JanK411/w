package de.fhdw.jjtt.w;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import de.fhdw.jjtt.w.w.Variable;

public class Utils {
	public static <T> List<T> concat(List<T>... lists) {
		return Stream.of(lists).flatMap(List::stream).collect(Collectors.toList());
	}
	
	public static boolean containsInParams(Variable var, List<String> lst) {
		return lst.contains(var.getName());
	}

}

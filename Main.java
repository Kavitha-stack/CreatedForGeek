
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.google.gson.Gson;

/**
 * This class gives all the options to print the java array
 * @author Kavitha Ashok
 *
 */
public class Main {

	public static void main(String[] args) throws JsonProcessingException {
		printUsingForLoop();
		printUsingEnhancedForLoop();
		printIntArray();
		printStringArray();
		printArrayUsingJoin();
		printTwoDimentionArray();
		printUsingStreamWithForeach();
		printUsingAsListStreamWithForeach();
		printUsingStreamOf();
		printUsingFlatMapForStringMultiArray();
		printUsingFlatMapForIntMultiArray();
		printArrayUsingasList();
		printUsingJackson();
		printUsingGson();
		printArrayUsingStringBuilder();
	}

	private static void printUsingForLoop() {
		int[] intArray = { 1, 2, 3, 4, 5 };
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}
	}

	private static void printUsingEnhancedForLoop() {
		int[] intArray = { 1, 2, 3, 4, 5 };
		for (int i : intArray) {
			System.out.print(i + " ");
		}
	}

	private static void printStringArray() {
		String[] array = new String[] { "Java", "Code", "Geek" };
		System.out.println(Arrays.toString(array));
	}

	private static void printIntArray() {
		int[] intArray = { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(intArray));
	}

	private static void printArrayUsingJoin() {
		String[] strArray = { "Java", "Code", "Geek" };
		String delimiter = " ";
		System.out.println(String.join(delimiter, strArray));
	}

	private static void printTwoDimentionArray() {
		String[][] multiArray = new String[][] { { "Java", "Code", "Geek" }, { "Hello", "World", "Program" } };
		System.out.println(Arrays.deepToString(multiArray));
		System.out.println(Arrays.toString(multiArray));
	}

	private static void printUsingStreamWithForeach() {
		String[] strArray = new String[] { "Welcome", "to", "Java", "Code", "Geek" };
		Arrays.stream(strArray).forEach(System.out::println);
	}

	private static void printUsingAsListStreamWithForeach() {
		String[] strArray = new String[] { "Welcome", "to", "Java", "Code", "Geek" };
		Arrays.asList(strArray).stream().forEach(s -> System.out.println(s));
	}

	private static void printUsingStreamOf() {
		String[] strArray = new String[] { "Welcome", "to", "Java", "Code", "Geek" };
		Stream.of(strArray).forEach(System.out::println);
	}

	private static void printUsingFlatMapForStringMultiArray() {
		String[][] multiArray = new String[][] { { "Java", "language" }, { "Hello", "World" } };
		Arrays.stream(multiArray).flatMap(x -> Arrays.stream(x)).forEach(System.out::println);
	}

	private static void printUsingFlatMapForIntMultiArray() {
		int[][] multiArray = new int[][] { { 10, 20 }, { 30, 40 } };
		Arrays.stream(multiArray).flatMapToInt(x -> Arrays.stream(x)).forEach(System.out::println);
	}

	private static void printArrayUsingasList() {
		 String[] strArray = { "Java", "Code", "Geek"};
	      List<String> listArray = Arrays.asList(strArray );
	      System.out.println(listArray);
	}

	private static void printUsingJackson() throws JsonProcessingException {
		String[] strArray = { "Java", "Code", "Geek"};
		ObjectWriter objwriter = new ObjectMapper().writer().withDefaultPrettyPrinter();
		System.out.println(objwriter.writeValueAsString(strArray));
	}
	
	private static void printUsingGson() {
		String[] strArray = { "Java", "Code", "Geek"};
		Gson gson = new Gson();
		System.out.println(gson.toJson(strArray));
	}
	
	private static void printArrayUsingStringBuilder() {
		boolean flag = true;
		StringBuilder strBuilder = new StringBuilder();
		String[] strArray = new String[] { "Java", "Code", "Geek" };
		for (String eachString : strArray) {
			if (!flag)
				strBuilder.append(' ');

			strBuilder.append(eachString);
			flag = false;
		}
		System.out.println(strBuilder.toString());
	}
	
}

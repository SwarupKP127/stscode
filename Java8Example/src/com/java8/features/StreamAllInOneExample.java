package com.java8.features;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamAllInOneExample {
	
	public static void main(String[] args) {
		
		// Filter Even numbers from a List
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList()));
		
		// Find maximum number from a List
		System.out.println(numbers.stream().max(Integer::compare));
		
		// Sort a List
		List<Integer> sortNum = Arrays.asList(3, 5, 1, 4, 2);
		System.out.println(sortNum.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));
		
		// Counting Strings with specific Prefix
		List<String> countString = Arrays.asList("Lakhan", "Akshay", "Sachin", "Pavan", "Aashish", "Devansh");
		System.out.println(countString.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList()));
		
		// Find First Non-Repeated Character in a String
		String input = "swiss";
		System.out.println(input.chars().mapToObj(c -> (char) c).filter(c -> input.indexOf(c) == input.lastIndexOf(c)).findFirst() );
		
		// Convert List of Strings to Uppercase
		System.out.println(countString.stream().map(String::toUpperCase).collect(Collectors.toList()));
		
		// Sum of the Numbers in a List
		List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(numbers3.stream().mapToInt(Integer:: intValue).sum());
		
		// Check if Any String Matches aCondition
		System.out.println("If any String matches condition: "+ countString.stream().anyMatch(s -> s.contains("Lakhan")));

		// Find the Duplicates elements in the list
		List<Integer> numbers4 = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);
		Set<Integer> unique = new HashSet<>();
		System.out.println("Duplicate number from the List: "+ numbers4.stream().filter(n -> !unique.add(n)).collect(Collectors.toList()));
		
		// Group String by length
		System.out.println("String by Length: "+ countString.stream().collect(Collectors.groupingBy(String::length)));
		
		// Given a list of lists, flatten it into a single list
		List<List<Integer>> listOfLists = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8, 9));
		List<Integer> flatList = listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flatList);
		
		// Concatenate all strings in a list into a single string.
		List<String> words = Arrays.asList("Stream", "API", "is", "powerful");
		for(String s : words) {
			s.concat(s);
			System.out.print(s+" ");
		}
		// OR
		System.out.println();
		System.out.println(words.stream().reduce("", (s1, s2) -> s1 + " "+ s2).trim());
		// OR
		System.out.println("Join Strings: "+ words.stream().collect(Collectors.joining(" ")));
		
		// Find the longest string in a list.
		System.out.println(words.stream().collect(Collectors.groupingBy(String::length)));
		System.out.println(words.stream().max(Comparator.comparingInt(String::length)).orElse(null));
		
		// Remove null values from a list
		List<String> words1 = Arrays.asList("Java", null, "Stream", null, "API");
		System.out.println(words1);
		System.out.println(words1.stream().filter(Objects::nonNull).collect(Collectors.toList()));
		
		// Calculate the average of a list of integers.
		List<Integer> numbers2 = Arrays.asList(10, 20, 30, 40, 50, 15);
		System.out.println(numbers2.stream().mapToInt(Integer::intValue).average().orElse(0.0));
		// OR
		System.out.println(numbers2.stream().collect(Collectors.averagingInt(Integer::intValue)));
		// OR
		int addNum = 0;
		for(Integer num : numbers2) {
			addNum += num;
		}
		double avg = (double) addNum/numbers2.size();
		System.out.println(avg);
		
		// Convert a list of strings into a map with the string as the key and its length as the value.
		System.out.println(words.stream().collect(Collectors.toMap(word -> word, String::length)));
		// OR
		Map<String, Integer> mapWords = new HashMap<>();
		for(String str : words) {
			mapWords.put(str, str.length());
		}
		System.out.println("Using for loop: "+mapWords);
		// OR
		words.forEach(word -> mapWords.put(word, word.length()));
		System.out.println(mapWords);
		
		// Find the 3rd largest element in a list.
		System.out.println("3rd largest = " +numbers2.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().orElseThrow(() -> new NoSuchElementException("No 3rd largest element found")));
		// OR
		List<Integer> sorted = new ArrayList<>(numbers2);
		Collections.sort(sorted, Collections.reverseOrder());
		System.out.println("3rd largest = "+ sorted.get(2));
		// OR
		
		// Find all strings that are palindromes in a list.
		List<String> words2 = Arrays.asList("radar", "level", "world", "java");
		System.out.println("Palindromes string from List = "+ words2.stream().filter(word -> word.equals(new StringBuilder(word).reverse().toString())).collect(Collectors.toList()) );
		
		// Reverse each string in a list.
		System.out.println("Original String List = "+ words2);
		System.out.println("Reverse each String = "+ words2.stream().map(word -> new StringBuilder(word).reverse().toString()).collect(Collectors.toList()));
		
		// Given a map, filter entries with values greater than 10 and collect keys into a list.
		//Map<String, Integer> map = Map.of("A", 5, "B", 15, "C", 10, "D", 20);
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("A", 5);
		map.put("B", 15);
		map.put("C", 10);
		map.put("D", 20);
		List<String> keys = map.entrySet().stream()
		    .filter(entry -> entry.getValue() > 10)
		    .map(Map.Entry::getKey)
		    .collect(Collectors.toList());
		System.out.println(keys); // Output: [B, D]
		
		// Find common elements between two lists.
		List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> list2 = Arrays.asList(3, 4, 5, 6, 7);
		List<Integer> common = list1.stream().filter(list2::contains).collect(Collectors.toList());
		System.out.println("Common element between two lists:"+common);
		
		// Calculate the sum of squares of all even numbers in a list.
		System.out.println("Even number square & then sum: "+list1.stream().filter(n -> n%2 == 0).mapToInt(n -> n*n).sum());
		
		// Partition strings into palindromes and non-palindromes.
		System.out.println(words2.stream().collect(Collectors.partitioningBy(word -> word.equals(new StringBuilder(word).reverse().toString()))));
		
		// Find the longest word in a sentence using Streams.
		String sentence = "Java Stream API is very powerful";
		System.out.println("Logest word in sentence is: "+Arrays.stream(sentence.split(" ")).max(Comparator.comparingInt(String::length)).orElse(null));
		
		// Group a list of strings by their first character.
		List<String> words3 = Arrays.asList("apple", "banana", "avocado", "blueberry", "cherry");
		System.out.println(words3.stream().collect(Collectors.groupingBy(word -> word.charAt(0))));
					// Output: {a=[apple, avocado], b=[banana, blueberry], c=[cherry]}
		
		// Find the word with the most vowels in a list.
		String wordWithMostVowels = words3.stream()
			    .max(Comparator.comparingInt(word -> (int) word.chars().filter(c -> "aeiou".indexOf(c) != -1).count()))
			    .orElse(null);
			System.out.println(wordWithMostVowels);
			// Output: avocado
		
		// Calculate the product of all numbers in a list using reduce.
		System.out.println("Product of all Number in List: "+list1.stream().reduce(1, (a, b) -> a*b));
		// Output: 120
		
		// Detect all anagrams in a list of strings.
		//List<String> words = Arrays.asList("listen", "silent", "enlist", "google", "elbow", "below");
		
		
		// Count the frequency of each character in a string.
		String input2 = "success";
		Map<Character, Long> charFrequency = input2.chars()
		    .mapToObj(c -> (char) c)
		    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		System.out.println(charFrequency); // Output: {s=3, u=1, c=2, e=1}
		
		// Flatten a list of lists into a single list.
		List<List<Integer>> nestedList = Arrays.asList(
			    Arrays.asList(1, 2, 3),
			    Arrays.asList(4, 5),
			    Arrays.asList(6, 7, 8, 9)
			);
		List<Integer> flatList2 = nestedList.stream().flatMap(List::stream).collect(Collectors.toList());
		System.out.println(flatList2); // Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		// Identify all duplicate elements in a list.
		List<Integer> duplicates = Arrays.asList(1, 2, 3, 4, 2, 5, 3, 6);
		System.out.println("Duplicate Element in the List: " + duplicates.stream().filter(n -> Collections.frequency(duplicates, n) > 1).collect(Collectors.toSet()));
			// Output: [2, 3]
		
		// Convert a map to a list of “key=value” strings.
		//Map<String, Integer> map2 = Map.of("A", 1, "B", 2, "C", 3);
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("A", 1);
		map2.put("B", 2);
		map2.put("C", 3);
		System.out.println("Map to List: " + map2.entrySet().stream().map(entry -> entry.getKey() + "=" + entry.getValue()).collect(Collectors.toList()));
			// Output: [A=1, B=2, C=3]
		
		// Combine two lists into a map where one is keys and the other values.
		List<String> keys2 = Arrays.asList("A", "B", "C");
		List<Integer> values2 = Arrays.asList(1, 2, 3);
		System.out.println("List to Map: "+IntStream.range(0, keys2.size()).boxed().collect(Collectors.toMap(keys2::get, values2::get)));
			// Output: {A=1, B=2, C=3}
		
	}

}

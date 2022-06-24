package com.example.employee;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
		//Task 1
		for (int num : nums) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}
		//Task 2
		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (num % 2 == 0) {
				set.add(num);
			}
		}
		System.out.println(set);
		System.out.println("_________________");
		List<String> song = new ArrayList<>(List.of(
				"Доброе", "утро", "последний", "герой",
				"Доброе", "утро", "тебе", "и", "таким", "как", "ты"));
		List<String> words = new ArrayList<>(song);
		Set<String> songWithoutDuplicate = new HashSet<>(song);
		//Task 3
		for (String word : songWithoutDuplicate) {
			words.remove(word);
		}
		songWithoutDuplicate.removeAll(words);
		System.out.println(songWithoutDuplicate);
		//Task 4
		Set<String> songDuplicateWords = new HashSet<>(words);
		songDuplicateWords.removeAll(songWithoutDuplicate);
		System.out.println("Слов встрещающиеся 2 и более раз: " + songDuplicateWords.size());
		System.out.println("Слова: " + songDuplicateWords);
	}
}

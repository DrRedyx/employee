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
		List<String> words = new ArrayList<>();
		words.add("Прокрастинаторы");
		words.add("Прокрастинировали");
		words.add("Прокрастинировали");
		words.add("Да");
		words.add("Не");
		words.add("Выпрокрастинировали");
		//Task 3
		for (int i = 0; i < words.size(); i++) {
			for (int j = i + 1; j < words.size(); j++) {
				if (words.get(i).equals(words.get(j))) {
					words.remove(j);
					words.remove(i);
				}
			}
		}
		System.out.println(words);
		//Task 4
		words.add("Прокрастинировали");
		words.add("Прокрастинировали");
		System.out.println("Слова встрещающиеся 2 и более раз: ");
		for (int i = 0; i < words.size(); i++) {
			for (int j = i + 1; j < words.size(); j++) {
				if (words.get(i).equals(words.get(j))) {
					System.out.println(words.get(i));
				}
			}
		}
	}
}

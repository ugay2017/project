package ru.start;

import ru.work.*;

public class StartUI {
	
	public static void main(String[] args) {
	Tracker tracker = new Tracker();
	tracker.add(new Task("first task", "first desc"));
	for(Item item: tracker.getAll()) {
		System.out.println(item.getName());
	}
	}
}
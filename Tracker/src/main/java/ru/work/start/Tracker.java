package ru.start;

import ru.work.*;

public class Tracker {
	
	public  Item[] items = new Item[3];
	
	
	
	/*
	public static void main(String[] args) {
		Tracker tracker = new Tracker();
		tracker.items[0] = new Item("sdvs","desc",01);
		tracker.items[1] = new Task("sdvse", "desc");
		tracker.items[2] = new Bug();
		
		for(Item item : tracker.items) {
			if(item instanceof Task) {
				Task task = (Task) item;
				System.out.println(task.calculatePrice());
			}
			System.out.println(item.getName() + " " + item.getDescription());
		}
		*/
		/*
		Item item = new Item("name","desc", 01);
		System.out.println(item.getName()+" " + item.getDescription());
		Task task = new Task("name", "desc");
		System.out.println(task.getName()+ " "+ task.getDescription());*/
	}
}
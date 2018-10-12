package ru.start;

import ru.work.*;
import java.util.*;
import java.lang.*;

public class Tracker {
	
	private  Item[] items = new Item[10];
	private int position = 0;
	private static final Random RN = new Random(); 
	
	public Item add(Item item) {
		item.setId(this.generateId());
		this.items[position++] = item;
		return item;
	}
	
	protected Item findById(String id) {
		Item result = null;
		for(Item item : items) {
			if(item != null && item.getId().equals(id)) {
				result = item;
				break;
			}
		}
		return result;
	}
	
	String generateId() {
		return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));
	}
	
	public Item[] getAll() {
		Item[] result = new Item[position];
		for(int index = 0; index!=this.position; index++) {
			result[index] =this.items[index];
		}
		return result;
	}
	
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
		System.out.println(task.getName()+ " "+ task.getDescription());
	}
	*/
}
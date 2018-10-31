package brusnitsyna.second;

import java.util.ArrayList;
import java.util.Scanner;

public class Notepad {
	public ArrayList<Note> notes_ = new ArrayList<Note>();
	
	public void addNote() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter values:");
		System.out.print("	Name: ");
		String name = scan.nextLine();
		System.out.print("	Age: ");
		int age = scan.nextInt();
		System.out.print("	ID: ");
		long id = scan.nextLong();
		notes_.add(new Note(name, age, id));
	}
	
	public void removeNote() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Index of the note to be deleted: ");
		int index = scan.nextInt();
		if (index < 0 || index > notes_.size()) {
			throw new IllegalArgumentException ("Index is out of range");
		}
		notes_.remove(index);
	}
	
	public void changeNote() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Index of the note to be changed: ");
		int index = scan.nextInt();
		scan.nextLine();
		if (index < 0 || index >= notes_.size()) {
			throw new IllegalArgumentException ("Index is out of range");
		}
		System.out.println("Enter new values:");
		System.out.print("	Name: ");
		String name = scan.nextLine();
		System.out.print("	Age: ");
		int age = scan.nextInt();
		System.out.print("	ID: ");
		long id = scan.nextLong();
		notes_.get(index).name_  = name;	
		notes_.get(index).age_  = age;	
		notes_.get(index).id_  = id;	
	}
	
	public void printAllNotes() {
		for (int index = 0; index < notes_.size(); index++) {
			System.out.print(notes_.get(index).name_ + " ");
			System.out.print(notes_.get(index).age_ + " ");
			System.out.println(notes_.get(index).id_);
		}
	}
}

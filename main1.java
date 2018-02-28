package oop;
import java.util.Scanner;
// Here are problems 1 and 2
public class main1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter the number of people");
		int n = input.nextInt();
		String [] name = new String [n];
		int [] age = new int [n];
		String [] profession = new String [n];
		for(int i = 0; i<n; i++) {
			System.out.println("Please, enter the name of person number "+(i+1));
			name[i] = input.next();
			System.out.println("Please, enter the age of " + name[i]);
			age[i] = input.nextInt();
			System.out.println("Please, enter the profession of " + name[i]);
			profession[i] = input.next();
		}
		input.close();
		// a)
		Child a = new Child(n, age, name, profession);
		// b)
		Person b = new Child(n, age, name, profession);
		a.print();
		//b.print();
	}
}

class Person {
	String [] name;
	int [] age;
	void print() {
		for(int i =0; i<age.length; i++) {
			if(age[i]<25)
				System.out.println("name is: " + name[i] + "\t\t" + "age is: " + age[i]);
		}
	}
	public Person(int n, int [] ageinput, String [] nameinput) {
	   this.name = nameinput;
	   this.age = ageinput;
	}
}

class Child extends Person {
	String [] name;
	int [] age;
	String [] profession;
	void print() {
		for(int i =0; i<age.length; i++) {
			profession[i] = profession[i].toLowerCase();
			if(age[i]<25 && profession[i].equals("programmer"))
				System.out.println("name is: " + name[i] + "\t\t" + 
			                       "age is: "  + age[i]  + "\t\t" + 
								   "profession is: " + profession[i]);
			else {
				System.out.println("Sorry! I couldn't find anyone with age less than 25 or whose profession is programmer");
			}
		}		
	}
	public Child(int n, int [] ageinput, String [] nameinput, String [] professioninput) {
		super(n, ageinput,nameinput);
		this.name = nameinput;
		this.age = ageinput;
		this.profession = professioninput;
	}
}

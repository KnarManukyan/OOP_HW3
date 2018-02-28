package oop;
//This is the problem 3
public class main2 {
	public static void main(String[] args) {
	Oceanographer o = new Oceanographer();
	o.checkSound(new Dolphin());
	o.checkSound(new Whale());
	}
  }

interface LivesInOceaninterface{
	void makeSound();
}

class Oceanographer{
	void checkSound( LivesInOceaninterface x ) {
	   x.makeSound();
	}
}

class Whale implements LivesInOceaninterface {
     public void makeSound() {
    	 System.out.println("Whale sound!");
	}
}

class Dolphin implements LivesInOceaninterface{
    public void makeSound() {
    	System.out.println("Dolphin sound!");
	}	
}
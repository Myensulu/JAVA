package day59;

import day58.Animal;
import day58.Dog;
import day58.Horse;

public class AnimalShow59_3 {

	public static void main(String[] args) {	

			Animal a1 = new Dog(); 
			a1.makeNoise();
			// if you refer a Dog as Animal 
			// it will do only general animal related stuff 
			System.out.println(a1.legsCount);
			
			
			Animal a2 = new Horse(); 
			a2.makeNoise();
			

	}

}

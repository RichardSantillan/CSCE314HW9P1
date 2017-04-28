import java.util.*;

public class AnimalShelter extends Animal {
	
	Scanner s = new Scanner(System.in);
	
	List<Animal> x = new ArrayList<Animal>();
	
	public void cry(){
		//idk why this is here but I get the error
		//"Main is not abstract and does not override abstract method cry() in Animal"
	}
	public String getName(){
		return getName();
	}
	public void setName(String s){
		
	}
	public void setNumber(int n){
		
	}
	public int getNumber(){
		return getNumber();
	}
	
	public void addAnimal(){
		System.out.println("Enter 'C' for cat, 'D' for dog followed by animal name:");
		String i = s.nextLine();
		
		switch(i.charAt(0)){
			case 'C':
				Cat c = new Cat();
				c.setNumber(x.size()+1);
				c.setName(i);
				c.cry();
				x.add(c);
				break;
			case 'D':
				Dog d = new Dog();
				d.setNumber(x.size()+1);
				d.setName(i);
				d.cry();
				x.add(d);
				break;
			default: 
					System.out.println("Try again!");
					break;
		}
	}
	
	public void addAnimal(String i){
		switch(i.charAt(0)){
			case 'C':
				Cat c = new Cat();
				c.setNumber(x.size()+1);
				c.setName(i);
				c.cry();
				x.add(c);
				break;
			case 'D':
				Dog d = new Dog();
				d.setNumber(x.size()+1);
				d.setName(i);
				d.cry();
				x.add(d);
				break;
			default: 
					System.out.println("Try again!");
					break;
		}
	}
	
	public void adopt(){
		System.out.println("			Congrats!! You have adopted "+x.get(0).getName());
		x.remove(0);
		for (int i = 0; i<x.size(); i++){
			x.get(i).setNumber(i+1);
		}
	}
	
	public void adoptCat(){
		int k = 0;
		while(x.get(k).getName().charAt(0) != 'C'){
			System.out.println(x.get(k).getName().charAt(0));
			k++;
		}
		System.out.println("			Congrats Cat Lover!! You have adopted "+x.get(k).getName());
		x.remove(k);
		for (int i = 0; i<x.size(); i++){
			x.get(i).setNumber(i+1);
		}
	}
	
	public void adoptDog(){
		int k = 0;
		while(x.get(k).getName().charAt(0) != 'D'){
			k++;
		}
		System.out.println("			Congrats Dog Lover!! You have adopted "+x.get(k).getName());
		x.remove(k);
		for (int i = 0; i<x.size(); i++){
			x.get(i).setNumber(i+1);
		}
	}
	
	public void remainingAnimals(){
		System.out.println("-----------------------------------------------------------------------------------------");
		for (int i = 0; i<x.size(); i++){
			System.out.println(x.get(i).getName());
		}
		System.out.println("-----------------------------------------------------------------------------------------");
	}
	
	public void remainingCats(){
		System.out.println("-----------------------------------------------------------------------------------------");
		for (int i = 0; i<x.size(); i++){
			if(x.get(i).getName().charAt(0) != 'C')
				System.out.println(x.get(i).getName());
		}
		System.out.println("-----------------------------------------------------------------------------------------");
	}
	
	public void remainingDogs(){
		System.out.println("-----------------------------------------------------------------------------------------");
		for (int i = 0; i<x.size(); i++){
			if(x.get(i).getName().charAt(0) != 'D')
				System.out.println(x.get(i).getName());
		}
		System.out.println("-----------------------------------------------------------------------------------------");
	}
}
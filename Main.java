import java.util.Scanner;

/* DISCLAIMER
	I have not added error handling yet, so you be exact on what you are asked to input! :)
*/

public class Main extends AnimalShelter {
	
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		AnimalShelter as = new AnimalShelter();
		
		while(true){
			System.out.println(" 1: Add new animal \n 2: Adopt an animal \n 3: Adopt a cat \n 4: Adopt a dog \n 5: Show animals in the shelter \n 6: Show cats in the shelter \n 7: Show dogs in the shelter \n 0: Exit \n Enter a number:");
			int i = s.nextInt();
			
			switch(i){
				case 1:
					as.addAnimal();
					break;
				case 2:
					as.adopt();
					break;
				case 3:
					as.adoptCat();
					break;
				case 4:
					as.adoptDog();
					break;
				case 5:
					as.remainingAnimals();
					break;
				case 6:
					as.remainingDogs();
					break;
				case 7:
					as.remainingCats();
					break;
				case 0:
					System.out.println("Press [Ctrl]+C");
					break;
				default: 
					System.out.println("Try again!");
					break;
			}
		}
	}
	
}
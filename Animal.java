//HW9

/*	ABSTRACT CLASS
	- abstract classes exist to be extended, they cannot be instantiated
	- The benefit is being able to create abstract class is that you can use abstract methods
	- You will write all your main code in the abstract main
	- If you declare an abstract function in your abstract class, then this mathod will need to be 
		defined for/in each extended sub-class
*/

public abstract class Animal {
	public String name;
	public int number;
	
	public abstract void cry();
	public abstract void setName(String s);
	public abstract String getName();
	public void setNumber(int n){
		number = n;
	}
	public int getNumber(){
		return this.number;
	}
}
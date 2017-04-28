public class Dog extends Animal {
	
	public void cry() {
		System.out.println("Woof!");
	}
	public void setName(String s){
		name = s;
	}
	public String getName(){
		String s = this.name+" = #"+this.number;
		return s;
	}
}
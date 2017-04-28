public class Cat extends Animal {
	
	public void cry() {
		System.out.println("Meow!");
	}
	public void setName(String s){
		name = s;
	}
	public String getName(){
		String s = this.name+" = #"+this.number;
		return s;
	}
}

public class Person {
	private int age;
	private boolean isMale;
	private String name;
	
	public Person(){
		this.age = 0;
		this.isMale = true;
		this.name = "";
	}
	public String getName(){
		return this.name;
	}
	public void setName(String newName){
		this.name = newName;
	}
	public int getAge(){
		return this.age;
	}
	public boolean getGender(){
		return this.isMale;
	}
	public void setGender(Boolean isMale){
		this.isMale = isMale;
	}
	public void setAge(int Age){
		this.age = Age;
	}
	public Person(String newName, int Age, Boolean isMale){
		this.name = newName;
		this.age = Age;
		this.isMale = isMale;
	}
}

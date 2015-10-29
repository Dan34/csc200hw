
public class drivar {
	public static int testequal(Person a, Person b){
		if (a.getGender() == b.getGender() && a.getName().equals(b.getName()) && a.getAge() == b.getAge()){
			return 0;
		}else if(a.getAge() > b.getAge()){
			return 1;
		}else if(a.getAge() < b.getAge()){
			return 2;
		}else if(a.getAge() == b.getAge() && !a.getName().equals(b.getName()) || a.getGender() != b.getGender()){
			return 3;
		}else{
			return 4;
		}
	}
	public static boolean testName(Person a, Person b){
		if (a.getName().equals(b.getName())){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[]args){
		Person person1 = new Person("Dan",18,true);
		Person person2 = new Person("Dan",18,true);
		int result = testequal(person1,person2);
		switch (result){
		case 0:
			System.out.println("The two people are the same.");
			break;
		case 1:
			System.out.println(person1.getName()+" is older than "+person2.getName()+".");
			break;
		case 2:
			System.out.println(person2.getName()+" is older than "+person1.getName()+".");
			break;
		case 3:
			System.out.println("The two people are the same age.");
			break;
		case 4:
			System.out.println("Something went wrong. You should never see this message.");
			break;
		default:
			break;
		}
		boolean names = testName(person1,person2);
		if (names == false){
			System.out.print("The two people do not have the same name.");
		}else{
			System.out.print("The two people have the same name.");
		}
	}
}

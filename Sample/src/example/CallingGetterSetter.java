package example;

public class CallingGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetterSetter obj=new GetterSetter();
		obj.setName("BOB");
		obj.setAge(20);
		obj.setIdNum("123CB");

	    System.out.print("Name : " + obj.getName() + " Age : " + obj.getAge());

	}

}

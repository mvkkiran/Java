package javaTraining;

public class CloningExample {
	public static void main(String[] args)
	{
		 int[] a = {1,2,3};
		    int[] b = a.clone();
		    
		    /*int[] a is a separate object instance created on the heap and 
		    int[] b is a separate object instance created on the heap. (Remember all arrays are objects).*/

		    System.out.println(a == b ? "Same Instance":"Different Instance");
		    
		    /*when the source array contains objects. The clone method will return 
		     a reference to a new array, which references the same objects as the source array*/
		    Dog[] myDogs = new Dog[4];

		    myDogs[0] = new Dog("Wolf");
		    myDogs[1] = new Dog("Pepper");
		    myDogs[2] = new Dog("Bullet");
		    myDogs[3] = new Dog("Sadie");
		    
		    Dog[] myDogsClone = myDogs.clone();
		    
		    System.out.println(myDogs[0] == myDogsClone[0] ? "Same":"Different");
		    System.out.println(myDogs[1] == myDogsClone[1] ? "Same":"Different");
		    System.out.println(myDogs[2] == myDogsClone[2] ? "Same":"Different");
		    System.out.println(myDogs[3] == myDogsClone[3] ? "Same":"Different");
		    
		    
		    myDogsClone[0].setName("Ruff"); 
		    System.out.println(myDogs[0].getName());
		    
		    myDogsClone[1] = new Dog("Spot");
		    System.out.println(myDogsClone[1].getName());
		    System.out.println(myDogs[1].getName());
	}

}
class Dog{

    private String name;

    public Dog(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

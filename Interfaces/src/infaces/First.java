package infaces;

interface animal 
{

	public void cat();
	public void dog();
}

abstract class First implements animal {
	public void cat() {
		System.out.println("This is cat");
	}

	// public void dog() {
	// System.out.println("this is dog");
	// }
}

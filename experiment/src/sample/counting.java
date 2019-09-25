package sample;

public class counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=8,a=1;
		for(int i=n;i>0;i/=2)
		{
			for (int j = 0; j < i; j++) {
				System.out.println(a+"Hello");
				a++;
				
			}
		}
	}

}

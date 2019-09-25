package practice;

public class MakeChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int amount = 50;
		int denom[] = { 1, 2, 5, 10 };

		int m[] = new int[amount];
		m[1] = 1;
		m[2] = 1;
		m[5] = 1;
		m[10] = 1;
		
		for (int i = 2; i < m.length; i++) {

			if (m[i] == 1)
				continue;

			int large = 99999;
			for (int j = 0; j < denom.length; j++) {
				if (i - denom[j] >= 0) {
					if(large < m[i - denom[j]]){
						
					}
					else
						{
						large=m[i - denom[i]];
						}
					}

				}
			m[i] = large + 1;
			}
			

		

		for (int i = 0; i < m.length; i++) {
			System.out.println(i + " " + m[i]);
		}

	}

}

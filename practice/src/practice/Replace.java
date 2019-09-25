package practice;

public class Replace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input="hai this is kiran";
		char ch[]=input.toCharArray();
		StringBuilder sb=new StringBuilder();
		for (char c : ch) {
			if(c==' '){
				sb.append("%20");
			}
			else{
			sb.append(c);
			}
		}
		
		System.out.println(sb.toString());

	}

}

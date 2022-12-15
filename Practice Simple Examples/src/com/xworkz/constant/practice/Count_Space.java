package com.xworkz.constant.practice;



public class Count_Space {

	public static void main(String[] args) {

		
		int space=0;
		String str="count white space";
		
		for(int i=0;i<=str.charAt(i);i++) {
			if(str.charAt(i)==' ') {
				
				space++;
			}
			
		}
		
		//Scanner scanner=new Scanner(System.in);
		// creater scanner object for input
		//str=scanner.nextLine();
	//	for(int i = 0;i<str.length();i++) {
		//	char ch=str.charAt(i);
				//	if(ch==' ') {
					//	space++;
					//}
		//}
		System.out.println(space);
	}

}

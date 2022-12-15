
public class CountRemoveSpace {

	public static void main(String[] args) {

		//finding the number of spaces without using length
		String str= "Hands on learning happens here";
		String s="";
		int count=0;
		for(char ch:str.toCharArray())
		{
		if(ch==' ') {
			// after checking condition,if condition become false it will go for else and store the char in side string  s=";
			// if condition is true it will not go for else it will count the space
			count+=1;//count=count+1;or count=count++;
		}else {
			s+=ch;//s=s+ch;	//it is ude to store the char value 
			}
		}	
		System.out.println("white space:"+count);
		System.out.println("String without space:"+s);
		}
	}



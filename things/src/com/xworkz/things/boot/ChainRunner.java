package com.xworkz.things.boot;

import com.xworkz.things.Chain; 

public class ChainRunner {

	public static void main(String[] args) {
		
		
		System.out.println(System.lineSeparator());
		Chain chain=new Chain("Round");
		System.out.println(chain.type);
		
		System.out.println(System.lineSeparator());
		Chain chain1=new Chain("iron",2.5);
		System.out.println(chain1.material);
		System.out.println(chain1.weight);
		
		
		System.out.println(System.lineSeparator());
		Chain chain2=new Chain(2.5);
		System.out.println(chain2.weight);
				
         
		System.out.println(System.lineSeparator());
		Chain chain3=new Chain(6,"Round");
		System.out.println(chain3.length);
		System.out.println(chain3.type);
		
		System.out.println(System.lineSeparator());
		Chain chain4=new Chain(false,"Round","nayiKattiHakoke")
		System.out.println(chain4.stolen);
		System.out.println(chain4.type);
		System.out.println(chain4.usedFor);
		
		System.out.println(System.lineSeparator());
		Chain chain5=new Chain(2.5,true);
		System.out.println(chain5.weight);
		System.out.println(chain5.fresh);
		
		System.out.println(System.lineSeparator());
		Chain chain6=new Chain("Round",6,"iron",2.5,true);
		System.out.println(chain6.type);
		System.out.println(chain6.length);
		System.out.println(chain6.material);
		System.out.println(chain6.weight);
		System.out.println(chain6.fresh);
		
		
		
		
		
	}

}

package com.xworkz.constant.Relation.boot;
import com.xworkz.constant.Relation.PoliticalParty;
import com.xworkz.constant.Relation.BJP;
public class PoliticalPartyRunner {

	public static void main(String[] args) {
		PoliticalParty politicalParty=new PoliticalParty("Amith shaw","C T Ravi");
		politicalParty.display();
		
		BJP bJP =new BJP("Modi","J P NADDA","Delhi");
        bJP.display();
        
	}
}


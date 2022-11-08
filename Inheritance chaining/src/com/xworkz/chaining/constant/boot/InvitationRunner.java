package com.xworkz.chaining.constant.boot;

import com.xworkz.chaining.constant.Invitation;

import com.xworkz.chaining.constant.Card;
public class InvitationRunner {
	
	public static void main(String[] args) {
		
	
	Invitation invitation=new Card("Pavan","hubballi","Red");
	System.out.println(invitation.color);
	System.out.println(invitation.location);
	System.out.println(invitation.personName);
	
	Card invitation2=new Card("ankush","Koppal","Pink");
	System.out.println(invitation2.color);
	System.out.println(invitation2.location);
	System.out.println(invitation2.personName);

}
}
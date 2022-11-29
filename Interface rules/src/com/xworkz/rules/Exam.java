package com.xworkz.rules;


public class Exam implements ExamRules{
	
	@Override
	public boolean mobilesArenotAllowed ()
	{
		return true;
	}
	@Override
	public boolean idCards()
	{
		return true;
	}
	@Override
	public boolean ownCasli()
	{
		return true;
	}
	@Override
	public boolean noChits()
	{
		return true;
	}
	@Override
	public boolean hallTicketMandatory()
	{
		return true;
	}

}

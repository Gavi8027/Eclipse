package com.xworkz.rules;

public class Bank implements BankRules {
	
	@Override
	public boolean account()
	{
		return true;
	}
	@Override
	public boolean PassbookMandatory()
	{
		return true;
	}
	@Override
	public boolean CandidatePresnt()
	{
		return true;
	}
	@Override
		public boolean CandidateSign()
		{
			return true;
		}
	@Override
		public boolean Photo()
		{
			return true;
		}
	}



package com.xworkz.abstraction;

public class VijayaLakshmi extends  JavaTrainee implements KarnatakaRTO{

	@Override
	public boolean paidTax(double tax) {
		System.out.println("Running Paidtax");
		return false;
	}

	@Override
	public double gst() {
    System.out.println("Running gst");
		return 0;
	}

	@Override
	public double vat() {
       System.out.println("Running vat");
		return 0;
	}

}

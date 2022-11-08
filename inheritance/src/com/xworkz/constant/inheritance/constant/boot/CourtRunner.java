package com.xworkz.constant.inheritance.constant.boot;

import com.xworkz.constant.inheritance.constant.Court;
import com.xworkz.constant.inheritance.constant.DistrictCourt;
import com.xworkz.constant.inheritance.constant.HighCourt;
import com.xworkz.constant.inheritance.constant.SupremeCourt;

public class CourtRunner {
	
	
	public static void main(String[] args) {
		
		Court court=new Court();
		
		System.out.println(court.color);
		System.out.println(court.havingJudge);
		
		HighCourt court1=new HighCourt();
		HighCourt highCourt=(HighCourt) court1;
		
		System.out.println(highCourt.judgeName);
		System.out.println(highCourt.location);
		
		SupremeCourt court2=new SupremeCourt();
		SupremeCourt supremeCourt=(SupremeCourt) court2;
		
		System.out.println(supremeCourt.judgeName);
		System.out.println(supremeCourt.location);
		
		DistrictCourt court3=new DistrictCourt();
		DistrictCourt districtCourt=(DistrictCourt) court3;
		
		System.out.println(districtCourt.location);
		System.out.println(districtCourt.name);
		
		
		
		
		
	}

}

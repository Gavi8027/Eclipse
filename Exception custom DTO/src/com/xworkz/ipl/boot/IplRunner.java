package com.xworkz.ipl.boot;

import java.time.LocalDateTime;

import com.xworkz.ipl.dto.IplDTO;
import com.xworkz.ipl.dto.repository.IplRepository;
import com.xworkz.ipl.dto.repository.IplRepositoryImpl;

public class IplRunner {

	public static void main(String[] args) {

		IplRepository iplrepository=new IplRepositoryImpl();	
		
		IplDTO ipl=new IplDTO();
		
		ipl.setCreatedBy("gavi");
		ipl.setCreatedDate(LocalDateTime.of(2022, 12, 12, 10, 30));
		ipl.setUpdatedBy("System");
		ipl.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 10, 35));
		ipl.setCaptainName("Virat");
		ipl.setLoss(113);
		ipl.setNoOfPlayers(15);
		ipl.setNoOfSponoers(26);
		ipl.setOwnerWifename("Vini Raman");
		ipl.setRanking(5);
		ipl.setTeamName("RCB");
		ipl.setRatings(0);
		ipl.setWonerAlive(true);
		iplrepository.create(ipl);
		System.out.println(iplrepository.total());
		ipl.showOff();
		
		System.out.println("==");
		
IplDTO ipl1=new IplDTO();
		
		ipl1.setCreatedBy("gavi");
		ipl.setCreatedDate(LocalDateTime.of(2022, 12, 12, 10, 30));
		ipl1.setUpdatedBy("System");
		ipl1.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 10, 35));
		ipl1.setCaptainName("Virat");
		ipl1.setLoss(113);
		ipl1.setNoOfPlayers(15);
		ipl1.setNoOfSponoers(26);
		ipl1.setOwnerWifename("Vini Raman");
		ipl1.setRanking(5);
		ipl1.setTeamName("RCB");
		ipl1.setRatings(0);
		ipl1.setWonerAlive(true);
		iplrepository.create(ipl1);
		System.out.println(iplrepository.total());
		ipl1.showOff();
		
		System.out.println("==");
		
IplDTO ipl2=new IplDTO();
		
		ipl2.setCreatedBy("gavi");
		ipl2.setCreatedDate(LocalDateTime.of(2022, 12, 12, 10, 30));
		ipl2.setUpdatedBy("System");
		ipl2.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 10, 35));
		ipl2.setCaptainName("Virat");
		ipl2.setLoss(113);
		ipl2.setNoOfPlayers(15);
		ipl2.setNoOfSponoers(26);
		ipl2.setOwnerWifename("Vini Raman");
		ipl2.setRanking(5);
		ipl2.setTeamName("RCB");
		ipl2.setRatings(0);
		ipl2.setWonerAlive(true);
		iplrepository.create(ipl2);
		System.out.println(iplrepository.total());
		ipl.showOff();
		
		System.out.println("==");
		
IplDTO ipl3=new IplDTO();
		
		ipl3.setCreatedBy("gavi");
		ipl3.setCreatedDate(LocalDateTime.of(2022, 12, 12, 10, 30));
		ipl3.setUpdatedBy("System");
		ipl3.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 10, 35));
		ipl3.setCaptainName("Virat");
		ipl3.setLoss(113);
		ipl3.setNoOfPlayers(15);
		ipl3.setNoOfSponoers(26);
		ipl3.setOwnerWifename("Vini Raman");
		ipl3.setRanking(5);
		ipl3.setTeamName("RCB");
		ipl3.setRatings(0);
		ipl3.setWonerAlive(true);
		iplrepository.create(ipl3);
		System.out.println(iplrepository.total());
		ipl.showOff();
		
		System.out.println("==");
		
IplDTO ipl4=new IplDTO();
		
		ipl4.setCreatedBy("gavi");
		ipl4.setCreatedDate(LocalDateTime.of(2022, 12, 12, 10, 30));
		ipl4.setUpdatedBy("System");
		ipl4.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 10, 35));
		ipl4.setCaptainName("Virat");
		ipl4.setLoss(113);
		ipl4.setNoOfPlayers(15);
		ipl4.setNoOfSponoers(26);
		ipl4.setOwnerWifename("Vini Raman");
		ipl4.setRanking(5);
		ipl4.setTeamName("RCB");
		ipl4.setRatings(0);
		ipl4.setWonerAlive(true);
		iplrepository.create(ipl4);
		System.out.println(iplrepository.total());
		ipl.showOff();
		
		System.out.println("==");
		
IplDTO ipl5=new IplDTO();
		
		ipl5.setCreatedBy("gavi");
		ipl5.setCreatedDate(LocalDateTime.of(2022, 12, 12, 10, 30));
		ipl5.setUpdatedBy("System");
		ipl5.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 10, 35));
		ipl5.setCaptainName("Virat");
		ipl5.setLoss(113);
		ipl5.setNoOfPlayers(15);
		ipl5.setNoOfSponoers(26);
		ipl5.setOwnerWifename("Vini Raman");
		ipl5.setRanking(5);
		ipl5.setTeamName("RCB");
		ipl5.setRatings(0);
		ipl5.setWonerAlive(true);
		iplrepository.create(ipl5);
		System.out.println(iplrepository.total());
		ipl.showOff();
		
		System.out.println("==");
		
IplDTO ipl6=new IplDTO();
		
		ipl6.setCreatedBy("gavi");
		ipl6.setCreatedDate(LocalDateTime.of(2022, 12, 12, 10, 30));
		ipl6.setUpdatedBy("System");
		ipl6.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 10, 35));
		ipl6.setCaptainName("Virat");
		ipl6.setLoss(113);
		ipl6.setNoOfPlayers(15);
		ipl6.setNoOfSponoers(26);
		ipl6.setOwnerWifename("Vini Raman");
		ipl6.setRanking(5);
		ipl6.setTeamName("RCB");
		ipl6.setRatings(0);
		ipl6.setWonerAlive(true);
		iplrepository.create(ipl6);
		System.out.println(iplrepository.total());
		ipl.showOff();
		
		System.out.println("==");
		
IplDTO ipl7=new IplDTO();
		
		ipl7.setCreatedBy("gavi");
		ipl7.setCreatedDate(LocalDateTime.of(2022, 12, 12, 10, 30));
		ipl7.setUpdatedBy("System");
		ipl7.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 10, 35));
		ipl7.setCaptainName("Virat");
		ipl7.setLoss(113);
		ipl7.setNoOfPlayers(15);
		ipl7.setNoOfSponoers(26);
		ipl7.setOwnerWifename("Vini Raman");
		ipl7.setRanking(5);
		ipl7.setTeamName("RCB");
		ipl7.setRatings(0);
		ipl7.setWonerAlive(true);
		iplrepository.create(ipl7);
		System.out.println(iplrepository.total());
		ipl.showOff();
		
		System.out.println("==");
		
IplDTO ipl8=new IplDTO();
		
		ipl8.setCreatedBy("gavi");
		ipl8.setCreatedDate(LocalDateTime.of(2022, 12, 12, 10, 30));
		ipl8.setUpdatedBy("System");
		ipl8.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 10, 35));
		ipl8.setCaptainName("Virat");
		ipl8.setLoss(113);
		ipl8.setNoOfPlayers(15);
		ipl8.setNoOfSponoers(26);
		ipl8.setOwnerWifename("Vini Raman");
		ipl8.setRanking(5);
		ipl8.setTeamName("RCB");
		ipl8.setRatings(0);
		ipl8.setWonerAlive(true);
		iplrepository.create(ipl8);
		System.out.println(iplrepository.total());
		ipl.showOff();
		
		System.out.println("==");
		
IplDTO ipl9=new IplDTO();
		
		ipl9.setCreatedBy("gavi");
		ipl9.setCreatedDate(LocalDateTime.of(2022, 12, 12, 10, 30));
		ipl9.setUpdatedBy("System");
		ipl9.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 10, 35));
		ipl9.setCaptainName("Virat");
		ipl9.setLoss(113);
		ipl9.setNoOfPlayers(15);
		ipl9.setNoOfSponoers(26);
		ipl9.setOwnerWifename("Vini Raman");
		ipl9.setRanking(5);
		ipl9.setTeamName("RCB");
		ipl9.setRatings(0);
		ipl9.setWonerAlive(true);
		iplrepository.create(ipl9);
		System.out.println(iplrepository.total());
		ipl.showOff();
		
		System.out.println("==");
		
IplDTO ipl10=new IplDTO();
		
		ipl10.setCreatedBy("gavi");
		ipl10.setCreatedDate(LocalDateTime.of(2022, 12, 12, 10, 30));
		ipl10.setUpdatedBy("System");
		ipl10.setUpdatedDate(LocalDateTime.of(2022, 12, 12, 10, 35));
		ipl10.setCaptainName("Virat");
		ipl10.setLoss(113);
		ipl10.setNoOfPlayers(15);
		ipl10.setNoOfSponoers(26);
		ipl10.setOwnerWifename("Vini Raman");
		ipl10.setRanking(5);
		ipl10.setTeamName("RCB");
		ipl10.setRatings(0);
		ipl10.setWonerAlive(true);
		iplrepository.create(ipl10);
		System.out.println(iplrepository.total());
		ipl.showOff();
		
		System.out.println("==");
	}

}

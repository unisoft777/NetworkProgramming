package com.poly03.inter.engincontroller;

public class AcompanyImpl extends Object implements CarEnginControllerInter{
 
	
	
	@Override
	public void engineSpeedUp() {
		System.out.println("전기모터를 1만큼 가속시킨다.");
		
	}

	@Override
	public void engineSpeedDown() {
		System.out.println("전기모터를 1만큼 가속시킨다.");
		
	}

	@Override
	public void absSystem() {
		System.out.println("abs를 작동시킨다.");
		
	}

}

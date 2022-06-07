package com.poly03.inter.engincontroller;

public class BcompanyImpl implements CarEnginControllerInter {

	@Override
	public void engineSpeedUp() {
		System.out.println("전기 모터를 2만큼 가속시킨다.");
		
	}

	@Override
	public void engineSpeedDown() {
		System.out.println("전기 모터를 2만큼 가속시킨다.");
		
	}

	@Override
	public void absSystem() {
		System.out.println("abs 시스템을 가동시킨다.");
		
	}

}

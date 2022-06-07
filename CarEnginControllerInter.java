package com.poly03.inter.engincontroller;

//인터페이스 = 완전(100프로) 다형성 보장(모든 메서드가 추상(불완전)메서드 여야 한다.)
public interface  CarEnginControllerInter { //역할 지정
	 
	
	public static final int MAX=300;
	public int MIN=1; //static final은 생략 가능
	
	public  void engineSpeedUp();  //불완전 메서드 abstract 생략가능
	public  void engineSpeedDown();
	public  void absSystem();
     
}

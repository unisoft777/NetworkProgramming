package com.poly03.inter;

import com.poly03.inter.engincontroller.AcompanyImpl;
import com.poly03.inter.engincontroller.CarEnginControllerInter;

public class Interface01 {

	public static void main(String[] args) {
		
		// CarEnginControllerInter  cec = new CarEnginControllerInter();
		CarEnginControllerInter  cec = new AcompanyImpl();
		cec.engineSpeedDown();
		cec.engineSpeedUp();
		cec.absSystem();

	}

}

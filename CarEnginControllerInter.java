package com.poly03.inter.engincontroller;

//�������̽� = ����(100����) ������ ����(��� �޼��尡 �߻�(�ҿ���)�޼��� ���� �Ѵ�.)
public interface  CarEnginControllerInter { //���� ����
	 
	
	public static final int MAX=300;
	public int MIN=1; //static final�� ���� ����
	
	public  void engineSpeedUp();  //�ҿ��� �޼��� abstract ��������
	public  void engineSpeedDown();
	public  void absSystem();
     
}

package com.pattern.behavior.f_momento;

/**
 * 备忘录模式
 * @author xhk
 * @date 2018年2月24日
 */
public class MainClass {

	public static void main(String[] args) {
		Originator originator = new Originator();
		CareTaker careTaker = new CareTaker();
		
		originator.setState("state #1");
		originator.setState("state #2");
		careTaker.addMomento(originator.momento());
		originator.setState("state #3");
		careTaker.addMomento(originator.momento());
		originator.setState("state #4");
		
		System.out.println("current state :" + originator.getState());
		originator.getStateFromMomento(careTaker.getMomento(0));
		System.out.println("first saved state :" + originator.getState());
		originator.getStateFromMomento(careTaker.getMomento(1));
		System.out.println("second saved state :" + originator.getState());
	}

}

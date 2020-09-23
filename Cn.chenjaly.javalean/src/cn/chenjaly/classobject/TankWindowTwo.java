package cn.chenjaly.classobject;

import java.awt.Toolkit;

import TankWar.Tank;

public class TankWindowTwo {

	public int x = 20;
	
	public Tank tank1 = new Tank();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank t = new Tank();
		System.out.println(t.getX());
		
		Tank t2 = new Tank(300,400);
		System.out.println(t2.getX());
		System.out.println(t2.getSpeed());
		
		Tank t3 = new Tank(200,300,50,50,40,Toolkit.getDefaultToolkit().getImage("src/image"));
		System.out.println(t3.getSpeed());
	}

}

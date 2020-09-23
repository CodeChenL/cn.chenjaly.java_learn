package TankWar;

import java.awt.Graphics;
import java.awt.Image;
//import java.awt.image;

//import cn.chenjaly.javalearn.retum;

import java.awt.Toolkit;

import cn.chenjaly.classobject.TankWindowTwo;

public class Tank {

	protected int x = 100;
	protected int y = 100;
	
	protected int w = 50;
	protected int h = 50;
	
	protected int speed = 10;
	
	private Image image = Toolkit .getDefaultToolkit().getImage("src/image");
	
	public Tank(int x,int y,int w,int h,int speed,Image image) {
		this.x = x;
		this.y = y;
		this.w = w;
		this.h = h;
		this.speed = speed;
		this.image = image;
		
	}
	
	public Tank(int x,int y) {
		this.x = x;
		this.y = y;
	}
	
	public Tank() {
		
	}
	
	public void move() {
		
	}
	
	public void paint(Graphics g) {

		g.drawImage(image, x, y, null);
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getSpeed() {
		return this.speed;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tank tank1 = new Tank();
		System.out.println(tank1.x);
		System.out.println(tank1.getX());
		
		TankWindowTwo tw2 = new TankWindowTwo();
		System.out.println(tw2.x);
		
		System.out.println(tw2.tank1.getX());
	}

}

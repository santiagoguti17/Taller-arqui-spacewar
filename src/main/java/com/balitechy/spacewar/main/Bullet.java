package com.balitechy.spacewar.main;

import com.balitechy.spacewar.main.interfaces.BulletGraphic;

import java.awt.Graphics;

public class Bullet {
	
	private double x;
	private double y;
	public static final int WIDTH = 11;
	public static final int HEIGHT = 21;
	private BulletGraphic graphic;

	public Bullet(double x, double y) {
		this.x = x;
		this.y = y;
		this.graphic = GameConfig.getFactory().createBullet();
	}
	
	public void tick(){
		y -= 5;
	}

	public void render(Graphics g) {
		graphic.render(g, x, y);
	}
	public double getY(){
		return y;
	}
}

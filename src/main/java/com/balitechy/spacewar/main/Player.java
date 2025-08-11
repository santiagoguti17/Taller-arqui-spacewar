package com.balitechy.spacewar.main;

import com.balitechy.spacewar.main.interfaces.BulletGraphic;
import com.balitechy.spacewar.main.interfaces.PlayerGraphic;
import com.balitechy.spacewar.main.spritesstyle.SpritesBullet;
import com.balitechy.spacewar.main.vectorialstyle.VectorialBullet;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class Player {

	private double x;
	private double y;
	
	private double velX;
	private double velY;
	
	public static final int WIDTH = 56;
	public static final int HEIGHT = 28;

	private Game game;


	private PlayerGraphic graphic;


	public Player(double x, double y, Game game) {
		this.x = x;
		this.y = y;
		this.graphic = GameConfig.getFactory().createPlayer();
		this.game = game;
	}

	public void setVelX(double velX) {
		this.velX = velX;
	}

	public void setVelY(double velY) {
		this.velY = velY;
	}

	public void shoot() {
		Bullet b = new Bullet(x + (WIDTH / 2) - 5, y - 18);
		game.getBullets().addBullet(b);
	}

	public void tick(){
		x += velX;
		y += velY;
		
		// To avoid player go outside the arena.		
		if(x <= 0)
			x = 0;
		if(x >= (Game.WIDTH * Game.SCALE) - WIDTH)
			x = (Game.WIDTH * Game.SCALE) - WIDTH;
		if(y <= 0)
			y = 0;
		if(y >= (Game.HEIGHT * Game.SCALE) - HEIGHT)
			y = (Game.HEIGHT * Game.SCALE) - HEIGHT;
	}

	public void render(Graphics g) {
		graphic.render(g, x, y);
	}
}

package com.pattern.behavior.observer;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observable;
import java.util.Observer;

@SuppressWarnings("serial")
public class BoxObserver extends Frame {
	Observable observable = new BoxObservable();
	public BoxObserver(int grid) {
		setTitle("Demo Observer Pattern");
		setLayout(new GridLayout(grid, grid));
		for (int i = 0; i < grid; i++) {
			for (int j = 0; j < grid; j++) {
				add(new OCBox(i, j, observable));
			}
		}
	}
	
	public static void main(String[] args) {
		int grid = 8;
		Frame f = new BoxObserver(grid);
		f.setSize(500,400);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
	}
}

class OCBox extends Canvas implements Observer {
	Observable notifier;
	int x,y;
	Color color = newColor();
	static final Color[] colors = {
			Color.black,Color.blue,Color.cyan,
			Color.darkGray,Color.gray,Color.green,
			Color.lightGray,Color.magenta,
			Color.orange,Color.pink,Color.red,
			Color.white,Color.yellow
	};
	
	private static Color newColor(){
		return colors[(int) (Math.random() * colors.length)];
	}

	public OCBox(int x, int y, Observable notifier) {
		this.x = x;
		this.y = y;
		notifier.addObserver(this);
		this.notifier = notifier;
		addMouseListener(new ML());
	}
	
	public void paint(Graphics g){
		g.setColor(color);
		Dimension size = getSize();
		g.fillRect(0, 0, size.width, size.height);
	}
	
	class ML extends MouseAdapter {
		@Override
		public void mousePressed(MouseEvent e) {
			notifier.notifyObservers(OCBox.this);
		}
	}
	
	@Override
	public void update(Observable o, Object arg) {
		OCBox clicked = (OCBox) arg;
		if(nextTo(clicked)){
			color = clicked.color;
			repaint();
		}
	}
	
	private final boolean nextTo(OCBox b){
		return Math.abs(x - b.x) <= 1 && Math.abs(y - b.y) <= 1;
	}
}

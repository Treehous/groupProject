package edu.ycp.cs320.groupProject.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import edu.ycp.cs320.groupProject.controller.StageController;
import edu.ycp.cs320.groupProject.model.Ball;
import edu.ycp.cs320.groupProject.model.Paddle;
import edu.ycp.cs320.groupProject.model.StageModel;



public class StageView extends JPanel {
	
	/** Width of the window */
	private static final int WIDTH = 600;
	
	/** Height of window */
	private static final int HEIGHT = 600;
	
	/**Width of the Paddle*/
	private static final int PADDLE_WIDTH = 80;
	
	/** Height of the Paddle */
	private static final int PADDLE_HEIGHT = 116;
	
	private Paddle paddle;
	private Ball ball;
	private StageController controller;
	private StageModel model;
	
	
	
	
	
	public StageView() {
		setBackground(new Color(100, 100, 100));
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		
		/*
		MouseAdapter listener = new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				handleMousePressed(e);
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				handleMouseDragged(e);
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				handleMouseReleased(e);
			}
		};
		addMouseListener(listener);
		addMouseMotionListener(listener);*/
	}
	
	public void setModel(StageModel model) {
		this.model = model;
	}
	
	public void setController(StageController controller) {
		this.controller = controller;
	}
	
	public static void main(final String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				StageView view = new StageView();
				
				StageController controller = new StageController();
				
				StageModel model = new StageModel();
				
				view.setModel(model);
				view.setController(controller);
				
				JFrame frame = new JFrame("p4ng");
				frame.setContentPane(view);
				frame.pack();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
	
	@Override
	protected void paintComponent(Graphics g) {
	
		super.paintComponent(g);
		
		drawBall(g, ball.getX(), ball.getY(), ball);
		
		
	}
	

	@SuppressWarnings("unused")
	private void drawPaddle(Graphics g, int x, int y, Paddle paddle) {
		
		g.setColor(Color.BLACK);
		g.drawRect(x, y, PADDLE_WIDTH, PADDLE_HEIGHT);
		
		
	}
	
	
	private void drawBall(Graphics g, int x, int y, Ball ball)
	{
		g.setColor(Color.BLACK);
		g.drawOval(x, y, ball.getRadius()*2, ball.getRadius()*2);
	}
}

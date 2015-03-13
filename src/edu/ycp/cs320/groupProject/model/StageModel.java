package edu.ycp.cs320.groupProject.model;

public class StageModel {
	
	Paddle paddle = new Paddle();
	Ball ball = new Ball();
	
	public StageModel()
	{
		
	}
	
	public Paddle getPaddle()
	{
		return paddle;
	}
	
	public Ball getBall()
	{
		return ball;
	}

}

package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class AutoDrive {
	
	
	boolean finished;
	int time;
	int timer = 0;
	double speed;
	
	
	public AutoDrive(double velocity, int seconds){
		time = seconds;
		speed = velocity;
	}
	protected void initalize(){
		finished = false;
		RobotMap.drive.arcadeDrive(speed, 0);
		//RobotMap.gay.kys(no,no);
		
	}
	protected void execute(){
		timer++;
		if(timer==time){
			finished = true;
		}
	}
	protected boolean isFinished(){
		return finished;
		
	}
	protected void end(){
		RobotMap.drive.arcadeDrive(0, 0);
		timer = 0;
		end();
	}
}

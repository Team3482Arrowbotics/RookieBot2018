package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class AutoDrive extends Command {

	double speed;
	double time;
	double timer = 0;
	boolean finished = false;

	public AutoDrive(double velocity, double seconds) {
		speed = velocity;
		time = seconds;
	}

	protected void initialize() {
		RobotMap.drive.arcadeDrive(speed, 0);
	}

	protected void execute() {
		timer++;
		if(timer == time){
			finished = true;
		}
	}

	protected boolean isFinished() {
		return finished;
	}

	protected void end() {
		RobotMap.drive.arcadeDrive(0, 0);
		timer = 0;
		end(); //what
	}

}
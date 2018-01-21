package org.usfirst.frc.team3482.robot.commands;

import java.util.Timer;

import org.usfirst.frc.team3482.robot.Robot;
import org.usfirst.frc.team3482.robot.RobotMap;
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team3482.robot.commands.Turn;

public class DriveToWall extends Command{
	double distance = RobotMap.rangeFinder.getAverageVoltage();
	int stop = 0, stopdist, counter = 0;
	double speed = 0.1;
	int drivemode = 0;
	boolean counting = false;
	int amount = 0;
	
	protected void initialize() {
		if (stopdist > 5) {
			stopdist = 5;
		}
		if (distance < 0.1) {
			drivemode = 1;
		}
	}
	protected void execute() {
		distance = RobotMap.rangeFinder.getVoltage();
		System.out.println("Range Finder Value: " + distance + " Speed: " + speed);
		if (distance < 0.07) {
			speed = 1;
		}
		if (distance >= 0.07 && distance < 0.25) {
			speed = 0.66;
		}
		if (distance >= 0.25 && drivemode < 0.7) {
			speed = 0.33;
		}
		if (distance >= 0.7) {
			speed = 0;
		}
		if(speed == 0) {
			counter++;
		}
		
		RobotMap.drive.arcadeDrive(0, -speed); //reversed because rookie bot is wonk shit
		
	}
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return counter > 20;
	}

}

package org.usfirst.frc.team3482.robot.commands;

import java.util.Timer;

import org.usfirst.frc.team3482.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class DriveToWall extends Command{
	double distance = RobotMap.rangeFinder.getAverageVoltage();
	int stop = 0, stopdist;
	double speed = 0;
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
		else{

			
		}
	}
	protected void execute() {
		distance = RobotMap.rangeFinder.getAverageVoltage();
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
		if (speed == 0) {
			
		}
		RobotMap.drive.arcadeDrive(0, -speed); //reversed because rookie boot is wonk shit
		
	}
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}

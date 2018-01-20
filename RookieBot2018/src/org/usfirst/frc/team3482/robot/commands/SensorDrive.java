package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class SensorDrive extends Command{
	double dist = RobotMap.rangeFinder.getVoltage();
	double speed;
	boolean whiel = true;
	public SensorDrive(double speed){
		this.speed = speed;
	}
	protected void initialize(){
		RobotMap.drive.arcadeDrive(speed, 0);
	}
	protected void execute(){
		while(whiel == true) {
			if (dist >= 1) {
				speed *= 0.5;
				RobotMap.drive.arcadeDrive(speed, 0);
				if (dist >= 2) {
					whiel = false;
				}
			}
		}
	}
	protected boolean isFinished() {
		return false; // what
	}
	protected void end() {
		whiel = true;
		RobotMap.drive.arcadeDrive(0, 0);
		end(); //what
	}
}	
package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

public class AutoDrive {
	double speed;
	double time;
	double timer = 0;
	public AutoDrive(speed, time) {
		protected void initialize() {
			RobotMap.drive.arcadeDrive(speed, 0);
		}
		protected void execute() {
			timer++;
		}
		protected boolean isFinished() {
			return false;
		}
		protected void end() {
			RobotMap.drive.arcadeDrive(0, 0);
			timer = 0;
			end(); //what
		}
	}
}

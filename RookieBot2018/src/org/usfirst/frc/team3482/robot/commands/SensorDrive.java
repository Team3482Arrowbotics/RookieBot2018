package org.usfirst.frc.team3482.robot.commands;

package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

protected class SensorDrive {
	double dist = RobotMap.rangeFinder();
	double speed;
	protected void drive(double speed){
		protected void initialize(){
			RobotMap.drive.arcadeDrive(speed, 0);
		}
		protected void execute(){
			while(true) {
				if (dist >= 1) {
					speed *= 0.5;
					RobotMap.drive.arcadeDrive(speed, 0);
					if (dist >= 2) {
						break;
					}
				}
			}
		}
		protected boolean isFinished() {
			return false; // what
		}
		protected void end() {
			RobotMap.drive.arcadeDrive(0, 0);
			end(); //what
		}
	}	
}

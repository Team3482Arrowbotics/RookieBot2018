package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

public class AutoTurn {
	double currentAngle = RobotMap.navx.getAngle();
	double angleGoal1 = currentAngle + 90;
	double angleGoal2 = currentAngle - 90
	public void turn(boolean x){
		if (x = true){
			while (true){
				RobotMap.drive.arcadeDrive(90, 0);
				if(currentAngle != angleGoal1){
					// pid shit nibba
				}
			}
		} else if (x = false){
			while (true){
				RobotMap.drive.arcadeDrive(-90, 0);
				if (currentAngle != angleGoal2){
					//pid shit nibba
				}
			}
		}
	}
}

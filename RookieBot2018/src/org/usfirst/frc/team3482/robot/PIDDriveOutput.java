package org.usfirst.frc.team3482.robot;

import edu.wpi.first.wpilibj.PIDOutput;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


public class PIDDriveOutput implements PIDOutput{
	
	DifferentialDrive drive;
	public PIDDriveOutput(DifferentialDrive d){
		drive = d;
	}
	@Override
	public void pidWrite(double output) {
		drive.arcadeDrive(-output, 0); //swap for new bot
		System.out.println("Error: " + RobotMap.gyro.getError() + " Output: " + output);
		
	}


}

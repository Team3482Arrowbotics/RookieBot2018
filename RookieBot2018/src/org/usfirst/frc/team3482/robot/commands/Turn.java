package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class Turn extends Command{
	double start, target, p, tolerance, delta;
	boolean onTarget = false;
	public Turn(double delta, double tolerance){
		this.delta = delta;
		start = RobotMap.navx.getYaw();
		target = 360 - (start + delta);
		this.tolerance = tolerance;
	}
	protected void execute(){
		double pos = RobotMap.navx.getYaw();
		delta = target - pos;
		double turnSpeed = p * delta;
		System.out.println("Position: " +  pos + "\nDelta: " + (target-pos));
		if (Math.abs(delta) <= tolerance){
			onTarget = true;
		}
		else if(delta > 0){
			RobotMap.drive.arcadeDrive(0, turnSpeed);
		}
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return onTarget;
	}
	protected void end(){
		RobotMap.drive.stopMotor();
	}

}

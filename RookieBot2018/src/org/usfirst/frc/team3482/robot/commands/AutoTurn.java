package org.usfirst.frc.team3482.robot.commands;

import org.usfirst.frc.team3482.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class AutoTurn extends Command{
	double angleTurn;
	public AutoTurn(double aoT){
		angleTurn = aoT;
	}
	public void initialize(){
		RobotMap.rotationController.enable();
		RobotMap.rotationController.setSetpoint(angleTurn);
	}
	public void execute(){
	
	}
	public boolean isFinished(){
		return false;
	}
	public void end(){
		RobotMap.rotationController.disable();
		end();
	}
}

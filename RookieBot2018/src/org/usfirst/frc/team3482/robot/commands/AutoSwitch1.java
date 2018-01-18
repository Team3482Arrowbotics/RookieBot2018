package org.usfirst.frc.team3482.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoSwitch1 extends CommandGroup{
	public AutoSwitch1() {
		addSequential(AutoDrive(0.5, 5))
		addSequential(AutoTurn(90))
		addSequential(SensorDrive())
	}
}

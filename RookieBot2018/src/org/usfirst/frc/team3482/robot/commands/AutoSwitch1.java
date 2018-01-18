package org.usfirst.frc.team3482.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team3482.robot.commands.AutoDrive;
import org.usfirst.frc.team3482.robot.commands.SensorDrive;

public class AutoSwitch1 extends CommandGroup{
	public void AutoSwitch1() {
		addSequential(AutoDrive(1.1, 0.4));
		addSequential(AutoTurn(90));
		addSequential(SensorDrive());
	}
}

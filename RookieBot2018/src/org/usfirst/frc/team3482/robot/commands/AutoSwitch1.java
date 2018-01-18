package org.usfirst.frc.team3482.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.CommandGroup;
import org.usfirst.frc.team3482.robot.commands.AutoDrive;
import org.usfirst.frc.team3482.robot.commands.SensorDrive;

public class AutoSwitch1 extends CommandGroup{
	public AutoSwitch1() {
		addSequential(new AutoDrive(0.4, 1.1));
		addSequential(new AutoTurn(90));
		addSequential(new SensorDrive(0.4));
	}
}

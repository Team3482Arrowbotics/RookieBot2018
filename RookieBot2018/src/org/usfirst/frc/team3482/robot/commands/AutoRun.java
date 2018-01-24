package org.usfirst.frc.team3482.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoRun extends CommandGroup{
	addSeqential(new Autodrive(0.5, 50));
}

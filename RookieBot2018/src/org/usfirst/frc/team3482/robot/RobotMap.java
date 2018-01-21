package org.usfirst.frc.team3482.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.PIDController;
import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {
	public static WPI_TalonSRX frontLeft;
	public static WPI_TalonSRX frontRight;
	public static WPI_TalonSRX backLeft;
	public static WPI_TalonSRX backRight;
	public static SpeedControllerGroup left;
	public static SpeedControllerGroup right;
	public static DifferentialDrive drive;
	public static AnalogInput rangeFinder;
	public static AHRSPID navx;
	public static PIDController gyro;
	public static PIDDriveOutput pidDrive;
	public static void init(){
		//drive talons
		frontLeft = new WPI_TalonSRX(8);
		frontRight = new WPI_TalonSRX(4);
		backLeft = new WPI_TalonSRX(1);
		backRight = new WPI_TalonSRX(0);
		//drive groupings
		left = new SpeedControllerGroup(frontLeft, backLeft);
		right = new SpeedControllerGroup(frontRight, backRight);
		//gyro
		rangeFinder = new AnalogInput(1);
		//drive train
		drive = new DifferentialDrive(left, right);
		drive.setDeadband(0.1);
		drive.setSafetyEnabled(false);
		
		pidDrive = new PIDDriveOutput(drive);
		navx = new AHRSPID(SPI.Port.kMXP);
		gyro = new PIDController(0.07, 0, 0, navx, pidDrive);
		gyro.setInputRange(-180, 180);
		gyro.setOutputRange(-.6, .6);
		gyro.setContinuous(true);
	  	gyro.setAbsoluteTolerance(1);
			
	}
}

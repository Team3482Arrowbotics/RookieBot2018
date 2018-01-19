package org.usfirst.frc.team3482.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.PIDSourceType;

public class EncoderPID extends WPI_TalonSRX implements PIDSource{
	public EncoderPID(int port) {
		// TODO Auto-generated constructor stub
		super(port);
	}
	@Override
	public double pidGet(){
		return this.getSensorCollection().getQuadraturePosition();
	}
	@Override
	public void setPIDSourceType(PIDSourceType pidSource) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public PIDSourceType getPIDSourceType() {
		// TODO Auto-generated method stub
		return null;
	}

}

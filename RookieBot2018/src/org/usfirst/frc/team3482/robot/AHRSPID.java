package org.usfirst.frc.team3482.robot;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.PIDSource;
import edu.wpi.first.wpilibj.SPI.Port;

public class AHRSPID extends AHRS implements PIDSource{
	
	public AHRSPID(Port spi_port_id) {
		super(spi_port_id);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double pidGet(){
		return this.getYaw();
	}
}

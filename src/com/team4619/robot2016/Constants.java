package com.team4619.robot2016;

import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.VictorSP;

public class Constants {
	
	//creates four motors
	public VictorSP frontLeft = new VictorSP(0);
	public VictorSP frontRight = new VictorSP(1);
	public VictorSP backLeft = new VictorSP(2);
	public VictorSP backRight = new VictorSP(3);
	
	//creates two shooters
	public VictorSP leftShooter = new VictorSP(4);
	public VictorSP rightShooter = new VictorSP(5);
	
	//creates actuator using TalonSRX
	public TalonSRX actuator = new TalonSRX(6);
	
}

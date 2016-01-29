package com.team4619.robot2016;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.VictorSP;

public class Constants {

	//created xboxcontroller object
	public static Joystick xBoxController = new Joystick(0);

	//creates four motors
	public static VictorSP frontLeft = new VictorSP(0);
	public static VictorSP frontRight = new VictorSP(1);
	public static VictorSP backLeft = new VictorSP(2);
	public static VictorSP backRight = new VictorSP(3);

	//creates two shooters
	public static VictorSP leftShooter = new VictorSP(4);
	public static VictorSP rightShooter = new VictorSP(5);

	//creates actuator using TalonSRX
	public static TalonSRX actuator = new TalonSRX(6);

	//creates robot drive
	public static RobotDrive driveMain = new RobotDrive(frontLeft, frontRight, backLeft, backRight);
	
	//creates constants for different SPEEDS
	public final double climbSpeed = .25;
}

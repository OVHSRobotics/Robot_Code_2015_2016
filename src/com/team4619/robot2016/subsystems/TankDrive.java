package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

public class TankDrive {
	public VictorSP frontLeft,
					frontRight,
					backLeft,
					backRight;

	Joystick xJoystick;
	

	RobotDrive driveMain = new RobotDrive (frontLeft, frontRight, backLeft, backRight);

	public TankDrive(VictorSP frontLeft,
			VictorSP frontRight,
			VictorSP backLeft,
			VictorSP backRight,
			Joystick xJoystick)
	{
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.backLeft = backLeft;
		this.backRight = backRight;
		this.xJoystick = xJoystick;
	}
	public void Drive()
	{
		//needs to add another joystick
		driveMain.tankDrive(xJoystick.getRawAxis(1), xJoystick.getRawAxis(5), true);
	}
}
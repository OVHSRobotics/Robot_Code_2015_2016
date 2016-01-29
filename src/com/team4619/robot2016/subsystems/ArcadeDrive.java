package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

public class ArcadeDrive {

	public VictorSP frontLeft,
					frontRight,
					backLeft,
					backRight;

	Joystick xJoystick;

	RobotDrive driveMain = new RobotDrive(frontLeft, frontRight, backLeft, backRight);

	public ArcadeDrive(VictorSP frontLeft,
			VictorSP frontRight,
			VictorSP backLeft,
			VictorSP backRight,
			Joystick xJoystick)
	{
		this.frontLeft = frontLeft;
		this.frontRight = frontRight;
		this.backRight = backRight;
		this.backLeft = backLeft;
		this.xJoystick = xJoystick;
	}
	public void ArcadeDrive()
	{
		
		driveMain.arcadeDrive(xJoystick.getRawAxis(1), xJoystick.getRawAxis(4), true);
	}
}

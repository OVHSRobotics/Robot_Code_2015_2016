package com.team4619.robot2016.subsystems;

import com.team4619.robot2016.Constants;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

public class ArcadeDrive {

	//Drives with tank drive
	public static void Drive()
	{	
		(Constants.driveMain).arcadeDrive((Constants.xBoxController).getRawAxis(1), (Constants.xBoxController).getRawAxis(4), true);
	}
}

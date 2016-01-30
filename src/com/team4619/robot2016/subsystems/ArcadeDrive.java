package com.team4619.robot2016.subsystems;

import com.team4619.robot2016.Constants;
import com.team4619.robot2016.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

public class ArcadeDrive {

	//Drives with tank drive
	public static void Drive()
	{	
		RobotMap.driveMain.arcadeDrive(RobotMap.xBoxController.getRawAxis(Constants.XBoxController.LEFT_JOYSTICK_Y_AXIS), (RobotMap.xBoxController).getRawAxis(Constants.XBoxController.RIGHT_JOYSTICK_X_AXIS), true);
	}
}

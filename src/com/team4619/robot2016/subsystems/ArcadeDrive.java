package com.team4619.robot2016.subsystems;

import com.team4619.robot2016.RobotMap;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;

public class ArcadeDrive {

	//Drives with tank drive
	public void ArcadeDrive()
	{	
		(RobotMap.driveMain).arcadeDrive((RobotMap.xBoxController).getRawAxis(1), (RobotMap.xBoxController).getRawAxis(4), true);
	}
}

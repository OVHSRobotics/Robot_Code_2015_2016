package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import com.team4619.robot2016.*;

public class TankDrive {

	//Drives with tank drive
	public void Drive()
	{
		(RobotMap.driveMain).tankDrive((RobotMap.xBoxController).getRawAxis(1), (RobotMap.xBoxController).getRawAxis(5), true);
	}
}
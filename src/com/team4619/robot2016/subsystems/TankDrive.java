package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.VictorSP;
import com.team4619.robot2016.*;

public class TankDrive {

	//Drives with tank drive
	public void Drive()
	{
		(Constants.driveMain).tankDrive((Constants.xBoxController).getRawAxis(1), (Constants.xBoxController).getRawAxis(5), true);
	}
}
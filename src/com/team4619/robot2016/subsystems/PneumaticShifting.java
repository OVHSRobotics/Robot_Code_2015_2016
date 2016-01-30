package com.team4619.robot2016.subsystems;

import com.team4619.robot2016.*;
import edu.wpi.first.wpilibj.DoubleSolenoid;

public class PneumaticShifting {

	public static void Shift ()
	{
		if((OI.Start).get())
		{
			(RobotMap.piston1).set(DoubleSolenoid.Value.kForward);
		}
		else if((OI.Back).get())
		{
			(RobotMap.piston1).set(DoubleSolenoid.Value.kReverse);
		}
		else
		{
			(RobotMap.piston1).set(DoubleSolenoid.Value.kOff);
		}
	}
	
}

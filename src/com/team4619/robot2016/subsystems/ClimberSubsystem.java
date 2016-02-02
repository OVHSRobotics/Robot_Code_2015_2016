package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Victor;
import com.team4619.robot2016.*;

public class ClimberSubsystem {
	
	public void Extend()
	{
		if((RobotMap.xBoxController).getRawAxis(8)>0);
		{
			RobotMap.climber.set(Constants.Range(Constants.CLIMBER_MOTOR_SPEED_DUTY_CYCLE + .22, -1, 1));
		}
		
		else
		{
			RobotMap.climber.set(0);
		}
		
	}
	
	public void Retract()
	{
		if((RobotMap.xBoxController).getRawAxis(7)>0);
		{
			RobotMap.climber.set(-Constants.CLIMBER_MOTOR_SPEED_DUTY_CYCLE);
		}
		else
	{
			RobotMap.climber.set(0);
		}
	}
}

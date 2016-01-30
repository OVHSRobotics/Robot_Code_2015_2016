package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Victor;
import com.team4619.robot2016.*;

public class Climbing {
	
	public void ClimberExtend()
	{
		//extends tape measure
		RobotMap.climber.set(Constants.Range(Constants.CLIMBER_MOTOR_SPEED_DUTY_CYCLE + .22, -1, 1));
	}
	
	public void ClimberRetract()
	{
		//retracts tape measure
		RobotMap.climber.set(-Constants.CLIMBER_MOTOR_SPEED_DUTY_CYCLE);
	}
}

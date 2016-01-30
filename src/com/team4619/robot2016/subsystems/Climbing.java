package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Victor;
import com.team4619.robot2016.*;

public class Climbing {

	//sets motorspeed for tape measure climber
	private double motorSpeed = .15;
	
	public void ClimberExtend()
	{
		//extends tape measure
		(Constants.climber).set(motorSpeed + .22);
	}
	
	public void ClimberRetract()
	{
		//retracts tape measure
		(Constants.climber).set(-motorSpeed);
	}
}

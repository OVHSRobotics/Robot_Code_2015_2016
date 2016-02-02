package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Victor;
import com.team4619.robot2016.*;

public class ShooterMechanism {

	public void Shoot()
	{
		if((RobotMap.xBoxController.getRawAxis(Constants.XBoxController.RIGHT_TRIGGER)>0))
		{
			RobotMap.leftShooter.set(Constants.Shooter.shootPower);
			RobotMap.rightShooter.set(-Constants.Shooter.shootPower);
		}
		else
		{
			RobotMap.rightShooter.set(0);
			RobotMap.leftShooter.set(0);
		}
	}

	public void Intake()
	{
		if((RobotMap.xBoxController.getRawAxis(Constants.XBoxController.LEFT_TRIGGER)>0))
		{
			RobotMap.leftShooter.set(-Constants.Shooter.INTAKE_POWER);
			RobotMap.rightShooter.set(Constants.Shooter.INTAKE_POWER);	
		}
		else
		{
			RobotMap.rightShooter.set(0);
			RobotMap.leftShooter.set(0);
		}
	}
	
	public void StopShooter()
	{
		RobotMap.leftShooter.set(0);
		RobotMap.rightShooter.set(0);
	}

	public void AngleDown()
	{
		//actuates up and actuationAngles to certain height
		RobotMap.actuator.set(-Constants.ACTUATION_SPEED_DUTY_CYCLE);
	}

	public void AngleUp()
	{
		//actuates down and actuationAngles to certain height
		RobotMap.actuator.set(Constants.ACTUATION_SPEED_DUTY_CYCLE);
	}
	
	public void StopChangingAngle()
	{
		RobotMap.actuator.set(0);
	}

	public void HoldBall()
	{
		//sets servo to start position which keeps the ball from hitting the shooters
		(RobotMap.bumper).set(0);
	}

	public void PushBallForward()
	{
		if ((RobotMap.xBoxController).getRawAxis(3)>0)
		{
			(RobotMap.bumper).set(1);
		}
		else
		{
			(RobotMap.bumper).set(0);
		}
	}
	public static void changeShootSpeed()
	{
		if((Constants.Shooter.shootPower)+(Constants.Shooter.INCREMENT_RATE_UNIT_CYCLE)<=1 && OI.rBumper.get())
		{
			Constants.Shooter.shootPower += (Constants.Shooter.INCREMENT_RATE_UNIT_CYCLE);
		}
		else if((Constants.Shooter.shootPower)-.25>=(Constants.Shooter.INCREMENT_RATE_UNIT_CYCLE) && OI.lBumper.get())
		{
			Constants.Shooter.shootPower -= (Constants.Shooter.INCREMENT_RATE_UNIT_CYCLE);
		}
	}
}

package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Victor;
import com.team4619.robot2016.*;

public class ShooterMechanism {

	public void Shoot()
	{
		RobotMap.leftShooter.set(Constants.Shooter.SHOOT_POWER);
		RobotMap.rightShooter.set(-Constants.Shooter.SHOOT_POWER);
	}

	public void Intake()
	{
		RobotMap.leftShooter.set(-Constants.Shooter.INTAKE_POWER);
		RobotMap.rightShooter.set(Constants.Shooter.INTAKE_POWER);
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
		RobotMap.bumper.set(0);
	}

	public void PushBallForward()
	{
		//sets servo to full extension which pushes the ball forward to shoot
		RobotMap.bumper.set(1);
	}
}

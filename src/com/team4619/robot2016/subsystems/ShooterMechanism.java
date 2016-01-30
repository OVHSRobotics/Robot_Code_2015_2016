package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Victor;
import com.team4619.robot2016.*;

public class ShooterMechanism {

	public static void Shoot()
	{
		RobotMap.leftShooter.set(Constants.Shooter.SHOOT_POWER);
		RobotMap.rightShooter.set(-Constants.Shooter.SHOOT_POWER);
	}

	public static void Intake()
	{
		RobotMap.leftShooter.set(-Constants.Shooter.INTAKE_POWER);
		RobotMap.rightShooter.set(Constants.Shooter.INTAKE_POWER);
	}

	public static void ActuateDown()
	{
		//actuates up and actuationAngles to certain height
		RobotMap.actuator.set(-Constants.ACTUATION_SPEED_DUTY_CYCLE);
	}

	public static void ActuateUp()
	{
		//actuates down and actuationAngles to certain height
		RobotMap.actuator.set(Constants.ACTUATION_SPEED_DUTY_CYCLE);
	}

	public static void HoldBall()
	{
		//sets servo to start position which keeps the ball from hitting the shooters
		RobotMap.bumper.set(0);
	}

	public static void PushBallForward()
	{
		//sets servo to full extension which pushes the ball forward to shoot
		RobotMap.bumper.set(1);
	}
}

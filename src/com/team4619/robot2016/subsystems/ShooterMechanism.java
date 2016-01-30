package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Victor;
import com.team4619.robot2016.*;

public class ShooterMechanism {

	//creates servo object
	private static Servo bumper;

	//sets standard actuation speed
	private static double actuationSpeed = .2;

	//counts actuation angle
	private static int actuationAngle = 0;

	public static void Shoot()
	{
		//shoots the ball at 100% power
		(RobotMap.leftShooter).set(1);
		(RobotMap.rightShooter).set(-1);
	}

	public static void Intake()
	{
		//intakes the ball at 32% power
		(RobotMap.leftShooter).set(-.32);
		(RobotMap.rightShooter).set(.32);
	}

	public static void ActuateDown()
	{
		//actuates up and actuationAngles to certain height
		if (actuationAngle > 0 && !(actuationAngle - 1 > 0))
		{
			(RobotMap.actuator).set(-actuationSpeed);
		}
	}

	public static void ActuateUp()
	{
		//actuates down and actuationAngles to certain height
		if (actuationAngle < 1 && !(actuationAngle + 1 < 90))
		{
			(RobotMap.actuator).set(actuationSpeed);
		}
	}

	public static void HoldBall()
	{
		//sets servo to start position which keeps the ball from hitting the shooters
		bumper.set(0);
	}

	public static void PushBallForward()
	{
		//sets servo to full extension which pushes the ball forward to shoot
		bumper.set(1);
	}
}

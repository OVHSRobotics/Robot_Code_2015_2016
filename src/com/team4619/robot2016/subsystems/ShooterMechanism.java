package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Victor;
import com.team4619.robot2016.*;

public class ShooterMechanism {

	//creates servo object
	private static Servo bumper;

	public static void Shoot()
	{
		//shoots the ball at 100% power
		(Constants.leftShooter).set(1);
		(Constants.rightShooter).set(-1);
	}

	public static void Intake()
	{
		//intakes the ball at 32% power
		(Constants.leftShooter).set(-.32);
		(Constants.rightShooter).set(.32);
	}

	public static void ActuateDown()
	{
		//actuates up and actuationAngles to certain height
		if ((Constants.actuationAngle) > 0 && !((Constants.actuationAngle) - 1 > 0))
		{
			(Constants.actuator).set(-(Constants.actuationSpeed));
		}
	}

	public static void ActuateUp()
	{
		//actuates down and actuationAngles to certain height
		if ((Constants.actuationAngle) < 1 && !((Constants.actuationAngle) + 1 < 90))
		{
			(Constants.actuator).set((Constants.actuationSpeed));
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

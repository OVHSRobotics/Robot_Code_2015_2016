package info.ovhs.robotics.subsystems;

import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Victor;

public class ShooterMechanism {
	//creates speedcontrollers necessary for shooting mechanisms
	private Victor leftShooter;
	private Victor rightShooter;
	private TalonSRX actuator;

	//creates servo object
	private Servo bumper;

	//sets standard actuation speed
	private double actuationSpeed = .2;

	//counts actuation angle
	int actuationAngle = 0;

	public ShooterMechanism(Victor leftShooter, 
							Victor rightShooter, 
							TalonSRX actuator, 
							int actuationAngle, 
							Servo bumper) 
	{
		//sets parameters to variables
		this.leftShooter = leftShooter;
		this.rightShooter = rightShooter;
		this.actuator = actuator;
		this.actuationAngle = actuationAngle;
		this.bumper = bumper;
	}

	public void Shoot()
	{
		//shoots the ball at 100% power
		leftShooter.set(1);
		rightShooter.set(-1);
	}

	public void Intake()
	{
		//intakes the ball at 32% power
		leftShooter.set(-.32);
		rightShooter.set(.32);
	}

	public void ActuateDown()
	{
		//actuates up and actuationAngles to certain height
		if (actuationAngle > 0 && !(actuationAngle - 1 > 0))
		{
			actuator.set(-actuationSpeed);
		}
	}

	public void ActuateUp()
	{
		//actuates down and actuationAngles to certain height
		if (actuationAngle < 1 && !(actuationAngle + 1 < 90))
		{
			actuator.set(actuationSpeed);
		}
	}

	public void ServoRetract()
	{
		//sets servo to start
		bumper.set(0);
	}

	public void ServoExtend()
	{
		//sets servo to full extension
		bumper.set(1);
	}
}

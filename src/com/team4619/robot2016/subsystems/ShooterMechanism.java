package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.CANTalon.FeedbackDevice;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

import com.team4619.robot2016.*;
import com.team4619.robot2016.commands.TankDrive;
import com.team4619.robot2016.commands.shootermechanism.Stop;

public class ShooterMechanism extends Subsystem{

	protected static ShooterMechanism instance;
	public static double shootPower = .75;
	
	SpeedController leftShooterMotorSpeedController = RobotMap.leftShooter;
	SpeedController rightShooterMotorSpeedController = RobotMap.rightShooter;
	SpeedController actuatingMotorSpeedController = RobotMap.actuation;
	Servo bumperServo = RobotMap.bumper;
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new Stop());
	}
	
	public static ShooterMechanism getInstance() {
		if (ShooterMechanism.instance == null) {
			ShooterMechanism.instance = new ShooterMechanism();
		}

		return ShooterMechanism.instance;
	}
	
	public void Shoot() {
		leftShooterMotorSpeedController.set(shootPower);
		rightShooterMotorSpeedController.set(-shootPower);
	}

	public void Intake() {
		leftShooterMotorSpeedController.set(-Constants.Shooter.INTAKE_POWER);
		rightShooterMotorSpeedController.set(Constants.Shooter.INTAKE_POWER);	
	}

	public void StopShooter() {
		leftShooterMotorSpeedController.set(Constants.MOTOR_STOP_SPINNING);
		rightShooterMotorSpeedController.set(Constants.MOTOR_STOP_SPINNING);
	}

	public void AngleDown() {
		//actuates up and actuationAnglecos to certain height
		actuatingMotorSpeedController.set(-Constants.ACTUATION_SPEED_DUTY_CYCLE);
	}

	public void AngleUp() {
		//actuates down and actuationAngles to certain height
		actuatingMotorSpeedController.set(Constants.ACTUATION_SPEED_DUTY_CYCLE);

		//chapters 10 12 13... 12.1.3
		int pulseWidthPos = (RobotMap.actuation).getPulseWidthPosition();
	}
	
	public void StopChangingAngle() {
		actuatingMotorSpeedController.set(Constants.MOTOR_STOP_SPINNING);
	}
	
	public void StopServo() {
		//sets servo to start position which keeps the ball from hitting the shooters
		bumperServo.set(Constants.MOTOR_STOP_SPINNING);
	}
	
	public void FullServoRotation() {
		bumperServo.set(Constants.SERVO_RUN_FULL_POWER);
	}
	
	public void increaseShootSpeed() {
		shootPower += (Constants.Shooter.INCREMENT_RATE_DUTY_CYCLE);
	}
	
	public void decreaseShootSpeed() {
		shootPower -= (Constants.Shooter.INCREMENT_RATE_DUTY_CYCLE);
	}

	public void encoderReset() {
		RobotMap.actuator.setPosition(Constants.ActuatingArm.MIN_ACTUATION_ANGLE);
	}
	
	public double getActuationAngle() {
		double angle = RobotMap.actuator.getPosition();
		
		return angle;
	}
}

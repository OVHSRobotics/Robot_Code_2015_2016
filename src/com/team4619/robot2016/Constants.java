package com.team4619.robot2016;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;

public class Constants {

	//sets standard actuation speed
	public final static double ACTUATION_SPEED_DUTY_CYCLE = .3;
	
	//sets standard climbing speed 
	public final static double CLIMBER_MOTOR_SPEED_DUTY_CYCLE = .15;
	
	public class Shooter {
		public final static double SHOOT_POWER = 1;
		public final static double INTAKE_POWER = .32;
	}
	
	public class XBoxController {
		public final static int LEFT_JOYSTICK_X_AXIS = 0;
		public final static int LEFT_JOYSTICK_Y_AXIS = 1; 
		public final static int LEFT_TRIGGER = 2;
		public final static int RIGHT_TRIGGER = 3;
		public final static int RIGHT_JOYSTICK_X_AXIS = 4;
		public final static int RIGHT_JOYSTICK_Y_AXIS = 5;

	}
	
	public static double Range(double value, double min, double max) {
		return Math.min(max, Math.max(value, min));
	}
}

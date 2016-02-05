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

	public static class Shooter {
		public final static double INTAKE_POWER = .32;
		public final static double INCREMENT_RATE_DUTY_CYCLE = .25;
	}

	public class XBoxController {
		public final static int LEFT_JOYSTICK_X_AXIS = 0;
		public final static int LEFT_JOYSTICK_Y_AXIS = 1; 
		public final static int LEFT_TRIGGER = 2;
		public final static int RIGHT_TRIGGER = 3;
		public final static int RIGHT_JOYSTICK_X_AXIS = 4;
		public final static int RIGHT_JOYSTICK_Y_AXIS = 5;
		public final static int BUTTON_A = 6;
		public final static int BUTTON_B = 7;
		public final static int BUTTON_X = 8;
		public final static int BUTTON_Y = 9;
		public final static int L_BUMPER = 10;
		public final static int R_BUMPER = 11;
		public final static int BACK = 12;
		public final static int START = 13;
		public final static int LEFT_JOYSTICK_BUTTON = 14;
		public final static int RIGHT_JOYSTICK_BUTTON = 15;

	}

	public class PWMDrivingPorts {
		public static final int FRONT_LEFT_MOTOR_PORT = 0;
		public static final int FRONT_RIGHT_MOTOR_PORT = 1;
		public static final int BACK_LEFT_MOTOR_PORT = 2;
		public static final int BACK_RIGHT_MOTOR_PORT = 3;
	}

	public static final int LEFT_SHOOTER_MOTOR_PORT = 4;
	public static final int RIGHT_SHOOTER_MOTOR_PORT = 5;
	public static final int ACTUATOR_MOTOR_PORT = 6;
	public static final int CLIMBER_MOTOR_PORT = 7;
	public static final int SERVO_BUMPER_PORT = 8;
	public static final int PWM_PORT_NINE = 9;

	public static double Range(double value, double min, double max) {
		return Math.min(max, Math.max(value, min));
	}
}

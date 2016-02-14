package com.team4619.robot2016;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Servo;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
//import com.team4619.robot2016.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	public static int leftMotor = 1;
	public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	public static int rangefinderPort = 1;
	public static int rangefinderModule = 1;

	//created xboxcontroller object  
	public static Joystick xBoxController;

	//creates four motors
	public static VictorSP frontLeft;
	public static VictorSP frontRight;
	public static VictorSP backLeft;
	public static VictorSP backRight;

	//creates servo for bumping the ball forward
	public static Servo bumper;

	//creates two shooters
	public static VictorSP leftShooter;
	public static VictorSP rightShooter;

	//creates a climber
	public static Victor climber;

	//creates actuator using TalonSRX
	public static TalonSRX actuator;

	//creates robot drive
	public static RobotDrive driveMain;

	//creates objects necessary for pneumatics
	public static Compressor compressor;
	public static DoubleSolenoid gearBoxShiftingPiston;

	//creates encoder object for actuation
	public static CANTalon actuation;
	
	public static void init() {
		RobotMap.setUpDrive();
		RobotMap.setUpSubsystems();
		xBoxController = new Joystick(0);
	}
	
	public static void setUpDrive() {
		frontLeft = new VictorSP(Constants.PWMDrivingPorts.FRONT_LEFT_MOTOR_PORT);
		frontRight = new VictorSP(Constants.PWMDrivingPorts.FRONT_RIGHT_MOTOR_PORT);
		backLeft = new VictorSP(Constants.PWMDrivingPorts.BACK_LEFT_MOTOR_PORT);
		backRight = new VictorSP(Constants.PWMDrivingPorts.BACK_RIGHT_MOTOR_PORT);
		driveMain = new RobotDrive(frontLeft, frontRight, backLeft, backRight);
	}
	
	public static void setUpSubsystems() {
		bumper = new Servo(Constants.SERVO_PWM_PORT);
		leftShooter = new VictorSP(Constants.LEFT_SHOOTER_MOTOR_PORT);
		rightShooter = new VictorSP(Constants.RIGHT_SHOOTER_MOTOR_PORT);
		climber = new Victor(Constants.CLIMBER_MOTOR_PORT);
		actuator = new TalonSRX(Constants.ACTUATOR_MOTOR_PORT);
		compressor = new Compressor(Constants.PneumaticConfiguration.COMPRESSOR_NUMBER);
		gearBoxShiftingPiston = new DoubleSolenoid(Constants.PneumaticConfiguration.SHIFT_FORWARD,
				Constants.PneumaticConfiguration.SHIFT_BACKWARD);
		actuation = new CANTalon(0);
	}
}

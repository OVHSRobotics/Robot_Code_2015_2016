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
import com.team4619.robot2016.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	
	//created xboxcontroller object 
		public static Joystick xBoxController = new Joystick(0);

		//creates four motors
		public static VictorSP frontLeft = new VictorSP(Constants.PWMPorts.PWM_PORT_ZERO);
		public static VictorSP frontRight = new VictorSP(Constants.PWMPorts.PWM_PORT_ONE);
		public static VictorSP backLeft = new VictorSP(Constants.PWMPorts.PWM_PORT_TWO);
		public static VictorSP backRight = new VictorSP(Constants.PWMPorts.PWM_PORT_THREE);

		//creates servo for bumping the ball forward
		public static Servo bumper = new Servo(1);
		
		//creates two shooters
		public static VictorSP leftShooter = new VictorSP(Constants.PWMPorts.PWM_PORT_FOUR);
		public static VictorSP rightShooter = new VictorSP(Constants.PWMPorts.PWM_PORT_FIVE);
		
		//creates a climber
		public static Victor climber = new Victor(Constants.PWMPorts.PWM_PORT_SEVEN);
		
		//creates actuator using TalonSRX
		public static TalonSRX actuator = new TalonSRX(Constants.PWMPorts.PWM_PORT_SIX);
		
		//creates robot drive
		public static RobotDrive driveMain = new RobotDrive(frontLeft, frontRight, backLeft, backRight);
		
		
		//creates objects necessary for pneumatics
		public static Compressor compressor = new Compressor(0);
		public static DoubleSolenoid piston1 = new DoubleSolenoid(1,2);
		
		//creates encoder object for actuation
		public static CANTalon actuation = new CANTalon(0);
}

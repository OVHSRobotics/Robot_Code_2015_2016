package com.team4619.robot2016.subsystems;

import com.team4619.robot2016.subsystems.DriveTrain;
import com.team4619.robot2016.Constants;
import com.team4619.robot2016.RobotMap;
import com.team4619.robot2016.commands.*;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
	/**
	 * Instance of the Drive Train Subsystem
	 */
	protected static DriveTrain instance;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	/**
	 * Speed Controller for the front left drive motor
	 */
    SpeedController frontLeftDriveMotorSpeedController = RobotMap.frontLeft;
    /**
     * Speed Controller for the rear left drive motor
     */
    SpeedController rearLeftDriveMotorSpeedController = RobotMap.backLeft;
    /**
     * Speed Controller for the front right drive motor
     */
    SpeedController frontRightDriveMotorSpeedController = RobotMap.frontRight;
    /**
     * Speed Controller for the rear right drive motor
     */
    SpeedController rearRightDriveMotorSpeedController = RobotMap.backRight;
    /**
     * RobotDrive Drive Motor Configuration
     */
    RobotDrive drive = RobotMap.driveMain;

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new TankDrive());
    }
    
    /**
     * Gets the instance of the DriveTrain Subsystem and creates one if there isn't one already
     * @return instance of DriveTrain Subsystem
     */
    public static DriveTrain getInstance() {
    	if (DriveTrain.instance == null) {
    		DriveTrain.instance = new DriveTrain();
    	}
    	
    	return DriveTrain.instance;
    }
    
    public void tankDrive()
    {
    	drive.tankDrive(RobotMap.xBoxController.getRawAxis(Constants.XBoxController.LEFT_JOYSTICK_Y_AXIS), (RobotMap.xBoxController).getRawAxis(Constants.XBoxController.RIGHT_JOYSTICK_Y_AXIS), true);
    }
    
    public void arcadeDrive()
    {
    	drive.arcadeDrive(RobotMap.xBoxController.getRawAxis(Constants.XBoxController.LEFT_JOYSTICK_Y_AXIS), (RobotMap.xBoxController).getRawAxis(Constants.XBoxController.RIGHT_JOYSTICK_X_AXIS), true);
    }
}


package com.team4619.robot2016.commands.autonomous;

import com.team4619.robot2016.RobotMap;
import com.team4619.robot2016.commands.CommandBase;
import com.team4619.robot2016.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

public class DriveBackwards extends Command{
	private double initialTime;
	private double time;
	private double powerFrontRight,powerFrontLeft,powerBackRight,powerBackLeft;
	private boolean backwards;

	/*Drive Backwards with full power in 3 seconds autonomously
	 * Default	
	 */
	public DriveBackwards() {
		this(1,1,1,1,3, true);
	}
	
	public DriveBackwards(double time){
		this(1,1,1,1, time, true);
	}
	
	public DriveBackwards(double power, double time){
		this(power, power, power, power, time, true);
	}

	public DriveBackwards(double power, double time, boolean Backwards) {
		this(power,power,power,power,time,Backwards);
	}
	
	public DriveBackwards(double powerFrontLeft, double powerRearLeft, double powerFrontRight, double powerRearRight, double time, boolean Backwards) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(CommandBase.driveTrain);
    	this.time = time;
    	this.powerFrontLeft = powerFrontLeft;
    	this.powerBackLeft = powerRearLeft;
    	this.powerFrontRight = powerFrontRight;
    	this.powerBackRight = powerRearRight;
    	this.backwards = Backwards;
    }

	protected void end() {
		RobotMap.frontLeft.set(0);
		RobotMap.frontRight.set(0);
		RobotMap.backLeft.set(0);
		RobotMap.backRight.set(0);

	}

	protected void execute() {
		RobotMap.frontLeft.set(-1);
		RobotMap.frontRight.set(-1);
		RobotMap.backLeft.set(-1);
		RobotMap.backRight.set(-1);

	}

	protected void initialize() {
		if(!backwards) {
			RobotMap.frontLeft.set(-1);
			RobotMap.frontRight.set(-1);
			RobotMap.backLeft.set(-1);
			RobotMap.backRight.set(-1);
		}
		else {
			RobotMap.frontLeft.set(-1);
			RobotMap.frontRight.set(-1);
			RobotMap.backLeft.set(-1);
			RobotMap.backRight.set(-1);
		}
		
	}

	protected void interrupted() {
		RobotMap.frontLeft.set(0);
		RobotMap.frontRight.set(0);
		RobotMap.backLeft.set(0);
		RobotMap.backRight.set(0);

	}

	protected boolean isFinished() {
		return false;
	}
	

}

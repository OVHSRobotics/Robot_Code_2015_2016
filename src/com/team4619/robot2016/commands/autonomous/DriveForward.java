package com.team4619.robot2016.commands.autonomous;

import com.team4619.robot2016.Constants;
import com.team4619.robot2016.RobotMap;

import com.team4619.robot2016.commands.*;
import com.team4619.robot2016.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

public class DriveForward extends Command {

	private double initialTime;
	private double time;
	private double powerFrontRight,powerFrontLeft,powerBackRight,powerBackLeft;
	private boolean forward;

	/*Drive forward with full power in 3 seconds autonomously
	 * Default	
	 */
	public DriveForward() {
		this(1,1,1,1,3, true);
	}
	
	public DriveForward(double time){
		this(1,1,1,1, time, true);
	}
	
	public DriveForward(double power, double time){
		this(power, power, power, power, time, true);
	}

	public DriveForward(double power, double time, boolean forward) {
		this(power,power,power,power,time,forward);
	}
	
	public DriveForward(double powerFrontLeft, double powerRearLeft, double powerFrontRight, double powerRearRight, double time, boolean forward) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(CommandBase.driveTrain);
    	this.time = time;
    	this.powerFrontLeft = powerFrontLeft;
    	this.powerBackLeft = powerRearLeft;
    	this.powerFrontRight = powerFrontRight;
    	this.powerBackRight = powerRearRight;
    	this.forward = forward;
    }
	
	protected void end() {
		RobotMap.frontLeft.set(0);
		RobotMap.frontRight.set(0);
		RobotMap.backLeft.set(0);
		RobotMap.backRight.set(0);

	}

	@Override
	protected void execute() {
		RobotMap.frontLeft.set(powerFrontLeft);
		RobotMap.frontRight.set(powerFrontRight);
		RobotMap.backLeft.set(powerBackLeft);
		RobotMap.backRight.set(powerBackRight);

	}

	@Override
	protected void initialize() {
		if(!forward) {
			RobotMap.frontLeft.set(powerFrontLeft);
			RobotMap.frontRight.set(powerFrontRight);
			RobotMap.backLeft.set(powerBackLeft);
			RobotMap.backRight.set(powerBackRight);
		}
		else {
			RobotMap.frontLeft.set(powerFrontLeft);
			RobotMap.frontRight.set(powerFrontRight);
			RobotMap.backLeft.set(powerBackLeft);
			RobotMap.backRight.set(powerBackRight);
		}
		
	}

	@Override
	protected void interrupted() {
		RobotMap.frontLeft.set(0);
		RobotMap.frontRight.set(0);
		RobotMap.backLeft.set(0);
		RobotMap.backRight.set(0);

	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}

package com.team4619.robot2016.commands.autonomous;

import com.team4619.robot2016.Constants;
import com.team4619.robot2016.RobotMap;

import com.team4619.robot2016.commands.*;
import com.team4619.robot2016.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

public class TurnRight extends Command {

	private double initialTime;
	private double time;
	private double powerFrontRight,powerFrontLeft,powerBackRight,powerBackLeft;
	private boolean right;

	/*Turn right with full power in 1 seconds autonomously
	 * Default	
	 */
	public TurnRight() {
		this(1,1,1,1,1, true);
	}

	public TurnRight(double time){
		this(1,1,1,1, time, true);
	}

	public TurnRight(double power, double time){
		this(power, power, power, power, time, true);
	}

	public TurnRight(double power, double time, boolean Left) {
		this(power,power,power,power,time,Left);
	}

	public TurnRight(double powerFrontLeft, double powerRearLeft, double powerFrontRight, double powerRearRight, double time, boolean right) {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(CommandBase.driveTrain);
		this.time = time;
		this.powerFrontLeft = powerFrontLeft;
		this.powerBackLeft = powerRearLeft;
		this.powerFrontRight = powerFrontRight;
		this.powerBackRight = powerRearRight;
		this.right = right;
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
		RobotMap.frontRight.set(-powerFrontRight);
		RobotMap.backLeft.set(powerBackLeft);
		RobotMap.backRight.set(-powerBackRight);

	}

	@Override
	protected void initialize() {
		if(!right) {
			RobotMap.frontLeft.set(powerFrontLeft);
			RobotMap.frontRight.set(-powerFrontRight);
			RobotMap.backLeft.set(powerBackLeft);
			RobotMap.backRight.set(-powerBackRight);
		}
		else {
			RobotMap.frontLeft.set(powerFrontLeft);
			RobotMap.frontRight.set(-powerFrontRight);
			RobotMap.backLeft.set(powerBackLeft);
			RobotMap.backRight.set(-powerBackRight);
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

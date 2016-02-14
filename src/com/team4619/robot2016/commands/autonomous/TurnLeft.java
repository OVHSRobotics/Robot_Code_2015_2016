package com.team4619.robot2016.commands.autonomous;

import com.team4619.robot2016.Constants;
import com.team4619.robot2016.RobotMap;

import com.team4619.robot2016.commands.*;
import com.team4619.robot2016.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

public class TurnLeft extends Command {

	private double initialTime;
	private double time;
	private double powerFrontRight,powerFrontLeft,powerBackRight,powerBackLeft;
	private boolean left;

	/*Turn Left with full power in 3 seconds autonomously
	 * Default	
	 */
	public TurnLeft() {
		this(1,1,1,1,3, true);
	}

	public TurnLeft(double time){
		this(1,1,1,1, time, true);
	}

	public TurnLeft(double power, double time){
		this(power, power, power, power, time, true);
	}

	public TurnLeft(double power, double time, boolean Left) {
		this(power,power,power,power,time,Left);
	}

	public TurnLeft(double powerFrontLeft, double powerRearLeft, double powerFrontRight, double powerRearRight, double time, boolean left) {
		// Use requires() here to declare subsystem dependencies
		// eg. requires(chassis);
		requires(CommandBase.driveTrain);
		this.time = time;
		this.powerFrontLeft = powerFrontLeft;
		this.powerBackLeft = powerRearLeft;
		this.powerFrontRight = powerFrontRight;
		this.powerBackRight = powerRearRight;
		this.left = left;
	}

	protected void end() {
		RobotMap.frontLeft.set(0);
		RobotMap.frontRight.set(0);
		RobotMap.backLeft.set(0);
		RobotMap.backRight.set(0);

	}

	@Override
	protected void execute() {
		RobotMap.frontLeft.set(-0.5);
		RobotMap.frontRight.set(0.5);
		RobotMap.backLeft.set(-0.5);
		RobotMap.backRight.set(0.5);

	}

	@Override
	protected void initialize() {
		if(!left) {
			RobotMap.frontLeft.set(-0.5);
			RobotMap.frontRight.set(0.5);
			RobotMap.backLeft.set(-0.5);
			RobotMap.backRight.set(0.5);
		}
		else {
			RobotMap.frontLeft.set(-0.5);
			RobotMap.frontRight.set(0.5);
			RobotMap.backLeft.set(-0.5);
			RobotMap.backRight.set(0.5);
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

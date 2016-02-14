package com.team4619.robot2016.commands.autonomous;

import com.team4619.robot2016.Constants;
import com.team4619.robot2016.RobotMap;

import com.team4619.robot2016.commands.*;
import com.team4619.robot2016.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

public class Intake extends Command {

	private double initialTime;
	private double time;
	private double powerRight, powerLeft;
	private boolean intake;
	
	//spinning motors for 3 seconds
	public Intake(){
		this(Constants.Shooter.INTAKE_POWER,Constants.Shooter.INTAKE_POWER,3, true);
	}
	
	public Intake(double time){
		this(Constants.Shooter.INTAKE_POWER,Constants.Shooter.INTAKE_POWER, time, true);
	}
	
	public Intake(double power, double time){
		this(power, power, time, true);
	}
	
	public Intake(double powerRight, double powerLeft, double time, boolean intake) {
		requires(CommandBase.shooterMechanism);
		this.powerRight = powerRight;
		this.powerLeft = powerLeft;
		this.time = time;
		this.intake = intake;
	}

	protected void end() {
		
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	

}

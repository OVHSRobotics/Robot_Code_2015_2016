package com.team4619.robot2016.commands.shootermechanism;

import com.team4619.robot2016.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Command;

public class Intake extends Command{

	public Intake (){
		requires(CommandBase.shooterMechanism);
	}
	
	@Override
	protected void end() {
		CommandBase.shooterMechanism.StopShooter();
	}

	@Override
	protected void execute() {
		CommandBase.shooterMechanism.Intake();
	}

	@Override
	protected void initialize() {
		CommandBase.shooterMechanism.Intake();
	}

	@Override
	protected void interrupted() {
		CommandBase.shooterMechanism.StopShooter();
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

}

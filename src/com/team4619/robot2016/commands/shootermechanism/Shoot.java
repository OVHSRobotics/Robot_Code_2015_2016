package com.team4619.robot2016.commands.shootermechanism;

import com.team4619.robot2016.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Command;

public class Shoot extends Command{

	public Shoot() {
		requires(CommandBase.shooterMechanism);
	}
	
	@Override
	protected void end() {
		CommandBase.shooterMechanism.StopShooter();
	}

	@Override
	protected void execute() {
	}

	@Override
	protected void initialize() {
		CommandBase.shooterMechanism.Shoot();
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

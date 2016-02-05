package com.team4619.robot2016.commands.shootermechanism;

import com.team4619.robot2016.commands.CommandBase;
import com.team4619.robot2016.subsystems.ShooterMechanism;

import edu.wpi.first.wpilibj.command.Command;

public class Stop extends Command{

	public Stop(){
		requires(CommandBase.shooterMechanism);
	}
	
	@Override
	protected void end() {
		
	}

	@Override
	protected void execute() {
		
	}

	@Override
	protected void initialize() {
		CommandBase.shooterMechanism.StopShooter();
	}

	@Override
	protected void interrupted() {
		
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

}

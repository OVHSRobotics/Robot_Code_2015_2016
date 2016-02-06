package com.team4619.robot2016.commands.climbersubsystem;

import com.team4619.robot2016.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Command;

public class Extend extends Command{

	public Extend () {
		requires(CommandBase.climberMechanism);
	}
	
	@Override
	protected void end() {
		// TODO Auto-generated method stub
		CommandBase.climberMechanism.Stop();
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		CommandBase.climberMechanism.Extend();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		CommandBase.climberMechanism.Stop();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}

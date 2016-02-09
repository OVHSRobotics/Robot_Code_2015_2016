package com.team4619.robot2016.commands.climbersubsystem;

import com.team4619.robot2016.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Command;

public class Retract extends Command{
	

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
		CommandBase.climberMechanism.Retract();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub
		CommandBase.climberMechanism.Stop();
	}

	@Override
	protected boolean isFinished() {
		//use encoder to limit climber
		return false;
	}

}

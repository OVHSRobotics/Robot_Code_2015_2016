package com.team4619.robot2016.commands.climbersubsystem;

import com.team4619.robot2016.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Command;

public class Stop extends Command {

	public Stop() {
		requires(CommandBase.climberMechanism);
	}
	
	
	protected void end() {
		CommandBase.climberMechanism.Stop();
	}

	
	protected void execute() {
		
	}

	
	protected void initialize() {
		CommandBase.climberMechanism.Stop();
	}

	
	protected void interrupted() {
		
		CommandBase.climberMechanism.Stop();		
	}

	
	protected boolean isFinished() {
		
		return true;
	}

}

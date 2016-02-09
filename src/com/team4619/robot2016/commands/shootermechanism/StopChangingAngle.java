package com.team4619.robot2016.commands.shootermechanism;

import com.team4619.robot2016.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

public class StopChangingAngle extends Command {

	@Override
	protected void end() {
		CommandBase.shooterMechanism.StopChangingAngle();
		
	}

	@Override
	protected void execute() {
		
		
	}

	@Override
	protected void initialize() {
		CommandBase.shooterMechanism.StopChangingAngle();
		
	}

	@Override
	protected void interrupted() {
		
		
	}

	@Override
	protected boolean isFinished() {
		
		return true;
	}

}

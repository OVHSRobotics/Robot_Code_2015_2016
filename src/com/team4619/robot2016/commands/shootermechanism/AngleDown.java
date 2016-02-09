package com.team4619.robot2016.commands.shootermechanism;

import com.team4619.robot2016.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

public class AngleDown extends Command {

	@Override
	protected void end() {
		CommandBase.shooterMechanism.StopChangingAngle();
		
	}

	@Override
	protected void execute() {
		
		
	}

	@Override
	protected void initialize() {
		CommandBase.shooterMechanism.AngleDown();
		
	}

	@Override
	protected void interrupted() {
		CommandBase.shooterMechanism.StopChangingAngle();
		
	}

	@Override
	protected boolean isFinished() {
		
		return false;
	}

}

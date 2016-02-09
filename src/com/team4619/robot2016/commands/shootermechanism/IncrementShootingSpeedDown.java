package com.team4619.robot2016.commands.shootermechanism;

import com.team4619.robot2016.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

public class IncrementShootingSpeedDown extends Command{

	@Override
	protected void end() {
		CommandBase.shooterMechanism.StopShooter();
		
	}

	@Override
	protected void execute() {
		
		
	}

	@Override
	protected void initialize() {
		CommandBase.shooterMechanism.decreaseShootSpeed();
		
	}

	@Override
	protected void interrupted() {
		
		
	}

	@Override
	protected boolean isFinished() {
		
		return true;
	}

}

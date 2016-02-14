package com.team4619.robot2016.commands.shootermechanism;

import com.team4619.robot2016.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Command;

public class PushBallForward extends Command {
	@Override
	protected void end() {
		CommandBase.shooterMechanism.StopServo();
	}

	@Override
	protected void execute() {
		CommandBase.shooterMechanism.FullServoRotation();
	}

	@Override
	protected void initialize() {
		CommandBase.shooterMechanism.FullServoRotation();
	}

	@Override
	protected void interrupted() {
		CommandBase.shooterMechanism.StopServo();
	}

	@Override
	protected boolean isFinished() {
		
		return false;
	}
}

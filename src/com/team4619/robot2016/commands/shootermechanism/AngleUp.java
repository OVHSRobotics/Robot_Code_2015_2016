package com.team4619.robot2016.commands.shootermechanism;

import com.team4619.robot2016.Constants;
import com.team4619.robot2016.commands.CommandBase;
import edu.wpi.first.wpilibj.command.Command;

public class AngleUp extends Command {

	@Override
	protected void end() {
		CommandBase.shooterMechanism.StopChangingAngle();
		
	}

	@Override
	protected void execute() {
		CommandBase.shooterMechanism.AngleUp();
		
	}

	@Override
	protected void initialize() {
		CommandBase.shooterMechanism.AngleUp();
		
	}

	@Override
	protected void interrupted() {
		CommandBase.shooterMechanism.StopChangingAngle();
		
	}

	@Override
	protected boolean isFinished() {
		if (CommandBase.shooterMechanism.getActuationAngle() >= Constants.ActuatingArm.MAX_ACTUATION_ANGLE) {
			return true;
		}
		return false;
	}

}

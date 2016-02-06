package com.team4619.robot2016.subsystems;

import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.team4619.robot2016.*;
import com.team4619.robot2016.commands.climbersubsystem.*;

public class ClimberSubsystem extends Subsystem {

	
	protected static ClimberSubsystem instance;
	public static ClimberSubsystem getInstance() {
		if (ClimberSubsystem.instance == null) {
			ClimberSubsystem.instance = new ClimberSubsystem();
		}

		return ClimberSubsystem.instance;
	}

	public void initDefaultCommand() {
		setDefaultCommand(new Stop());
	}

	public void Extend() {
		RobotMap.climber.set(Constants.Range(Constants.CLIMBER_MOTOR_SPEED_DUTY_CYCLE + .22, -1, 1));
	}

	public void Retract() {

		RobotMap.climber.set(-Constants.CLIMBER_MOTOR_SPEED_DUTY_CYCLE);

	}
	
	public void Stop()
	{
		RobotMap.climber.set(Constants.MOTOR_STOP_SPINNING);
	}
}
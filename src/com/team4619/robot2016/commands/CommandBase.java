package com.team4619.robot2016.commands;

import com.team4619.robot2016.Constants;
import com.team4619.robot2016.Robot;
import com.team4619.robot2016.commands.CommandBase;
import com.team4619.robot2016.subsystems.*;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public abstract class CommandBase extends Command {
	/**
	 * This class is to hold all of the subsystems on the robot in order to have one instance of the subsystems to work
	 * off of.  Call all subsystems as instances in the CommandBase.
	 * 
	 * <p>
	 * INITIALIZE OI LAST!!!
	 * </p>
	 */
	
	/**
	 * Instance of the Drive Train Subsystem
	 */
	public static DriveTrain driveTrain;
	
	public static PneumaticDriveTrainShifting pneumaticDriveTrainShifting;
	
	public static ShooterMechanism shooterMechanism;
	
	public static ClimberSubsystem climberMechanism;
	/**
	 * Instance of the OI Class
	 */
	public static OI oi;
	
	/**
	 * Initializes the subsystems on the robot
	 */
	public static void init() {
		CommandBase.driveTrain = DriveTrain.getInstance();
		
		CommandBase.shooterMechanism = ShooterMechanism.getInstance();

		CommandBase.pneumaticDriveTrainShifting = PneumaticDriveTrainShifting.getInstance();

		CommandBase.climberMechanism = ClimberSubsystem.getInstance();

		
		// Must be initialized after all subsystems
		CommandBase.oi = OI.getInstance();
	}
}

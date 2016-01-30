package com.team4619.robot2016.commands;

import com.team4619.robot2016.commands.CommandBase;

/**
 * Arcade Drive Mode
 */
public class ArcadeDrive extends CommandBase {
	
	/**
	 * Arcade Drive Mode
	 */
    public ArcadeDrive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);

        requires(CommandBase.driveTrain);
    }

    /**
     *  Called just before this Command runs the first time
     */
    protected void initialize() {
    }

    /**
     *  Called repeatedly when this Command is scheduled to run
     */
    protected void execute() {
    	driveTrain.arcadeDrive();
    }

    /**
     *  Make this return true when this Command no longer needs to run execute()
     */
    protected boolean isFinished() {
        return false;
    }

    /**
     *  Called once after isFinished returns true
     */
    protected void end() {
    }

    /**
     *  Called when another command which requires one or more of the same subsystems is scheduled to run
     */
    protected void interrupted() {
    }
}
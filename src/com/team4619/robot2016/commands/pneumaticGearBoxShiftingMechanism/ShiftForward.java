
package com.team4619.robot2016.commands.pneumaticGearBoxShiftingMechanism;
	
import com.team4619.robot2016.commands.CommandBase;

import edu.wpi.first.wpilibj.command.Command;

public class ShiftForward extends Command{
	
	public ShiftForward(){
		requires(CommandBase.pneumaticDriveTrainShifting);
	}
	
	@Override
	protected void end() {
		CommandBase.pneumaticDriveTrainShifting.StopShifting();
		
	}

	@Override
	protected void execute() {
		
		
	}

	@Override
	protected void initialize() {
		CommandBase.pneumaticDriveTrainShifting.ShiftForward();
	}

	@Override
	protected void interrupted() {
		CommandBase.pneumaticDriveTrainShifting.StopShifting();
		
	}

	@Override
	protected boolean isFinished() {
		
		return false;
	}
	
}
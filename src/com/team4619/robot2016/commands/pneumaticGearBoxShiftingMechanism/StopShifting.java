package com.team4619.robot2016.commands.pneumaticGearBoxShiftingMechanism;

import edu.wpi.first.wpilibj.command.Command;
import com.team4619.robot2016.commands.CommandBase;

public class StopShifting extends Command{

	public StopShifting() {
		requires(CommandBase.pneumaticDriveTrainShifting); 
	}
	@Override
	protected void end(){
		CommandBase.pneumaticDriveTrainShifting.StopShifting();
		
	}

	@Override
	protected void execute(){
		
		
	}

	@Override
	protected void initialize(){
		CommandBase.pneumaticDriveTrainShifting.StopShifting();
		
	}

	@Override
	protected void interrupted(){
		
		
	}

	@Override
	protected boolean isFinished(){
	
		return true;
	}

}

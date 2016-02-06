package com.team4619.robot2016.subsystems;

import com.team4619.robot2016.RobotMap;
import com.team4619.robot2016.commands.shootermechanism.Stop;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import com.team4619.robot2016.commands.pneumaticGearBoxShiftingMechanism.*;

public class PneumaticDriveTrainShifting extends Subsystem  {
	
	protected static PneumaticDriveTrainShifting instance;
	
	// air compressor for pneumatic system
	Compressor airCompressor = RobotMap.compressor;
	// 2 ways solenoid valve of pneumatic system
	DoubleSolenoid pneumaticSolenoidValve = RobotMap.gearBoxShiftingPiston;
	
	public void ShiftForward()
	{
		(RobotMap.gearBoxShiftingPiston).set(DoubleSolenoid.Value.kForward);
	}
	public void ShiftBackward()
	{
		(RobotMap.gearBoxShiftingPiston).set(DoubleSolenoid.Value.kReverse);
	}
	public void StopShifting()
	{
		(RobotMap.gearBoxShiftingPiston).set(DoubleSolenoid.Value.kOff);
	}
	

	public static PneumaticDriveTrainShifting getInstance(){
		if(PneumaticDriveTrainShifting.instance == null)
		{
			PneumaticDriveTrainShifting.instance = new PneumaticDriveTrainShifting();
		}
		return PneumaticDriveTrainShifting.instance;
	}

	public void initDefaultCommand() {
		setDefaultCommand(new StopShifting());
    }
	
	
}

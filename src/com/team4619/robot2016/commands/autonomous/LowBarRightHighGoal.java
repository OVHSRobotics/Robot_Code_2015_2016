package com.team4619.robot2016.commands.autonomous;

import com.team4619.robot2016.*;
import com.team4619.robot2016.commands.*;
import com.team4619.robot2016.commands.shootermechanism.*;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class LowBarRightHighGoal extends CommandGroup{
	public LowBarRightHighGoal(){
		addSequential(new ArcadeDrive());
		addSequential(new ArcadeDrive());
		addSequential(new AngleUp());
		addSequential(new Shoot());
		
	}

}

package com.team4619.robot2016;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;

public class JoystickAsButton extends Button {

	public GenericHID joystick;
	
	public int axis;
	
	public double threshold;
	
	public JoystickAsButton(GenericHID joystick, int axis, double threshold) {
		this.joystick = joystick;
		this.axis = axis;
		this.threshold = threshold;
	}
	
	public boolean get() {
		if(Math.abs(this.joystick.getRawAxis(axis))>0) {
			return true;
		}
		return false;
	}
	
}

package info.ovhs.robotics.subsystems;

import edu.wpi.first.wpilibj.Victor;

public class Climbing {
	
	//Sets the two speed controllers for the tape measure climber
	private Victor leftMotor;
	private Victor rightMotor;
	
	//sets motorspeed for tape measure climber
	private double motorSpeed = .15;
	
	public Climbing(Victor leftMotor, Victor rightMotor) 
	{
		//sets variables equal to each other
		this.leftMotor = leftMotor;
		this.rightMotor = rightMotor;
	}
	
	public void ClimberExtend()
	{
		//extends tape measure
		leftMotor.set(motorSpeed + .22);
	}
	
	public void ClimberRetract()
	{
		//retracts tape measure
		rightMotor.set(-motorSpeed);
	}
}

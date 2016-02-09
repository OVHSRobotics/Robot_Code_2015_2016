package com.team4619.robot2016;

import com.team4619.robot2016.commands.shootermechanism.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released  and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());

	/**	
	 * Instance of the OI Class
	 */
	private static OI instance;


	public OI() {
		leftTrigger.whileHeld(new Shoot());
		rightTrigger.whileHeld(new Intake());
	}

	public static Joystick xBoxController = new Joystick(1);
	public static Button A = new JoystickButton(xBoxController, Constants.XBoxController.BUTTON_A),
			B = new JoystickButton(xBoxController, Constants.XBoxController.BUTTON_B),
			X = new JoystickButton(xBoxController, Constants.XBoxController.BUTTON_X),
			Y = new JoystickButton(xBoxController, Constants.XBoxController.BUTTON_Y),
			lBumper = new JoystickButton(xBoxController, Constants.XBoxController.L_BUMPER),
			rBumper = new JoystickButton(xBoxController, Constants.XBoxController.R_BUMPER),
			Back = new JoystickButton(xBoxController, Constants.XBoxController.BACK),
			Start = new JoystickButton(xBoxController, Constants.XBoxController.START),
			leftJoystickButton = new JoystickButton(xBoxController,  Constants.XBoxController.RIGHT_JOYSTICK_BUTTON),
			rightJoystickButton = new JoystickButton(xBoxController,  Constants.XBoxController.RIGHT_JOYSTICK_BUTTON );

	public static JoystickAsButton leftTrigger = new JoystickAsButton(xBoxController, Constants.XBoxController.LEFT_TRIGGER, .04),
									rightTrigger = new JoystickAsButton(xBoxController, Constants.XBoxController.RIGHT_TRIGGER, .04);

	/**
	 * Gets the instance of the OI Class and creates one if one doesn't exist
	 * @return instance of OI Class
	 */
	public static OI getInstance() {
		if (OI.instance == null) {
			OI.instance = new OI();
		}

		return OI.instance;
	}
}


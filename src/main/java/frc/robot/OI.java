package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.buttons.POVButton;

public class OI {
    
    public Joystick driverController = new Joystick(RobotMap.DRIVER_CONTROLLER);
    public Joystick operatorController = new Joystick(RobotMap.OPERATOR_CONTROLLER);
  
    // DRIVER JOYSTICK
    public boolean getDriverButton(int axis) {
      return driverController.getRawButton(axis);
    }
  
    public double getDriverRawAxis(int axis) {
      return driverController.getRawAxis(axis);
    }
  
    public int getDriverPOV(int axis) {
      return driverController.getPOV();
    }
  
    Button dButtonA = new JoystickButton(this.driverController, RobotMap.BUTTON_A);
    Button dButtonB = new JoystickButton(this.driverController, RobotMap.BUTTON_B);
    Button dButtonX = new JoystickButton(this.driverController, RobotMap.BUTTON_X);
    Button dButtonY = new JoystickButton(this.driverController, RobotMap.BUTTON_Y);
    Button dButtonLeftBumper = new JoystickButton(this.driverController, RobotMap.LEFT_BUMPER);
    Button dButtonRightBumper = new JoystickButton(this.driverController, RobotMap.RIGHT_BUMPER);
    Button dButtonBack = new JoystickButton(this.driverController, RobotMap.BACK_BUTTON);
    Button dButtonStart = new JoystickButton(this.driverController, RobotMap.START_BUTTON);
    Button dButtonLeftStick = new JoystickButton(this.driverController, RobotMap.LEFT_STICK_BUTTON);
    Button dButtonRightStick = new JoystickButton(this.driverController, RobotMap.RIGHT_STICK_BUTTON);
  
    POVButton dPovUp = new POVButton(driverController, RobotMap.POV_UP);
    POVButton dPovRight = new POVButton(driverController, RobotMap.POV_RIGHT);
    POVButton dPovDown = new POVButton(driverController, RobotMap.POV_DOWN);
    POVButton dPovLeft = new POVButton(driverController, RobotMap.POV_LEFT);
  
    // OPERATOR JOYSTICK
    public boolean getOperatorButton(int axis) {
      return operatorController.getRawButton(axis);
    }
  
    public double getOperatorRawAxis(int axis) {
      return operatorController.getRawAxis(axis);
    }
  
    public int getOperatorPOV(int axis) {
      return operatorController.getPOV();
    }
  
    Button oButtonA = new JoystickButton(this.operatorController, RobotMap.oBUTTON_A);
    Button oButtonB = new JoystickButton(this.operatorController, RobotMap.oBUTTON_B);
    Button oButtonY = new JoystickButton(this.operatorController, RobotMap.oBUTTON_Y);
    Button oButtonX = new JoystickButton(this.operatorController, RobotMap.oBUTTON_X);
    Button oButtonLeftBumper = new JoystickButton(this.operatorController, RobotMap.oLEFT_BUMPER);
    Button oButtonRightBumper = new JoystickButton(this.operatorController, RobotMap.oRIGHT_BUMPER);
    Button oButtonBack = new JoystickButton(this.operatorController, RobotMap.oBACK_BUTTON);
    Button oButtonStart = new JoystickButton(this.operatorController, RobotMap.oSTART_BUTTON);
    Button oButtonLeftStick = new JoystickButton(this.operatorController, RobotMap.oLEFT_STICK_BUTTON);
    Button oButtonRightStick = new JoystickButton(this.operatorController, RobotMap.oRIGHT_STICK_BUTTON);
  
    POVButton oPovUp = new POVButton(operatorController, RobotMap.oPOV_UP);
    POVButton oPovRight = new POVButton(operatorController, RobotMap.oPOV_RIGHT);
    POVButton oPovDown = new POVButton(operatorController, RobotMap.oPOV_DOWN);
    POVButton oPovLeft = new POVButton(operatorController, RobotMap.oPOV_LEFT);
    
    public OI() {
    
       
    }
}


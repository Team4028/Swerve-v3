package frc.robot.commands;

import org.frcteam2910.common.math.Vector2;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.subsystems.DrivetrainSubsystem;

public class HolonomicDriveCommand extends Command {
    public HolonomicDriveCommand() {
        requires(DrivetrainSubsystem.getInstance());
    }

    @Override
    protected void execute() {
       
        double forward = Robot.m_oi.getDriverRawAxis(RobotMap.LEFT_STICK_Y);
        double strafe = Robot.m_oi.getDriverRawAxis(RobotMap.LEFT_STICK_X);
        double rotation = Robot.m_oi.getDriverRawAxis(RobotMap.RIGHT_STICK_X);
        
        boolean robotOriented = Robot.m_oi.getDriverButton(RobotMap.LEFT_STICK_BUTTON);
        
        Vector2 translation = new Vector2(forward, strafe);



        DrivetrainSubsystem.getInstance().holonomicDrive(translation, rotation, !robotOriented);
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}

package frc.robot.subsystems;

import org.frcteam2910.common.robot.drivers.NavX;

import edu.wpi.first.wpilibj.SPI;

public class Superstructure {
   

    private static final Superstructure instance = new Superstructure();

    private NavX navX = new NavX(SPI.Port.kMXP); 

    private Superstructure() {
        navX.calibrate();
        navX.setInverted(true);  
        }
     

    public static Superstructure getInstance() {
        return instance;
    }

    public NavX getGyroscope() {
        return navX;
    }


}

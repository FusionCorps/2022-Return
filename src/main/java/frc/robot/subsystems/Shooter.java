package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import static frc.robot.Constants.Shooter.*;

public class Shooter extends SubsystemBase {

    WPI_TalonFX shooter0;

    public Shooter() {
        shooter0 = new WPI_TalonFX(SHOOTER_ID);
    }

    public void setShooter(double pct) {
        shooter0.set(pct);
    }

    public double getShooterVel() {
        return shooter0.getSelectedSensorVelocity();
    }

}

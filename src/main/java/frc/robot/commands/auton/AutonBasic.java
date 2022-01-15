package frc.robot.commands.auton;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.chassis.ChassisDriveAuton;
import frc.robot.commands.chassis.ResetGyro;
import frc.robot.subsystems.Chassis;

public class AutonBasic extends SequentialCommandGroup {

    Chassis mChassis;

    public AutonBasic(Chassis chassis) {


        mChassis = chassis;

        addRequirements(mChassis);

        addCommands(new ResetGyro(mChassis),
                new ChassisDriveAuton(mChassis, 0.1, 0.0, 0.0, 0.3),
                new ChassisDriveAuton(mChassis, 0.5, 0.0, 0.0, 0.5));
    }

}

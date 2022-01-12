package frc.robot.commands.chassis;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Chassis;

public class ChassisDriveAuton extends CommandBase {

    Chassis mChassis;

    double mFwdSpeed;
    double mStrSpeed;
    double mRotSpeed;
    double mTime;

    private Timer timer = new Timer();

    public ChassisDriveAuton(Chassis chassis, double fwdSpeed, double strSpeed, double rotSpeed, double time) {
        mFwdSpeed = fwdSpeed;
        mStrSpeed = strSpeed;
        mRotSpeed = rotSpeed;
        mTime = time;

        addRequirements(mChassis);
    }

    @Override
    public void initialize() {
        timer.reset();
        timer.start();
    }

    @Override
    public void execute() {

        mChassis.runSwerve(mFwdSpeed, mStrSpeed, mRotSpeed);

    }

    @Override
    public boolean isFinished() {
        return  timer.hasPeriodPassed(mTime);
    }

    @Override
    public void end(boolean interrupted) {
        mChassis.runSwerve(0.0, 0.0, 0.0);
    }

}

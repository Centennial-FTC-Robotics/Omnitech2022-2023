package org.firstinspires.ftc.teamcode.tests;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import org.RIP.OurRobot;
import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.tfod.TFObjectDetector;

@Autonomous(name="Subsystems: Test", group="Tests")
public class SubsystemTest extends LinearOpMode {
    @Override
    public void runOpMode() {
        //Get motors from Hardware Map
        OurRobot robot = new OurRobot();
        robot.initialize(this);
        waitForStart();
        while(opModeIsActive()) {
            robot.drivetrain.move(0.3);
            robot.drivetrain.update();
        }
    }
}
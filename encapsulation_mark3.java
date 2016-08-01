public class Robot {
	// Current X coordinate
    private double x = 0;
    // Current Y coordinate
    private double y = 0;
    // The current rate (in degrees)
    private double course = 0;
 
    // Moving at a distance of "distance"
    public void forward(int distance) {
        // Appeal to the field object X
        x = x + distance * Math.cos(course / 180 * Math.PI);
        // Appeal to the field object Y
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }
 
    // Print robot's coordinates
    public void printCoordinates() {
        System.out.println(x + "," + y);
    }
 
    public double getX() {
        return x;
    }
 
    public double getY() {
        return y;
    }
 
    public double getCourse() {
        return course;
    }
 
    public void setCourse(double course) {
        this.course = course;
    }
}

public class RobotManager {
	public static void main(String[] args) {
        // Create an object of class Robot
        Robot robot = new Robot();
 
        // Forward for 20 meters
        robot.forward(20);
        // Print coordinates
        robot.printCoordinates();
 
        // This is a more correct way to change course.
        // Implementation within the robot is not much different, but
        // we can at any time make a more advanced version
        // But Robot Manager class do not even know this
        robot.setCourse(90);
        // Forward for 20 meters
        robot.forward(20);
        // Print coordinates
        robot.printCoordinates();
 
        // The course is 45 degrees
        robot.setCourse(45);
        // Forward for 20 meters
        robot.forward(20);
        // Print coordinates
        robot.printCoordinates();
    }
}

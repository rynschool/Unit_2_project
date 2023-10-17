import java.util.Scanner;


public class LinearEquationLogic {
    private Scanner scan;
    private LinearEquation equation;


    private String coords1;
    private String coords2;




    public LinearEquationLogic () {
        equation = null;
        scan = new Scanner(System.in);
    }
    public void start () {
        int num = 0;
        while (num != 1) {
            System.out.println("Welcome to the Linear Equation Calculator");
            System.out.println("Please insert your first coordinates");
            coords1 = scan.nextLine();
            System.out.println("Please insert your second coordinates");
            coords2 = scan.nextLine();
            int x1 = Integer.parseInt(coords1.substring(1, coords1.indexOf(",")));
            int y1 = Integer.parseInt(coords1.substring(coords1.indexOf(",") + 2, coords1.indexOf(")")));
            int x2 = Integer.parseInt(coords2.substring(1, coords2.indexOf(",")));
            int y2 = Integer.parseInt(coords2.substring(coords2.indexOf(",") + 2, coords2.indexOf(")")));
            LinearEquation equation = new LinearEquation(x1, y1, x2, y2);

            System.out.println("The two points are " + coords1 + " " + coords2);
            if (x2 - x1 != 0){
                System.out.println("The equation to your line is: " + equation.equation());
                System.out.println("The slope of your line is: " + ((y2 * 1.0 - y1) / (x2 - x1)));
                System.out.println("The y-intercept of your line: " + equation.yintercept());
                System.out.println("The distance between the two points: " + equation.distance());
                System.out.println("");
                System.out.print("Enter a value for x: ");
                equation.setNewX(scan.nextDouble());
                System.out.println("Your point on the line is: " + equation.newCords());
                System.out.println("");
                System.out.println("Type 1 to stop the program and 0 to restart.");
                num = scan.nextInt();
                scan.nextLine();
            } else {
                System.out.println("The equation to your line is: x = " + x2);
                System.out.println("The slope of your line is undefined.");
                System.out.println("The y-intercept of your line does not exist, unless the line is x = 0, in which it has infinite y - intercepts");
                System.out.println("The distance between the two points: " + Math.abs(y1-y2));
                System.out.println("");
                System.out.println("");
                System.out.println("Type 1 to stop the program and 0 to restart.");
                num = scan.nextInt();
                scan.nextLine();
            }

        }



    }



}


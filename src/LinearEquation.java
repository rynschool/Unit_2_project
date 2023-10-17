public class LinearEquation {
    private int xCord1;
    private int yCord1;
    private int xCord2;
    private int yCord2;

    private double newX;


    public LinearEquation (int x1, int y1, int x2, int y2) {
        xCord1 = x1;
        yCord1 = y1;
        xCord2 = x2;
        yCord2 = y2;
    }


    public String slope () {
        if (xCord2 - xCord1 == 0) {
            return "undefined";
        } else {
            return (yCord2 - yCord1) + "/" + (xCord2 - xCord1);
        }
    }


    public double yintercept () {
        return yCord1 - ((yCord2 * 1.0 - yCord1)/(xCord2 - xCord1)) * xCord1;
    }


    public String equation () {
        return "y = " + slope() + "x + " + yintercept();
    }

    public double distance () {
        double cool = Math.sqrt(Math.pow(yCord2-yCord1,2) + Math.pow(xCord2-xCord1,2));
        return Math.round(cool * 100.0) / 100.0;
    }

    public void setNewX (double number) {
        newX = number;
    }
    public String newCords() {
        double newY = ((yCord2 * 1.0 - yCord1)/(xCord2-xCord1) * newX + yintercept());
        return "(" + newX + ", " + newY + ")";
    }

    public String getInfo () {
        String returned = "";
        if (xCord2 - xCord1 != 0) {
            returned = "The two points are: (" + xCord1 + ", " + yCord1 + ")" + "(" + xCord2 + ", " + yCord2 + ")\n";
            returned += "The equation of your line is: " + equation() + "\n";
            returned += "The slope of the line is: " + slope() + "\n";
            returned += "The y-intercept of the line is: " + yintercept() + "\n";
            returned += "The distance between the two points is: "  + distance() + "\n";
        } else {
            returned = "The two points are: (" + xCord1 + ", " + yCord1 + ")" + "(" + xCord2 + ", " + yCord2 + ")\n";
            returned += "The equation of your line is: x = " + xCord2 + "\n";
            returned += "The slope of the line is: undefined\n";
            returned += "The y-intercept of the line doesn't exist, unless the line is x=0, in which it has infinite y - intercepts\n";
            returned += "The distance between the two points is: "  + (Math.abs(yCord2-yCord1)) + "\n";
        }

        return returned;
    }
}


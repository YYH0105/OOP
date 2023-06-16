package flag;

public class Shape {
    double x, y;
    
    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "圖形原點:" + x + ":" + y;
    } 
}

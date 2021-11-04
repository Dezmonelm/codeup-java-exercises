package shapes;

abstract class Quadralateral extends Shape implements Measurable  {
    
    protected double length;
    protected double width;
    
    public Quadralateral(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double getLength() {
        return this.length;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    abstract void setLength(double length);
    abstract void setWidth(double width);
}

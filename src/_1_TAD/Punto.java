package _1_TAD;

public class Punto {
    private int x,y,z;
    String dimension;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Punto() {
        this.x = 0;
        this.y = 0;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }
}

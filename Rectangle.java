/**
 * Represents a rectangle with length and width.
 * Includes methods to set/get values, compare rectangles, and display info.
 */
public class Rectangle {
    private int length;
    private int width;

    // Default constructor
    public Rectangle() {
        this.length = 0;
        this.width = 0;
    }

    // Constructor with parameters
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Setters
    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    // Getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // toString method
    public String toString() {
        return "Rectangle [Length = " + length + ", Width = " + width + "]";
    }

    // equals method
    public boolean equals(Rectangle other) {
        return this.length == other.length && this.width == other.width;
    }
}
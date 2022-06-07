package be.intecbrussel.sets;

import java.util.Objects;

public class Box {
    private int height;
    private int length;
    private int width;

    public Box(int height, int length, int width) {
        this.height = height;
        this.length = length;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Box{" +
                "h=" + height +
                ", l=" + length +
                ", w=" + width +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return height == box.height && length == box.length && width == box.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, length, width);
    }
}

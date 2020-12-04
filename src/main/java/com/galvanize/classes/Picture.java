package com.galvanize.classes;

public class Picture {
    private boolean framed;
    private int height;
    private int width;

    Picture(int height, int width) {
        this(false, height, width);
    }

    Picture(boolean framed, int height, int width) {
        this.framed = framed;
        this.height = height;
        this.width = width;
    }

    public static void main(String[] args) {
        Picture pic = new Picture(10, 20);
        System.out.printf("%d x %d Picture, framed: %b%n", pic.getHeight(), pic.getWidth(), pic.isFramed());
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isFramed() {
        return framed;
    }

    public void setFramed(boolean framed) {
        this.framed = framed;
    }
}

package com.mmx.unit4;

public class Shape {
    public static double areaOf(Triangle t) { return t.getBase() * t.getHeight() * 0.5; }
    public static double areaOf(Circle c) { return Math.PI * c.getRadius() * c.getRadius(); }
    public static double areaOf(Rectangle r) { return r.getHeight() * r.getWidth(); }
    public static double areaOf(Square s) { return s.getSide() * s.getSide(); }
}

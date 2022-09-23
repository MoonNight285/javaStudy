package ch4;

public class Earth {
    public static final double EARTH_RADIOUS = 6400;
    public static final double EARTH_SURFACE_AREA;

    static {
        EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIOUS * EARTH_RADIOUS;
    }
}

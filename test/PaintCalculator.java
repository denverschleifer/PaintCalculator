public class PaintCalculator {
    private Room room;
    private static final int PAINT_FOR_CEILING = 350;
    public PaintCalculator(Room room) {
        this.room = room;
}
    private double calculateArea(){
        return(this.room.getArea());
}
    public int getGallonsOfPaintForCeiling() {
        double gallonsNeeded = 0;
        gallonsNeeded = calculateArea() / PAINT_FOR_CEILING;
        return (int) Math.ceil(gallonsNeeded);
    }
}

public class Rectangle implements Shape {

    @Override
    public void draw() {

        int i;
        int height = 4;
        int width = 6;

        for (i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}

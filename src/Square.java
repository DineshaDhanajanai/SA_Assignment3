public class Square implements Shape {

    @Override
    public void draw() {



        int i = 5;
        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

}

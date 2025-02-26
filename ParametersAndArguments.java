public class ParametersAndArguments {

    // Method to calculate area
    public static int calculateArea(int width, int height) {
        int area = width * height;
        return area;
    }

    public static void main(String[] args) {
        int roomWidth = 10;
        int roomHeight = 15;

        // Calling the method and storing the result
        int area = calculateArea(roomWidth, roomHeight);

        // Printing the result
        System.out.println("The calculated area is: " + area);
    }
}

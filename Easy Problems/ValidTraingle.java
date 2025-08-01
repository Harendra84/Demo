public class ValidTraingle {
    public static void main(String[] args){


        int a = 3, b = 4, c = 10;
        if(isValidTraingle(a, b, c)){
            System.out.println("The sides " + a + ", " + b + ", " + c + " can form a triangle.");
        } else{
            System.out.println("The sides " + a + ", " + b + ", " + c + " cannot form a triangle.");
        }
    }

    public static boolean isValidTraingle(int a, int b, int c){
        {
            return (a + b > c) && (a + c > b) && (b + c > a);
        }
}
}
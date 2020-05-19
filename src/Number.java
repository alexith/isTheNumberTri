
public class Number{
    public static void main(String[] args) {

        class someNumber{
            int number;
            public boolean isTriangularNumber() {
                int x = 1;
                int triangularNumber = 1;

                while(triangularNumber < number){
                    x++;
                    triangularNumber = triangularNumber + 1;
                }
                if(triangularNumber == number){
                    return true;
                } else{
                    return false;
                }
            }
            public boolean isNumberSquare(){
                double squareRoot = Math.sqrt(number);

                if (squareRoot == Math.floor(squareRoot)) {
                    return true;
                } else {
                    return false;
                }


            }
        }
    }
}


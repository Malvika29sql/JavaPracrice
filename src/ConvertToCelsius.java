import java.util.Scanner;

public class ConvertToCelsius  {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Input temperature in Fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                double celsius = calculateFormula(fahrenheit);
                int sumOfNumber = sum(2,3);
        int sumOfNumber1 = sum("cat","bat");
                System.out.println(fahrenheit + " degree fahrenheit is equal to " + celsius + "in celsius");
        System.out.println(sumOfNumber1);

            }

            public static double calculateFormula(Double fahrenheit){
               return ((fahrenheit - 32.0) / 1.8);
            }


            public static int sum(int a,int b){
            int sumOfNumber = a+b;
                    return(sumOfNumber);
            }
    public static int sum(String a,String b){
        String sumOfNumber = a+' '+b;
        return 1;
    }
        }

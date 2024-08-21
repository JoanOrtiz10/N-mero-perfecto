package numberperfect;

/**
 *
 * @author BYzYzzCODE
 */
public class NumberPerfect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int number = 6;
        String result = validationNumber(number);
        System.out.println(result);
        long endTime = System.nanoTime()- startTime;
        System.out.println("tiemp: " + endTime);
    }

    public static String validationNumber(int num) {

        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        
        if(num == sum ){
        return "es un numero perfecto" ;
        }else{
        return "no es un numero perfecto";
        }
    }

}

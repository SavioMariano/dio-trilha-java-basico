package estruturas.repetição;
public class ExamploBreakContinue {
    public static void main(String[] args) {
        for(int x = 1; x <= 5; x++){
            if (x >= 3 && x <= 4) {
                break;
            }
            System.out.println(x);
        }
    }
}

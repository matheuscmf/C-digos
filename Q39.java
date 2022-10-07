package ExercíciosTiago;

public class Q39 {
    public static void main(String[] args) {
        double qtT,qt1,qt2,qt3;
        qtT = 780000.0;
        qt1 = 0.46*(qtT);
        qt2 = 0.32*(qtT);
        // o terceiro ganhador receberá exatos 22% do total, ou seja, 0.22 |( (1-0.46)-0.32 ==0.22)|
        qt3 = 0.22*(qtT);
        System.out.println("A Quantia ganha por cada ganhador,respectivamente,foi: ");
        System.out.println("1° Ganhador:R$ "+qt1);
        System.out.println("2° Ganhador:R$ "+qt2);
        System.out.println("3° Ganhador:R$ "+qt3);
    }
}

public class main {

    public static void main(String[] args) {
        int price = 2420;
        int bonusMile = 20;
        int mile = price / bonusMile;
        if (price > bonusMile) {
            System.out.println(" Количество начисленных миль " + mile);
        }
    }
}
import java.util.Scanner;

public class GreatFight {    public static void main(String[] args) {
    int DragonHp = 50;
    int knightHits = 10;
    Scanner console = new Scanner(System.in);
    System.out.print("Вы решили напасть на спящего дракона. Теперь придется с ним сражаться.");

            while (knightHits>0&&DragonHp>0) {
        System.out.print("Сила удара мечом: от 1 до 10:");
        int hits = console.nextInt();
                if (hits < 1 || hits > 10) {
                    System.out.println("Промах");
                } else {
                    DragonHp = DragonHp - hits;
                }
                knightHits--;
            }

    if (DragonHp <= 0) {
        System.out.println("Дракон повержен, вы в безопасности!");
    } else {
        System.out.println("Ваши удары были с каждым ударом все слабее. В конце концов вы проиграли");
    }
}
}
package lotto;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        InOutPut bring = new InOutPut();
        ProcessData change = new ProcessData();
        CoreProcess core = new CoreProcess();
        int moneyChance;
        int bonus;
        List<Integer> lotto;

        try {
            moneyChance = change.moneyChance(change.money(bring.InputNumber(bring.start)));
            System.out.println(moneyChance);
            bring.confirm(moneyChance);
            System.out.println(core.lottoPack(moneyChance));
            lotto = change.pickedNumbers(bring.InputNumber(bring.input));
            new Lotto(lotto);
            bonus = change.money(bring.InputNumber(bring.inputBonus));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        new ResultLotto(moneyChance, lotto, bonus);

    }

}

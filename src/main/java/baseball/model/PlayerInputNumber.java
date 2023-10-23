package baseball.model;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

// 2. 사용자 입력 받기
public class PlayerInputNumber {
    public String playerInput() {
        System.out.println("숫자를 입력해주세요 : ");
        String input = Console.readLine();

        return input;
    }

    public List<Integer> inputNumberList(String input) {
        List<Integer> playerNum = new ArrayList<>();

        for (String number : input.split("")) {
            playerNum.add(Integer.parseInt(number));
        }
        return playerNum;
    }
}

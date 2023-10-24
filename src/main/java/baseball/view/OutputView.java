package baseball.view;

public class OutputView {
    private final static String GAME_START_MESSAGE = "숫자 야구 게임을 시작합니다.";
    private final static String INPUT_NUM_MESSAGE = "숫자를 입력해주세요 : ";
    private static final String BALL_MESSAGE = "볼";
    private static final String STRIKE_MESSAGE = "스트라이크";
    private static final String NOTHING_MESSAGE = "낫싱";
    private final static String GAME_SUCCESS_MESSAGE = "3개의 숫자를 모두 맞히셨습니다! 게임 종료";
    private final static String GAME_RESTART_MESSAGE = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

    public static void printGameStartMessage(){
        System.out.println(GAME_START_MESSAGE);
    }

    public static void printInputNumMessage() {
        System.out.print(INPUT_NUM_MESSAGE);
    }

    public static void printBallMessage(){
        System.out.println(BALL_MESSAGE);
    }
    public static void printStrikeMessage(){
        System.out.println(STRIKE_MESSAGE);
    }

    public static void printNothingMessage(){
        System.out.println(NOTHING_MESSAGE);
    }

    public static void printGameSuccessMessage(){
        System.out.println(GAME_SUCCESS_MESSAGE);
    }

    public static void printRestartMessage() {
        System.out.println(GAME_RESTART_MESSAGE);
    }
}
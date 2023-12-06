
public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    // コンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    // チーム名を取得するGetterメソッド
    public String getName() {
        return name;
    }

    // 勝ち数を取得するGetterメソッド
    public int getWin() {
        return win;
    }

    // 負け数を取得するGetterメソッド
    public int getLose() {
        return lose;
    }

    // 引き分け数を取得するGetterメソッド
    public int getDraw() {
        return draw;
    }

    // 勝率を計算するメソッド
    public double getRate() {
        return (double) win / (win + lose);
    }

    // レポートを表示するメソッド
    public void report() {
        System.out.println(getName() + "の2022年の成績は " + getWin() + "勝 " + getLose() + "敗 " + getDraw() + "分、勝率は " + getRate() + "です。");
    }
}
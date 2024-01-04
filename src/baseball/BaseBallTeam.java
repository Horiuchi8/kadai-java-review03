/*クラスオブジェクト(鋳型の役割)
 * 基本情報のテンプレートを記入
 * 勝率計算メソッドを記入
 * reportメソッドを記入
*/

package baseball;
//基本情報の記入
public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

    //引数なしのコンストラクタの生成
    public BaseBallTeam() {
    }

    //コンストラクタの作成
    public BaseBallTeam(String name,int win, int lose, int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    //勝率計算メソッド
    public double getRate() {
        return (double) win / (win + lose);
    }

    //reportメソッド
    public void report() {

        double getRate = 0;
        System.out.println(name + "の2022年の成績は" + win + "勝" + lose + "敗" + draw + "分" + "勝率は" + getRate + "です。");

    }
}

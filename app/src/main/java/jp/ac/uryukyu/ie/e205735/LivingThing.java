package jp.ac.uryukyu.ie.e205735;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;
    /**
    *  String name; //名前
    *  int hitPoint; //HP
    *  int attack; //攻撃力
    *  boolean dead; //生死状態。true=死亡。
    */

    public LivingThing(String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    /**
     * 自身へ攻撃されたときのダメージ処理をするメソッド。
     * 指定されたダメージを hitPoint から引き、死亡判定を行う。
     * @param damage 受けたダメージ
     */
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは倒れた。\n", name);
        }
    }

    /**
     * 攻撃するメソッド。
     * attackに応じて乱数でダメージを算出し、opponent.wounded()によりダメージ処理を実行。
     * @param opponent 攻撃対象
     */
    public void attack(LivingThing opponent){
        if (this.dead == false){
        int damage = (int)(Math.random() * attack);
        System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        opponent.wounded(damage);
        }
    }

    /**
     * フィールド変数のname（名前）を受け取るメソッド
     */
    public String getName(){
        return this.name;
    }

    /**
     * フィールド変数のhitPoint（HP）を受け取るメソッド
     * @return int型 hitPoint
     */
    public int getHitPoint(){
        return this.hitPoint;
    }

    /**
     * フィールド変数のdead（生死状態）を受け取るメソッド
     */
    public boolean isDead(){
        return this.dead;
    }
}


public class Monster {

	//課題9-1
	private String name;	//名前
	private int hp;			//体力
	private int at;			//攻撃力
	private int df;			//防御力
	
	//getterメソッド
	public String getName() {
		return this.name;
	}
	
	//setterメソッド
	public void setName(String name) {
		this.name = name;
	}

	//getterメソッド
	public int getHp() {
		return this.hp;
	}
	
	//setterメソッド
	public void setHp(int hp) {
		this.hp = hp;
	}
	//getterメソッド
	public int getAt() {
		return this.at;
	}
	
	//setterメソッド
	public void setAt(int at) {
		this.at = at;
	}
	//getterメソッド
	public int getDf() {
		return this.df;
	}
	
	//setterメソッド
	public void setDf(int df) {
		this.df = df;
	}

	
	void attack() {//攻撃
		System.out.println(this.name + "の攻撃！");
		System.out.println(this.at + "のダメージ");
	}
	
	void defence() {//防御
		System.out.println(this.name + "は守りを固めた！");
		this.df = this.df + 10;
		System.out.println("防御力が10上がった");
	}
	
	void takeDamage(int damage) {
		this.hp -= damage;
		if(this.hp > 0) {
			System.out.println(this.name + "の残りHP:" + this.hp);
		}else {
			System.out.println(this.name + "は倒れた！");
		}
	}

}

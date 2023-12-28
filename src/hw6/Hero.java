package hw6;
public abstract class Hero implements Moveable, Defendable, Attackable {
	// 省略 getter/setter...
	
	private String name;
	private int level;
	private double exp;
	
	public Hero() {
		this("David", 1, 0);
	}
	
	public Hero(String name, int level, double exp) {
		this.name = name;
		this.level = level;
		this.exp = exp;
	}
	
	public void attack() {
		System.out.println("預設攻擊");
	}
	
	public void move() {
		System.out.println("預設移動");
	}
	
	
	public void defend() {
		System.out.println("預設防禦");
	}
}

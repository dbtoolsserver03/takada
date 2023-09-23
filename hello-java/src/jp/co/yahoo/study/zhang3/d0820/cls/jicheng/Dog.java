package jp.co.yahoo.study.zhang3.d0820.cls.jicheng;

public class Dog {

	
	private String name;
    protected int height;
    protected int weight;
    protected int color;
    
    protected void call() {
		System.out.println("wang");
	}
    
	public void run() {
		System.out.println("run");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

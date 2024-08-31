package jp.co.yahoo.saisk.cls.test;

public class Area {

	int x;
	int y;
	
	
	public Area(int x, int y) {
		this.x = x;
		this.y = y;
	}


	public static void main(String[] args) {
		
		Area area = new Area(10,20);
		int ret = funArea(area);
		System.out.println(ret);
	}


	private static int funArea(Area area) {
		return area.x*area.y;
	}

}

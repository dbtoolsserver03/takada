package com.oralce.study.interf.cls;

import com.oralce.study.cls.dt.Animal;
import com.oralce.study.interf.Area;
import com.oralce.study.interf.Color;

// 当框架不想让开发者用框架里的类生成对象时，就会把这个类定义成抽象类
public  abstract class Leg4  extends Animal implements Color,Area {
	@Override
	public void printMyColor() {
		// TODO 自動生成されたメソッド・スタブ
	}

	@Override
	public void printMyArea() {
		// TODO 自動生成されたメソッド・スタブ
	}
}



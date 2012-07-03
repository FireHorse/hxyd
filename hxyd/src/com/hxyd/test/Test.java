package com.hxyd.test;

import com.alibaba.fastjson.JSON;
import com.hxyd.bean.Unit;

public class Test {
	public static void main(String args[]){
		Unit unit = new Unit();
		unit.setAccState("test");
		unit.setBalance(500.00);
		unit.setBaseNumber(600.00);
		Object str=JSON.toJSON(unit);
		System.out.println(str);
		
	}
}

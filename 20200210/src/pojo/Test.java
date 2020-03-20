package pojo;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;

public class Test {

	public static void main(String[] args) {
		Dept d = new Dept(10,"������","����");
		
		String str = JSON.toJSONString(d);
		System.out.println(str);
		
		List<Dept> list = new ArrayList<Dept>();
		list.add(d);
		list.add(new Dept(20,"�г���","����"));
		String str2 = JSON.toJSONString(list);
		System.out.println(str2);

	}

}

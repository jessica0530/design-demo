package com.design.pattern.adapter;

import com.design.pattern.builderpattern.BMWCarBuilder;
import com.design.pattern.builderpattern.CarBuilder;

public class MainTest {
	public static void main(String[] args) throws Exception{
		UserInfoTransfer transfer = new UserInfoTransfer();
		UserInfoInto userInto = transfer.getUser();
	}
}

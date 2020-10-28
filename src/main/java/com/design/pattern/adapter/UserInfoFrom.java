package com.design.pattern.adapter;

import java.util.HashMap;
import java.util.Map;

public class UserInfoFrom implements  UserInfoFromInterface{
	@Override
	public Map<String, String> getUserInfo() {
		Map<String,String> nameMap = new HashMap<>();
		nameMap.put("jessica","18");
		return nameMap;
	}

	@Override
	public Map<String, String> getHomeAddress() {
		Map<String,String> addressMap = new HashMap<>();
		addressMap.put("jessica","SH");
		return null;
	}
}

package com.design.pattern.proxy;

import com.design.pattern.factory.BMWFactory;
import com.design.pattern.factory.Car;
import com.design.pattern.factory.Factory;

public class MainTest {
	public static void main(String[] args) throws Exception{
		PDFFile pdf = new PDFFile();
		File proxy = (File)PDFProxy.getProxy(pdf);
		proxy.openFile();
	}
}

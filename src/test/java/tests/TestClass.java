package tests;

import tests.BaseClass;


public class TestClass {

	public static void main(String[] args) {
		BaseClass bs = new BaseClass();
		
		bs.setup();
		bs.test();
		bs.teardown();

	}

}

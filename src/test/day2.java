package test;

import org.testng.annotations.Test;

public class day2 {
	@Test
	public void day2_1() {
		System.out.println("day2-1");
	}
	@Test(dependsOnMethods = {"day2_3"} )
	public void day2_2() {
		System.out.println("day2-2 ");
	}
	@Test
	public void day2_3() {
		System.out.println("day2-3 Depends Test");
	}
	@Test(groups = {"Smoke"})
	public void day2_4() {
		System.out.println("day2-4 Smoke");
	}

}

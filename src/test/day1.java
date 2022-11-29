package test;

import org.testng.annotations.Test;

public class day1 {
	@Test(groups = {"Smoke"})
	public void day1_1() {
		System.out.println("day1-1");
	}
	@Test
	public void day1_2() {
		System.out.println("day1-2 Smoke");
	}
	@Test
	public void day1_3() {
		System.out.println("day1-3 ");
	}
	@Test(groups = {"Smoke"})
	public void day1_4() {
		System.out.println("day1-4 Smoke");
	}

}

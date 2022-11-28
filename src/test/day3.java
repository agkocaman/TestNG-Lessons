package test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day3 {
	@Test
	public void day3_1() {
		System.out.println("day3-1");
	}
	@AfterSuite
	public void day3_2() {
		System.out.println("day3-2 bu alanda @AfterMethod Kullandım.");
	}
	@Test
	public void day3_3() {
		System.out.println("day3-3");
	}
	@Test
	public void day3_4() {
		System.out.println("day3-4");
	}

}

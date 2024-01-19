package lab12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class testAddNumber {
	@Test
	void test() {
		RecursiveFunction rf = new RecursiveFunction();
		assertEquals(55, rf.addNumbers(10));
	}
}

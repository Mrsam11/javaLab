package lab12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class checkPrime {
	@Test
	void test() {
		Lab12 obj = new Lab12();
		assertEquals(true, obj.checkPrime(3));
	}
}

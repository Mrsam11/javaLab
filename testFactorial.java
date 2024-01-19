package lab12;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class testFactorial {
	@Test
	void test() {
		Lab12 obj = new Lab12();
		assertEquals(120, obj.factorial(5));
	}
}

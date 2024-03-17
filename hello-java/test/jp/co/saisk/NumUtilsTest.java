/**
 * 
 */
package jp.co.saisk;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class NumUtilsTest {

	@Test
	void testAdd() {

		int ret = NumUtils.getRet(5, 3, "+");
		Assert.assertEquals(8, ret);

	}

	@Test
	void testMinus() {

		int ret = NumUtils.getRet(5, 3, "-");
		Assert.assertEquals(2, ret);

	}

}

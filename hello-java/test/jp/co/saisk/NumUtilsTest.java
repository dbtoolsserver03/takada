/**
 *
 */
package jp.co.saisk;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

/**
 *
 */
public class NumUtilsTest {

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
//
//	@Test
//	void testOther() {
//
//		int ret = NumUtils.getRet(5, 3, "$");
//		Assert.assertEquals(0, ret);
//
//	}
//	@Test
//	void testNew() {
//
//		NumUtils  ret = new NumUtils();
//		Assert.assertNotEquals(null, ret);
//
//	}
}

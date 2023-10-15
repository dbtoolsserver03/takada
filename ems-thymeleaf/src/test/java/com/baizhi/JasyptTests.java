package com.baizhi;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JasyptTests {

	private StringEncryptor stringEncryptor;

	@Autowired
	public JasyptTests(StringEncryptor stringEncryptor) {
		this.stringEncryptor = stringEncryptor;
	}

	@Test
	public void testSecret() {
		
		String user = "root";
		String pwd = "123456";
		String ip1 = "localhost";
		String ip2 = "127.0.0.1";
		System.out.println(2222);
		//加密
		String secretUser = stringEncryptor.encrypt(user);
		System.out.println(user + ":" + secretUser);
		String secretPwd = stringEncryptor.encrypt(pwd);
		System.out.println(pwd + ":" + secretPwd);

		String ip1V = stringEncryptor.encrypt(ip1);
		System.out.println(ip1 + ":" + ip1V);
		String ip2V = stringEncryptor.encrypt(ip2);
		System.out.println(ip2 + ":" + ip2V);

		//        String decrypt = stringEncryptor.decrypt("cv2W1fM0vSNpx4R12MsY2Q==");
		//        System.out.println(decrypt);

	}
}

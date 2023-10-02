package com.baizhi;

import org.junit.jupiter.api.Test;
import org.mybatis.generator.LombokMyCommentGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class LombokMyCommentGeneratorApplicationTests {

	@Autowired
	private ApplicationContext applicationContext;

	@Test
	void contextLoads() {

		for (String name : applicationContext.getBeanDefinitionNames()) {
			System.out.println(name);
		}
		
		//GeneratorSqlmapMysql.run();
		LombokMyCommentGenerator.run();
	}
}

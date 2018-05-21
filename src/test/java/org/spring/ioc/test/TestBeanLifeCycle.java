package org.spring.ioc.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.spring.bean.BeanLifeCycle;

@RunWith(BlockJUnit4ClassRunner.class) // 指定JUnit默认执行类
public class TestBeanLifeCycle extends UnitTestBase {

	public TestBeanLifeCycle() {// 通过构造方法传入spring配置文件路径

		super("classpath*:spring-beanlifecycle.xml");

	}

	@Test
	public void testScope() {

		BeanLifeCycle bean = super.getBean("beanLifeCycle");
		System.out.println(bean.toString());

	}

}

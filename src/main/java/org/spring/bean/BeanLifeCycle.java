package org.spring.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle  implements InitializingBean, DisposableBean{

	@Override
	public void destroy() throws Exception {
		
		System.out.println("Bean Destroy.");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		 System.out.println("Bean Init.");
		
	}

}

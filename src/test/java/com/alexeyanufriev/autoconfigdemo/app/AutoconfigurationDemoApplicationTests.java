package com.alexeyanufriev.autoconfigdemo.app;

import com.alexeyanufriev.autoconfigdemo.app.beans.DependencyBean;
import com.alexeyanufriev.autoconfigdemo.app.beans.MainBean;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class AutoconfigurationDemoApplicationTests {

	@Autowired(required = false)
	private MainBean mainBean;

	@Autowired(required = false)
	private DependencyBean dependencyBean;

	@Test
	void completeSetOfBeansShouldBeAutowired() {
		Assertions.assertThat(this.mainBean).isNotNull();
		Assertions.assertThat(this.dependencyBean).isNotNull();
	}

}

package com.lsylove.springmvc.test;

import static org.junit.Assert.*;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:META-INF/spring/**/*.xml" })
public class ConnectionTest {

	@Autowired
	private SqlSessionFactory ref;

	@Test
	@Ignore
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void test1() {
		assertNotNull(ref);
	}

}

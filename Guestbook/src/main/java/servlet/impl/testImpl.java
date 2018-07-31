package servlet.impl;

import servlet.service.testService;
import org.springframework.stereotype.Service;
import egovframework.rte.fdl.cmmn.EgovAbstractServiceImpl;

@Service("testService")
public class testImpl extends EgovAbstractServiceImpl implements testService {
	@Override
	public String addStringTest(String str) throws Exception {
		System.out.println("testImpl.java - addStringTest()");

		return str + " -> testImpl ";
	}
}
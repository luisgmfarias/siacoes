package br.edu.utfpr.dv.siacoes.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DepartmentTest {
	
	private final Department department = new Department();

	@Test
	public void testSite() {
		department.setSite("https://portal.utfpr.edu.br");
		assertEquals("https://portal.utfpr.edu.br", department.getSite());
	}

}

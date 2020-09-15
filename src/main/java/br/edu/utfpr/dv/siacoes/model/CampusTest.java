package br.edu.utfpr.dv.siacoes.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class CampusTest {
	
	private final Campus campus = new Campus();
	
	@Test
	public void testName() {
		campus.setName("Curitiba");
		assertEquals("Curitiba", campus.getName());
	}
	
	@Test
	public void testInitials() {
		campus.setInitials("UTFPR");
		assertEquals("UTFPR", campus.getInitials());
	}

}

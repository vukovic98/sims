package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import model.Document;
import model.Field;
import model.State;
import model.Transition;

class DocumentTest extends Document {

	@Test
	void test() {
		testNextState();
		testAddField();
		testFindField();
		testDeleteField();
	}
	
	public void testNextState() {
		int id = 1;
		boolean succeed = true;
		State s1 = new State("1", "1", "AccessPermit", 1);
		State s2 = new State("2", "2", "AccessPermit", 2);
		super.setCurrentState(s1);
		
		Transition t = new Transition(1, "1", "AccessPermit", s1, s2, s1);
		s1.addTransition(t);
		s2.addTransition(t);
		
		assertEquals(s2, super.nextState(id, succeed));
	}
	
	public void testAddField() {
		super.setFields(new ArrayList<Field>());
		
		Field f = new Field("f", "string", "F: ");
		
		assertEquals(0, super.getFields().size());
		
		super.addField(f);
		
		assertEquals(1, super.getFields().size());
	}
	
	public void testFindField() {
		super.setFields(new ArrayList<Field>());
		
		Field f = new Field("f", "string", "F: ");

		assertNull(super.findField(f.getName()));
		
		super.addField(f);

		assertEquals(f, super.findField(f.getName()));
	}
	
	public void testDeleteField() {
		super.setFields(new ArrayList<Field>());
		
		Field f = new Field("f", "string", "F: ");
		super.addField(f);
		
		assertEquals(f, super.findField(f.getName()));
		
		super.deleteField(f);
		
		assertEquals(null, super.findField(f.getName()));
	}
	
	public void testEquals() {
		Document d1 = new Document();
		d1.setTitle("D1");
		
		Document d2 = new Document();
		d2.setTitle("d1");
		
		Document d3 = new Document();
		d3.setTitle("D2");
		
		assertTrue(d1.equals(d2));
		assertFalse(d1.equals(d3));
	}

}

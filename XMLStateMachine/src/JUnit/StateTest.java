package JUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import model.State;

class StateTest extends State {


	@Test
	void testEquals() {
		super.setEntityId(1);
		State s1 = new State();
		s1.setEntityId(1);
		State s2 = null;
		
		boolean b1 = super.getEntityId() == s1.getEntityId();
		boolean b2 = false;
		
		assertEquals(b1, super.equals(s1));
		assertEquals(b2,super.equals(s2));
	}

}

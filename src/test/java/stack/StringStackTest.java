package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringStackTest {

    @Test
    public void shouldReturnTrueForEmptyStack(){
        StringStack stack = new StringStack();
        assertTrue(stack.isEmpty());

    }

    @Test
    public void shouldReturnFalseForNotEmptyStack(){
        StringStack stack = new StringStack();
        stack.push("TEST");
        assertFalse(stack.isEmpty());

    }

    @Test
    public void shouldReturnItemAfterPushAndPop(){
        StringStack stack = new StringStack();
        stack.push("TEST");
        assertEquals("TEST", stack.pop());
        assertTrue(stack.isEmpty());

    }

}
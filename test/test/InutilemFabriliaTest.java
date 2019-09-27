package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InutilemFabriliaTest {

    @org.junit.jupiter.api.Test
    void add() {
        assertEquals(2, InutilemFabrilia.add(1,1));
    }

    @Test
    void sub() {
        assertEquals(99, InutilemFabrilia.sub(100,1));
    }

    @Test
    void mul() {
        assertEquals(100, InutilemFabrilia.sub(100,1));
    }
}

package com.bowling;

import org.junit.Test;
import org.junit.Before;
import static org.assertj.core.api.Assertions.*;

public class BowlingGameTest {
    private Game g;

    @Before
    public void beforeGameTest() {
        g = new Game();
    }

    private void rollMany(int n, int pins) {
        for (int i = 0; i < n; i++)
            g.roll(pins);
    }

    @Test
    public void testGutterGame() throws Exception {
        rollMany(20, 0);
        assertThat(g.score()).isEqualTo(0);
    }

    @Test
    public void testAllOnes() throws Exception {
        rollMany(20, 1);
        assertThat(g.score()).isEqualTo(20);
    }

    @Test
    public void testOneSpare() throws Exception {
        g.roll(5);
        g.roll(5);
        g.roll(3);
        rollMany(17, 0);
        assertThat(g.score()).isEqualTo(16);
    }
}

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

  @Test
  public void testGutterGame() throws Exception {
    Game g = new Game();
    for(int i = 0; i < 20; i++)
      g.roll(0);
    assertThat(g.score()).isEqualTo(0);
  }

  @Test
  public void testAllOnes() throws Exception {
    Game g = new Game();
    for (int i = 0; i < 20; i++)
      g.roll(1);
    assertThat(g.score()).isEqualTo(20);
  }
}

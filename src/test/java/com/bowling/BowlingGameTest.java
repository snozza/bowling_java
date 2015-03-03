package com.bowling;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class BowlingGameTest {

  @Test
  public void testGutterGame() throws Exception {
    Game g = new Game();
    for(int i=0; i < 20; i++)
      g.roll(0);
    assertThat(0).isEqualTo(g.score());
  }
}

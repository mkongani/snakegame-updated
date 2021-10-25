import static org.junit.jupiter.api.Assertions.*;

import java.awt.BorderLayout;

import javax.swing.JFrame;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UnitTest {

	@Test
	void test() {

        ScorePanel scorePanel = new ScorePanel();
        GamePanel gamePanel = new GamePanel(scorePanel);
       
        JFrame  frame = new JFrame("Snake Game");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       
        frame.getContentPane().add(scorePanel, BorderLayout.NORTH);
        frame.getContentPane().add(gamePanel);
        
        frame.setSize(400, 400);
        frame.setVisible(true);
       
		fail("Not yet implemented");
	}

}

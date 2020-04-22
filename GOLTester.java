import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GOLTester {

	//Normal Game of Life Tests:
	//oneStep method tests

	@Test
	public void oneStepTest1() {

		GameOfLife test = new GameOfLife();
		test.addCells(5,4);
		test.addCells(5,5);
		test.addCells(5,6);
		test.oneStep();

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,1,0,0,0,0},
							{0,0,0,0,0,1,0,0,0,0},
							{0,0,0,0,0,1,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void oneStepTest2() {

		GameOfLife test = new GameOfLife();
		test.addCells(4,4);
		test.addCells(4,5);
		test.addCells(4,6);
		test.addCells(5,3);
		test.addCells(5,4);
		test.addCells(5,5);
		test.oneStep();

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,1,0,0,0,0},
							{0,0,0,1,0,0,1,0,0,0},
							{0,0,0,1,0,0,1,0,0,0},
							{0,0,0,0,1,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void oneStepTest3() {

		GameOfLife test = new GameOfLife();
		test.addCells(3,3);
		test.addCells(3,4);
		test.addCells(4,3);
		test.addCells(4,4);
		test.addCells(5,5);
		test.addCells(5,6);
		test.addCells(6,5);
		test.addCells(6,6);
		test.oneStep();

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,1,1,0,0,0,0,0},
							{0,0,0,1,0,0,0,0,0,0},
							{0,0,0,0,0,0,1,0,0,0},
							{0,0,0,0,0,1,1,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void oneStepTest4() {

		GameOfLife test = new GameOfLife(20);
		test.addCells(3,9);
		test.addCells(4,8);
		test.addCells(4,9);
		test.addCells(4,10);
		test.addCells(5,7);
		test.addCells(5,9);
		test.addCells(5,11);
		test.addCells(6,7);
		test.addCells(6,9);
		test.addCells(6,11);
		test.addCells(7,8);
		test.addCells(7,9);
		test.addCells(7,10);
		test.addCells(8,9);

		test.addCells(11,9);
		test.addCells(12,8);
		test.addCells(12,9);
		test.addCells(12,10);
		test.addCells(13,7);
		test.addCells(13,9);
		test.addCells(13,11);
		test.addCells(14,7);
		test.addCells(14,9);
		test.addCells(14,11);
		test.addCells(15,8);
		test.addCells(15,9);
		test.addCells(15,10);
		test.addCells(16,9);
		test.oneStep();

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void oneStepTest5() {

		GameOfLife test = new GameOfLife();
		test.addCells(4,4);
		test.addCells(4,5);
		test.addCells(5,4);
		test.addCells(5,5);

		test.oneStep();

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,1,1,0,0,0,0},
							{0,0,0,0,1,1,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	//evolution method tests

	@Test
	public void evolutionTest1() {

		GameOfLife test = new GameOfLife();
		test.addCells(5,4);
		test.addCells(5,5);
		test.addCells(5,6);
		test.evolution(9);

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,1,0,0,0,0},
							{0,0,0,0,0,1,0,0,0,0},
							{0,0,0,0,0,1,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void evolutionTest2() {

		GameOfLife test = new GameOfLife();
		test.addCells(4,4);
		test.addCells(4,5);
		test.addCells(4,6);
		test.addCells(5,3);
		test.addCells(5,4);
		test.addCells(5,5);
		test.evolution(4);

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,1,1,1,0,0,0},
							{0,0,0,1,1,1,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void evolutionTest3() {

		GameOfLife test = new GameOfLife();
		test.addCells(3,3);
		test.addCells(3,4);
		test.addCells(4,3);
		test.addCells(4,4);
		test.addCells(5,5);
		test.addCells(5,6);
		test.addCells(6,5);
		test.addCells(6,6);
		test.evolution(7);

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,1,1,0,0,0,0,0},
							{0,0,0,1,0,0,0,0,0,0},
							{0,0,0,0,0,0,1,0,0,0},
							{0,0,0,0,0,1,1,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void evolutionTest4() {

		GameOfLife test = new GameOfLife(20);
		test.addCells(3,9);
		test.addCells(4,8);
		test.addCells(4,9);
		test.addCells(4,10);
		test.addCells(5,7);
		test.addCells(5,9);
		test.addCells(5,11);
		test.addCells(6,7);
		test.addCells(6,9);
		test.addCells(6,11);
		test.addCells(7,8);
		test.addCells(7,9);
		test.addCells(7,10);
		test.addCells(8,9);

		test.addCells(11,9);
		test.addCells(12,8);
		test.addCells(12,9);
		test.addCells(12,10);
		test.addCells(13,7);
		test.addCells(13,9);
		test.addCells(13,11);
		test.addCells(14,7);
		test.addCells(14,9);
		test.addCells(14,11);
		test.addCells(15,8);
		test.addCells(15,9);
		test.addCells(15,10);
		test.addCells(16,9);
		test.evolution(15);

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void evolutionTest5() {

		GameOfLife test = new GameOfLife();
		test.addCells(4,4);
		test.addCells(4,5);
		test.addCells(5,4);
		test.addCells(5,5);

		test.evolution(420);

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,1,1,0,0,0,0},
							{0,0,0,0,1,1,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}


	//Torus Game of Life Tests:
	//oneStep Method tests

	@Test
	public void torusOneStep1() {

		TorusGameOfLife test2 = new TorusGameOfLife();
		test2.addCells(5,4);
		test2.addCells(5,5);
		test2.addCells(5,6);
		test2.oneStep();

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,1,0,0,0,0},
				{0,0,0,0,0,1,0,0,0,0},
				{0,0,0,0,0,1,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test2.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void torusOneStep2() {

		TorusGameOfLife test2 = new TorusGameOfLife();
		test2.addCells(4,4);
		test2.addCells(4,5);
		test2.addCells(4,6);
		test2.addCells(5,3);
		test2.addCells(5,4);
		test2.addCells(5,5);
		test2.oneStep();

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,1,0,0,0,0},
				{0,0,0,1,0,0,1,0,0,0},
				{0,0,0,1,0,0,1,0,0,0},
				{0,0,0,0,1,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test2.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void torusOneStep3() {

		TorusGameOfLife test2 = new TorusGameOfLife();
		test2.addCells(3,3);
		test2.addCells(3,4);
		test2.addCells(4,3);
		test2.addCells(4,4);
		test2.addCells(5,5);
		test2.addCells(5,6);
		test2.addCells(6,5);
		test2.addCells(6,6);
		test2.oneStep();

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,1,1,0,0,0,0,0},
				{0,0,0,1,0,0,0,0,0,0},
				{0,0,0,0,0,0,1,0,0,0},
				{0,0,0,0,0,1,1,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test2.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void torusOneStep4() {

		TorusGameOfLife test2 = new TorusGameOfLife(20);
		test2.addCells(3,9);
		test2.addCells(4,8);
		test2.addCells(4,9);
		test2.addCells(4,10);
		test2.addCells(5,7);
		test2.addCells(5,9);
		test2.addCells(5,11);
		test2.addCells(6,7);
		test2.addCells(6,9);
		test2.addCells(6,11);
		test2.addCells(7,8);
		test2.addCells(7,9);
		test2.addCells(7,10);
		test2.addCells(8,9);

		test2.addCells(11,9);
		test2.addCells(12,8);
		test2.addCells(12,9);
		test2.addCells(12,10);
		test2.addCells(13,7);
		test2.addCells(13,9);
		test2.addCells(13,11);
		test2.addCells(14,7);
		test2.addCells(14,9);
		test2.addCells(14,11);
		test2.addCells(15,8);
		test2.addCells(15,9);
		test2.addCells(15,10);
		test2.addCells(16,9);
		test2.oneStep();

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
							{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test2.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void torusOneStep5() {

		TorusGameOfLife test2 = new TorusGameOfLife();
		test2.addCells(4,4);
		test2.addCells(4,5);
		test2.addCells(5,4);
		test2.addCells(5,5);

		test2.oneStep();

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,1,1,0,0,0,0},
				{0,0,0,0,1,1,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test2.getBoard();
		assertArrayEquals(actual, expected);
	}

	//evolution Method tests

	@Test
	public void torusEvolution() {

		TorusGameOfLife test = new TorusGameOfLife();
		test.addCells(5,4);
		test.addCells(5,5);
		test.addCells(5,6);
		test.evolution(9);

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,1,0,0,0,0},
				{0,0,0,0,0,1,0,0,0,0},
				{0,0,0,0,0,1,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void torusEvolution2() {

		TorusGameOfLife test = new TorusGameOfLife();
		test.addCells(4,4);
		test.addCells(4,5);
		test.addCells(4,6);
		test.addCells(5,3);
		test.addCells(5,4);
		test.addCells(5,5);
		test.evolution(4);

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,1,1,1,0,0,0},
				{0,0,0,1,1,1,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void torusEvolution3() {

		TorusGameOfLife test = new TorusGameOfLife();
		test.addCells(3,3);
		test.addCells(3,4);
		test.addCells(4,3);
		test.addCells(4,4);
		test.addCells(5,5);
		test.addCells(5,6);
		test.addCells(6,5);
		test.addCells(6,6);
		test.evolution(7);

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,1,1,0,0,0,0,0},
				{0,0,0,1,0,0,0,0,0,0},
				{0,0,0,0,0,0,1,0,0,0},
				{0,0,0,0,0,1,1,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void torusEvolution4() {

		TorusGameOfLife test = new TorusGameOfLife(20);
		test.addCells(3,9);
		test.addCells(4,8);
		test.addCells(4,9);
		test.addCells(4,10);
		test.addCells(5,7);
		test.addCells(5,9);
		test.addCells(5,11);
		test.addCells(6,7);
		test.addCells(6,9);
		test.addCells(6,11);
		test.addCells(7,8);
		test.addCells(7,9);
		test.addCells(7,10);
		test.addCells(8,9);

		test.addCells(11,9);
		test.addCells(12,8);
		test.addCells(12,9);
		test.addCells(12,10);
		test.addCells(13,7);
		test.addCells(13,9);
		test.addCells(13,11);
		test.addCells(14,7);
		test.addCells(14,9);
		test.addCells(14,11);
		test.addCells(15,8);
		test.addCells(15,9);
		test.addCells(15,10);
		test.addCells(16,9);
		test.evolution(15);

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,1,0,1,0,1,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}

	@Test
	public void torusEvolution5() {

		TorusGameOfLife test = new TorusGameOfLife();
		test.addCells(4,4);
		test.addCells(4,5);
		test.addCells(5,4);
		test.addCells(5,5);

		test.evolution(420);

		int[][] expected = {{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,1,1,0,0,0,0},
				{0,0,0,0,1,1,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0}};
		int[][] actual = test.getBoard();
		assertArrayEquals(actual, expected);
	}



	}
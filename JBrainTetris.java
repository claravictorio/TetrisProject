
public class JBrainTetris extends JTetris {
	
	private Brain brain;
	
	JBrainTetris(int width, int height) {
		super(width, height);
		brain = new ClaraBrain();
	}
	public void tick(int verb)
	{
		Brain.Move move = brain.bestMove(board, currentPiece, HEIGHT + TOP_SPACE, null);

		if(!currentPiece.equals(move.piece))
			super.tick(ROTATE);
		if(move.x < currentX)
			super.tick(LEFT);
		else if(move.x > currentX)
			super.tick(RIGHT);
		super.tick(DOWN);
	}
	
}

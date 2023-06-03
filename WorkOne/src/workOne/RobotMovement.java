package workOne;

import java.util.ArrayList;

public interface RobotMovement {

	public int forwardOrBackward(int id, ArrayList<Cells> cellsList, int width);

	public boolean limite(int iD, ArrayList<Cells> cellsList, int quantascelulas, int width);

}

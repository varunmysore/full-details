package program;

public class Pattern2 {
	public static void main(String[] args) {
		int row = 5, col = 5;

		for (int i = 0; i < row; i++) {
			char ch = 'A';
			for (int j = 0; j < col; j++) {
				if (i + j >= row - 1)
					System.out.print(ch++);
				else
					System.out.print(' ');
			}
			System.out.println();
			
		}

	}
}

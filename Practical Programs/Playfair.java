import java.util.Scanner;

public class Playfair {

	private Scanner in = new Scanner(System.in);

	private char[] alpha = new char[26];
	private boolean[] visited = new boolean[26];
	private static char[][] grid = new char[5][5];

	private String key = "";
	private String msg = "";
	private String result = "";
	private char ignore = 'Q';

	public static void main(String[] args) {
		Playfair pf = new Playfair();

		pf.setup();
		pf.gridSetup();
		pf.encrypt();

		for (char[] arr : grid) {
			for (char c : arr) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

		System.out.println(pf.result);
	}

	private void setup() {
		for (int i = 0; i < 26; i++) {
			alpha[i] = (char) (i + 65);
		}

		System.out.println("Enter a key");
		key = in.nextLine();
		key = key.toUpperCase();

		System.out.println("Enter a message");
		msg = in.nextLine();
		msg = msg.toUpperCase();
		msg = msg.replace(" ", "");

		if (msg.contains(Character.toString('Q')) || key.contains(Character.toString('Q'))) {
			for (int i = 0; i < 26; i++) {
				if (!msg.contains(Character.toString(alpha[i])) && !(key.contains(Character.toString(alpha[i])))) {
					ignore = alpha[i];
				}
			}
		}
	}

	private void gridSetup() {
		int i = 0, j = 0;

		for (int k = 0; k < key.length(); k++) {
			if (key.charAt(k) == 32) {
				continue;
			}

			if (!visited[key.charAt(k) - 65]) {
				visited[key.charAt(k) - 65] = true;
				grid[j][i] = key.charAt(k);
				i++;
				if (i >= 5) {
					j++;
					i = 0;
				}
			}
		}

		for (int iota = 0; iota < 26; iota++) {
			if (!visited[iota] && alpha[iota] != ignore) {
				grid[j][i] = alpha[iota];
				i++;
				if (i >= 5) {
					j++;
					i = 0;
				}
			}
		}
	}

	private void encrypt() {
		if (msg.length() % 2 != 0) {
			msg += "Z";
		}

		for (int i = 0; i < msg.length(); i += 2) {
			result += gridLogic(msg.charAt(i), msg.charAt(i + 1));
		}
	}

	private static String gridLogic(char a, char b) {
		int ax = 0, ay = 0, bx = 0, by = 0;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (grid[i][j] == a) {
					ax = i;
					ay = j;
				}
				if (grid[i][j] == b) {
					bx = i;
					by = j;
				}
			}
		}
		
		String resultA = "", resultB = "";

		if (ay == by) {
			try {
				resultA = String.valueOf(grid[ax + 1][ay]);
			} catch (Exception e) {
				resultA = String.valueOf(grid[0][ay]);
			}

			try {
				resultB = String.valueOf(grid[bx + 1][by]);
			} catch (Exception e) {
				resultB = String.valueOf(grid[0][by]);
			}
		} else if (ax == bx) {
			try {
				resultA = String.valueOf(grid[ax][ay + 1]);
			} catch (Exception e) {
				resultA = String.valueOf(grid[ax][0]);
			}

			try {
				resultB = String.valueOf(grid[bx][by + 1]);
			} catch (Exception e) {
				resultB = String.valueOf(grid[bx][0]);
			}
		} else {
			resultB = String.valueOf(grid[bx][ay]);
			resultA = String.valueOf(grid[ax][by]);
		}

		return resultA + resultB + " ";
	}

}
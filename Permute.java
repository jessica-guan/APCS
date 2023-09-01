import java.util.*;

public class Permute {
	static boolean isPresent(String s, ArrayList<String> Res) {
		for (String str : Res) {
			if (str.equals(s))
				return true;
		}
		return false;
	}
	static ArrayList<String> distinctPermute(String str) {
		if (str.length() == 0) {
			ArrayList<String> baseRes = new ArrayList<>();
			baseRes.add("");
			return baseRes;
		}
		char ch = str.charAt(0);
		String restStr = str.substring(1);
		ArrayList<String> prevRes = distinctPermute(restStr);
		ArrayList<String> Res = new ArrayList<>();
		for (String s : prevRes) {
			for (int i = 0; i <= s.length(); i++) {
				String f = s.substring(0, i) + ch + s.substring(i);
				if (!isPresent(f, Res))
					Res.add(f);
			}
		}
		return Res;
	}
	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Input string: ");
		String s = console.next();
		console.close();
		ArrayList<String> temp = new ArrayList<>();
		for (int i = 0; i <= distinctPermute(s).size() - 1; i++) {
			temp.add(distinctPermute(s).get(i));
		}
		Collections.sort(temp);
		for (int i = 0; i <= temp.size() - 1; i++) {
			System.out.println(temp.get(i));
		}
	}
}
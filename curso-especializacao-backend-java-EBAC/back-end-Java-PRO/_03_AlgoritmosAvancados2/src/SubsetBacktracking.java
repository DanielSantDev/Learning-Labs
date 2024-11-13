import java.util.ArrayList;
import java.util.List;

public class SubsetBacktracking {
    public static List<List<Integer>> subsetsOfSizeN(int[] S, int n) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(S, n, 0, new ArrayList<>(), result);
        return result;
    }

    private static void generateSubsets(int[] S, int n, int start, List<Integer> current, List<List<Integer>> result) {
        if (current.size() == n) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < S.length; i++) {
            current.add(S[i]);
            generateSubsets(S, n, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] S1 = {1, 2, 3};
        int n1 = 2;
        System.out.println("Subconjuntos de tamanho " + n1 + " para S = " + java.util.Arrays.toString(S1) + ": " + subsetsOfSizeN(S1, n1));

        int[] S2 = {1, 2, 3, 4};
        int n2 = 1;
        System.out.println("Subconjuntos de tamanho " + n2 + " para S = " + java.util.Arrays.toString(S2) + ": " + subsetsOfSizeN(S2, n2));
    }
}

import java.util.List;

public class Sample {

    public static void main(String[] args) {
        System.out.println(isEven(List.of(1, 3, 5)));
    }

    /**
     * リストの中身はすべて偶数かどうか判定します。
     * 
     * @param values チェック対象のリスト
     * @return リストの中身がすべて偶数なら true、奇数を含むなら false
     */
    public static boolean isEven(List<Integer> values) {
        return values.stream().allMatch(v -> v % 2 == 0);
    }
}

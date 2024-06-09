import java.util.List;

public class Lambda {
    /**
     * リストの中身はすべて奇数かどうか判定します。
     * 
     * @param values チェック対象のリスト
     * @return リストの中身がすべて奇数なら true、奇数以外を含むなら false
     */
    public boolean isOdd(List<Integer> values) {
        return values.stream().allMatch(v -> v % 2 == 1);
    }
}

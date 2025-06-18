class Solution {
    public List<List<Integer>> generate(int rows) {
        List<List<Integer>> result = new ArrayList<>();
        if (rows == 0) {
            return result;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if (rows == 1) {
            return result;
        }
        for (int i = 1; i < rows; i++) {
            List<Integer> l = result.get(i - 1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j = 0; j < i - 1; j++) {
                row.add(l.get(j) + l.get(j + 1));
            }
            row.add(1);
            result.add(row);
        }
        return result;
    }
}
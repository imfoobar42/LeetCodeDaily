class Solution {
  public long distributeCandies(int n, int limit) {
    return (calculate(n + 2) -
        3 * calculate(n - limit + 1) +
        3 * calculate(n - (limit + 1) * 2 + 2) -
        calculate(n - 3 * (limit + 1) + 2));
  }

  public long calculate(int x) {
    if (x < 0) {
      return 0;
    }
    return ((long) x * (x - 1)) / 2;
  }
}
class Solution {

  public int romanToInt(String s) {
    int sum = 0;
    int i = 0;
    Map<Character, Integer> map = new HashMap<>();
    // Symbol Value
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    char[] c = s.toCharArray();

    while (i < s.length()) {
      // Check if next numeral exists and is larger than the current one
      if (i + 1 < s.length() && map.get(c[i]) < map.get(c[i + 1])) {
        sum += map.get(c[i + 1]) - map.get(c[i]);
        i += 2; // Skip the next numeral since it's already processed
      } else {
        sum += map.get(c[i]);
        i++;
      }
    }

    return sum;
  }
}
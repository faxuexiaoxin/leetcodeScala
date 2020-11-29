package top.faxuexiaoxin.question3

import scala.collection.mutable

object question3 {
    def lengthOfLongestSubstring(s: String): Int = {
        if (s == null || s.length == 0) {
            return 0;
        } else {
            //要考虑到所有可能出现的字符串。
            //那么用hashmap来处理。
            val map = new mutable.HashMap[Char, Int]();
            var d = 0;
            var max = 0;
            var last = 0;
            //d表示当前字符的出现位置的距离
            //last表示当前上一个最长子串的长度
            //max表示最大最长的穿的长度
            for (i <- 0 until s.length()) {
                d = i - map.get(s(i)).getOrElse(-1);
                map.put(s(i), i);
                if (last >= d) {
                    last = d;
                } else {
                    last += 1;
                }

                if (last > max) {
                    max = last;
                }
            }
            return max;
        }
    }
}

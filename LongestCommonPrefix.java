import java.util.Scanner;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = {"flower","flow","flight"};
        LCP a = new LCP();
        System.out.println(a.longestCommonPrefix(strs));
        sc.close();
    }
}

class LCP 
{
    public String longestCommonPrefix(String[] strs) 
    {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0]; // Assume the first string is the common prefix

        for (int i = 1; i < strs.length; i++) {
            // Reduce the prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
}

/*Ques:
Write a function to find the longest common prefix string amongst an array of strings.
Sould work for any kind of input/s.
If there is no common prefix, return an empty string "".

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 

Constraints:
1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters.
 */

// My try
 /*
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        String[] strs = {"flower","flow","flight", "fltr"};
        String prefix = "";
        String temp = "";
        boolean match = true;
//        boolean found = false;
        for(int i = 0; i < strs.length; i++) {
//             boolean match = true;
             int j = 0;
             String s = "";
             while(match) {
                  if(strs[i].charAt(j) == strs[i+1].charAt(j)) {
                       s += strs[i].charAt(j);
                       j ++;
                  } else {
                       match = false;
                  }
             }
             
             if(i > 0 && s.equals(temp)) {
                  match = true;
             } else if(i > 0 && !s.equals(temp)) {
                  int a = s.length(); int b = temp.length();
                  int x = a - b; int y = b - a;
                  String s2 = "";
                  if (x < y) {
                       for(int p = 0; p < a; p++) {
                            if(s.charAt(p) == temp.charAt(p)) {
                                 s2 += s.charAt(p);
                            } else {
                                 break;
                            }
                       }
                       if(!s2.equals("")) {
                            match = true;
                       } else {
                            match = false;
                       }
                  } else {
                       for(int p = 0; p < b; p++) {
                            if(temp.charAt(p) == s.charAt(p)) {
                                 s2 += temp.charAt(p);
                            } else {
                                 break;
                            }
                       }
                       if(!s2.equals("")) {
                            match = true;
                       } else {
                            match = false;
                       }
                  }
//                  match = false;
             }
             s = temp;
        }
             
        System.out.println(prefix);
    }
}
 */
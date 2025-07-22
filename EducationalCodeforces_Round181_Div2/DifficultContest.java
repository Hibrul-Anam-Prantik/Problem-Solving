package EducationalCodeforces_Round181_Div2;

import java.io.*;

public class DifficultContest {
    public static void main(String[] args) throws Exception {
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            String temp = "";
            for (int j = 0; j < s.length() - 2; j++) {
                temp = s.substring(j, j + 3);
                if(temp.equals("FFT") || temp.equals("NTT")) {
                    temp = s.substring(0, j + 1) + s.charAt(j + 2) + s.charAt(j + 1) + s.substring(j + 3);
                    s = temp;
                }
            }
            System.out.println(s);
        }
        br.close();
    }
}

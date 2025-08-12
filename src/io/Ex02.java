package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex02 { // 파일 입력
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("test1.txt"));

            String str1 = br.readLine(); // 첫 줄 다 읽어옴
            String str2 = br.readLine(); // 다음 줄 다 읽어옴

            System.out.println("파일에 기록된 2개의 문자열은");
            System.out.println(str1 + " 입니다.");
            System.out.println(str2 + " 입니다.");

            br.close();

        } catch (IOException e) {
            System.out.println("입출력 에러가 발생했습니다.");
        }
    }
}

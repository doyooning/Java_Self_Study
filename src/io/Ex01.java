package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ex01 { // 파일 입력
    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("test1.txt")));
            // 파일 이름 지정 및 FileWriter, BufferedWriter, PrintWriter 객체 생성
            pw.println("Hello!"); // 파일에 기록, 콘솔 출력 X
            pw.println("GoodBye!"); // 파일에 기록, 콘솔 출력 X
            System.out.println("파일에 기록되었습니다.");

            pw.close(); // 파일 닫기
        } catch (IOException e) {
            System.out.println("입출력 에러가 발생했습니다.");;
        }
    }
}

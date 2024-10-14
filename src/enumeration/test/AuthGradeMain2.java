package enumeration.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AuthGradeMain2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]: ");
        String input = br.readLine();

        AuthGrade authGrade = AuthGrade.valueOf(input.toUpperCase());
        System.out.println("당신의 등급은 " + authGrade.getDescription()+"입니다.");
        System.out.println("==메뉴 목록==");
        System.out.println(authGrade.getAuthByLevel().stream()
                .map(str -> "- " + str)
                .collect(Collectors.joining("\n")));

    }
}

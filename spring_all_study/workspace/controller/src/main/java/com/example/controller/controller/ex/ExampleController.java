package com.example.controller.controller.ex;

import com.example.controller.common.exception.test.TestException;
import com.example.controller.domain.Member;
import com.example.controller.domain.School;
import com.example.controller.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Arrays;
import java.util.Optional;

@Controller
//상위 경로는 뒤에 **을 붙이자
@RequestMapping("/ex/**")
public class ExampleController {

//    web.xml 역할
//    @GetMapping("ex01")
//    controller의 execute 역할
//    public void ex01() {
//        System.out.println("ex01.............");
//    }
//    명확하게 경로를 지정해주도록 지향하자

    @GetMapping("ex01")
//    @RequestMapping(value = "ex01", method = RequestMethod.GET, consumes = {}, produces = {})
    public String ex01() {
        System.out.println("ex01........");
        return "/ex/ex01";
    }

//    ex02를 선언하고, 본인의 이름을 콘솔창에 출력한다.
//    알맞은 경로에 ex02.html을 생성하고 h1태그로 본인 이름을 출력한다.
//    @GetMapping("ex02")
//    public void ex02() {
//        System.out.println("정희준");
//    }

    @GetMapping("ex02")
    public String ex02() {
        System.out.println("ex02........");
        return "/ex/ex02";
    }

//    model 객체는 request 객체를 대체
//    사용자가 서블릿에 의존하는건 좋지 않아 request 객체를 사용하는건 지양한다.
//    model.addAttribute가 parameter 앞에 있으면 화면에서 키 값으로 사용한다.
//    /ex/ex03?age=20

    @GetMapping("ex03")
    public String ex03(int age, Model model) {
        System.out.println(age);
        model.addAttribute("age", age);
        return "/ex/ex03";
    }

//    이름을 전달받은 뒤 HTML에서 h1태그로 출력하기
//    @GetMapping("ex04")
//    public String ex04(String name, Model model) {
//        System.out.println(name);
//        model.addAttribute("name", name);
//        return "/ex/ex04";
//    }

    @GetMapping("ex04")
    public String ex04(@ModelAttribute("name") String name) {
        return "/ex/ex04";
    }

//    @GetMapping("ex05")
//    public String ex05(Member member, Model model) {
//        System.out.println(member);
//        model.addAttribute("member", member);
//        return "/ex/ex05";
//    }

//    일반 자료형들은 반드시 key값을 써줘야한다.
//    class 자료형의 key값이 자료형이 맨 앞 글자가 소문자로 바뀐다.

//    @GetMapping("ex05")
//    public String ex05(Member member) {
//        System.out.println(member);
//        return "/ex/ex05";
//    }

    @GetMapping("ex05")
    public String ex05(Member member, Model model) {
        System.out.println(member);
        model.addAttribute("member", member);
        return "/ex/ex05";
    }

//    학생 객체 생성(이름, 국어, 영어, 수학)
//    Convention에 맞게 제작한 뒤
//    ex06 제작
//    평균 출력

    @GetMapping("ex06")
    public String ex06(Student student, Model model) {
//        System.out.println(student);
//        int total = student.getKorean() + student.getEnglish() + student.getMath();
//        double average = ((student.getKorean() + student.getEnglish() + student.getMath()) / 3.0);
//        model.addAttribute("student", student);
//        model.addAttribute("total", total);
//        model.addAttribute("average", average);
        model.addAttribute("student", student);
        return "/ex/ex06";
    }

//    체크박스에 사용되는 문자열 배열
    @GetMapping("ex07")
    public void ex07(String[] arData) {
//        Arrays.toString(배열): 배열의 요소를 이쁘게 문자열로 만들어준다.
        System.out.println(Arrays.toString(arData));
    }

//    ex08.html에 체크박스 3개 구성
//    완료버튼 클릭 시, GET 방식으로 다음과 같이 요청한다.
//    /ex/ex09
    @GetMapping("ex08")
    public String ex08() {
        return "/ex/ex08";
    }

//    사용자가 선택한 체크박스 value를 받아 출력한다.
    @GetMapping("ex09")
    public RedirectView ex09(@RequestParam("data") String[] arData, Model model) {
        model.addAttribute("arData", arData);
        return new RedirectView("/ex/ex08");
    }
//    파라미터하고 name이 다르면 @RequestParam()
//    public String ex09(@RequestParam("data") String[] arData, Model model) {
//        if(arData != null) {
//            for (String data : arData) {
//                System.out.println("선택 사항: " + data);
//            }
//        } else {
//            System.out.println("선택 안함");
//        }

//        model.addAttribute("arData", arData);
//        return "/ex/ex09";
//    }

    @GetMapping("ex10")
    public String goToEx10() {
        return "/ex/ex10";
    }

//    @PostMapping("ex10")
//    public void ex10(School school) {
//        System.out.println(school);
//    }

    @PostMapping("ex10")
    public RedirectView ex10(School school){
//        return "redirect: /ex/ex08";
        return new RedirectView("/ex/ex08");
    }

    @GetMapping("ex11")
    public String ex11(Model model) {
        Member member = null;
        model.addAttribute("member", Optional.ofNullable(member).orElseThrow(TestException::new));
        return "/ex/ex11";
    }
}


























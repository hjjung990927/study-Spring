package com.example.controller.common.exception.handler;

import com.example.controller.common.exception.test.TestException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

// 어디선가 throw를 사용해 exception이 발생되면 감지해 이 쪽으로 catch 하겠다.
@ControllerAdvice(basePackages = "com.example.controller.controller.ex")
// basePackages: 어디에서 발생할 exception을 잡아줄 지 경로를 정한다.
public class ExampleExceptionHandler {

    @ExceptionHandler(TestException.class)
    protected String handleTestException(TestException e) {
        return "ex/test";
    }
}

package org.dhanush.quiz_monolith.controllers;

import lombok.Getter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping()
public class BaseController {
    @Getter
    private static final String basePath ="api/v1/";
}

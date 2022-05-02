package com.example.emp.swagger.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen")
@Controller
@RequestMapping("${openapi.eMPProject.base-path:/}")
public class ApiTestApiController implements ApiTestApi {

    private final ApiTestApiDelegate delegate;

    public ApiTestApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) ApiTestApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new ApiTestApiDelegate() {});
    }

    @Override
    public ApiTestApiDelegate getDelegate() {
        return delegate;
    }

}

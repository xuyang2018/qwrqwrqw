package com.service.qwrqwrqwr.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-04-09T10:21:02.206Z")

@RestSchema(schemaId = "qwrqwrqwr")
@RequestMapping(path = "/qwrqwrqwr", produces = MediaType.APPLICATION_JSON)
public class QwrqwrqwrImpl {

    @Autowired
    private QwrqwrqwrDelegate userQwrqwrqwrDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userQwrqwrqwrDelegate.helloworld(name);
    }

}

package com.mvc;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 5/21/2014.
 * Copyright Vale Inc.
 */
@Controller
@RequestMapping(value = "/")
public class InputController {


    Logger log= Logger.getLogger(this.getClass());
    @RequestMapping(value = "/print", method = RequestMethod.GET)
    public Object printMyName(){
        return "hello_gellow";
    }

}

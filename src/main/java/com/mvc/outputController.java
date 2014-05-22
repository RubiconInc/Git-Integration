package com.mvc;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/output")
public class outputController {

    Logger log= Logger.getLogger(this.getClass());
    @RequestMapping(method=RequestMethod.POST)
    public Object outputPrint()
    {
    	return "output";
    }
}

package com.plwb.WeatherWA.index.indexController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class indexController {

    @RequestMapping(value = "/")
    public ModelAndView redirectindex() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        return mav;
    }

}

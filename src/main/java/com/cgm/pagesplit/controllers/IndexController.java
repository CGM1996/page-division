package com.cgm.pagesplit.controllers;

import com.cgm.pagesplit.service.IPresetService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author cgm
 */
@Controller
public class IndexController {
    @Resource
    private IPresetService presetService;

    @RequestMapping("/")
    public void index(HttpServletResponse response) throws IOException {
        response.sendRedirect("/config.html");
    }

    @RequestMapping("/config")
    public void config(HttpServletResponse response) throws IOException {
        response.sendRedirect("/config.html");
    }

    @RequestMapping("/custom")
    public void custom(HttpServletResponse response) throws IOException {
        response.sendRedirect("/custom.html");
    }

    @RequestMapping("/preset")
    public void preset(HttpServletResponse response) throws IOException {
        int amount = Integer.parseInt(presetService.getConfigList().get(0));
        response.sendRedirect("/division" + amount + ".html");

    }

    @RequestMapping("/8")
    public void indexEight(HttpServletResponse response) throws IOException {
        response.sendRedirect("/division8.html");
    }

    @RequestMapping("/9")
    public void indexNine(HttpServletResponse response) throws IOException {
        response.sendRedirect("/division9.html");
    }
}

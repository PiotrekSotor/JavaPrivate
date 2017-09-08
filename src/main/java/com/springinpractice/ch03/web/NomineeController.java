/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.springinpractice.ch03.web;

import com.springinpractice.ch03.model.Member;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public final class NomineeController {
    private static final Logger log = Logger.getLogger(NomineeController.class);
    
    private String thanksViewName;
    
    public void setThanksViewName(String thanksViewName){
        this.thanksViewName = thanksViewName;
        
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public Member form(){ return new Member();}
    
    @RequestMapping(method = RequestMethod.POST)
    public String processFormData(Member member){
        log.info("Przetwarzanie nominacji: " + member);
        return thanksViewName;
    }
    }

package com.encrypt.enc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CryptoController {

    private final CryptoMethod cryptoMethod;

    public CryptoController() {
        this.cryptoMethod = new CryptoMethod();
    }

    @RequestMapping("/encrypt")
    public String encryptValue(@RequestParam("key") String key,
                               @RequestParam("value") String value,
                               Model model) {
        try {
            String encryptedValue = cryptoMethod.encryptMethod(value, key);
            model.addAttribute("encryptedValue", encryptedValue);
        } catch (Exception e) {
        	  // Handle encryption error
        }
        return "welcome";
    }

    @RequestMapping("/decrypt")
    public String decryptValue(@RequestParam("key") String key,
                               @RequestParam("value") String value,
                               Model model) {
        try {
            String decryptedValue = cryptoMethod.decryptMethod(value, key);
            model.addAttribute("decryptedValue", decryptedValue);
        } catch (Exception e) {
            // Handle decryption error
        }
        return "welcome";
    }

    @RequestMapping("/")
    public String home() {
        return "welcome";
    }

    @ExceptionHandler(Exception.class)
    public String handleException(Exception e) {
        // Handle and log the exception
        return "error-page"; // Create a JSP file named "error-page.jsp" for error handling
    }
}

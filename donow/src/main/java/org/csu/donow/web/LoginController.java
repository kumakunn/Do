package org.csu.donow.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class LoginController {
    public final static String UPLOADED_FOLDER ="C:\\Users\\shuxin\\Desktop";

    @GetMapping("/login")
    public String getAll(){
        return null;
    }

}

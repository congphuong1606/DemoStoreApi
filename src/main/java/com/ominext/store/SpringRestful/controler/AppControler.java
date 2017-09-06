package com.ominext.store.SpringRestful.controler;

import com.ominext.store.SpringRestful.entity.Post;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AppControler {
    @RequestMapping(path = "/isconnect", method = RequestMethod.GET,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public int checkConect() {
        return 1;
    }
}

package com.ominext.store.SpringRestful.controler;

import com.ominext.store.SpringRestful.entity.Acc;
import com.ominext.store.SpringRestful.repository.AccRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("accs")
public class AccControler {
    @Autowired
    private AccRepository accRepository;


    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Acc addNewUser(@RequestBody Acc acc) {
        accRepository.save(acc);
        return acc;

    }

    @RequestMapping(path = "/update", method = RequestMethod.PUT,
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public int updateAcc(@RequestBody Acc acc) {
        int check = 2;
        try {
            accRepository.save(acc);
            check = 1;
        } catch (Exception e) {
            check = 0;
        }

        return check;

    }

    @RequestMapping(path = "/all", method = RequestMethod.GET)
    public @ResponseBody
    Iterable<Acc> getAllAccs() {
        return accRepository.findAll();
    }

    @RequestMapping(path = "/{accId}", method = RequestMethod.GET)
    public @ResponseBody
    Acc getAcc(@PathVariable("accId") long accId) {
        return accRepository.findOne(accId);
    }


}

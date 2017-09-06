package com.ominext.store.SpringRestful.controler;

import com.ominext.store.SpringRestful.entity.Cmt;
import com.ominext.store.SpringRestful.repository.CmtRepository;
import com.sun.xml.internal.bind.v2.model.core.ID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("cmts")
public class CmtControler {
    @Autowired
    CmtRepository cmtRepository;


    @RequestMapping(value = "/{cmtId}", method = RequestMethod.DELETE, produces = {MediaType.APPLICATION_JSON_VALUE})
    public void deleteCmt(@PathVariable("cmtId") long cmtId) {
        cmtRepository.delete(cmtId);
    }
    @RequestMapping(value = "/add", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Cmt addNewCmt(@RequestBody Cmt cmt) {
        cmtRepository.save(cmt);
        return cmt;
    }

    @RequestMapping(value = "/{cmtPostId}", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public  @ResponseBody List<Cmt> getCmts(@PathVariable("cmtPostId") long cmtPostId) {
        return cmtRepository.findAllByCmtPostId(cmtPostId);
    }
}

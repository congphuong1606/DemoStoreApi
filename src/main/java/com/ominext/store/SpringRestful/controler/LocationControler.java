package com.ominext.store.SpringRestful.controler;

import com.ominext.store.SpringRestful.entity.Acc;
import com.ominext.store.SpringRestful.entity.Cmt;
import com.ominext.store.SpringRestful.entity.Location;
import com.ominext.store.SpringRestful.repository.AccRepository;
import com.ominext.store.SpringRestful.repository.LocationReposity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("locations")
public class LocationControler {
    @Autowired
    private LocationReposity locationReposity;


    @RequestMapping(path = "/add", method = RequestMethod.POST, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    public Location addNewUser(@RequestBody Location location) {
        locationReposity.save(location);
        return location;

    }

    @RequestMapping(path = "/{locationId}", method = RequestMethod.GET)
    public @ResponseBody
    Location getLocation(@PathVariable("locationId" )long locationId) {
        return locationReposity.findOne(locationId);
    }


}

package org.project.votingcalc.controller;

import org.project.votingcalc.entity.VEntity;
import org.project.votingcalc.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VController
{
    @Autowired
    private MyService ser;

    @PostMapping("/add")
    public VEntity add(@RequestBody VEntity v)
    {
        return ser.storeData(v);
    }
}

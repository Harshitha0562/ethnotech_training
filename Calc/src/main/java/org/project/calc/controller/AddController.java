package org.project.calc.controller;


import org.project.calc.entity.AddEntity;
import org.project.calc.repo.CalcRepo;
import org.project.calc.service.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AddController {

    @Autowired
    private AddService ser;

    @PostMapping("add")
    public AddEntity add(@RequestBody AddEntity en) {
        return ser.add(en);
    }

    @GetMapping("/get")
    public List<AddEntity> getAll()
    {
        return ser.getAll();
    }
/*
    @PostMapping("sub")
    public AddEntity sub(@RequestBody AddEntity en) {
        en.setOperation("SUB");
        en.setResult(en.getNum1() - en.getNum2());
        return repo.save(en);
    }

    @PostMapping("mul")
    public AddEntity mul(@RequestBody AddEntity en) {
        en.setOperation("MUL");
        en.setResult(en.getNum1() * en.getNum2());
        return repo.save(en);
    }

    @PostMapping("div")
    public AddEntity div(@RequestBody AddEntity en) {
        en.setOperation("DIV");
        en.setResult(en.getNum1() / en.getNum2());
        return repo.save(en);
    }*/
}
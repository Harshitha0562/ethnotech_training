package org.project.calc.service;


import org.project.calc.entity.AddEntity;
import org.project.calc.repo.CalcRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class AddService
{
    @Autowired
    private CalcRepo repo;
    public AddEntity add(AddEntity en)
    {
        en.setResult(en.getNum1()+en.getNum2());
        return repo.save(en);
    }

   public List<AddEntity> getAll()
   {
       return repo.findAll();
   }
}

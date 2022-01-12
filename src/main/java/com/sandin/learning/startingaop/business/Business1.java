package com.sandin.learning.startingaop.business;

import com.sandin.learning.startingaop.data.Dao1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business1 {

    @Autowired
    private Dao1 dao1;

    public String calculateSomething(){
        return dao1.retrieveSomething();
    }

}

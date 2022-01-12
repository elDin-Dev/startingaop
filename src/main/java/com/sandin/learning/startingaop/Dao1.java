package com.sandin.learning.startingaop;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    public String retrieveSomething(){
        return this.getClass().toString();
    }
}

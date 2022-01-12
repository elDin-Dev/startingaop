package com.sandin.learning.startingaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    public String retrieveSomething(){
        return this.getClass().toString();
    }
}

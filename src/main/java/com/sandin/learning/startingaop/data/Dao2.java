package com.sandin.learning.startingaop.data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

    public String retrieveSomething(){
        return this.getClass().toString();
    }
}

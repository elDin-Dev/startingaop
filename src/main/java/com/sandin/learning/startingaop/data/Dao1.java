package com.sandin.learning.startingaop.data;

import com.sandin.learning.startingaop.aspect.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class Dao1 {

    @TrackTime
    public String retrieveSomething(){
        return this.getClass().toString();
    }
}

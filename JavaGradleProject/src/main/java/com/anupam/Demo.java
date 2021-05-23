package com.anupam;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Demo{


    private static final Logger logger = LogManager.getLogger(Demo.class);

    public int add(int a, int b){

        logger.debug("Inside add");

        return a+b;

    }

    /*public static void main(String[] args){

      
    logger.info("RESULT = "+new Demo().add(2,3));
        

    }*/
}
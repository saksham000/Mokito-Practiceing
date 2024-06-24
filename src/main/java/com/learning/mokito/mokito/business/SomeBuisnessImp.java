package com.learning.mokito.mokito.business;

public class SomeBuisnessImp {

    private DataService service;

    public SomeBuisnessImp(DataService service){
        super();
        this.service = service;
    }

    public int findTheGratestFromAllData(){
        int[] data = service.retrieveAllData();
        int gratestValue = Integer.MIN_VALUE;
        for(int value:data){
            if(value > gratestValue)
            gratestValue = value;
        }
        return gratestValue;
    }
}


interface DataService {
    int[] retrieveAllData();
    
}
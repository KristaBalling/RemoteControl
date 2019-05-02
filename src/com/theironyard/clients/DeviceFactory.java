package com.theironyard.clients;

import com.theironyard.processes.GeneralManufacturingProcess;
import com.theironyard.processes.SmartphoneManufacturingProcess;

public class DeviceFactory {
    public static void main(String args[]){
        GeneralManufacturingProcess manufacturer =  new SmartphoneManufacturingProcess("Iphone");
        manufacturer.launchProcess();
    }
}

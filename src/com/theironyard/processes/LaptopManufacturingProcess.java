package com.theironyard.processes;

import com.theironyard.processes.GeneralManufacturingProcess;

public class LaptopManufacturingProcess extends GeneralManufacturingProcess {

    public LaptopManufacturingProcess(String name) {
        super(name);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assembled device");

    }

    @Override
    protected void testDevice() {
        System.out.println("tested device");

    }

    @Override
    protected void packageDevice() {
        System.out.println("packaged laptop");
    }

    @Override
    protected void storeDevice() {
        System.out.println("stored laptop");
    }
}

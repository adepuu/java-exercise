package com.adepuu.exercises.session10;

public class DVD extends LibraryMaterial{
    public DVD(int availabilityCount) {
        super(availabilityCount);
    }

    @Override
    public String getType() {
        return "DVD";
    }
}

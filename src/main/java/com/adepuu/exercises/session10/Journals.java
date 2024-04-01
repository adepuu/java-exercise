package com.adepuu.exercises.session10;

public class Journals extends LibraryMaterials{
    private String editor;

    public Journals (String title, String editor, int availabilityCount) {
        super(title, availabilityCount);
        this.editor = editor;
    }

}

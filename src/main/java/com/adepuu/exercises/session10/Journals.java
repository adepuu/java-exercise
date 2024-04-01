package com.adepuu.exercises.session10;

public class Journals extends LibraryMaterials{
    private String editor;

    public Journals (String title, String editor, int availabilityCount) {
        super(title, availabilityCount);
        this.editor = editor;
    }
    /**
     * Properties:
     *         - editor
     *
     *     Methods:
     *         - constructor(title, availability_count, editor)
     *
     * # Journal Class Implementation
     * Method Journal.constructor(title, availability_count, editor):
     *     super().constructor(title, availability_count)
     *     self.editor = editor
     */
}

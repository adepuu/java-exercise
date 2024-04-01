package com.adepuu.exercises.session10;

public class LibraryManagement {
//    private String materialType;
//    private String title;
//    private int availabilityCount;
//    private String info;

    // empty constructor
    public LibraryManagement() {

    }

    public LibraryMaterials createMaterial (String materialType, String title, int availabilityCount, String info) {
        switch (materialType) {
            case "Book":
                return new Books(title, info, availabilityCount);
            case "Magazine":
                return new Magazines(title, info, availabilityCount);
            case "Journal":
                return new Journals(title, info, availabilityCount);
            default:
                throw new IllegalArgumentException("Unknown material type");
        }
    }

    public void manageMaterial(LibraryMaterials material, String action) {
        if (action.equals("borrow")) {
            material.borrowMaterial();
        } else if (action.equals("return")) {
            material.returnMaterial();
        } else {
            System.out.println("Invalid action.");
        }
    }
    /**
     * Methods:
     *         - create_material(material_type, title, availability_count, additional_info)
     *         - manage_material(material, action)
     *
     * # Librarian Class Implementation
     * Method Librarian.create_material(material_type, title, availability_count, additional_info):
     *     if material_type == "Book":
     *         return Book(title, availability_count, additional_info)
     *     elif material_type == "DVD":
     *         return DVD(title, availability_count, additional_info)
     *     elif material_type == "Journal":
     *         return Journal(title, availability_count, additional_info)
     *
     * Method Librarian.manage_material(material, action):
     *     if action == "borrow":
     *         material.borrow()
     *     elif action == "return":
     *         material.return_material()
     */
}

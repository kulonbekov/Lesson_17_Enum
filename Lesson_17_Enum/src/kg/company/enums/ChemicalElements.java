package kg.company.enums;

public enum ChemicalElements {

    Hydrogenium("Водород", 1),
    Helium("Гелий",2),
    Lithium("Литий",3),
    Beryllium("Бериллий",4);



    private String name;
    private final int atomNumber;


    ChemicalElements(String name, int atomNumber) {
        this.name = name;
        this.atomNumber = atomNumber;
    }

    public String getName() {
        return name;
    }

    public int getAtomNumber() {
        return atomNumber;
    }
}

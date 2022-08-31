package kg.company;


import kg.company.enums.ChemicalElements;

public class Main {
    public static void main(String[] args) {

        for (ChemicalElements s: ChemicalElements.values())
            System.out.println("Атомный номер: (" + s.getAtomNumber() + ") Названия: " + s.getName());


    }
}
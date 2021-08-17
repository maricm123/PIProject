package ftn.magacinsko.model;

public enum Smer {

	U("Ulaz"),
	I("Izlaz");
	
	public final String name;

    private Smer(String label) {
        this.name = label;
    }
}
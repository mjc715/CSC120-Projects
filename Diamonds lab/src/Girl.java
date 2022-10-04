public class Girl {
    private String name;
    Diamond GirlsDiamond = null;
//----------------------------------------------------------------------------------------------------------------------
    public Girl(String name) {
        this.name = name;
    }
//----------------------------------------------------------------------------------------------------------------------
    public void SetDiamond(Diamond newDiamond) {
        boolean accepted = false;
        if (GirlsDiamond == null) {
            GirlsDiamond = newDiamond;
            accepted = true;
        }
        if (newDiamond.getCarats() > 0 && newDiamond.getValue() > GirlsDiamond.getValue()) {
            GirlsDiamond = newDiamond;
            accepted = true;
        }
        if (!accepted) {
            System.out.println("The diamond was rejected.");
        } else {
            System.out.println("The diamond was accepted.");
        }
    }
//----------------------------------------------------------------------------------------------------------------------
    public String toString() {
        if (GirlsDiamond != null) {
            return(String.format("%s has a diamond. %d carats, worth $%d.", name, GirlsDiamond.getCarats(),
                    GirlsDiamond.getValue()));
        } else {
            return("The girl has no diamond.");
        }
    }
}

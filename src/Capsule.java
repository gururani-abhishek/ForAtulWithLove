public class Capsule {
    private String pen = "red";
    private String pencil = "Graphite Pencil";
//    final String pencil0 = "blue";


    public String getPencil() {
        return pencil;
    }

    public void setPencil(String pencil) {
        this.pencil = pencil;
    }

    // getters
    public String capsulePenDe() {
        return pen;
    }

    // setters
    public void capsulePenSetKr(String pen) {
        if(pen == "red" || pen == "blue" || pen == "black" || pen == "pink")
        this.pen = pen;
    }
}

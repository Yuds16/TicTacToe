public class Controller {
    private int controllerID;
    private Board board;

    public Controller(int id) {
        if (id <= 1) {
            this.controllerID = 1;
        } else if (id >= 2) {
            this.controllerID = 2;
        }
    }

    public int getControllerID() {
        return this.controllerID;
    }
}

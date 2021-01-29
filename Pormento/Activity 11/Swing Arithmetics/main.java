public class main {
    public static void main(String[] args) {
        model swingModel = new model();
        view swingView = new view();

        controller swingControl = new controller(swingView,swingModel);
        swingView.setVisible(true);
    }
}

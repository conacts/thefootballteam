
import Controller.Controller;
import Model.Model;
import View.View;

public class App
{

    public static void main(String[] args)
    {

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(view, model);
    }
}

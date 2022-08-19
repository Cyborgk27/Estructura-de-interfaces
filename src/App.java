public class App {

    public static void main(String[] args) throws Exception {
        CocheCRUD cocheCRUD = new CocheCRUDImplement();

        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    };
}

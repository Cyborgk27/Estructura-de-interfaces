public class CocheCRUDImplement implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Soy el metodo save");
        
    }

    @Override
    public void findAll() {
        System.out.println("Soy el metodo findAll");
        
    }

    @Override
    public void delete() {
        System.out.println("Soy el metodo delete");
    }
    
}

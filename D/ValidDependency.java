package solid.D;


class businesslogic{
    public logic Dal;
    public businesslogic(logic logicLayer){
        Dal =  logicLayer;
    }
    void save(object details){
        Dal.Save(details);
    }
}
interface logic{
    void save(object deatils);
}
class DataAccess implements logic{
    public void Save(object details){

    }
}
public class ValidDependency{
//decoupling is done in other to remove dependency of modules
}
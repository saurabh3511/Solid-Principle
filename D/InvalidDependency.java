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

 class logic{
     public void Save(object details){
    // perform save 
     }
 }
public class InvalidDependency{
//Here, we're using the dependency injection pattern to facilitate adding the Keyboard dependency into the Windows98Machine class.

}

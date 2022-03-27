package solid.D;


 interface Keyboard { }
public class Windows98Machine{

    private final Keyboard keyboard;
    private final Monitor monitor;

    public Windows98Machine(Keyboard keyboard, Monitor monitor) {
        this.keyboard = keyboard;
        this.monitor = monitor;
    }
}
public class StandardKeyboard implements Keyboard { }
public class ValidDependency{
//decoupling is done in other to remove dependency of modules
}
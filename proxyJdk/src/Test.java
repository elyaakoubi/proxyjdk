import java.lang.reflect.Proxy;

public class Test {
    public static void main(String[] args) {
        IService target = new Service();
        IService serviceProxy = (IService) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                        target.getClass().getInterfaces(),new GestionAppel(target));

        serviceProxy.afficher(100);




    }
}

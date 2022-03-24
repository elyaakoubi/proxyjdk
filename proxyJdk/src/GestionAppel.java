import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class GestionAppel implements InvocationHandler {

    Object target;

    public GestionAppel(Object target){
        this.target=target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(".........");
        Object obj = method.invoke(target,args);
        System.out.println(".........");
        return obj;
    }
}

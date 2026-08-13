            package p000;

            import android.app.Activity;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.lang.reflect.Proxy;
            
            public final class IOoI0IIOlolO {
                public ClassLoader I00000oIO;

                public IOoI0IIOlolO(ClassLoader classLoader) {
/* 4 */             this.I00000oIO = classLoader;
                }

                public IOo1o10il I00000oIO(Object obj, O0IOli0o0 o0IOli0o0, Activity activity, Il1oIOO0l il1oIOO0l) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
/* 3 */             IOo1o0lI iOo1o0lI = new IOo1o0lI();
/* 6 */             iOo1o0lI.I00000oIO = o0IOli0o0;
/* 8 */             iOo1o0lI.I00000oOI = il1oIOO0l;
/* 10 */            VarHandle.storeStoreFence();
/* 13 */            ClassLoader classLoader = this.I00000oIO;
/* 25 */            Object objNewProxyInstance = Proxy.newProxyInstance(classLoader, new Class[]{classLoader.loadClass("java.util.function.Consumer")}, iOo1o0lI);
/* 53 */            obj.getClass().getMethod("addWindowLayoutInfoListener", Activity.class, classLoader.loadClass("java.util.function.Consumer")).invoke(obj, activity, objNewProxyInstance);
/* 70 */            Method method = obj.getClass().getMethod("removeWindowLayoutInfoListener", classLoader.loadClass("java.util.function.Consumer"));
/* 76 */            IOo1o10il iOo1o10il = new IOo1o10il();
/* 79 */            iOo1o10il.I00000oIO = method;
/* 81 */            iOo1o10il.I00000oOI = obj;
/* 83 */            iOo1o10il.I0000Il00O = objNewProxyInstance;
/* 85 */            VarHandle.storeStoreFence();
/* 204 */           return iOo1o10il;
                }
            }

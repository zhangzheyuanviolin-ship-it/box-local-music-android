            package p000;

            import java.lang.reflect.Constructor;
            import java.lang.reflect.Modifier;
            
            public abstract class l0Oll01O {
                public static OooioIIoi0O I00000oIO(Class cls) throws NoSuchMethodException, SecurityException {
                    try {
/* 4 */                 Constructor declaredConstructor = cls.getDeclaredConstructor(null);
/* 16 */                if (!Modifier.isPublic(declaredConstructor.getModifiers())) {
/* 54 */                    throw new RuntimeException("Cannot create an instance of " + cls);
                        }
                        try {
/* 22 */                    return (OooioIIoi0O) declaredConstructor.newInstance(null);
                        } catch (IllegalAccessException e) {
/* 29 */                    OoOil11Ol1o.I000lI("Cannot create an instance of ", cls, e);
/* 3 */                     return null;
                        } catch (InstantiationException e2) {
/* 33 */                    OoOil11Ol1o.I000lI("Cannot create an instance of ", cls, e2);
/* 3 */                     return null;
                        }
                    } catch (NoSuchMethodException e3) {
/* 56 */                OoOil11Ol1o.I000lI("Cannot create an instance of ", cls, e3);
/* 3 */                 return null;
                    }
                }
            }

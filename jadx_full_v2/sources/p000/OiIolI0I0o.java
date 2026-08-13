            package p000;

            import android.app.Application;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.InvocationTargetException;
            import java.util.Arrays;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class OiIolI0I0o {
                public static final List I00000oIO = IOOi1I.I000O01llI0(Application.class, OiIloOOiiOii.class);
                public static final List I00000oOI = Collections.singletonList(OiIloOOiiOii.class);

                public static final Constructor I00000oIO(Class cls, List list) throws SecurityException {
/* 7 */             for (Constructor<?> constructor : cls.getConstructors()) {
/* 15 */                List listI00IioO0OiOi = I1IoiO1l.I00IioO0OiOi(constructor.getParameterTypes());
/* 23 */                if (list.equals(listI00IioO0OiOi)) {
/* 25 */                    return constructor;
                        }
/* 34 */                if (list.size() == listI00IioO0OiOi.size() && listI00IioO0OiOi.containsAll(list)) {
/* 77 */                    throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
                        }
                    }
/* 81 */            return null;
                }

                public static final OooioIIoi0O I00000oOI(Class cls, Constructor constructor, Object... objArr) {
                    try {
/* 11 */                return (OooioIIoi0O) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
                    } catch (IllegalAccessException e) {
/* 69 */                OoOil11Ol1o.I000lI("Failed to access ", cls, e);
/* 1 */                 return null;
                    } catch (InstantiationException e2) {
/* 66 */                throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
                    } catch (InvocationTargetException e3) {
/* 38 */                OIiilo1Ool0o.I000iOII("An exception happened in constructor of " + cls, e3.getCause());
/* 1 */                 return null;
                    }
                }
            }

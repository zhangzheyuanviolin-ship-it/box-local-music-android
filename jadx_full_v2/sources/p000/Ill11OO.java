            package p000;

            import java.lang.reflect.InvocationTargetException;
            
            public final class Ill11OO {
                public static final Ol0Ii10o1 I00000oOI = new Ol0Ii10o1(0);
                public Ill1OlOOl I00000oIO;

                public static Class I00000oOI(ClassLoader classLoader, String str) throws ClassNotFoundException {
/* 1 */             Ol0Ii10o1 ol0Ii10o1 = I00000oOI;
/* 7 */             Ol0Ii10o1 ol0Ii10o12 = (Ol0Ii10o1) ol0Ii10o1.get(classLoader);
/* 10 */            if (ol0Ii10o12 == null) {
/* 14 */                ol0Ii10o12 = new Ol0Ii10o1(0);
/* 17 */                ol0Ii10o1.put(classLoader, ol0Ii10o12);
                    }
/* 24 */            Class cls = (Class) ol0Ii10o12.get(str);
/* 26 */            if (cls != null) {
/* 37 */                return cls;
                    }
/* 28 */            Class<?> cls2 = Class.forName(str, false, classLoader);
/* 32 */            ol0Ii10o12.put(str, cls2);
/* 35 */            return cls2;
                }

                public static Class I0000Il00O(ClassLoader classLoader, String str) {
                    try {
/* 3 */                 return I00000oOI(classLoader, str);
                    } catch (ClassCastException e) {
/* 21 */                throw new IOiIIo1l(IlIi0I0.I000lI("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e, 2);
                    } catch (ClassNotFoundException e2) {
/* 37 */                throw new IOiIIo1l(IlIi0I0.I000lI("Unable to instantiate fragment ", str, ": make sure class name exists"), e2, 2);
                    }
                }

                public final Ill0l1 I00000oIO(String str) {
                    try {
/* 29 */                return (Ill0l1) I0000Il00O(this.I00000oIO.I00111O.I00iiI.getClassLoader(), str).getConstructor(null).newInstance(null);
                    } catch (IllegalAccessException e) {
/* 73 */                throw new IOiIIo1l(IlIi0I0.I000lI("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e, 2);
                    } catch (InstantiationException e2) {
/* 168 */               throw new IOiIIo1l(IlIi0I0.I000lI("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2, 2);
                    } catch (NoSuchMethodException e3) {
/* 63 */                throw new IOiIIo1l(IlIi0I0.I000lI("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e3, 2);
                    } catch (InvocationTargetException e4) {
/* 51 */                throw new IOiIIo1l(IlIi0I0.I000lI("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e4, 2);
                    }
                }
            }

            package p000;

            import java.io.ObjectInputStream;
            import java.io.ObjectStreamClass;
            import java.lang.reflect.Constructor;
            import java.lang.reflect.Field;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            
            public abstract class IOIOilI0 {

                public class I00000oIO extends IOIOilI0 {
                    final Constructor val$constructor;
                    final Class val$rawType;

                    public I00000oIO(Constructor constructor, Class cls) {
/* 1 */                 this.val$constructor = constructor;
/* 3 */                 this.val$rawType = cls;
                    }

                    @Override
                    public Object newInstance() {
/* 4 */                 return this.val$constructor.newInstance(null);
                    }

                    public String toString() {
/* 3 */                 return this.val$rawType.getName();
                    }
                }

                public class I00000oOI extends IOIOilI0 {
                    final Method val$allocateInstance;
                    final Class val$rawType;
                    final Object val$unsafe;

                    public I00000oOI(Method method, Object obj, Class cls) {
/* 1 */                 this.val$allocateInstance = method;
/* 3 */                 this.val$unsafe = obj;
/* 5 */                 this.val$rawType = cls;
                    }

                    @Override
                    public Object newInstance() {
/* 11 */                return this.val$allocateInstance.invoke(this.val$unsafe, this.val$rawType);
                    }

                    public String toString() {
/* 3 */                 return this.val$rawType.getName();
                    }
                }

                public class I0000Il00O extends IOIOilI0 {
                    final int val$constructorId;
                    final Method val$newInstance;
                    final Class val$rawType;

                    public I0000Il00O(Method method, Class cls, int i) {
/* 1 */                 this.val$newInstance = method;
/* 3 */                 this.val$rawType = cls;
/* 5 */                 this.val$constructorId = i;
                    }

                    @Override
                    public Object newInstance() {
/* 16 */                return this.val$newInstance.invoke(null, this.val$rawType, Integer.valueOf(this.val$constructorId));
                    }

                    public String toString() {
/* 3 */                 return this.val$rawType.getName();
                    }
                }

                public class I0000O extends IOIOilI0 {
                    final Method val$newInstance;
                    final Class val$rawType;

                    public I0000O(Method method, Class cls) {
/* 1 */                 this.val$newInstance = method;
/* 3 */                 this.val$rawType = cls;
                    }

                    @Override
                    public Object newInstance() {
/* 12 */                return this.val$newInstance.invoke(null, this.val$rawType, Object.class);
                    }

                    public String toString() {
/* 3 */                 return this.val$rawType.getName();
                    }
                }

                public static <T> IOIOilI0 get(Class<?> cls) {
                    try {
                        try {
                            try {
                                try {
/* 7 */                             Constructor<?> declaredConstructor = cls.getDeclaredConstructor(null);
/* 11 */                            declaredConstructor.setAccessible(true);
/* 16 */                            return new I00000oIO(declaredConstructor, cls);
                                } catch (Exception unused) {
/* 134 */                           I000II.I000iOII("cannot construct instances of ".concat(cls.getName()));
/* 5 */                             return null;
                                }
                            } catch (NoSuchMethodException unused2) {
/* 22 */                        Class<?> cls2 = Class.forName("sun.misc.Unsafe");
/* 28 */                        Field declaredField = cls2.getDeclaredField("theUnsafe");
/* 32 */                        declaredField.setAccessible(true);
/* 51 */                        return new I00000oOI(cls2.getMethod("allocateInstance", Class.class), declaredField.get(null), cls);
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
/* 63 */                    Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
/* 67 */                    declaredMethod.setAccessible(true);
/* 82 */                    int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
/* 92 */                    Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
/* 96 */                    declaredMethod2.setAccessible(true);
/* 101 */                   return new I0000Il00O(declaredMethod2, cls, iIntValue);
                        } catch (IllegalAccessException unused4) {
/* 148 */                   OoOil11Ol1o.I0000Il00O();
/* 5 */                     return null;
                        }
                    } catch (IllegalAccessException unused5) {
/* 144 */               OoOil11Ol1o.I0000Il00O();
/* 5 */                 return null;
                    } catch (NoSuchMethodException unused6) {
/* 111 */               Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
/* 115 */               declaredMethod3.setAccessible(true);
/* 120 */               return new I0000O(declaredMethod3, cls);
                    } catch (InvocationTargetException e) {
/* 143 */               throw Ooll10OlIOl0.rethrowCause(e);
                    }
                }

                public abstract Object newInstance();
            }

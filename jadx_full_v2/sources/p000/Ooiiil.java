            package p000;

            import java.io.ObjectInputStream;
            import java.io.ObjectStreamClass;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            
            public abstract class Ooiiil {
                public static final Ooiiil I00000oIO;

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    OoiiiiOlIOl ooiiiiOlIOl;
                    try {
                        try {
                            try {
/* 9 */                         Class<?> cls = Class.forName("sun.misc.Unsafe");
/* 15 */                        Field declaredField = cls.getDeclaredField("theUnsafe");
/* 19 */                        declaredField.setAccessible(true);
/* 22 */                        Object obj = declaredField.get(null);
/* 32 */                        Method method = cls.getMethod("allocateInstance", Class.class);
/* 38 */                        OoiiO0iIOl ooiiO0iIOl = new OoiiO0iIOl();
/* 41 */                        ooiiO0iIOl.I00000oOI = method;
/* 43 */                        ooiiO0iIOl.I0000Il00O = obj;
/* 45 */                        VarHandle.storeStoreFence();
                                ooiiiiOlIOl = ooiiO0iIOl;
                            } catch (Exception unused) {
/* 57 */                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
/* 61 */                        declaredMethod.setAccessible(true);
/* 76 */                        int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
/* 86 */                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
/* 90 */                        declaredMethod2.setAccessible(true);
/* 95 */                        Ooiii0iol1 ooiii0iol1 = new Ooiii0iol1();
/* 98 */                        ooiii0iol1.I00000oOI = declaredMethod2;
/* 100 */                       ooiii0iol1.I0000Il00O = iIntValue;
/* 102 */                       VarHandle.storeStoreFence();
                                ooiiiiOlIOl = ooiii0iol1;
                            }
                        } catch (Exception unused2) {
/* 112 */                   Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
/* 116 */                   declaredMethod3.setAccessible(true);
/* 121 */                   Ooiii1OoOI ooiii1OoOI = new Ooiii1OoOI();
/* 124 */                   ooiii1OoOI.I00000oOI = declaredMethod3;
/* 126 */                   VarHandle.storeStoreFence();
                            ooiiiiOlIOl = ooiii1OoOI;
                        }
                    } catch (Exception unused3) {
/* 132 */               ooiiiiOlIOl = new OoiiiiOlIOl();
                    }
/* 135 */           I00000oIO = ooiiiiOlIOl;
                }

                public abstract Object I00000oIO(Class cls);
            }

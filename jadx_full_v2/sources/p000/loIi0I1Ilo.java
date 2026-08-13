            package p000;

            import java.io.ObjectInputStream;
            import java.io.ObjectStreamClass;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Field;
            import java.lang.reflect.Method;
            
            public abstract class loIi0I1Ilo {
                public static final loIi0I1Ilo I00000oIO;

                /* JADX WARN: Multi-variable type inference failed */
                static {
                    loIIoO10I loiioo10i;
                    try {
                        try {
                            try {
/* 9 */                         Class<?> cls = Class.forName("sun.misc.Unsafe");
/* 15 */                        Field declaredField = cls.getDeclaredField("theUnsafe");
/* 19 */                        declaredField.setAccessible(true);
/* 22 */                        Object obj = declaredField.get(null);
/* 32 */                        Method method = cls.getMethod("allocateInstance", Class.class);
/* 38 */                        loI01OOol loi01oool = new loI01OOol();
/* 41 */                        loi01oool.I00000oOI = method;
/* 43 */                        loi01oool.I0000Il00O = obj;
/* 45 */                        VarHandle.storeStoreFence();
                                loiioo10i = loi01oool;
                            } catch (Exception unused) {
/* 57 */                        Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
/* 61 */                        declaredMethod.setAccessible(true);
/* 76 */                        int iIntValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
/* 86 */                        Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
/* 90 */                        declaredMethod2.setAccessible(true);
/* 95 */                        loI0oIO loi0oio = new loI0oIO();
/* 98 */                        loi0oio.I00000oOI = declaredMethod2;
/* 100 */                       loi0oio.I0000Il00O = iIntValue;
/* 102 */                       VarHandle.storeStoreFence();
                                loiioo10i = loi0oio;
                            }
                        } catch (Exception unused2) {
/* 112 */                   Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
/* 116 */                   declaredMethod3.setAccessible(true);
/* 121 */                   loI1OIIo0olO loi1oiio0olo = new loI1OIIo0olO();
/* 124 */                   loi1oiio0olo.I00000oOI = declaredMethod3;
/* 126 */                   VarHandle.storeStoreFence();
                            loiioo10i = loi1oiio0olo;
                        }
                    } catch (Exception unused3) {
/* 132 */               loiioo10i = new loIIoO10I();
                    }
/* 135 */           I00000oIO = loiioo10i;
                }

                public abstract Object I00000oIO(Class cls);
            }

            package p000;

            import java.lang.reflect.Field;
            import java.lang.reflect.Modifier;
            import sun.misc.Unsafe;
            
            public abstract class I1Ioolli0l0o {
                public static final Unsafe I00000oIO;

                static {
                    Field declaredField;
                    try {
/* 6 */                 declaredField = Unsafe.class.getDeclaredField("theUnsafe");
                    } catch (NoSuchFieldException e) {
/* 12 */                Field[] declaredFields = Unsafe.class.getDeclaredFields();
/* 16 */                int length = declaredFields.length;
/* 17 */                int i = 0;
                        while (true) {
/* 18 */                    if (i >= length) {
/* 47 */                        declaredField = null;
                                break;
                            }
/* 20 */                    Field field = declaredFields[i];
/* 30 */                    if (Modifier.isStatic(field.getModifiers()) && Unsafe.class.isAssignableFrom(field.getType())) {
/* 42 */                        declaredField = field;
                                break;
                            }
/* 44 */                    i++;
                        }
/* 48 */                if (declaredField != null) {
/* 110 */                   throw new UnsupportedOperationException("Couldn't find the Unsafe", e);
                        }
                    }
/* 51 */            declaredField.setAccessible(true);
                    try {
/* 60 */                I00000oIO = (Unsafe) declaredField.get(null);
                    } catch (IllegalAccessException e2) {
/* 64 */                IioIoO10iOiI.I000lI(e2);
                    }
                }
            }

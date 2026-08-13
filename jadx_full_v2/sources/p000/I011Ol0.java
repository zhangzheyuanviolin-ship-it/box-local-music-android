            package p000;

            import java.lang.reflect.Field;
            import java.security.PrivilegedExceptionAction;
            import sun.misc.Unsafe;
            
            public final class I011Ol0 implements PrivilegedExceptionAction {
                @Override
                public final Object run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
/* 9 */             for (Field field : Unsafe.class.getDeclaredFields()) {
/* 14 */                field.setAccessible(true);
/* 18 */                Object obj = field.get(null);
/* 26 */                if (Unsafe.class.isInstance(obj)) {
/* 32 */                    return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
/* 113 */           throw new NoSuchFieldError("the Unsafe");
                }
            }

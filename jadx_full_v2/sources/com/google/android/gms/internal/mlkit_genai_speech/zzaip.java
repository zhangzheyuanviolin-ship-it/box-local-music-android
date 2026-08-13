            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.lang.reflect.Field;
            import java.security.PrivilegedExceptionAction;
            import sun.misc.Unsafe;
            
            final class zzaip implements PrivilegedExceptionAction {
                @Override
                public final Object run() throws IllegalAccessException, SecurityException, IllegalArgumentException {
/* 10 */            for (Field field : Unsafe.class.getDeclaredFields()) {
/* 15 */                field.setAccessible(true);
/* 18 */                Object obj = field.get(null);
/* 26 */                if (Unsafe.class.isInstance(obj)) {
/* 32 */                    return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
/* 9 */             return null;
                }
            }

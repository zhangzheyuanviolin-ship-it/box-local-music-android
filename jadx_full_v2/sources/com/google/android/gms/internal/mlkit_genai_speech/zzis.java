            package com.google.android.gms.internal.mlkit_genai_speech;

            import sun.misc.Unsafe;
            
            public final class zzis {
                public static boolean zza(Unsafe unsafe, Object obj, long j, Object obj2, Object obj3) {
/* 5 */             while (!unsafe.compareAndSwapObject(obj, j, obj2, obj3)) {
/* 13 */                if (unsafe.getObject(obj, j) != obj2) {
/* 15 */                    return false;
                        }
                    }
/* 7 */             return true;
                }
            }

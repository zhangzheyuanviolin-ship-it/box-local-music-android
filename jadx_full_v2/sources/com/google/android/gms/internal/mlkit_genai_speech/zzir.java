            package com.google.android.gms.internal.mlkit_genai_speech;

            import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
            
            public final class zzir {
                public static boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Object obj2, Object obj3) {
/* 5 */             while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, obj3)) {
/* 13 */                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
/* 15 */                    return false;
                        }
                    }
/* 7 */             return true;
                }
            }

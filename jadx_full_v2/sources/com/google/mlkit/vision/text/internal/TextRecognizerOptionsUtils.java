            package com.google.mlkit.vision.text.internal;

            import java.util.concurrent.atomic.AtomicReference;
            import p000.IioIii0IO;
            import p000.O1o0111OI00;
            
            public final class TextRecognizerOptionsUtils {
                private TextRecognizerOptionsUtils() {
                }

                public static boolean isThickClient(AtomicReference<Boolean> atomicReference, String str) {
/* 5 */             if (atomicReference.get() != null) {
/* 13 */                return atomicReference.get().booleanValue();
                    }
/* 34 */            boolean z = IioIii0IO.I00000oIO(O1o0111OI00.I0000Il00O().I00000oOI(), str) > 0;
/* 39 */            atomicReference.set(Boolean.valueOf(z));
/* 89 */            return z;
                }
            }

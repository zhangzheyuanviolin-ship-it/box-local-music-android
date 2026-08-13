            package androidx.camera.core.internal.compat.quirk;

            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashSet;
            import p000.Ioi1Io1o;
            import p000.OOIIOiolI;
            import p000.OOiio1i;
            import p000.Ool10o;
            import p000.OolIl0ii1;
            import p000.OolO01iOo0O;
            
            public final class ImageCaptureFailedForSpecificCombinationQuirk implements OOiio1i {
                public static final HashSet I00000oIO = new HashSet(Arrays.asList("pixel 4a", "pixel 4a (5g)", "pixel 5", "pixel 5a"));

                public static boolean I00000oOI(LinkedHashSet linkedHashSet) {
/* 7 */             if (linkedHashSet.size() == 3) {
/* 10 */                Iterator it = linkedHashSet.iterator();
/* 14 */                boolean z = false;
/* 15 */                boolean z2 = false;
/* 16 */                boolean z3 = false;
/* 22 */                while (it.hasNext()) {
/* 28 */                    Ool10o ool10o = (Ool10o) it.next();
/* 32 */                    if (ool10o instanceof OOIIOiolI) {
/* 34 */                        z = true;
                            } else if (ool10o instanceof Ioi1Io1o) {
/* 40 */                        z3 = true;
                            } else if (ool10o.I000OOo1O.I000O01llI0(OolIl0ii1.I00OIl)) {
/* 64 */                        z2 = ool10o.I000OOo1O.I0010o() == OolO01iOo0O.I00iio;
                            }
                        }
/* 66 */                if (z && z2 && z3) {
/* 21 */                    return true;
                        }
                    }
/* 6 */             return false;
                }
            }

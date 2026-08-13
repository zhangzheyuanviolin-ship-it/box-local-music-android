            package p000;

            import android.graphics.Typeface;
            
            public abstract class iliioilIlo1 {
                /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(int i, Object obj, Oi0l1olOi oi0l1olOi, IlilIIiIiO ililIIiIiO, int i2) {
                    boolean z;
/* 3 */             if (!(obj instanceof Typeface)) {
/* 5 */                 return obj;
                    }
/* 8 */             boolean z2 = false;
/* 10 */            if ((i & 1) == 0 || O0000Ioio00.I0000O(oi0l1olOi.I00000oOI, ililIIiIiO)) {
/* 40 */                z = false;
                    } else {
/* 20 */                IlilIIiIiO ililIIiIiO2 = IlilIIiIiO.I00iiI;
/* 22 */                IlilIIiIiO ililIIiIiO3 = IlilIIiIiO.I00iio;
/* 28 */                if (ililIIiIiO.compareTo(ililIIiIiO3) >= 0 && oi0l1olOi.I00000oOI.compareTo(ililIIiIiO3) < 0) {
/* 38 */                    z = true;
                        }
                    }
/* 52 */            boolean z3 = ((i & 2) == 0 || i2 == oi0l1olOi.I0000Il00O) ? false : true;
/* 53 */            if (!z3 && !z) {
/* 57 */                return obj;
                    }
/* 65 */            int i3 = z ? ililIIiIiO.I00iOIl : oi0l1olOi.I00000oOI.I00iOIl;
/* 67 */            if (!z3 ? oi0l1olOi.I0000Il00O == 1 : i2 == 1) {
/* 71 */                z2 = true;
                    }
/* 80 */            return Typeface.create((Typeface) obj, i3, z2);
                }
            }

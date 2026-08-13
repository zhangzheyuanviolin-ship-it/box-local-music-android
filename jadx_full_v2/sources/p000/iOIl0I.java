            package p000;

            import android.os.Build;
            
            public abstract class iOIl0I {
                public static final long I00000oIO(long j) {
/* 3 */             long j2 = 63 & j;
/* 4 */             int i = (int) j2;
/* 7 */             if (i <= 15) {
/* 9 */                 return j;
                    }
/* 14 */            if (i == IOOlIOOi0O0.I001IIilI0O.I0000Il00O) {
/* 20 */                return iiO01ll11o1l.I000OOo1O(j);
                    }
/* 26 */            if (i != IOOlIOOi0O0.I001IO000.I0000Il00O) {
/* 30 */                int i2 = IOOlIOOi0O0.I001i1O0Ol.I0000Il00O;
                    }
                    return (i != IOOlIOOi0O0.I001i1lo1io.I0000Il00O || Build.VERSION.SDK_INT >= 36) ? (j & (-64)) | (j2 - 1) : iiO01ll11o1l.I000OOo1O(j);
                }

                public static final long I00000oOI(long j) {
/* 4 */             int i = (int) (63 & j);
                    return (i == IOOlIOOi0O0.I001i1lo1io.I0000Il00O || i == IOOlIOOi0O0.I0010o.I0000Il00O || i == IOOlIOOi0O0.I00111O.I0000Il00O) ? I00000oIO(IOOiio0i.I00000oOI(j, IOOlIOOi0O0.I0000oI00)) : I00000oIO(j);
                }
            }

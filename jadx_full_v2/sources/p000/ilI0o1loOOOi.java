            package p000;

            import android.widget.EdgeEffect;
            
            public abstract class ilI0o1loOOOi {
                public static float I00000oIO(EdgeEffect edgeEffect, float f, float f2, IiIooOOOI iiIooOOOI) {
                    float distance;
/* 1 */             float f3 = IioO11i.I00000oIO;
/* 17 */            double dI00000oIO = iiIooOOOI.I00000oIO() * 386.0878f * 160.0f * 0.84f;
/* 31 */            double d = IioO11i.I00000oIO * dI00000oIO;
/* 48 */            float fExp = (float) (Math.exp((IioO11i.I00000oOI / IioO11i.I0000Il00O) * Math.log((Math.abs(f) * 0.35f) / d)) * d);
                    try {
/* 50 */                distance = edgeEffect.getDistance();
                    } catch (Throwable unused) {
/* 55 */                distance = 0.0f;
                    }
/* 59 */            if (fExp > distance * f2) {
/* 49 */                return 0.0f;
                    }
/* 65 */            edgeEffect.onAbsorb(O1OooO0IlOo.I000II(f));
/* 68 */            return f;
                }
            }

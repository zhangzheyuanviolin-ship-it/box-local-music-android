            package p000;

            import java.util.Comparator;
            
            public final class O1o10o implements Comparator {
                public final int I00iOIl;
                public float[] I00iiI;

                @Override
                public final int compare(Object obj, Object obj2) {
                    switch (this.I00iOIl) {
                        case 0:
/* 39 */                    int iIntValue = ((Number) obj2).intValue();
/* 43 */                    float[] fArr = this.I00iiI;
/* 63 */                    return iii1OiiIi.I00000oIO(Float.valueOf(fArr[iIntValue]), Float.valueOf(fArr[((Number) obj).intValue()]));
                        default:
/* 8 */                     int iIntValue2 = ((Number) obj2).intValue();
/* 12 */                    float[] fArr2 = this.I00iiI;
/* 32 */                    return iii1OiiIi.I00000oIO(Float.valueOf(fArr2[iIntValue2]), Float.valueOf(fArr2[((Number) obj).intValue()]));
                    }
                }
            }

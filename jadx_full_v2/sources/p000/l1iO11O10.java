            package p000;

            import android.content.res.Resources;
            
            public abstract class l1iO11O10 {
                public static String I00000oIO(I1O0ol i1O0ol, int i) {
/* 4 */             if (i <= 16777215) {
/* 6 */                 return String.valueOf(i);
                    }
                    try {
/* 17 */                return i1O0ol.I00000oIO.getResources().getResourceName(i);
                    } catch (Resources.NotFoundException unused) {
/* 22 */                return String.valueOf(i);
                    }
                }

                public static OilO0iOl I00000oOI(OI1ilOI1ioo0 oI1ilOI1ioo0) {
/* 8 */             return OilO1oiooiII.I000OiO(oI1ilOI1ioo0, new O1o0i0Ol0Oo0(27));
                }
            }

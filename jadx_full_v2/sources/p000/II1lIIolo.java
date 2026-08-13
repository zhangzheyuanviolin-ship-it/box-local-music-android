            package p000;

            import android.util.Log;
            import java.util.Collection;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class II1lIIolo implements Function1 {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;

                public II1lIIolo(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    boolean zI0110OiO;
                    switch (this.I00iOIl) {
                        case 0:
/* 42 */                    int i = this.I00iiI;
/* 46 */                    II1o0111IO0 iI1o0111IO0 = (II1o0111IO0) this.I00iiO;
/* 48 */                    String str = (String) obj;
/* 52 */                    if (i == iI1o0111IO0.I000lI) {
/* 62 */                        Log.e("BoxAssistVM", "describe inference error: ".concat(str));
/* 69 */                        iI1o0111IO0.I000O01llI0.I00000oOI("Sorry, I couldn't describe the scene.");
/* 72 */                        OlO0OIIl1 olO0OIIl1 = iI1o0111IO0.I0000Il00O;
/* 94 */                        olO0OIIl1.I000lI(null, II1l1O1oi01.I00000oIO((II1l1O1oi01) olO0OIIl1.getValue(), null, false, "Describe mode", null, false, 11));
                            }
/* 97 */                    return OoiIlOl1iI.I00000oIO;
                        case 1:
/* 25 */                    OOo0ooi oOo0ooi = (OOo0ooi) this.I00iiO;
/* 31 */                    zI0110OiO = ((IliIO10oO0) obj).I0110OiO(this.I00iiI);
/* 39 */                    oOo0ooi.I00iOIl = Boolean.valueOf(zI0110OiO);
                            break;
                        default:
/* 14 */                    zI0110OiO = ((List) obj).addAll(this.I00iiI, (Collection) this.I00iiO);
                            break;
                    }
/* 18 */            return Boolean.valueOf(zI0110OiO);
                }
            }

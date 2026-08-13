            package p000;

            import android.content.Context;
            import kotlin.jvm.functions.Function1;
            
            public final class IlI00oi implements Function1 {
                public final int I00iOIl;
                public IlI1loI1lO1 I00iiI;
                public Context I00iiO;

                @Override
                public final Object invoke(Object obj) {
/* 3 */             int i = this.I00iOIl;
/* 9 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 169 */                   IlI1loI1lO1 ilI1loI1lO1 = this.I00iiI;
/* 171 */                   Context context = this.I00iiO;
/* 177 */                   boolean zBooleanValue = ((Boolean) obj).booleanValue();
/* 183 */                   Oi010OO0.I001lllioOl(context, "facerec_prefs", 0, "showPercent", zBooleanValue);
/* 186 */                   OlO0OIIl1 olO0OIIl1 = ilI1loI1lO1.I00000oOI;
/* 215 */                   olO0OIIl1.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl1.getValue(), null, false, null, null, null, null, null, 0.0f, false, zBooleanValue, false, 1535));
                            break;
                        case 1:
/* 119 */                   IlI1loI1lO1 ilI1loI1lO12 = this.I00iiI;
/* 121 */                   Context context2 = this.I00iiO;
/* 127 */                   boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
/* 133 */                   Oi010OO0.I001lllioOl(context2, "facerec_prefs", 0, "showMesh", zBooleanValue2);
/* 136 */                   OlO0OIIl1 olO0OIIl12 = ilI1loI1lO12.I00000oOI;
/* 165 */                   olO0OIIl12.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl12.getValue(), null, false, null, null, null, null, null, 0.0f, false, false, zBooleanValue2, 1023));
                            break;
                        case 2:
/* 91 */                    IlI1loI1lO1 ilI1loI1lO13 = this.I00iiI;
/* 99 */                    IOO11li1OoII iOO11li1OoIII00000oIO = OooiooIOO.I00000oIO(ilI1loI1lO13);
/* 103 */                   IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 115 */                   iOi1II01i0.I0000O(iOO11li1OoIII00000oIO, Ii1oo1ooill0.I00iiI, null, new IiI110i1O(ilI1loI1lO13, this.I00iiO, (String) obj, null, 4), 2);
                            break;
                        case 3:
/* 30 */                    IlI1loI1lO1 ilI1loI1lO14 = this.I00iiI;
/* 32 */                    Context context3 = this.I00iiO;
/* 38 */                    float fFloatValue = ((Float) obj).floatValue();
/* 56 */                    context3.getSharedPreferences("facerec_prefs", 0).edit().putFloat("threshold", fFloatValue).apply();
/* 59 */                    OlO0OIIl1 olO0OIIl13 = ilI1loI1lO14.I00000oOI;
/* 87 */                    olO0OIIl13.I000lI(null, IlI10IO.I00000oIO((IlI10IO) olO0OIIl13.getValue(), null, false, null, null, null, null, null, fFloatValue, false, false, false, 1919));
                            break;
                        default:
/* 26 */                    this.I00iiI.I000l1(this.I00iiO, ((Boolean) obj).booleanValue());
                            break;
                    }
/* 29 */            return ooiIlOl1iI;
                }
            }

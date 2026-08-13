            package p000;

            import android.graphics.drawable.Drawable;
            import kotlin.jvm.functions.Function3;
            
            public final class OlolIo0O implements Function3 {
                public final int I00iOIl;
                public Drawable I00iiI;

                public OlolIo0O(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 1 */             int i = this.I00iOIl;
/* 3 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 52 */                    long j = ((IOOiio0i) obj).I00000oIO;
/* 54 */                    IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 58 */                    int iIntValue = ((Number) obj3).intValue();
/* 72 */                    if (!iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 82 */                        iloI0lOlll1.I00OilO00Il();
                                break;
                            } else {
/* 78 */                        iOl0lOIi11.I00ioIO.I000II(this.I00iiI, iloI0lOlll1, 48);
                                break;
                            }
                        default:
/* 16 */                    long j2 = ((IOOiio0i) obj).I00000oIO;
/* 18 */                    IloI0lOlll1 iloI0lOlll12 = (IloI0lOlll1) obj2;
/* 22 */                    int iIntValue2 = ((Number) obj3).intValue();
/* 36 */                    if (!iloI0lOlll12.I00OIl(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
/* 46 */                        iloI0lOlll12.I00OilO00Il();
                                break;
                            } else {
/* 42 */                        iOl0lOIi11.I00ioIO.I000II(this.I00iiI, iloI0lOlll12, 48);
                                break;
                            }
                    }
/* 49 */            return ooiIlOl1iI;
                }
            }

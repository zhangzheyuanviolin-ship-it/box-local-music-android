            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class Iii0Ioi10 implements IlliIl1l11O {
                public OI1OloOIO1O I00iOIl;
                public Iii0iOoIo I00iiI;
                public OiIil1il I00iiO;
                public Ol1o0O0O0 I00iio;
                public Iii0OliiI I00ilI0I1;

                /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj, Object obj2) {
/* 1 */             IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj;
/* 5 */             int iIntValue = ((Number) obj2).intValue();
/* 9 */             Iii0iOoIo iii0iOoIo = this.I00iiI;
/* 11 */            OI1OloOIO1O oI1OloOIO1O = this.I00iOIl;
/* 16 */            if ((iIntValue & 3) == 2 && iloI0lOlll1.I00IO1()) {
/* 25 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 37 */                boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(oI1OloOIO1O) | iloI0lOlll1.I000OOo1O(iii0iOoIo);
/* 38 */                Ol1o0O0O0 ol1o0O0O0 = this.I00iio;
/* 40 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 44 */                if (!zI000OOo1O) {
                            Object obj3 = objI00O0i0ii;
/* 48 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 54 */                        I01oIoOI01l i01oIoOI01l = new I01oIoOI01l(14);
/* 57 */                        i01oIoOI01l.I00iiI = ol1o0O0O0;
/* 59 */                        i01oIoOI01l.I00iiO = oI1OloOIO1O;
/* 61 */                        i01oIoOI01l.I00iio = iii0iOoIo;
/* 63 */                        VarHandle.storeStoreFence();
/* 66 */                        iloI0lOlll1.I00iio(i01oIoOI01l);
                                obj3 = i01oIoOI01l;
                            }
/* 71 */                    iIO0iiOiOl0l.I00000oOI(oI1OloOIO1O, (Function1) obj3, iloI0lOlll1);
/* 74 */                    OiIil1il oiIil1il = this.I00iiO;
/* 78 */                    Iii0OliiI iii0OliiI = this.I00ilI0I1;
/* 80 */                    II01l1Oii iI01l1Oii = new II01l1Oii(2);
/* 83 */                    iI01l1Oii.I00iiI = iii0OliiI;
/* 85 */                    iI01l1Oii.I00iiO = oI1OloOIO1O;
/* 87 */                    VarHandle.storeStoreFence();
/* 99 */                    l1iIi10.I00000oIO(oI1OloOIO1O, oiIil1il, iiioOl1O.I00000oOI(-497631156, iI01l1Oii, iloI0lOlll1), iloI0lOlll1, 384);
                        }
                    }
/* 102 */           return OoiIlOl1iI.I00000oIO;
                }
            }

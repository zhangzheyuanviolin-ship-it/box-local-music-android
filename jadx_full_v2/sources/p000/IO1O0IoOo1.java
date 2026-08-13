            package p000;

            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            import kotlin.jvm.functions.Function3;
            
            public final class IO1O0IoOo1 implements Function3 {
                public Conversation I00iOIl;
                public IO1OIo01l1 I00iiI;
                public O1ol100o0O I00iiO;
                public OI1o1o1iO1l I00iio;
                public OI10i0Il I00ilI0I1;
                public OI10i0Il I00ilO0;

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 4 */             IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj2;
/* 8 */             int iIntValue = ((Number) obj3).intValue();
/* 12 */            OI1o1o1iO1l oI1o1o1iO1l = this.I00iio;
/* 14 */            O1ol100o0O o1ol100o0O = this.I00iiO;
/* 16 */            IO1OIo01l1 iO1OIo01l1 = this.I00iiI;
/* 33 */            if (iloI0lOlll1.I00OIl(iIntValue & 1, (iIntValue & 17) != 16)) {
/* 36 */                Conversation conversation = this.I00iOIl;
/* 46 */                boolean zI000II = iloI0lOlll1.I000II(conversation) | iloI0lOlll1.I000OOo1O(iO1OIo01l1);
/* 47 */                Conversation conversation2 = this.I00iOIl;
/* 49 */                OI10i0Il oI10i0Il = this.I00ilI0I1;
/* 51 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 55 */                IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        Object obj4 = objI00O0i0ii;
/* 57 */                if (zI000II || objI00O0i0ii == iOO0o0I1l) {
/* 63 */                    II01oIlIII iI01oIlIII = new II01oIlIII(1);
/* 66 */                    iI01oIlIII.I00iiO = conversation2;
/* 68 */                    iI01oIlIII.I00iio = iO1OIo01l1;
/* 70 */                    iI01oIlIII.I00iiI = oI10i0Il;
/* 72 */                    VarHandle.storeStoreFence();
/* 75 */                    iloI0lOlll1.I00iio(iI01oIlIII);
                            obj4 = iI01oIlIII;
                        }
/* 79 */                IllOOo00lI illOOo00lI = (IllOOo00lI) obj4;
/* 81 */                OI10i0Il oI10i0Il2 = this.I00ilO0;
/* 83 */                Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj5 = objI00O0i0ii2;
/* 87 */                if (objI00O0i0ii2 == iOO0o0I1l) {
/* 93 */                    I00iiI i00iiI = new I00iiI(11);
/* 96 */                    i00iiI.I00iiI = oI10i0Il2;
/* 98 */                    VarHandle.storeStoreFence();
/* 101 */                   iloI0lOlll1.I00iio(i00iiI);
                            obj5 = i00iiI;
                        }
/* 104 */               Function1 function1 = (Function1) obj5;
/* 119 */               boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(iO1OIo01l1) | iloI0lOlll1.I000OOo1O(o1ol100o0O) | iloI0lOlll1.I000OOo1O(oI1o1o1iO1l);
/* 120 */               Object objI00O0i0ii3 = iloI0lOlll1.I00O0i0ii();
                        Object obj6 = objI00O0i0ii3;
/* 124 */               if (zI000OOo1O || objI00O0i0ii3 == iOO0o0I1l) {
/* 130 */                   I1ooIoloo0 i1ooIoloo0 = new I1ooIoloo0(1);
/* 133 */                   i1ooIoloo0.I00iiI = iO1OIo01l1;
/* 135 */                   i1ooIoloo0.I00iiO = o1ol100o0O;
/* 137 */                   i1ooIoloo0.I00iio = oI1o1o1iO1l;
/* 139 */                   VarHandle.storeStoreFence();
/* 142 */                   iloI0lOlll1.I00iio(i1ooIoloo0);
                            obj6 = i1ooIoloo0;
                        }
/* 150 */               iOlIi1i.I00000oOI(conversation, illOOo00lI, function1, (Function1) obj6, iloI0lOlll1, 384);
                    } else {
/* 154 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 157 */           return OoiIlOl1iI.I00000oIO;
                }
            }

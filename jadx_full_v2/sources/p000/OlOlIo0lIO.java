            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class OlOlIo0lIO implements IiIolo {
                @Override
                public final int I00000oIO(IiIoiiOoIi iiIoiiOoIi, IiIoiiOoIi iiIoiiOoIi2) {
/* 1 */             ArrayList arrayList = iiIoiiOoIi.I00000oIO;
/* 3 */             int size = arrayList.size();
/* 7 */             ArrayList arrayList2 = iiIoiiOoIi2.I00000oIO;
/* 14 */            if (size != arrayList2.size() || arrayList.size() > 2) {
/* 13 */                return 0;
                    }
/* 28 */            OloOO10o oloOO10o = (OloOO10o) IIl001iO0Io.I000OiO(1, arrayList);
/* 32 */            OlOl1Oii olOl1Oii = new OlOl1Oii();
/* 37 */            OO0Ii1 oO0Ii1 = new OO0Ii1();
/* 50 */            oO0Ii1.I00000oOI(iiIoiiOoIi.I00000oOI(arrayList.size()));
/* 57 */            OloOO10o oloOO10o2 = (OloOO10o) arrayList2.get(0);
/* 59 */            OIIl1OIol oIIl1OIol = oloOO10o.I0000oI00;
/* 63 */            OIIloI0Iil oIIloI0Iil = new OIIloI0Iil();
/* 66 */            oIIloI0Iil.I00iiI = oIIl1OIol;
/* 68 */            oIIloI0Iil.I00iiO = oloOO10o2;
/* 70 */            VarHandle.storeStoreFence();
/* 77 */            while (oIIloI0Iil.hasNext()) {
/* 83 */                OIIl1OIol oIIl1OIol2 = (OIIl1OIol) oIIloI0Iil.next();
/* 85 */                olOl1Oii.I0000Il00O(oIIl1OIol2);
/* 92 */                oO0Ii1.I00000oIO(oIIl1OIol2.I0000O());
                    }
/* 106 */           oO0Ii1.I00000oOI(iiIoiiOoIi2.I00000oIO(arrayList2.size()));
/* 109 */           List list = oO0Ii1.I00000oIO;
/* 111 */           if (list == null) {
/* 114 */               list = Collections.EMPTY_LIST;
                    }
/* 116 */           olOl1Oii.I000II(list);
/* 119 */           oloOO10o.I0000oI00(olOl1Oii);
/* 122 */           return arrayList.size();
                }

                @Override
                public final char I00000oOI() {
/* 1 */             return '~';
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             return 1;
                }

                @Override
                public final char I0000O() {
/* 1 */             return '~';
                }
            }

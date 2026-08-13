            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            
            public final class I1OlOIoo011 implements IiIolo {
                public final char I00000oIO;

                public I1OlOIoo011(char c) {
/* 4 */             this.I00000oIO = c;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final int I00000oIO(IiIoiiOoIi iiIoiiOoIi, IiIoiiOoIi iiIoiiOoIi2) {
                    Il0010l0i0O il0010l0i0O;
/* 1 */             ArrayList arrayList = iiIoiiOoIi.I00000oIO;
/* 3 */             ArrayList arrayList2 = iiIoiiOoIi2.I00000oIO;
/* 8 */             if (iiIoiiOoIi.I0000oI00 || iiIoiiOoIi2.I0000O) {
/* 14 */                int i = iiIoiiOoIi2.I0000Il00O;
/* 18 */                if (i % 3 != 0 && (iiIoiiOoIi.I0000Il00O + i) % 3 == 0) {
/* 7 */                     return 0;
                        }
                    }
/* 28 */            int size = arrayList.size();
/* 33 */            char c = this.I00000oIO;
/* 35 */            int i2 = 2;
/* 36 */            if (size < 2 || arrayList2.size() < 2) {
/* 73 */                String strValueOf = String.valueOf(c);
/* 77 */                Il0010l0i0O il0010l0i0O2 = new Il0010l0i0O();
/* 80 */                il0010l0i0O2.I000II = strValueOf;
/* 82 */                i2 = 1;
                        il0010l0i0O = il0010l0i0O2;
                    } else {
/* 61 */                String str = String.valueOf(c) + c;
/* 65 */                Oli001o oli001o = new Oli001o();
/* 68 */                oli001o.I000II = str;
                        il0010l0i0O = oli001o;
                    }
/* 85 */            OO0Ii1 oO0Ii1 = new OO0Ii1();
/* 94 */            oO0Ii1.I00000oOI(iiIoiiOoIi.I00000oOI(i2));
/* 106 */           OloOO10o oloOO10o = (OloOO10o) arrayList.get(arrayList.size() - 1);
/* 112 */           OloOO10o oloOO10o2 = (OloOO10o) arrayList2.get(0);
/* 114 */           OIIl1OIol oIIl1OIol = oloOO10o.I0000oI00;
/* 118 */           OIIloI0Iil oIIloI0Iil = new OIIloI0Iil();
/* 121 */           oIIloI0Iil.I00iiI = oIIl1OIol;
/* 123 */           oIIloI0Iil.I00iiO = oloOO10o2;
/* 125 */           VarHandle.storeStoreFence();
/* 132 */           while (oIIloI0Iil.hasNext()) {
/* 138 */               OIIl1OIol oIIl1OIol2 = (OIIl1OIol) oIIloI0Iil.next();
/* 140 */               il0010l0i0O.I0000Il00O(oIIl1OIol2);
/* 147 */               oO0Ii1.I00000oIO(oIIl1OIol2.I0000O());
                    }
/* 157 */           oO0Ii1.I00000oOI(iiIoiiOoIi2.I00000oIO(i2));
/* 160 */           List list = oO0Ii1.I00000oIO;
/* 162 */           if (list == null) {
/* 165 */               list = Collections.EMPTY_LIST;
                    }
/* 167 */           il0010l0i0O.I000II(list);
/* 170 */           oloOO10o.I0000oI00(il0010l0i0O);
/* 551 */           return i2;
                }

                @Override
                public final char I00000oOI() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             return 1;
                }

                @Override
                public final char I0000O() {
/* 1 */             return this.I00000oIO;
                }
            }

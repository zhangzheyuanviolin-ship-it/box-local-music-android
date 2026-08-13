            package p000;

            import java.io.IOException;
            import java.util.ArrayList;
            import java.util.Map;
            import java.util.TreeMap;
            
            public final class OIliioo1i0 extends I1oO1oiO00O {
                public ArrayList I0000oI00;
                public final int I0001Ioi1lo;
                public final int I000II;

                public OIliioo1i0(IIi0io1lIo iIi0io1lIo, IIOolO1li iIOolO1li) throws IOException {
/* 10 */            super(new Ioo011Oi(iIi0io1lIo.I010l1ol111()));
/* 14 */            this.I0000oI00 = null;
/* 16 */            this.I0000Il00O = iIOolO1li;
/* 21 */            int iI00oooO = iIi0io1lIo.I00oooO(IIi0I0I0o.I0I0I10I, null, -1);
/* 25 */            this.I0001Ioi1lo = iI00oooO;
/* 27 */            if (iI00oooO == -1) {
/* 72 */                IioIoO10iOiI.I000OOo1O("/N entry missing in object stream");
/* 89 */                throw null;
                    }
/* 29 */            if (iI00oooO < 0) {
/* 66 */                IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI00oooO, "Illegal /N entry in object stream: "));
/* 69 */                throw null;
                    }
/* 33 */            int iI00oooO2 = iIi0io1lIo.I00oooO(IIi0I0I0o.I01Oi01Ilol, null, -1);
/* 37 */            this.I000II = iI00oooO2;
/* 39 */            if (iI00oooO2 == -1) {
/* 56 */                IioIoO10iOiI.I000OOo1O("/First entry missing in object stream");
/* 59 */                throw null;
                    }
/* 41 */            if (iI00oooO2 >= 0) {
/* 43 */                return;
                    }
/* 50 */            IioIoO10iOiI.I000OOo1O(Oi010OO0.I000oI1ioi(iI00oooO2, "Illegal /First entry in object stream: "));
/* 53 */            throw null;
                }

                public final void I001i1O0Ol() {
/* 1 */             OilOll oilOll = this.I00000oOI;
                    try {
/* 5 */                 TreeMap treeMap = new TreeMap();
/* 8 */                 long position = oilOll.getPosition();
/* 12 */                int i = this.I000II;
/* 18 */                long j = (position + i) - 1;
/* 23 */                for (int i2 = 0; i2 < this.I0001Ioi1lo && oilOll.getPosition() < j; i2++) {
/* 51 */                    treeMap.put(Integer.valueOf((int) I00100o1O0lo()), Long.valueOf(I0010I0i()));
                        }
/* 66 */                this.I0000oI00 = new ArrayList(treeMap.size());
/* 80 */                for (Map.Entry entry : treeMap.entrySet()) {
/* 94 */                    int iIntValue = ((Integer) entry.getKey()).intValue();
/* 98 */                    long position2 = oilOll.getPosition();
/* 102 */                   int i3 = iIntValue + i;
/* 103 */                   if (i3 > 0 && position2 < i3) {
/* 112 */                       oilOll.I00io1l(i3 - ((int) position2));
                            }
/* 121 */                   IIi0O10I iIi0O10I = new IIi0O10I(I000l1());
/* 124 */                   iIi0O10I.I00iiO = 0;
/* 136 */                   iIi0O10I.I00iiI = ((Long) entry.getValue()).longValue();
/* 140 */                   this.I0000oI00.add(iIi0O10I);
                        }
                    } finally {
/* 150 */               oilOll.close();
                    }
                }
            }

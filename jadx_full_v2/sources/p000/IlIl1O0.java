            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IlIl1O0 extends O1ooOo implements O0iOoioOoI {
                public Iii1I1O0 I00o0iI0io1;
                public float I00o0l1o1o0;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
                    int iI000l1;
                    int iI000OiO;
                    int iI000OOo1O;
                    int i;
/* 5 */             if (!IOo0oO11ll1O.I0001Ioi1lo(j) || this.I00o0iI0io1 == Iii1I1O0.I00iOIl) {
/* 42 */                iI000l1 = IOo0oO11ll1O.I000l1(j);
/* 46 */                iI000OiO = IOo0oO11ll1O.I000OiO(j);
                    } else {
/* 21 */                int iRound = Math.round(IOo0oO11ll1O.I000OiO(j) * this.I00o0l1o1o0);
/* 25 */                int iI000l12 = IOo0oO11ll1O.I000l1(j);
/* 29 */                iI000l1 = IOo0oO11ll1O.I000OiO(j);
/* 33 */                if (iRound < iI000l12) {
/* 35 */                    iRound = iI000l12;
                        }
/* 36 */                if (iRound <= iI000l1) {
/* 39 */                    iI000l1 = iRound;
                        }
/* 40 */                iI000OiO = iI000l1;
                    }
/* 54 */            if (!IOo0oO11ll1O.I0000oI00(j) || this.I00o0iI0io1 == Iii1I1O0.I00iiI) {
/* 91 */                int iI000iOII = IOo0oO11ll1O.I000iOII(j);
/* 95 */                int iI000OOo1O2 = IOo0oO11ll1O.I000OOo1O(j);
/* 100 */               iI000OOo1O = iI000iOII;
/* 101 */               i = iI000OOo1O2;
                    } else {
/* 70 */                int iRound2 = Math.round(IOo0oO11ll1O.I000OOo1O(j) * this.I00o0l1o1o0);
/* 74 */                int iI000iOII2 = IOo0oO11ll1O.I000iOII(j);
/* 78 */                iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 82 */                if (iRound2 < iI000iOII2) {
/* 84 */                    iRound2 = iI000iOII2;
                        }
/* 85 */                if (iRound2 <= iI000OOo1O) {
/* 88 */                    iI000OOo1O = iRound2;
                        }
/* 89 */                i = iI000OOo1O;
                    }
/* 106 */           OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0olo.I00000oIO(iI000l1, iI000OiO, iI000OOo1O, i));
/* 110 */           int i2 = oO1I0001000iI001lllioOl.I00iOIl;
/* 112 */           int i3 = oO1I0001000iI001lllioOl.I00iiI;
/* 117 */           I0li0o i0li0o = new I0li0o(4);
/* 120 */           i0li0o.I00iiI = oO1I0001000iI001lllioOl;
/* 122 */           VarHandle.storeStoreFence();
/* 127 */           return o1iOIoOiO0.I001i1lo1io(i2, i3, Il011I1OiO0I.I00iOIl, i0li0o);
                }
            }

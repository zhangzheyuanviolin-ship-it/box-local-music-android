            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public final class O1loo1lIlI extends O1ooOo implements IOlIil1, O0iOoioOoI {
                public LinkedHashMap I00o0iI0io1;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 9 */             float f = ((Iil1010O) iiliIooIliOo.I00000oIO(this, IooiioIo.I0000Il00O)).I00iOIl;
/* 14 */            if (f < 0.0f) {
/* 16 */                f = 0.0f;
                    }
/* 17 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(j);
/* 23 */            int i = 1;
/* 41 */            boolean z = this.I00lll10 && !Float.isNaN(f) && Iil1010O.I00000oOI(f, 0.0f) > 0;
/* 53 */            int iI00l0OO0IO = !Float.isNaN(f) ? o1iOIoOiO0.I00l0OO0IO(f) : 0;
/* 54 */            int iMax = oO1I0001000iI001lllioOl.I00iOIl;
/* 56 */            if (z) {
/* 58 */                iMax = Math.max(iMax, iI00l0OO0IO);
                    }
/* 62 */            int iMax2 = oO1I0001000iI001lllioOl.I00iiI;
/* 64 */            if (z) {
/* 66 */                iMax2 = Math.max(iMax2, iI00l0OO0IO);
                    }
/* 70 */            if (z) {
/* 72 */                LinkedHashMap linkedHashMap = this.I00o0iI0io1;
/* 74 */                if (linkedHashMap == null) {
/* 79 */                    linkedHashMap = new LinkedHashMap(2);
/* 82 */                    this.I00o0iI0io1 = linkedHashMap;
                        }
/* 84 */                OooOio0IilO oooOio0IilO = IooiioIo.I00000oOI;
/* 94 */                int iRound = Math.round((iI00l0OO0IO - oO1I0001000iI001lllioOl.I00iOIl) / 2.0f);
/* 98 */                if (iRound < 0) {
/* 100 */                   iRound = 0;
                        }
/* 105 */               linkedHashMap.put(oooOio0IilO, Integer.valueOf(iRound));
/* 108 */               IoI110lO0O ioI110lO0O = IooiioIo.I00000oIO;
/* 115 */               int iRound2 = Math.round((iI00l0OO0IO - oO1I0001000iI001lllioOl.I00iiI) / 2.0f);
/* 127 */               linkedHashMap.put(ioI110lO0O, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
                    }
/* 130 */           Map map = this.I00o0iI0io1;
/* 132 */           if (map == null) {
/* 134 */               map = Il011I1OiO0I.I00iOIl;
                    }
/* 138 */           Ioo1100i ioo1100i = new Ioo1100i(i);
/* 141 */           ioo1100i.I00iiI = iMax;
/* 143 */           ioo1100i.I00iiO = oO1I0001000iI001lllioOl;
/* 145 */           ioo1100i.I00iio = iMax2;
/* 147 */           VarHandle.storeStoreFence();
/* 150 */           return o1iOIoOiO0.I001i1lo1io(iMax, iMax2, map, ioo1100i);
                }
            }

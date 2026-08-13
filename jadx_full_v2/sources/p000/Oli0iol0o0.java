            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class Oli0iol0o0 extends O1ooOo implements O0iOoioOoI {
                public Oli0oiO I00o0iI0io1;

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
/* 3 */             int i = 1;
/* 4 */             Oli100iIoOOO oli100iIoOOOI01101IOlO = Oli0oiO.I01101IOlO(this.I00o0iI0io1, 1);
/* 20 */            float f = oli100iIoOOOI01101IOlO.I001IO000((byte) 8) ? oli100iIoOOOI01101IOlO.I000iOII : 0.0f;
/* 32 */            float f2 = (oli100iIoOOOI01101IOlO.I001IO000((byte) 0) ? oli100iIoOOOI01101IOlO.I0000Il00O : 0.0f) + f;
/* 43 */            float f3 = (oli100iIoOOOI01101IOlO.I001IO000((byte) 1) ? oli100iIoOOOI01101IOlO.I0000O : 0.0f) + f;
/* 55 */            float f4 = (oli100iIoOOOI01101IOlO.I001IO000((byte) 2) ? oli100iIoOOOI01101IOlO.I0000oI00 : 0.0f) + f;
/* 63 */            float f5 = oli100iIoOOOI01101IOlO.I001IO000((byte) 3) ? oli100iIoOOOI01101IOlO.I0001Ioi1lo : 0.0f;
/* 67 */            int iRound = Math.round(f3 + f2);
/* 72 */            int iRound2 = Math.round(f5 + f + f4);
/* 82 */            OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0olo.I000OOo1O(j, -iRound, -iRound2));
/* 89 */            int iI000II = IOo0olo.I000II(oO1I0001000iI001lllioOl.I00iOIl + iRound, j);
/* 96 */            int iI0001Ioi1lo = IOo0olo.I0001Ioi1lo(oO1I0001000iI001lllioOl.I00iiI + iRound2, j);
/* 102 */           II1O0lII iI1O0lII = new II1O0lII(i);
/* 105 */           iI1O0lII.I00iio = oO1I0001000iI001lllioOl;
/* 107 */           iI1O0lII.I00iiI = f2;
/* 109 */           iI1O0lII.I00iiO = f4;
/* 111 */           VarHandle.storeStoreFence();
/* 116 */           return o1iOIoOiO0.I001i1lo1io(iI000II, iI0001Ioi1lo, Il011I1OiO0I.I00iOIl, iI1O0lII);
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                @Override
                public final void I010101Oo1lO() {
/* 7 */             Oli0oiO oli0oiO = (Oli0oiO) lOo1ii0o1.I00000oIO(this, "StyleOuterNode");
/* 9 */             oli0oiO.I00o101lO = this;
/* 11 */            this.I00o0iI0io1 = oli0oiO;
/* 14 */            oli0oiO.I01101olii(true);
                }
            }

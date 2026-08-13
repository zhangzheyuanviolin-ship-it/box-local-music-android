            package p000;
            
            public final class Oo1ll1O implements OO1ll1 {
                public int I00iOIl;
                public long I00iiI;

                @Override
                public final long I00000oIO(IooO1IOlo iooO1IOlo, long j, O0iOOoiioO o0iOOoiioO, long j2) {
/* 13 */            int i = (int) (j2 >> 32);
/* 27 */            int iI0000Il00O = lIiioliIlo.I0000Il00O(((iooO1IOlo.I0000O() - i) / 2) + iooO1IOlo.I00000oIO, 0, Math.max(0, ((int) (this.I00iiI >> 32)) - i));
/* 40 */            int i2 = iooO1IOlo.I00000oOI - ((int) (j2 & 4294967295L));
/* 41 */            int i3 = this.I00iOIl;
/* 43 */            int i4 = i2 - i3;
/* 44 */            if (i4 < 0) {
/* 48 */                i4 = iooO1IOlo.I0000O + i3;
                    }
/* 66 */            return (iI0000Il00O << 32) | (lIiioliIlo.I0000Il00O(i4, 0, Math.max(0, ((int) (r7 & 4294967295L)) - r10)) & 4294967295L);
                }
            }

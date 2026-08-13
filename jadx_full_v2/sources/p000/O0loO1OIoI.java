            package p000;
            
            public final class O0loO1OIoI implements O0lOOii {
                public O0o0I1i0O I00000oIO;

                @Override
                public final int I00000oIO() {
/* 7 */             return this.I00000oIO.I000OiO().I000oI1ioi;
                }

                @Override
                public final int I00000oOI() {
/* 23 */            return Math.min(I00000oIO() - 1, ((O0o0100I) IOOi0Ool1i.I00Io1o110i(this.I00000oIO.I000OiO().I000l1)).I00000oIO);
                }

                @Override
                public final int I0000Il00O() {
                    int i;
/* 1 */             O0o0I1i0O o0o0I1i0O = this.I00000oIO;
/* 13 */            if (o0o0I1i0O.I000OiO().I000l1.isEmpty()) {
/* 15 */                return 0;
                    }
/* 17 */            O0o00O1Oi00 o0o00O1Oi00I000OiO = o0o0I1i0O.I000OiO();
/* 37 */            int iI000OOo1O = (int) (o0o00O1Oi00I000OiO.I00100l0 == OIilII.I00iOIl ? o0o00O1Oi00I000OiO.I000OOo1O() & 4294967295L : o0o00O1Oi00I000OiO.I000OOo1O() >> 32);
/* 51 */            int iI00000oIO = l101lII0l1ol.I00000oIO(o0o0I1i0O.I000OiO());
/* 56 */            if (iI00000oIO != 0 && (i = iI000OOo1O / iI00000oIO) >= 1) {
/* 110 */               return i;
                    }
/* 55 */            return 1;
                }

                @Override
                public final boolean I0000O() {
/* 15 */            return !this.I00000oIO.I000OiO().I000l1.isEmpty();
                }

                @Override
                public final int I0000oI00() {
/* 8 */             return Math.max(0, this.I00000oIO.I000O01llI0());
                }
            }

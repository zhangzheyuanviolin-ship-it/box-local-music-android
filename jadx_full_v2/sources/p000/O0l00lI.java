            package p000;

            import java.util.List;
            
            public final class O0l00lI implements O0lOOii {
                public O0l101IIlOI0 I00000oIO;

                @Override
                public final int I00000oIO() {
/* 7 */             return this.I00000oIO.I000II().I00100o1O0lo;
                }

                @Override
                public final int I00000oOI() {
/* 15 */            return ((O0l0iI) IOOi0Ool1i.I00Io1o110i(this.I00000oIO.I000II().I000o00OoI0I)).I00000oIO;
                }

                @Override
                public final int I0000Il00O() {
                    int i;
/* 1 */             O0l101IIlOI0 o0l101IIlOI0 = this.I00000oIO;
/* 13 */            int i2 = 0;
/* 14 */            if (o0l101IIlOI0.I000II().I000o00OoI0I.isEmpty()) {
/* 13 */                return 0;
                    }
/* 17 */            O0l0i1O o0l0i1OI000II = o0l101IIlOI0.I000II();
/* 21 */            OIilII oIilII = o0l0i1OI000II.I0010I0i;
/* 23 */            OIilII oIilII2 = OIilII.I00iOIl;
/* 39 */            int iI000OOo1O = (int) (oIilII == oIilII2 ? o0l0i1OI000II.I000OOo1O() & 4294967295L : o0l0i1OI000II.I000OOo1O() >> 32);
/* 47 */            O0l0i1O o0l0i1OI000II2 = o0l101IIlOI0.I000II();
/* 51 */            OIilII oIilII3 = o0l0i1OI000II2.I0010I0i;
/* 53 */            List list = o0l0i1OI000II2.I000o00OoI0I;
/* 60 */            boolean z = oIilII3 == oIilII2;
/* 65 */            if (!list.isEmpty()) {
/* 68 */                int i3 = 0;
/* 69 */                int i4 = 0;
/* 70 */                int i5 = 0;
/* 75 */                while (i3 < list.size()) {
/* 81 */                    O0l0iI o0l0iI = (O0l0iI) list.get(i3);
/* 88 */                    int i6 = z ? o0l0iI.I001i1lo1io : o0l0iI.I001iOo1i0O;
/* 91 */                    if (i6 == -1) {
/* 93 */                        i3++;
                            } else {
/* 96 */                        int iMax = 0;
/* 101 */                       while (i3 < list.size()) {
/* 107 */                           O0l0iI o0l0iI2 = (O0l0iI) list.get(i3);
/* 116 */                           if ((z ? o0l0iI2.I001i1lo1io : o0l0iI2.I001iOo1i0O) != i6) {
                                        break;
                                    }
/* 141 */                           iMax = Math.max(iMax, (int) (z ? ((O0l0iI) list.get(i3)).I001IO000 & 4294967295L : ((O0l0iI) list.get(i3)).I001IO000 >> 32));
/* 145 */                           i3++;
                                }
/* 148 */                       i4 += iMax;
/* 149 */                       i5++;
                            }
                        }
/* 155 */               i2 = (i4 / i5) + o0l0i1OI000II2.I00111O;
                    }
/* 157 */           if (i2 != 0 && (i = iI000OOo1O / i2) >= 1) {
/* 245 */               return i;
                    }
/* 55 */            return 1;
                }

                @Override
                public final boolean I0000O() {
/* 15 */            return !this.I00000oIO.I000II().I000o00OoI0I.isEmpty();
                }

                @Override
                public final int I0000oI00() {
/* 7 */             return this.I00000oIO.I0000O.I00000oOI.I000II();
                }
            }

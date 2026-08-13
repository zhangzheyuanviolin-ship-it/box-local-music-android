            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class O0l0IoOl extends I01O1lIi {
                public final O0l0II1 I00iiI;
                public final O0lilI1ioI I00iiO;
                public final int I00iio;
                public final O0lilI1ioI I00ilI0I1;
                public final O0l101IIlOI0 I00ilO0;
                public final int I00io1l;
                public final int I00ioIO;
                public final long I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O0l0IoOl(O0l0II1 o0l0II1, O0lilI1ioI o0lilI1ioI, int i, O0l101IIlOI0 o0l101IIlOI0, int i2, int i3, long j) {
/* 12 */            super(2);
/* 1 */             this.I00ilI0I1 = o0lilI1ioI;
/* 3 */             this.I00ilO0 = o0l101IIlOI0;
/* 5 */             this.I00io1l = i2;
/* 7 */             this.I00ioIO = i3;
/* 9 */             this.I00l0I0l0lO1 = j;
/* 15 */            this.I00iiI = o0l0II1;
/* 17 */            this.I00iiO = o0lilI1ioI;
/* 19 */            this.I00iio = i;
                }

                @Override
                public final O0lilO I00oO101o(int i, int i2, int i3, long j) {
/* 8 */             return I010OIo1l(i, i2, i3, j, this.I00iio);
                }

                public final O0l0iI I010OIo1l(int i, int i2, int i3, long j, int i4) {
                    int iI000iOII;
/* 1 */             O0l0II1 o0l0II1 = this.I00iiI;
/* 3 */             Object objI00000oOI = o0l0II1.I00000oOI(i);
/* 9 */             Object objI00000oIO = o0l0II1.I00000oOI.I00000oIO(i);
/* 15 */            List listI00oli = I00oli(this.I00iiO, i, j);
/* 23 */            if (IOo0oO11ll1O.I000O01llI0(j)) {
/* 25 */                iI000iOII = IOo0oO11ll1O.I000l1(j);
                    } else {
/* 34 */                if (!IOo0oO11ll1O.I000II(j)) {
/* 38 */                    Ioll0IliO1l.I00000oIO("does not have fixed height");
                        }
/* 41 */                iI000iOII = IOo0oO11ll1O.I000iOII(j);
                    }
/* 49 */            O0iOOoiioO layoutDirection = this.I00ilI0I1.I00iiI.getLayoutDirection();
/* 55 */            O0li0o o0li0o = this.I00ilO0.I000lI;
/* 59 */            O0l0iI o0l0iI = new O0l0iI();
/* 62 */            o0l0iI.I00000oIO = i;
/* 64 */            o0l0iI.I00000oOI = objI00000oOI;
/* 66 */            o0l0iI.I0000Il00O = iI000iOII;
/* 68 */            o0l0iI.I0000O = layoutDirection;
/* 72 */            o0l0iI.I0000oI00 = this.I00io1l;
/* 76 */            o0l0iI.I0001Ioi1lo = this.I00ioIO;
/* 78 */            o0l0iI.I000II = listI00oli;
/* 82 */            o0l0iI.I000O01llI0 = this.I00l0I0l0lO1;
/* 84 */            o0l0iI.I000OOo1O = objI00000oIO;
/* 86 */            o0l0iI.I000OiO = o0li0o;
/* 88 */            o0l0iI.I000iOII = j;
/* 90 */            o0l0iI.I000l1 = i2;
/* 92 */            o0l0iI.I000lI = i3;
/* 96 */            o0l0iI.I0010o = Integer.MIN_VALUE;
/* 101 */           int size = listI00oli.size();
/* 107 */           int iMax = 0;
/* 108 */           for (int i5 = 0; i5 < size; i5++) {
/* 118 */               iMax = Math.max(iMax, ((OO1I0001000i) listI00oli.get(i5)).I00iiI);
                    }
/* 125 */           o0l0iI.I000o00OoI0I = iMax;
/* 127 */           o0l0iI.I0010I0i = i4;
/* 129 */           o0l0iI.I00100l0 = iMax;
/* 131 */           o0l0iI.I000oI1ioi = iI000iOII;
/* 133 */           o0l0iI.I00100o1O0lo = 0;
/* 147 */           o0l0iI.I001IO000 = (iI000iOII << 32) | (iMax & 4294967295L);
/* 151 */           o0l0iI.I001i1O0Ol = 0L;
/* 154 */           o0l0iI.I001i1lo1io = -1;
/* 156 */           o0l0iI.I001iOo1i0O = -1;
/* 158 */           VarHandle.storeStoreFence();
/* 399 */           return o0l0iI;
                }
            }

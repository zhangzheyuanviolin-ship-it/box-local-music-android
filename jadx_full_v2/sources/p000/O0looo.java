            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class O0looo extends I01O1lIi {
                public final O0loo1 I00iiI;
                public final O0lilI1ioI I00iiO;
                public final long I00iio;
                public final boolean I00ilI0I1;
                public final O0lilI1ioI I00ilO0;
                public final int I00io1l;
                public final int I00ioIO;
                public final I0iol11I1OI I00l0I0l0lO1;
                public final II0O000iIl I00l0OO0IO;
                public final int I00li1OI;
                public final int I00ll1;
                public final long I00lli11;
                public final O0o0I1i0O I00lll10;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O0looo(long j, boolean z, O0loo1 o0loo1, O0lilI1ioI o0lilI1ioI, int i, int i2, I0iol11I1OI i0iol11I1OI, II0O000iIl iI0O000iIl, int i3, int i4, long j2, O0o0I1i0O o0o0I1i0O) {
/* 22 */            super(2);
/* 1 */             this.I00ilI0I1 = z;
/* 3 */             this.I00ilO0 = o0lilI1ioI;
/* 5 */             this.I00io1l = i;
/* 7 */             this.I00ioIO = i2;
/* 9 */             this.I00l0I0l0lO1 = i0iol11I1OI;
/* 11 */            this.I00l0OO0IO = iI0O000iIl;
/* 13 */            this.I00li1OI = i3;
/* 15 */            this.I00ll1 = i4;
/* 17 */            this.I00lli11 = j2;
/* 19 */            this.I00lll10 = o0o0I1i0O;
/* 25 */            this.I00iiI = o0loo1;
/* 27 */            this.I00iiO = o0lilI1ioI;
/* 52 */            this.I00iio = IOo0olo.I00000oOI(0, z ? IOo0oO11ll1O.I000OiO(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : IOo0oO11ll1O.I000OOo1O(j), 5);
                }

                @Override
                public final O0lilO I00oO101o(int i, int i2, int i3, long j) {
/* 1 */             return I010OIo1l(i, j);
                }

                public final O0o0100I I010OIo1l(int i, long j) {
/* 1 */             O0loo1 o0loo1 = this.I00iiI;
/* 3 */             Object objI00000oOI = o0loo1.I00000oOI(i);
/* 9 */             Object objI00000oIO = o0loo1.I00000oOI.I00000oIO(i);
/* 15 */            List listI00oli = I00oli(this.I00iiO, i, j);
/* 28 */            int i2 = i == this.I00io1l + (-1) ? 0 : this.I00ioIO;
/* 36 */            O0iOOoiioO layoutDirection = this.I00ilO0.I00iiI.getLayoutDirection();
/* 42 */            O0li0o o0li0o = this.I00lll10.I000oI1ioi;
/* 44 */            O0o0100I o0o0100I = new O0o0100I();
/* 47 */            o0o0100I.I00000oIO = i;
/* 49 */            o0o0100I.I00000oOI = listI00oli;
/* 51 */            boolean z = this.I00ilI0I1;
/* 53 */            o0o0100I.I0000Il00O = z;
/* 57 */            o0o0100I.I0000O = this.I00l0I0l0lO1;
/* 61 */            o0o0100I.I0000oI00 = this.I00l0OO0IO;
/* 63 */            o0o0100I.I0001Ioi1lo = layoutDirection;
/* 67 */            o0o0100I.I000II = this.I00li1OI;
/* 71 */            o0o0100I.I000O01llI0 = this.I00ll1;
/* 75 */            o0o0100I.I000OOo1O = this.I00lli11;
/* 77 */            o0o0100I.I000OiO = objI00000oOI;
/* 79 */            o0o0100I.I000iOII = objI00000oIO;
/* 81 */            o0o0100I.I000l1 = o0li0o;
/* 83 */            o0o0100I.I000lI = j;
/* 87 */            o0o0100I.I001IO000 = Integer.MIN_VALUE;
/* 92 */            int size = listI00oli.size();
/* 97 */            int i3 = 0;
/* 98 */            int iMax = 0;
/* 99 */            for (int i4 = 0; i4 < size; i4++) {
/* 105 */               OO1I0001000i oO1I0001000i = (OO1I0001000i) listI00oli.get(i4);
/* 114 */               i3 += z ? oO1I0001000i.I00iiI : oO1I0001000i.I00iOIl;
/* 122 */               iMax = Math.max(iMax, !z ? oO1I0001000i.I00iiI : oO1I0001000i.I00iOIl);
                    }
/* 129 */           o0o0100I.I000oI1ioi = i3;
/* 131 */           o0o0100I.I00111O = iMax;
/* 143 */           o0o0100I.I001iOo1i0O = new int[o0o0100I.I00000oOI.size() * 2];
/* 145 */           if (z) {
/* 147 */               o0o0100I.I0010o = i2;
/* 149 */               o0o0100I.I00100o1O0lo = i3;
/* 151 */               o0o0100I.I00100l0 = iMax;
/* 153 */               o0o0100I.I0010I0i = 0;
                    } else {
/* 159 */               o0o0100I.I0010o = 0;
/* 161 */               o0o0100I.I00100o1O0lo = iMax;
/* 163 */               o0o0100I.I00100l0 = i3;
/* 165 */               o0o0100I.I0010I0i = i2;
                    }
/* 155 */           VarHandle.storeStoreFence();
/* 158 */           return o0o0100I;
                }
            }

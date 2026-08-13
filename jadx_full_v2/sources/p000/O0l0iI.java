            package p000;

            import java.util.List;
            
            public final class O0l0iI implements O0lilO {
                public int I00000oIO;
                public Object I00000oOI;
                public int I0000Il00O;
                public O0iOOoiioO I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public List I000II;
                public long I000O01llI0;
                public Object I000OOo1O;
                public O0li0o I000OiO;
                public long I000iOII;
                public int I000l1;
                public int I000lI;
                public int I000o00OoI0I;
                public int I000oI1ioi;
                public int I00100l0;
                public int I00100o1O0lo;
                public int I0010I0i;
                public int I0010o;
                public int I00111O;
                public int I001IIilI0O;
                public long I001IO000;
                public long I001i1O0Ol;
                public int I001i1lo1io;
                public int I001iOo1i0O;
                public boolean I001l0I00;

                @Override
                public final int I00000oIO() {
/* 1 */             return this.I00100o1O0lo;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return this.I000lI;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             return this.I00100l0;
                }

                @Override
                public final long I0000O() {
/* 1 */             return this.I000iOII;
                }

                @Override
                public final List I0000oI00() {
/* 1 */             return this.I000II;
                }

                @Override
                public final int I0001Ioi1lo() {
/* 1 */             return this.I0010I0i;
                }

                @Override
                public final long I000II(int i) {
/* 1 */             return this.I001i1O0Ol;
                }

                @Override
                public final int I000O01llI0() {
/* 1 */             return this.I000l1;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return this.I000oI1ioi;
                }

                @Override
                public final void I000OiO() {
/* 2 */             this.I001l0I00 = true;
                }

                @Override
                public final void I000iOII(int i, int i2, int i3, int i4) {
/* 8 */             I000o00OoI0I(i, i2, i3, i4, -1, -1);
                }

                public final int I000l1() {
/* 5 */             return this.I00100l0 + this.I0010I0i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I000lI(OO11o0IO oO11o0IO, boolean z) {
/* 5 */             List list = this.I000II;
/* 11 */            if (this.I0010o == Integer.MIN_VALUE) {
/* 16 */                Ioll0IliO1l.I00000oIO("position() should be called first");
                    }
/* 19 */            int size = list.size();
/* 24 */            for (int i = 0; i < size; i++) {
/* 30 */                OO1I0001000i oO1I0001000i = (OO1I0001000i) list.get(i);
/* 36 */                int i2 = this.I00111O - oO1I0001000i.I00iiI;
/* 37 */                int i3 = this.I001IIilI0O;
/* 39 */                long j = this.I001i1O0Ol;
/* 45 */                O0lOll0I0o00 o0lOll0I0o00I00000oIO = this.I000OiO.I00000oIO(i, this.I00000oOI);
/* 49 */                Io10IOI io10IOI = null;
/* 49 */                Object[] objArr = 0;
/* 50 */                if (o0lOll0I0o00I00000oIO != null) {
/* 52 */                    if (z) {
/* 54 */                        o0lOll0I0o00I00000oIO.I000o00OoI0I = j;
                            } else {
/* 84 */                        long jI0000oI00 = IooO0O.I0000oI00(!IooO0O.I0000Il00O(o0lOll0I0o00I00000oIO.I000o00OoI0I, 9223372034707292159L) ? o0lOll0I0o00I00000oIO.I000o00OoI0I : j, ((IooO0O) o0lOll0I0o00I00000oIO.I0010I0i.getValue()).I00000oIO);
/* 94 */                        int i4 = (int) (j & 4294967295L);
/* 97 */                        if (((i4 <= i2 && ((int) (jI0000oI00 & 4294967295L)) <= i2) || (i4 >= i3 && ((int) (jI0000oI00 & 4294967295L)) >= i3)) && ((Boolean) o0lOll0I0o00I00000oIO.I000O01llI0.getValue()).booleanValue()) {
/* 134 */                           iOi1II01i0.I0000O(o0lOll0I0o00I00000oIO.I00000oIO, null, null, new O0lOlIOi(o0lOll0I0o00I00000oIO, objArr == true ? 1 : 0, 1), 3);
                                }
/* 137 */                       j = jI0000oI00;
                            }
/* 138 */                   io10IOI = o0lOll0I0o00I00000oIO.I000oI1ioi;
                        }
/* 142 */               long jI0000oI002 = IooO0O.I0000oI00(j, this.I000O01llI0);
/* 146 */               if (!z && o0lOll0I0o00I00000oIO != null) {
/* 150 */                   o0lOll0I0o00I00000oIO.I000lI = jI0000oI002;
                        }
/* 152 */               if (io10IOI != null) {
/* 154 */                   oO11o0IO.I000II(oO1I0001000i);
/* 164 */                   oO1I0001000i.I00iIO(IooO0O.I0000oI00(jI0000oI002, oO1I0001000i.I00ilI0I1), 0.0f, io10IOI);
                        } else {
/* 168 */                   OO11o0IO.I001IIilI0O(oO11o0IO, oO1I0001000i, jI0000oI002);
                        }
                    }
                }

                public final void I000o00OoI0I(int i, int i2, int i3, int i4, int i5, int i6) {
/* 1 */             this.I0010o = i4;
/* 7 */             if (this.I0000O == O0iOOoiioO.I00iiI) {
/* 12 */                i2 = (i3 - i2) - this.I0000Il00O;
                    }
/* 27 */            this.I001i1O0Ol = (i2 << 32) | (i & 4294967295L);
/* 29 */            this.I001i1lo1io = i5;
/* 31 */            this.I001iOo1i0O = i6;
/* 36 */            this.I00111O = -this.I0000oI00;
/* 41 */            this.I001IIilI0O = i4 + this.I0001Ioi1lo;
                }

                @Override
                public final int getIndex() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final Object getKey() {
/* 1 */             return this.I00000oOI;
                }
            }

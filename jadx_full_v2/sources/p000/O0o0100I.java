            package p000;

            import java.util.List;
            
            public final class O0o0100I implements O0lilO {
                public int I00000oIO;
                public List I00000oOI;
                public boolean I0000Il00O;
                public I0iol11I1OI I0000O;
                public II0O000iIl I0000oI00;
                public O0iOOoiioO I0001Ioi1lo;
                public int I000II;
                public int I000O01llI0;
                public long I000OOo1O;
                public Object I000OiO;
                public Object I000iOII;
                public O0li0o I000l1;
                public long I000lI;
                public int I000o00OoI0I;
                public int I000oI1ioi;
                public int I00100l0;
                public int I00100o1O0lo;
                public int I0010I0i;
                public int I0010o;
                public int I00111O;
                public boolean I001IIilI0O;
                public int I001IO000;
                public int I001i1O0Ol;
                public int I001i1lo1io;
                public int[] I001iOo1i0O;

                @Override
                public final int I00000oIO() {
/* 1 */             return this.I0010I0i;
                }

                @Override
                public final int I00000oOI() {
/* 1 */             return 1;
                }

                @Override
                public final int I0000Il00O() {
/* 1 */             return this.I00100o1O0lo;
                }

                @Override
                public final long I0000O() {
/* 1 */             return this.I000lI;
                }

                @Override
                public final List I0000oI00() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final int I0001Ioi1lo() {
/* 1 */             return this.I0010o;
                }

                @Override
                public final long I000II(int i) {
/* 8 */             if (i == 0 && this.I00000oOI.size() == 0) {
/* 18 */                boolean z = this.I0000Il00O;
/* 20 */                int i2 = this.I000o00OoI0I;
                        return z ? i2 & 4294967295L : i2 << 32;
                    }
/* 30 */            int[] iArr = this.I001iOo1i0O;
/* 32 */            int i3 = i * 2;
/* 44 */            return (iArr[i3 + 1] & 4294967295L) | (iArr[i3] << 32);
                }

                @Override
                public final int I000O01llI0() {
/* 1 */             return 0;
                }

                @Override
                public final int I000OOo1O() {
/* 1 */             return this.I00100l0;
                }

                @Override
                public final void I000OiO() {
/* 2 */             this.I001IIilI0O = true;
                }

                @Override
                public final void I000iOII(int i, int i2, int i3, int i4) {
/* 1 */             I000oI1ioi(i, i3, i4);
                }

                public final int I000l1(long j) {
/* 12 */            return (int) (this.I0000Il00O ? j & 4294967295L : j >> 32);
                }

                public final int I000lI() {
                    int i;
                    int i2;
/* 3 */             if (this.I0000Il00O) {
/* 5 */                 i = this.I00100o1O0lo;
/* 7 */                 i2 = this.I0010o;
                    } else {
/* 11 */                i = this.I00100l0;
/* 13 */                i2 = this.I0010I0i;
                    }
/* 9 */             int i3 = i + i2;
/* 16 */            if (i3 < 0) {
/* 18 */                return 0;
                    }
/* 20 */            return i3;
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I000o00OoI0I(OO11o0IO oO11o0IO, boolean z) {
                    List list;
                    boolean z2;
/* 5 */             List list2 = this.I00000oOI;
/* 7 */             boolean z3 = this.I0000Il00O;
/* 13 */            if (this.I001IO000 == Integer.MIN_VALUE) {
/* 18 */                Ioll0IliO1l.I00000oIO("position() should be called first");
                    }
/* 21 */            int size = list2.size();
/* 25 */            int i = 0;
/* 26 */            while (i < size) {
/* 32 */                OO1I0001000i oO1I0001000i = (OO1I0001000i) list2.get(i);
/* 43 */                int i2 = this.I001i1O0Ol - (z3 ? oO1I0001000i.I00iiI : oO1I0001000i.I00iOIl);
/* 44 */                int i3 = this.I001i1lo1io;
/* 46 */                long jI000II = I000II(i);
/* 54 */                O0lOll0I0o00 o0lOll0I0o00I00000oIO = this.I000l1.I00000oIO(i, this.I000OiO);
/* 58 */                Io10IOI io10IOI = null;
/* 58 */                Object[] objArr = 0;
/* 59 */                if (o0lOll0I0o00I00000oIO != null) {
/* 61 */                    if (z) {
/* 63 */                        o0lOll0I0o00I00000oIO.I000o00OoI0I = jI000II;
/* 65 */                        list = list2;
/* 66 */                        z2 = z3;
                            } else {
/* 71 */                        list = list2;
/* 72 */                        z2 = z3;
/* 83 */                        if (!IooO0O.I0000Il00O(o0lOll0I0o00I00000oIO.I000o00OoI0I, 9223372034707292159L)) {
/* 85 */                            jI000II = o0lOll0I0o00I00000oIO.I000o00OoI0I;
                                }
/* 97 */                        long jI0000oI00 = IooO0O.I0000oI00(jI000II, ((IooO0O) o0lOll0I0o00I00000oIO.I0010I0i.getValue()).I00000oIO);
/* 105 */                       if (((I000l1(jI000II) <= i2 && I000l1(jI0000oI00) <= i2) || (I000l1(jI000II) >= i3 && I000l1(jI0000oI00) >= i3)) && ((Boolean) o0lOll0I0o00I00000oIO.I000O01llI0.getValue()).booleanValue()) {
/* 148 */                           iOi1II01i0.I0000O(o0lOll0I0o00I00000oIO.I00000oIO, null, null, new O0lOlIOi(o0lOll0I0o00I00000oIO, objArr == true ? 1 : 0, 1), 3);
                                }
/* 151 */                       jI000II = jI0000oI00;
                            }
/* 152 */                   io10IOI = o0lOll0I0o00I00000oIO.I000oI1ioi;
                        } else {
/* 155 */                   list = list2;
/* 156 */                   z2 = z3;
                        }
/* 160 */               long jI0000oI002 = IooO0O.I0000oI00(jI000II, this.I000OOo1O);
/* 164 */               if (!z && o0lOll0I0o00I00000oIO != null) {
/* 168 */                   o0lOll0I0o00I00000oIO.I000lI = jI0000oI002;
                        }
/* 171 */               if (z2) {
/* 173 */                   if (io10IOI != null) {
/* 175 */                       oO11o0IO.I000II(oO1I0001000i);
/* 184 */                       oO1I0001000i.I00iIO(IooO0O.I0000oI00(jI0000oI002, oO1I0001000i.I00ilI0I1), 0.0f, io10IOI);
                            } else {
/* 188 */                       OO11o0IO.I001IIilI0O(oO11o0IO, oO1I0001000i, jI0000oI002);
                            }
                        } else if (io10IOI == null) {
/* 261 */                   OO11o0IO.I000oI1ioi(oO11o0IO, oO1I0001000i, jI0000oI002);
                        } else if (oO11o0IO.I0000O() == O0iOOoiioO.I00iOIl || oO11o0IO.I0001Ioi1lo() == 0) {
/* 248 */                   oO11o0IO.I000II(oO1I0001000i);
/* 257 */                   oO1I0001000i.I00iIO(IooO0O.I0000oI00(jI0000oI002, oO1I0001000i.I00ilI0I1), 0.0f, io10IOI);
                        } else {
/* 221 */                   int iI0001Ioi1lo = (oO11o0IO.I0001Ioi1lo() - oO1I0001000i.I00iOIl) - ((int) (jI0000oI002 >> 32));
/* 235 */                   oO11o0IO.I000II(oO1I0001000i);
/* 244 */                   oO1I0001000i.I00iIO(IooO0O.I0000oI00((((int) (jI0000oI002 & 4294967295L)) & 4294967295L) | (iI0001Ioi1lo << 32), oO1I0001000i.I00ilI0I1), 0.0f, io10IOI);
                        }
/* 264 */               i++;
/* 266 */               list2 = list;
/* 267 */               z3 = z2;
                    }
                }

                public final void I000oI1ioi(int i, int i2, int i3) {
                    int i4;
/* 1 */             int[] iArr = this.I001iOo1i0O;
/* 3 */             this.I000o00OoI0I = i;
/* 5 */             boolean z = this.I0000Il00O;
/* 12 */            this.I001IO000 = z ? i3 : i2;
/* 14 */            List list = this.I00000oOI;
/* 19 */            int size = list.size();
/* 24 */            for (int i5 = 0; i5 < size; i5++) {
/* 30 */                OO1I0001000i oO1I0001000i = (OO1I0001000i) list.get(i5);
/* 32 */                int i6 = i5 * 2;
/* 34 */                if (z) {
/* 36 */                    I0iol11I1OI i0iol11I1OI = this.I0000O;
/* 38 */                    if (i0iol11I1OI == null) {
/* 64 */                        throw IlIi0I0.I0000oI00("null horizontalAlignment when isVertical == true");
                            }
/* 48 */                    iArr[i6] = i0iol11I1OI.I00000oIO(oO1I0001000i.I00iOIl, i2, this.I0001Ioi1lo);
/* 52 */                    iArr[i6 + 1] = i;
/* 54 */                    i4 = oO1I0001000i.I00iiI;
                        } else {
/* 65 */                    iArr[i6] = i;
/* 67 */                    int i7 = i6 + 1;
/* 69 */                    II0O000iIl iI0O000iIl = this.I0000oI00;
/* 71 */                    if (iI0O000iIl == null) {
/* 93 */                        throw IlIi0I0.I0000oI00("null verticalAlignment when isVertical == false");
                            }
/* 79 */                    iArr[i7] = iI0O000iIl.I00000oIO(oO1I0001000i.I00iiI, i3);
/* 81 */                    i4 = oO1I0001000i.I00iOIl;
                        }
/* 56 */                i += i4;
                    }
/* 97 */            this.I001i1O0Ol = -this.I000II;
/* 104 */           this.I001i1lo1io = this.I001IO000 + this.I000O01llI0;
                }

                @Override
                public final int getIndex() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public final Object getKey() {
/* 1 */             return this.I000OiO;
                }
            }

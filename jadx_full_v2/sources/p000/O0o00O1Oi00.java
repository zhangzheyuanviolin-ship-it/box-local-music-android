            package p000;

            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class O0o00O1Oi00 implements O1iOIo0o0 {
                public final O0o0100I I00000oIO;
                public final int I00000oOI;
                public final boolean I0000Il00O;
                public final float I0000O;
                public final O1iOIo0o0 I0000oI00;
                public final float I0001Ioi1lo;
                public final boolean I000II;
                public final Ii0110 I000O01llI0;
                public final IiIooOOOI I000OOo1O;
                public final long I000OiO;
                public final int I000iOII;
                public final List I000l1;
                public final int I000lI;
                public final int I000o00OoI0I;
                public final int I000oI1ioi;
                public final OIilII I00100l0;
                public final int I00100o1O0lo;
                public final int I0010I0i;

                public O0o00O1Oi00(O0o0100I o0o0100I, int i, boolean z, float f, O1iOIo0o0 o1iOIo0o0, float f2, boolean z2, Ii0110 ii0110, IiIooOOOI iiIooOOOI, long j, int i2, List list, int i3, int i4, int i5, OIilII oIilII, int i6, int i7) {
/* 4 */             this.I00000oIO = o0o0100I;
/* 6 */             this.I00000oOI = i;
/* 8 */             this.I0000Il00O = z;
/* 10 */            this.I0000O = f;
/* 12 */            this.I0000oI00 = o1iOIo0o0;
/* 14 */            this.I0001Ioi1lo = f2;
/* 16 */            this.I000II = z2;
/* 18 */            this.I000O01llI0 = ii0110;
/* 20 */            this.I000OOo1O = iiIooOOOI;
/* 22 */            this.I000OiO = j;
/* 24 */            this.I000iOII = i2;
/* 26 */            this.I000l1 = list;
/* 28 */            this.I000lI = i3;
/* 30 */            this.I000o00OoI0I = i4;
/* 34 */            this.I000oI1ioi = i5;
/* 38 */            this.I00100l0 = oIilII;
/* 42 */            this.I00100o1O0lo = i6;
/* 46 */            this.I0010I0i = i7;
                }

                @Override
                public final void I00000oIO() {
/* 3 */             this.I0000oI00.I00000oIO();
                }

                @Override
                public final Map I00000oOI() {
/* 3 */             return this.I0000oI00.I00000oOI();
                }

                @Override
                public final Function1 I0000Il00O() {
/* 3 */             return this.I0000oI00.I0000Il00O();
                }

                @Override
                public final int I0000O() {
/* 3 */             return this.I0000oI00.I0000O();
                }

                @Override
                public final IlliIl1l11O I0000oI00() {
/* 3 */             return this.I0000oI00.I0000oI00();
                }

                @Override
                public final int I0001Ioi1lo() {
/* 3 */             return this.I0000oI00.I0001Ioi1lo();
                }

                @Override
                public final Function1 I000II() {
/* 3 */             return this.I0000oI00.I000II();
                }

                public final O0o00O1Oi00 I000O01llI0(int i, boolean z) {
                    O0o0100I o0o0100I;
                    int i2;
                    int i3;
                    int i4;
/* 7 */             if (this.I000II) {
/* 286 */               return null;
                    }
/* 9 */             List list = this.I000l1;
/* 15 */            if (list.isEmpty() || (o0o0100I = this.I00000oIO) == null) {
/* 286 */               return null;
                    }
/* 21 */            int iI000lI = o0o0100I.I000lI();
/* 27 */            int i5 = this.I00000oOI - i;
/* 29 */            if (i5 < 0 || i5 >= iI000lI) {
/* 286 */               return null;
                    }
/* 37 */            O0o0100I o0o0100I2 = (O0o0100I) IOOi0Ool1i.I001lllioOl(list);
/* 43 */            O0o0100I o0o0100I3 = (O0o0100I) IOOi0Ool1i.I00Io1o110i(list);
/* 47 */            if (o0o0100I2.I001IIilI0O || o0o0100I3.I001IIilI0O) {
/* 286 */               return null;
                    }
/* 55 */            int i6 = o0o0100I2.I000o00OoI0I;
/* 57 */            int i7 = this.I000o00OoI0I;
/* 59 */            int i8 = this.I000lI;
/* 61 */            if (i < 0) {
/* 82 */                if (Math.min((o0o0100I2.I000lI() + i6) - i8, (o0o0100I3.I000lI() + o0o0100I3.I000o00OoI0I) - i7) <= (-i)) {
/* 286 */                   return null;
                        }
                    } else if (Math.min(i8 - i6, i7 - o0o0100I3.I000o00OoI0I) <= i) {
/* 286 */               return null;
                    }
/* 98 */            int size = list.size();
/* 102 */           int i9 = 0;
/* 103 */           while (i9 < size) {
/* 109 */               O0o0100I o0o0100I4 = (O0o0100I) list.get(i9);
/* 111 */               boolean z2 = o0o0100I4.I0000Il00O;
/* 113 */               int[] iArr = o0o0100I4.I001iOo1i0O;
/* 117 */               if (!o0o0100I4.I001IIilI0O) {
                            o0o0100I4.I000o00OoI0I += i;
/* 127 */                   int length = iArr.length;
/* 129 */                   for (int i10 = 0; i10 < length; i10++) {
/* 131 */                       int i11 = i10 & 1;
/* 133 */                       if ((z2 && i11 != 0) || (!z2 && i11 == 0)) {
/* 144 */                           iArr[i10] = iArr[i10] + i;
                                }
                            }
/* 149 */                   if (z) {
/* 153 */                       int size2 = o0o0100I4.I00000oOI.size();
/* 157 */                       int i12 = 0;
/* 158 */                       while (i12 < size2) {
/* 164 */                           O0lOll0I0o00 o0lOll0I0o00I00000oIO = o0o0100I4.I000l1.I00000oIO(i12, o0o0100I4.I000OiO);
/* 168 */                           if (o0lOll0I0o00I00000oIO != null) {
/* 170 */                               long j = o0lOll0I0o00I00000oIO.I000l1;
/* 179 */                               if (z2) {
/* 181 */                                   i2 = i5;
/* 185 */                                   i3 = (int) (j >> 32);
/* 188 */                                   i4 = ((int) (j & 4294967295L)) + i;
                                        } else {
/* 196 */                                   i2 = i5;
/* 201 */                                   i3 = ((int) (j >> 32)) + i;
/* 203 */                                   i4 = (int) (j & 4294967295L);
                                        }
/* 205 */                               o0lOll0I0o00I00000oIO.I000l1 = (i4 & 4294967295L) | (i3 << 32);
                                    } else {
/* 208 */                               i2 = i5;
                                    }
/* 210 */                           i12++;
/* 212 */                           i5 = i2;
                                }
                            }
                        }
/* 215 */               i9++;
/* 217 */               i5 = i5;
                    }
/* 282 */           return new O0o00O1Oi00(this.I00000oIO, i5, this.I0000Il00O || i > 0, i, this.I0000oI00, this.I0001Ioi1lo, this.I000II, this.I000O01llI0, this.I000OOo1O, this.I000OiO, this.I000iOII, list, this.I000lI, this.I000o00OoI0I, this.I000oI1ioi, this.I00100l0, this.I00100o1O0lo, this.I0010I0i);
                }

                public final long I000OOo1O() {
/* 1 */             O1iOIo0o0 o1iOIo0o0 = this.I0000oI00;
/* 22 */            return (o1iOIo0o0.I0001Ioi1lo() << 32) | (o1iOIo0o0.I0000O() & 4294967295L);
                }
            }

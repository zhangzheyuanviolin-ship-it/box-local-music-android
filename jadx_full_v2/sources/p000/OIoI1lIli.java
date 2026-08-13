            package p000;

            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
/* 21 */    public final class OIoI1lIli implements O1iOIo0o0 {
                public final List I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;
                public final OIilII I0000oI00;
                public final int I0001Ioi1lo;
                public final int I000II;
                public final int I000O01llI0;
                public final O1iOii1 I000OOo1O;
                public final O1iOii1 I000OiO;
                public final float I000iOII;
                public final int I000l1;
                public final boolean I000lI;
                public final IOO0o0I1l I000o00OoI0I;
                public final O1iOIo0o0 I000oI1ioi;
                public final boolean I00100l0;
                public final List I00100o1O0lo;
                public final List I0010I0i;
                public final Ii0110 I0010o;
                public final IiIooOOOI I00111O;
                public final long I001IIilI0O;

                public OIoI1lIli(List list, int i, int i2, int i3, OIilII oIilII, int i4, int i5, int i6, O1iOii1 o1iOii1, O1iOii1 o1iOii12, float f, int i7, boolean z, IOO0o0I1l iOO0o0I1l, O1iOIo0o0 o1iOIo0o0, boolean z2, List list2, List list3, Ii0110 ii0110, IiIooOOOI iiIooOOOI, long j) {
/* 2 */             this.I00000oIO = list;
/* 3 */             this.I00000oOI = i;
/* 4 */             this.I0000Il00O = i2;
/* 5 */             this.I0000O = i3;
/* 6 */             this.I0000oI00 = oIilII;
/* 7 */             this.I0001Ioi1lo = i4;
/* 8 */             this.I000II = i5;
/* 9 */             this.I000O01llI0 = i6;
/* 10 */            this.I000OOo1O = o1iOii1;
/* 11 */            this.I000OiO = o1iOii12;
/* 12 */            this.I000iOII = f;
/* 13 */            this.I000l1 = i7;
/* 14 */            this.I000lI = z;
/* 15 */            this.I000o00OoI0I = iOO0o0I1l;
/* 16 */            this.I000oI1ioi = o1iOIo0o0;
/* 17 */            this.I00100l0 = z2;
/* 18 */            this.I00100o1O0lo = list2;
/* 19 */            this.I0010I0i = list3;
/* 20 */            this.I0010o = ii0110;
/* 21 */            this.I00111O = iiIooOOOI;
/* 22 */            this.I001IIilI0O = j;
                }

                @Override
                public final void I00000oIO() {
/* 3 */             this.I000oI1ioi.I00000oIO();
                }

                @Override
                public final Map I00000oOI() {
/* 3 */             return this.I000oI1ioi.I00000oOI();
                }

                @Override
                public final Function1 I0000Il00O() {
/* 3 */             return this.I000oI1ioi.I0000Il00O();
                }

                @Override
                public final int I0000O() {
/* 3 */             return this.I000oI1ioi.I0000O();
                }

                @Override
                public final IlliIl1l11O I0000oI00() {
/* 3 */             return this.I000oI1ioi.I0000oI00();
                }

                @Override
                public final int I0001Ioi1lo() {
/* 3 */             return this.I000oI1ioi.I0001Ioi1lo();
                }

                @Override
                public final Function1 I000II() {
/* 3 */             return this.I000oI1ioi.I000II();
                }

                public final OIoI1lIli I000O01llI0(int i) {
                    int i2;
/* 9 */             int i3 = this.I00000oOI + this.I0000Il00O;
/* 12 */            if (this.I00100l0) {
/* 252 */               return null;
                    }
/* 14 */            List list = this.I00000oIO;
/* 20 */            if (list.isEmpty() || this.I000OOo1O == null || (i2 = this.I000l1 - i) < 0 || i2 >= i3) {
/* 252 */               return null;
                    }
/* 42 */            float f = this.I000iOII - (i3 != 0 ? i / i3 : 0.0f);
/* 46 */            if (this.I000OiO == null || f >= 0.5f || f <= -0.5f) {
/* 252 */               return null;
                    }
/* 66 */            O1iOii1 o1iOii1 = (O1iOii1) IOOi0Ool1i.I001lllioOl(list);
/* 72 */            O1iOii1 o1iOii12 = (O1iOii1) IOOi0Ool1i.I00Io1o110i(list);
/* 74 */            int i4 = this.I000II;
/* 76 */            int i5 = this.I0001Ioi1lo;
/* 78 */            if (i < 0) {
/* 93 */                if (Math.min((o1iOii1.I000OiO + i3) - i5, (o1iOii12.I000OiO + i3) - i4) <= (-i)) {
/* 252 */                   return null;
                        }
                    } else if (Math.min(i5 - o1iOii1.I000OiO, i4 - o1iOii12.I000OiO) <= i) {
/* 252 */               return null;
                    }
/* 111 */           int size = list.size();
/* 117 */           for (int i6 = 0; i6 < size; i6++) {
/* 125 */               ((O1iOii1) list.get(i6)).I00000oIO(i);
                    }
/* 131 */           List list2 = this.I00100o1O0lo;
/* 136 */           int size2 = list2.size();
/* 141 */           for (int i7 = 0; i7 < size2; i7++) {
/* 149 */               ((O1iOii1) list2.get(i7)).I00000oIO(i);
                    }
/* 155 */           List list3 = this.I0010I0i;
/* 160 */           int size3 = list3.size();
/* 165 */           for (int i8 = 0; i8 < size3; i8++) {
/* 173 */               ((O1iOii1) list3.get(i8)).I00000oIO(i);
                    }
/* 248 */           return new OIoI1lIli(this.I00000oIO, this.I00000oOI, this.I0000Il00O, this.I0000O, this.I0000oI00, this.I0001Ioi1lo, this.I000II, this.I000O01llI0, this.I000OOo1O, this.I000OiO, f, i2, this.I000lI || i > 0, this.I000o00OoI0I, this.I000oI1ioi, this.I00100l0, this.I00100o1O0lo, this.I0010I0i, this.I0010o, this.I00111O, this.I001IIilI0O);
                }

                public final long I000OOo1O() {
/* 1 */             O1iOIo0o0 o1iOIo0o0 = this.I000oI1ioi;
/* 22 */            return (o1iOIo0o0.I0001Ioi1lo() << 32) | (o1iOIo0o0.I0000O() & 4294967295L);
                }

                /* JADX WARN: Illegal instructions before constructor call */
/* 22 */        public OIoI1lIli(int i, int i2, int i3, int i4, int i5, int i6, IOO0o0I1l iOO0o0I1l, O1iOIo0o0 o1iOIo0o0, Ii0110 ii0110, IiIooOOOI iiIooOOOI, long j) {
                    OIilII oIilII = OIilII.I00iiI;
/* 23 */            Il01100l il01100l = Il01100l.I00iOIl;
                    this(il01100l, i, i2, i3, oIilII, i4, i5, i6, null, null, 0.0f, 0, false, iOO0o0I1l, o1iOIo0o0, false, il01100l, il01100l, ii0110, iiIooOOOI, j);
                }
            }

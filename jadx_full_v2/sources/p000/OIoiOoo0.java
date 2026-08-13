            package p000;
            
            public final class OIoiOoo0 {
                public String I00000oIO;
                public Oo0lloOiiIOI I00000oOI;
                public IliO0o11i01 I0000Il00O;
                public int I0000O;
                public boolean I0000oI00;
                public int I0001Ioi1lo;
                public int I000II;
                public long I000O01llI0;
                public IiIooOOOI I000OOo1O;
                public I0oilIol11i I000OiO;
                public boolean I000iOII;
                public long I000l1;
                public O1loOiII I000lI;
                public OIoiOo11o I000o00OoI0I;
                public O0iOOoiioO I000oI1ioi;
                public long I00100l0;
                public int I00100o1O0lo;
                public int I0010I0i;
                public long I0010o;

                public OIoiOoo0(String str, Oo0lloOiiIOI oo0lloOiiIOI, IliO0o11i01 iliO0o11i01, int i, boolean z, int i2, int i3) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = oo0lloOiiIOI;
/* 8 */             this.I0000Il00O = iliO0o11i01;
/* 10 */            this.I0000O = i;
/* 12 */            this.I0000oI00 = z;
/* 14 */            this.I0001Ioi1lo = i2;
/* 16 */            this.I000II = i3;
/* 18 */            int i4 = IollO00Ilo.I00000oOI;
/* 22 */            this.I000O01llI0 = IollO00Ilo.I00000oIO;
/* 26 */            this.I000l1 = 0L;
/* 30 */            if (!(true & true)) {
/* 34 */                Ioliol1Ii.I00000oIO("width and height must be >= 0");
                    }
/* 42 */            this.I00100l0 = IOo0olo.I000O01llI0(0, 0, 0, 0);
/* 45 */            this.I00100o1O0lo = -1;
/* 47 */            this.I0010I0i = -1;
                }

                public final int I00000oIO(int i, O0iOOoiioO o0iOOoiioO) {
/* 1 */             int i2 = this.I00100o1O0lo;
/* 3 */             int i3 = this.I0010I0i;
/* 5 */             if (i == i2 && i2 != -1) {
/* 10 */                return i3;
                    }
/* 15 */            long jI00000oIO = IOo0olo.I00000oIO(0, i, 0, Integer.MAX_VALUE);
/* 21 */            int i4 = 1;
/* 22 */            if (this.I000II > 1) {
/* 32 */                O1loOiII o1loOiIII00000oIO = l1Oioll0oIi1.I00000oIO(this.I000lI, o0iOOoiioO, this.I00000oOI, this.I000OOo1O, this.I0000Il00O);
/* 36 */                this.I000lI = o1loOiIII00000oIO;
/* 40 */                jI00000oIO = o1loOiIII00000oIO.I00000oIO(this.I000II, jI00000oIO);
                    }
/* 44 */            OIoiOo11o oIoiOo11oI0000oI00 = I0000oI00(o0iOOoiioO);
/* 56 */            long jI00000oIO2 = l0o1O1I1.I00000oIO(jI00000oIO, this.I0000oI00, this.I0000O, oIoiOo11oI0000oI00.I000l1());
/* 60 */            boolean z = this.I0000oI00;
/* 62 */            int i5 = this.I0000O;
/* 64 */            int i6 = this.I0001Ioi1lo;
/* 66 */            if ((z || (i5 != 2 && i5 != 4 && i5 != 5)) && i6 >= 1) {
/* 83 */                i4 = i6;
                    }
/* 90 */            int iI00000oIO = lOiooi0lII0.I00000oIO(l1oI100ii.I00000oIO(oIoiOo11oI0000oI00, jI00000oIO2, i4, i5).I0000oI00);
/* 94 */            int iI000iOII = IOo0oO11ll1O.I000iOII(jI00000oIO);
/* 98 */            if (iI00000oIO < iI000iOII) {
/* 100 */               iI00000oIO = iI000iOII;
                    }
/* 101 */           this.I00100o1O0lo = i;
/* 103 */           this.I0010I0i = iI00000oIO;
/* 106 */           return iI00000oIO;
                }

                public final boolean I00000oOI(long j, O0iOOoiioO o0iOOoiioO) {
                    OIoiOo11o oIoiOo11o;
/* 8 */             this.I0010o = (this.I0010o << 2) | 3;
/* 12 */            boolean z = true;
/* 13 */            if (this.I000II > 1) {
/* 23 */                O1loOiII o1loOiIII00000oIO = l1Oioll0oIi1.I00000oIO(this.I000lI, o0iOOoiioO, this.I00000oOI, this.I000OOo1O, this.I0000Il00O);
/* 27 */                this.I000lI = o1loOiIII00000oIO;
/* 31 */                j = o1loOiIII00000oIO.I00000oIO(this.I000II, j);
                    }
/* 35 */            I0oilIol11i i0oilIol11i = this.I000OiO;
/* 38 */            boolean z2 = false;
/* 46 */            if (i0oilIol11i != null && (oIoiOo11o = this.I000o00OoI0I) != null && !oIoiOo11o.I0000O() && o0iOOoiioO == this.I000oI1ioi && (IOo0oO11ll1O.I0000O(j, this.I00100l0) || (IOo0oO11ll1O.I000OiO(j) == IOo0oO11ll1O.I000OiO(this.I00100l0) && IOo0oO11ll1O.I000l1(j) == IOo0oO11ll1O.I000l1(this.I00100l0) && IOo0oO11ll1O.I000OOo1O(j) >= i0oilIol11i.I0000oI00 && !i0oilIol11i.I0000Il00O.I0000O))) {
/* 130 */               if (!IOo0oO11ll1O.I0000O(j, this.I00100l0)) {
/* 132 */                   I0oilIol11i i0oilIol11i2 = this.I000OiO;
/* 169 */                   this.I000l1 = IOo0olo.I0000O(j, (lOiooi0lII0.I00000oIO(Math.min(i0oilIol11i2.I00000oIO.I00l0OO0IO.I00000oOI(), i0oilIol11i2.I0000oI00())) << 32) | (lOiooi0lII0.I00000oIO(i0oilIol11i2.I0000oI00) & 4294967295L));
/* 173 */                   if (this.I0000O == 3 || (((int) (r8 >> 32)) >= i0oilIol11i2.I0000oI00() && ((int) (r8 & 4294967295L)) >= i0oilIol11i2.I0000oI00)) {
/* 199 */                       z = false;
                            }
/* 200 */                   this.I000iOII = z;
/* 202 */                   this.I00100l0 = j;
                        }
/* 38 */                return false;
                    }
/* 205 */           OIoiOo11o oIoiOo11oI0000oI00 = I0000oI00(o0iOOoiioO);
/* 217 */           long jI00000oIO = l0o1O1I1.I00000oIO(j, this.I0000oI00, this.I0000O, oIoiOo11oI0000oI00.I000l1());
/* 221 */           boolean z3 = this.I0000oI00;
/* 223 */           int i = this.I0000O;
/* 225 */           int i2 = this.I0001Ioi1lo;
/* 227 */           if ((!z3 && (i == 2 || i == 4 || i == 5)) || i2 < 1) {
/* 239 */               i2 = 1;
                    }
/* 244 */           I0oilIol11i i0oilIol11iI00000oIO = l1oI100ii.I00000oIO(oIoiOo11oI0000oI00, jI00000oIO, i2, i);
/* 248 */           this.I00100l0 = j;
/* 273 */           this.I000l1 = IOo0olo.I0000O(j, (lOiooi0lII0.I00000oIO(i0oilIol11iI00000oIO.I0000oI00()) << 32) | (lOiooi0lII0.I00000oIO(i0oilIol11iI00000oIO.I0000oI00) & 4294967295L));
/* 277 */           if (this.I0000O != 3 && (((int) (r13 >> 32)) < i0oilIol11iI00000oIO.I0000oI00() || ((int) (r13 & 4294967295L)) < i0oilIol11iI00000oIO.I0000oI00)) {
/* 301 */               z2 = true;
                    }
/* 302 */           this.I000iOII = z2;
/* 304 */           this.I000OiO = i0oilIol11iI00000oIO;
/* 12 */            return true;
                }

                public final void I0000Il00O() {
/* 2 */             this.I000OiO = null;
/* 4 */             this.I000o00OoI0I = null;
/* 6 */             this.I000oI1ioi = null;
/* 9 */             this.I00100o1O0lo = -1;
/* 11 */            this.I0010I0i = -1;
/* 18 */            this.I00100l0 = IOo0olo.I000O01llI0(0, 0, 0, 0);
/* 22 */            this.I000l1 = 0L;
/* 24 */            this.I000iOII = false;
                }

                public final void I0000O(IiIooOOOI iiIooOOOI) {
                    long jI00000oIO;
/* 1 */             IiIooOOOI iiIooOOOI2 = this.I000OOo1O;
/* 3 */             if (iiIooOOOI != null) {
/* 5 */                 int i = IollO00Ilo.I00000oOI;
/* 15 */                jI00000oIO = IollO00Ilo.I00000oIO(iiIooOOOI.I00000oIO(), iiIooOOOI.I00Ol00());
                    } else {
/* 20 */                jI00000oIO = IollO00Ilo.I00000oIO;
                    }
/* 22 */            if (iiIooOOOI2 == null) {
/* 24 */                this.I000OOo1O = iiIooOOOI;
/* 26 */                this.I000O01llI0 = jI00000oIO;
                    } else if (iiIooOOOI == null || this.I000O01llI0 != jI00000oIO) {
/* 38 */                this.I000OOo1O = iiIooOOOI;
/* 40 */                this.I000O01llI0 = jI00000oIO;
/* 49 */                this.I0010o = (this.I0010o << 2) | 1;
/* 51 */                I0000Il00O();
                    }
                }

                public final OIoiOo11o I0000oI00(O0iOOoiioO o0iOOoiioO) {
/* 1 */             OIoiOo11o oIoiOo11oI00000oIO = this.I000o00OoI0I;
/* 3 */             if (oIoiOo11oI00000oIO == null || o0iOOoiioO != this.I000oI1ioi || oIoiOo11oI00000oIO.I0000O()) {
/* 15 */                this.I000oI1ioi = o0iOOoiioO;
/* 17 */                String str = this.I00000oIO;
/* 21 */                Oo0lloOiiIOI oo0lloOiiIOII00000oIO = lOlilIi0I.I00000oIO(this.I00000oOI, o0iOOoiioO);
/* 25 */                IiIooOOOI iiIooOOOI = this.I000OOo1O;
/* 27 */                IliO0o11i01 iliO0o11i01 = this.I0000Il00O;
/* 29 */                boolean z = this.I0000oI00;
/* 31 */                Il01100l il01100l = Il01100l.I00iOIl;
/* 34 */                oIoiOo11oI00000oIO = l1o1o11OIIOo.I00000oIO(str, oo0lloOiiIOII00000oIO, il01100l, iiIooOOOI, iliO0o11i01, il01100l, z);
                    }
/* 38 */            this.I000o00OoI0I = oIoiOo11oI00000oIO;
/* 77 */            return oIoiOo11oI00000oIO;
                }

                public final String toString() {
/* 30 */            return IlIi0I0.I000o00OoI0I(IIl001iO0Io.I00111O("ParagraphLayoutCache(paragraph=", this.I000OiO != null ? "<paragraph>" : "null", ", lastDensity=", IollO00Ilo.I00000oOI(this.I000O01llI0), ", history="), this.I0010o, ", constraints=$)");
                }
            }

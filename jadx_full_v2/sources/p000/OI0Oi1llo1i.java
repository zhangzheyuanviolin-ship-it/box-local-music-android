            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class OI0Oi1llo1i {
                public I1111OO10i I00000oIO;
                public IliO0o11i01 I00000oOI;
                public int I0000Il00O;
                public boolean I0000O;
                public int I0000oI00;
                public int I0001Ioi1lo;
                public List I000II;
                public I1ili1lI0O I000O01llI0;
                public O1loOiII I000OOo1O;
                public long I000OiO;
                public IiIooOOOI I000iOII;
                public Oo0lloOiiIOI I000l1;
                public I1ii1o0 I000lI;
                public O0iOOoiioO I000o00OoI0I;
                public Oo0iil0o0oI I000oI1ioi;
                public int I00100l0;
                public int I00100o1O0lo;
                public OI0OOIl I0010I0i;
                public long I0010o;

                public OI0Oi1llo1i(I1111OO10i i1111OO10i, Oo0lloOiiIOI oo0lloOiiIOI, IliO0o11i01 iliO0o11i01, int i, boolean z, int i2, int i3, List list, I1ili1lI0O i1ili1lI0O) {
/* 4 */             this.I00000oIO = i1111OO10i;
/* 6 */             this.I00000oOI = iliO0o11i01;
/* 8 */             this.I0000Il00O = i;
/* 10 */            this.I0000O = z;
/* 12 */            this.I0000oI00 = i2;
/* 14 */            this.I0001Ioi1lo = i3;
/* 16 */            this.I000II = list;
/* 18 */            this.I000O01llI0 = i1ili1lI0O;
/* 20 */            int i4 = IollO00Ilo.I00000oOI;
/* 24 */            this.I000OiO = IollO00Ilo.I00000oIO;
/* 26 */            this.I000l1 = oo0lloOiiIOI;
/* 29 */            this.I00100l0 = -1;
/* 31 */            this.I00100o1O0lo = -1;
                }

                public final int I00000oIO(int i, O0iOOoiioO o0iOOoiioO) {
/* 1 */             int i2 = this.I00100l0;
/* 3 */             int i3 = this.I00100o1O0lo;
/* 5 */             if (i == i2 && i2 != -1) {
/* 10 */                return i3;
                    }
/* 15 */            long jI00000oIO = IOo0olo.I00000oIO(0, i, 0, Integer.MAX_VALUE);
/* 22 */            if (this.I0001Ioi1lo > 1) {
/* 24 */                jI00000oIO = I000O01llI0(jI00000oIO, o0iOOoiioO);
                    }
/* 34 */            int iI00000oIO = lOiooi0lII0.I00000oIO(I00000oOI(jI00000oIO, o0iOOoiioO).I0000oI00);
/* 38 */            int iI000iOII = IOo0oO11ll1O.I000iOII(jI00000oIO);
/* 42 */            if (iI00000oIO < iI000iOII) {
/* 44 */                iI00000oIO = iI000iOII;
                    }
/* 45 */            this.I00100l0 = i;
/* 47 */            this.I00100o1O0lo = iI00000oIO;
/* 106 */           return iI00000oIO;
                }

                public final OI0OIIiOi I00000oOI(long j, O0iOOoiioO o0iOOoiioO) {
/* 1 */             I1ii1o0 i1ii1o0I0000oI00 = I0000oI00(o0iOOoiioO);
/* 15 */            long jI00000oIO = l0o1O1I1.I00000oIO(j, this.I0000O, this.I0000Il00O, i1ii1o0I0000oI00.I000l1());
/* 19 */            boolean z = this.I0000O;
/* 21 */            int i = this.I0000Il00O;
/* 23 */            int i2 = this.I0000oI00;
/* 45 */            return new OI0OIIiOi(i1ii1o0I0000oI00, jI00000oIO, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
                }

                public final boolean I0000Il00O(long j, O0iOOoiioO o0iOOoiioO) {
/* 14 */            this.I0010o = (this.I0010o << 2) | 3;
/* 26 */            long jI000O01llI0 = this.I0001Ioi1lo > 1 ? I000O01llI0(j, o0iOOoiioO) : j;
/* 27 */            Oo0iil0o0oI oo0iil0o0oI = this.I000oI1ioi;
/* 29 */            if (oo0iil0o0oI != null) {
/* 32 */                OI0OIIiOi oI0OIIiOi = oo0iil0o0oI.I00000oOI;
/* 34 */                Oo0iiO1 oo0iiO1 = oo0iil0o0oI.I00000oIO;
/* 42 */                if (!oI0OIIiOi.I00000oIO.I0000O()) {
/* 45 */                    O0iOOoiioO o0iOOoiioO2 = oo0iiO1.I000O01llI0;
/* 47 */                    long j2 = oo0iiO1.I000OiO;
/* 49 */                    if (o0iOOoiioO == o0iOOoiioO2 && (IOo0oO11ll1O.I0000O(jI000O01llI0, j2) || (IOo0oO11ll1O.I000OiO(jI000O01llI0) == IOo0oO11ll1O.I000OiO(j2) && IOo0oO11ll1O.I000l1(jI000O01llI0) == IOo0oO11ll1O.I000l1(j2) && IOo0oO11ll1O.I000OOo1O(jI000O01llI0) >= oI0OIIiOi.I0000oI00 && !oI0OIIiOi.I0000Il00O))) {
/* 107 */                       if (IOo0oO11ll1O.I0000O(jI000O01llI0, this.I000oI1ioi.I00000oIO.I000OiO)) {
/* 109 */                           return false;
                                }
/* 119 */                       this.I000oI1ioi = I000II(o0iOOoiioO, jI000O01llI0, this.I000oI1ioi.I00000oOI);
/* 18 */                        return true;
                            }
                        }
                    }
/* 122 */           I1ili1lI0O i1ili1lI0O = this.I000O01llI0;
/* 124 */           if (i1ili1lI0O != null) {
/* 126 */               this.I000o00OoI0I = o0iOOoiioO;
/* 132 */               long j3 = this.I000l1.I00000oIO.I00000oOI;
/* 134 */               OI0OOIl oI0OOIl = this.I0010I0i;
/* 136 */               if (oI0OOIl == null) {
/* 140 */                   oI0OOIl = new OI0OOIl();
/* 143 */                   oI0OOIl.I00iiI = this;
/* 145 */                   VarHandle.storeStoreFence();
/* 148 */                   this.I0010I0i = oI0OOIl;
                        }
/* 152 */               float fI00oO101o = oI0OOIl.I00oO101o(i1ili1lI0O.I0000Il00O);
/* 158 */               float fI00oO101o2 = oI0OOIl.I00oO101o(i1ili1lI0O.I00000oIO);
/* 164 */               float fI00oO101o3 = oI0OOIl.I00oO101o(i1ili1lI0O.I00000oOI);
/* 170 */               float f = 2.0f;
/* 172 */               float f2 = (fI00oO101o2 + fI00oO101o3) / 2.0f;
/* 173 */               float f3 = fI00oO101o3;
/* 174 */               float f4 = fI00oO101o2;
/* 180 */               while (f3 - f4 >= fI00oO101o) {
/* 182 */                   float f5 = f;
/* 184 */                   float f6 = f3;
/* 198 */                   if (I1ili1lI0O.I00000oIO(oI0OOIl.I00000oOI(j, oI0OOIl.I00Io1o110i(f2)))) {
/* 200 */                       f3 = f2;
                            } else {
/* 202 */                       f4 = f2;
/* 204 */                       f3 = f6;
                            }
/* 208 */                   f2 = (f4 + f3) / f5;
/* 210 */                   f = f5;
                        }
/* 224 */               float fFloor = (((float) Math.floor((f4 - fI00oO101o2) / fI00oO101o)) * fI00oO101o) + fI00oO101o2;
/* 225 */               float f7 = fI00oO101o + fFloor;
/* 228 */               if (f7 <= fI00oO101o3 && !I1ili1lI0O.I00000oIO(oI0OOIl.I00000oOI(j, oI0OOIl.I00Io1o110i(f7)))) {
/* 244 */                   fFloor = f7;
                        }
/* 245 */               long jI00Io1o110i = oI0OOIl.I00Io1o110i(fFloor);
/* 253 */               if (Oo0o1OiIo.I0000oI00(jI00Io1o110i)) {
/* 255 */                   jI00Io1o110i = OI0OiIl.I00000oIO(j3, jI00Io1o110i);
                        }
/* 259 */               long j4 = jI00Io1o110i;
/* 260 */               OI0OOIl oI0OOIl2 = this.I0010I0i;
/* 262 */               if (oI0OOIl2 == null) {
/* 266 */                   oI0OOIl2 = new OI0OOIl();
/* 269 */                   oI0OOIl2.I00iiI = this;
/* 271 */                   VarHandle.storeStoreFence();
/* 274 */                   this.I0010I0i = oI0OOIl2;
                        }
/* 276 */               Oo0iil0o0oI oo0iil0o0oI2 = oI0OOIl2.I00iOIl;
/* 278 */               if (oo0iil0o0oI2 != null) {
/* 280 */                   Oo0iiO1 oo0iiO12 = oo0iil0o0oI2.I00000oIO;
/* 292 */                   if (Oo0o1OiIo.I00000oOI(j4, oo0iiO12.I00000oOI.I00000oIO.I00000oOI) && oo0iiO12.I0001Ioi1lo == this.I0000Il00O) {
/* 300 */                       this.I000oI1ioi = oo0iil0o0oI2;
/* 18 */                        return true;
                            }
                        }
/* 322 */               I0001Ioi1lo(Oo0lloOiiIOI.I00000oOI(this.I000l1, 0L, j4, null, null, 0L, 0L, null, 16777213));
                    }
/* 333 */           this.I000oI1ioi = I000II(o0iOOoiioO, jI000O01llI0, I00000oOI(jI000O01llI0, o0iOOoiioO));
/* 18 */            return true;
                }

                public final void I0000O(IiIooOOOI iiIooOOOI) {
                    long jI00000oIO;
/* 1 */             IiIooOOOI iiIooOOOI2 = this.I000iOII;
/* 3 */             if (iiIooOOOI != null) {
/* 5 */                 int i = IollO00Ilo.I00000oOI;
/* 15 */                jI00000oIO = IollO00Ilo.I00000oIO(iiIooOOOI.I00000oIO(), iiIooOOOI.I00Ol00());
                    } else {
/* 20 */                jI00000oIO = IollO00Ilo.I00000oIO;
                    }
/* 22 */            if (iiIooOOOI2 == null) {
/* 24 */                this.I000iOII = iiIooOOOI;
/* 26 */                this.I000OiO = jI00000oIO;
/* 28 */                return;
                    }
/* 29 */            if (iiIooOOOI == null || this.I000OiO != jI00000oIO) {
/* 38 */                this.I000iOII = iiIooOOOI;
/* 40 */                this.I000OiO = jI00000oIO;
/* 49 */                this.I0010o = (this.I0010o << 2) | 1;
/* 52 */                this.I000lI = null;
/* 54 */                this.I000oI1ioi = null;
/* 57 */                this.I00100o1O0lo = -1;
/* 59 */                this.I00100l0 = -1;
/* 61 */                this.I0010I0i = null;
                    }
                }

                public final I1ii1o0 I0000oI00(O0iOOoiioO o0iOOoiioO) {
/* 1 */             I1ii1o0 i1ii1o0 = this.I000lI;
/* 3 */             if (i1ii1o0 == null || o0iOOoiioO != this.I000o00OoI0I || i1ii1o0.I0000O()) {
/* 15 */                this.I000o00OoI0I = o0iOOoiioO;
/* 17 */                I1111OO10i i1111OO10i = this.I00000oIO;
/* 21 */                Oo0lloOiiIOI oo0lloOiiIOII00000oIO = lOlilIi0I.I00000oIO(this.I000l1, o0iOOoiioO);
/* 25 */                IiIooOOOI iiIooOOOI = this.I000iOII;
/* 27 */                IliO0o11i01 iliO0o11i01 = this.I00000oOI;
/* 29 */                List list = this.I000II;
/* 31 */                if (list == null) {
/* 33 */                    list = Il01100l.I00iOIl;
                        }
/* 40 */                i1ii1o0 = new I1ii1o0(i1111OO10i, iiIooOOOI, iliO0o11i01, oo0lloOiiIOII00000oIO, list, this.I0000O);
                    }
/* 44 */            this.I000lI = i1ii1o0;
/* 77 */            return i1ii1o0;
                }

                public final void I0001Ioi1lo(Oo0lloOiiIOI oo0lloOiiIOI) {
/* 3 */             boolean zI0000oI00 = oo0lloOiiIOI.I0000oI00(this.I000l1);
/* 7 */             this.I000l1 = oo0lloOiiIOI;
/* 9 */             if (zI0000oI00) {
/* 29 */                return;
                    }
                    this.I0010o <<= 2;
/* 18 */            this.I000lI = null;
/* 20 */            this.I000oI1ioi = null;
/* 23 */            this.I00100o1O0lo = -1;
/* 25 */            this.I00100l0 = -1;
                }

                public final Oo0iil0o0oI I000II(O0iOOoiioO o0iOOoiioO, long j, OI0OIIiOi oI0OIIiOi) {
/* 13 */            float fMin = Math.min(oI0OIIiOi.I00000oIO.I000l1(), oI0OIIiOi.I0000O);
/* 21 */            I1111OO10i i1111OO10i = this.I00000oIO;
/* 23 */            Oo0lloOiiIOI oo0lloOiiIOI = this.I000l1;
/* 25 */            List list = this.I000II;
/* 27 */            if (list == null) {
/* 29 */                list = Il01100l.I00iOIl;
                    }
/* 74 */            return new Oo0iil0o0oI(new Oo0iiO1(i1111OO10i, oo0lloOiiIOI, list, this.I0000oI00, this.I0000O, this.I0000Il00O, this.I000iOII, o0iOOoiioO, this.I00000oOI, j), oI0OIIiOi, IOo0olo.I0000O(j, (lOiooi0lII0.I00000oIO(fMin) << 32) | (lOiooi0lII0.I00000oIO(oI0OIIiOi.I0000oI00) & 4294967295L)));
                }

                public final long I000O01llI0(long j, O0iOOoiioO o0iOOoiioO) {
/* 9 */             O1loOiII o1loOiIII00000oIO = l1Oioll0oIi1.I00000oIO(this.I000OOo1O, o0iOOoiioO, this.I000l1, this.I000iOII, this.I00000oOI);
/* 13 */            this.I000OOo1O = o1loOiIII00000oIO;
/* 17 */            return o1loOiIII00000oIO.I00000oIO(this.I0001Ioi1lo, j);
                }

                public final String toString() {
                    Oo0iiO1 oo0iiO1;
/* 3 */             Object objI00000oIO = "null";
/* 7 */             String str = this.I000oI1ioi != null ? "<TextLayoutResult>" : "null";
/* 13 */            String strI00000oOI = IollO00Ilo.I00000oOI(this.I000OiO);
/* 17 */            long j = this.I0010o;
/* 19 */            Oo0iil0o0oI oo0iil0o0oI = this.I000oI1ioi;
/* 21 */            if (oo0iil0o0oI != null && (oo0iiO1 = oo0iil0o0oI.I00000oIO) != null) {
/* 29 */                objI00000oIO = IOo0oO11ll1O.I00000oIO(oo0iiO1.I000OiO);
                    }
/* 39 */            StringBuilder sbI00111O = IIl001iO0Io.I00111O("MultiParagraphLayoutCache(textLayoutResult=", str, ", lastDensity=", strI00000oOI, ", history=");
/* 43 */            sbI00111O.append(j);
/* 48 */            sbI00111O.append(", constraints=");
/* 51 */            sbI00111O.append(objI00000oIO);
/* 56 */            sbI00111O.append(")");
/* 59 */            return sbI00111O.toString();
                }
            }

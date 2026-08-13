            package p000;

            import android.view.KeyEvent;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            
            public final class IOOoIo0 extends I00oo1iO0ll {
                public IllOOo00lI I010i10l;
                public boolean I010iIIOlo;
                public OI0lli1 I010ioo;
                public OI0lli1 I010l10O;
                public OO1il00lI I010l1O;
                public OlIl0i I010l1ol111;
                public OlIl0i I010lI0oi;
                public boolean I010o0o0oO;
                public boolean I010oio1OO0;
                public long I01101IOlO;
                public boolean I01101olii;
                public Iol1O1 I0110OiO;
                public OlIl0i I0110o;
                public OlIl0i I0111i;
                public boolean I011IO1I11OI;
                public boolean I011IOil;
                public long I011Ill;
                public boolean I011Io0I1ioi;

                @Override
                public final void I0010o(I00Ol00 i00Ol00, OO1i0l oO1i0l) {
/* 3 */             ArrayList arrayList = (ArrayList) i00Ol00.I0000Il00O;
/* 5 */             I011IOil();
/* 10 */            if (this.I00oOio10iI1 && this.I00oliIiO01i == null) {
/* 18 */                Io01I1Olo0 io01I1Olo0 = new Io01I1Olo0();
/* 21 */                io01I1Olo0.I00o0iI0io1 = this;
/* 23 */                VarHandle.storeStoreFence();
/* 26 */                I010l1O(io01I1Olo0);
/* 29 */                this.I00oliIiO01i = io01I1Olo0;
                    }
/* 33 */            int i = 1;
/* 34 */            int i2 = 0;
/* 35 */            if (oO1i0l != OO1i0l.I00iiI) {
/* 321 */               if (oO1i0l != OO1i0l.I00iiO || this.I0110OiO == null || this.I011IOil) {
/* 900 */                   return;
                        }
/* 331 */               int size = arrayList.size();
/* 335 */               while (i2 < size) {
/* 341 */                   Iol1O1 iol1O1 = (Iol1O1) arrayList.get(i2);
/* 345 */                   if (iol1O1.I000OOo1O && iol1O1 != this.I0110OiO) {
/* 351 */                       I011iiii0i(true);
/* 354 */                       return;
                            }
/* 355 */                   i2++;
                        }
/* 900 */               return;
                    }
/* 39 */            if (this.I0110OiO == null) {
/* 41 */                int size2 = arrayList.size();
/* 46 */                for (int i3 = 0; i3 < size2; i3++) {
/* 58 */                    if (ioi000.I00000oIO((Iol1O1) arrayList.get(i3))) {
/* 64 */                        Iol1O1 iol1O12 = (Iol1O1) arrayList.get(0);
/* 66 */                        iol1O12.I000OOo1O = true;
/* 68 */                        this.I0110OiO = iol1O12;
/* 72 */                        if (this.I00oOio10iI1) {
/* 74 */                            OlIl0i olIl0i = this.I0111i;
/* 76 */                            IOoil1iiIilo iOoil1iiIilo = null;
/* 77 */                            if (olIl0i != null && olIl0i.I0000Il00O()) {
/* 93 */                                ((Oooii1o1) iiliIooIliOo.I00000oIO(this, IOlO0o100i1i.I00111O)).getClass();
/* 105 */                               if (iol1O12.I00000oOI - this.I011Ill < 40) {
/* 107 */                                   this.I011Io0I1ioi = true;
/* 109 */                                   return;
                                        }
/* 110 */                               this.I011IO1I11OI = true;
/* 112 */                               OlIl0i olIl0i2 = this.I0111i;
/* 114 */                               if (olIl0i2 != null) {
/* 116 */                                   olIl0i2.I000II(null);
                                        }
/* 119 */                               this.I0111i = null;
                                    }
/* 121 */                           this.I011IOil = false;
/* 123 */                           I0111i(iol1O12);
/* 128 */                           if (this.I010i10l != null) {
/* 144 */                               this.I0110o = iOi1II01i0.I0000O(I00ooiO1I(), null, null, new IOOoIiIl(this, iOoil1iiIilo, i), 3);
/* 146 */                               return;
                                    }
/* 900 */                           return;
                                }
/* 900 */                       return;
                            }
                        }
/* 900 */               return;
                    }
/* 152 */           if (this.I011IOil) {
/* 154 */               int size3 = arrayList.size();
/* 159 */               for (int i4 = 0; i4 < size3; i4++) {
/* 165 */                   Iol1O1 iol1O13 = (Iol1O1) arrayList.get(i4);
/* 169 */                   if (!iol1O13.I000O01llI0 || iol1O13.I0000O) {
/* 178 */                       int size4 = arrayList.size();
/* 182 */                       while (i2 < size4) {
/* 190 */                           ((Iol1O1) arrayList.get(i2)).I000OOo1O = true;
/* 192 */                           i2++;
                                }
/* 900 */                       return;
                            }
                        }
/* 199 */               Iol1O1 iol1O14 = (Iol1O1) arrayList.get(0);
/* 201 */               iol1O14.I000OOo1O = true;
/* 207 */               I011lIilI0lo(iol1O14.I00000oOI, this.I0110OiO);
/* 210 */               return;
                    }
/* 211 */           int size5 = arrayList.size();
/* 216 */           for (int i5 = 0; i5 < size5; i5++) {
/* 222 */               Iol1O1 iol1O15 = (Iol1O1) arrayList.get(i5);
/* 226 */               if (iol1O15.I000OOo1O || !iol1O15.I000O01llI0 || iol1O15.I0000O) {
/* 247 */                   float fI0001Ioi1lo = ((Oooii1o1) iiliIooIliOo.I00000oIO(this, IOlO0o100i1i.I00111O)).I0001Ioi1lo();
/* 251 */                   int size6 = arrayList.size();
/* 256 */                   for (int i6 = 0; i6 < size6; i6++) {
/* 262 */                       Iol1O1 iol1O16 = (Iol1O1) arrayList.get(i6);
/* 288 */                       boolean z = Math.abs(OIOlIiiioi.I0000oI00(OIOlIiiioi.I0001Ioi1lo(iol1O16.I0000Il00O, this.I0110OiO.I0000Il00O))) > fI0001Ioi1lo;
/* 291 */                       if (iol1O16.I000OOo1O || z) {
/* 299 */                           I011iiii0i(true);
/* 302 */                           return;
                                }
                            }
/* 900 */                   return;
                        }
                    }
/* 307 */           Iol1O1 iol1O17 = (Iol1O1) arrayList.get(0);
/* 309 */           iol1O17.I000OOo1O = true;
/* 315 */           I011lIilI0lo(iol1O17.I00000oOI, this.I0110OiO);
                }

                @Override
                public final void I001l0I00(OO1Oooio101 oO1Oooio101, OO1i0l oO1i0l, long j) {
/* 1 */             super.I001l0I00(oO1Oooio101, oO1i0l, j);
/* 6 */             int i = 0;
/* 7 */             if (oO1i0l != OO1i0l.I00iiI) {
/* 320 */               if (oO1i0l != OO1i0l.I00iiO || this.I010l1O == null || this.I010oio1OO0) {
/* 408 */                   return;
                        }
/* 330 */               List list = oO1Oooio101.I00000oIO;
/* 335 */               int size = list.size();
/* 340 */               for (int i2 = 0; i2 < size; i2++) {
/* 346 */                   OO1il00lI oO1il00lI = (OO1il00lI) list.get(i2);
/* 352 */                   if (oO1il00lI.I0000Il00O() && oO1il00lI != this.I010l1O) {
/* 358 */                       I011iiii0i(false);
/* 361 */                       return;
                            }
                        }
/* 408 */               return;
                    }
/* 11 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 13 */            if (this.I010l1O == null) {
/* 19 */                if (OloI0l1i1oO.I0001Ioi1lo(oO1Oooio101, true, false)) {
/* 27 */                    OO1il00lI oO1il00lI2 = (OO1il00lI) oO1Oooio101.I00000oIO.get(0);
/* 29 */                    oO1il00lI2.I00000oIO();
/* 32 */                    this.I010l1O = oO1il00lI2;
/* 36 */                    if (this.I00oOio10iI1) {
/* 38 */                        OlIl0i olIl0i = this.I010lI0oi;
/* 40 */                        if (olIl0i != null && olIl0i.I0000Il00O()) {
/* 56 */                            ((Oooii1o1) iiliIooIliOo.I00000oIO(this, IOlO0o100i1i.I00111O)).getClass();
/* 68 */                            if (oO1il00lI2.I00000oOI - this.I01101IOlO < 40) {
/* 70 */                                this.I01101olii = true;
/* 72 */                                return;
                                    }
/* 73 */                            this.I010o0o0oO = true;
/* 75 */                            OlIl0i olIl0i2 = this.I010lI0oi;
/* 77 */                            if (olIl0i2 != null) {
/* 79 */                                olIl0i2.I000II(null);
                                    }
/* 82 */                            this.I010lI0oi = null;
                                }
/* 84 */                        this.I010oio1OO0 = false;
/* 86 */                        I011IO1I11OI(oO1il00lI2);
/* 91 */                        if (this.I010i10l != null) {
/* 107 */                           this.I010l1ol111 = iOi1II01i0.I0000O(I00ooiO1I(), null, null, new IOOoIiIl(this, iOoil1iiIilo, i), 3);
/* 109 */                           return;
                                }
/* 408 */                       return;
                            }
/* 408 */                   return;
                        }
/* 408 */               return;
                    }
/* 117 */           boolean z = oO1Oooio101.I0000Il00O == 2;
/* 118 */           List list2 = oO1Oooio101.I00000oIO;
/* 120 */           if (z && !this.I010oio1OO0 && this.I00oOio10iI1 && this.I010i10l != null) {
/* 134 */               OlIl0i olIl0i3 = this.I010l1ol111;
/* 136 */               if (olIl0i3 != null) {
/* 138 */                   olIl0i3.I000II(null);
                        }
/* 141 */               this.I010l1ol111 = null;
/* 143 */               IllOOo00lI illOOo00lI = this.I010i10l;
/* 145 */               if (illOOo00lI != null) {
/* 147 */                   illOOo00lI.invoke();
                        }
/* 152 */               if (this.I010iIIOlo) {
/* 164 */                   ((OO1IIll00O) ((Io1I0l) iiliIooIliOo.I00000oIO(this, IOlO0o100i1i.I000l1))).I00000oIO(0);
                        }
/* 167 */               this.I010oio1OO0 = true;
                    }
/* 171 */           if (this.I010oio1OO0) {
/* 176 */               int size2 = list2.size();
/* 181 */               for (int i3 = 0; i3 < size2; i3++) {
/* 193 */                   if (!lI1Ol11OOlll.I0000O((OO1il00lI) list2.get(i3))) {
/* 198 */                       int size3 = list2.size();
/* 202 */                       while (i < size3) {
/* 210 */                           ((OO1il00lI) list2.get(i)).I00000oIO();
/* 213 */                           i++;
                                }
/* 408 */                       return;
                            }
                        }
/* 223 */               OO1il00lI oO1il00lI3 = (OO1il00lI) list2.get(0);
/* 225 */               oO1il00lI3.I00000oIO();
/* 232 */               I011lO1liO1O(oO1il00lI3.I00000oOI, this.I010l1O);
/* 235 */               return;
                    }
/* 239 */           int size4 = list2.size();
/* 244 */           for (int i4 = 0; i4 < size4; i4++) {
/* 256 */               if (!lI1Ol11OOlll.I0000Il00O((OO1il00lI) list2.get(i4))) {
/* 258 */                   long jI01101olii = I01101olii(j);
/* 265 */                   int size5 = list2.size();
/* 270 */                   for (int i5 = 0; i5 < size5; i5++) {
/* 276 */                       OO1il00lI oO1il00lI4 = (OO1il00lI) list2.get(i5);
/* 282 */                       if (oO1il00lI4.I0000Il00O() || lI1Ol11OOlll.I0000oI00(oO1il00lI4, j, jI01101olii)) {
/* 294 */                           I011iiii0i(false);
/* 297 */                           return;
                                }
                            }
/* 408 */                   return;
                        }
                    }
/* 305 */           OO1il00lI oO1il00lI5 = (OO1il00lI) list2.get(0);
/* 307 */           oO1il00lI5.I00000oIO();
/* 314 */           I011lO1liO1O(oO1il00lI5.I00000oOI, this.I010l1O);
                }

                @Override
                public final void I00IO1oi11O() {
                    IoI1l00l ioI1l00l;
/* 1 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00o101lO;
/* 3 */             if (oI0lOIiOIOOo != null && (ioI1l00l = this.I00oooO) != null) {
/* 14 */                oI0lOIiOIOOo.I00000oOI(new IoI1lIo00o0i(ioI1l00l));
                    }
/* 18 */            this.I00oooO = null;
/* 21 */            I011iiii0i(false);
                }

                @Override
                public final void I00iIi0i1o() {
/* 2 */             I011iiii0i(true);
                }

                @Override
                public final void I010II() {
/* 1 */             I011lOIoo0l();
                }

                @Override
                public final void I010o0o0oO(Oil0O0I oil0O0I) {
/* 3 */             if (this.I010i10l != null) {
/* 9 */                 I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(22);
/* 12 */                i0OIOO00l0O.I00iiI = this;
/* 14 */                VarHandle.storeStoreFence();
/* 17 */                O0O00I1Ili[] o0O00I1IliArr = Oil0Io.I00000oIO;
/* 27 */                oil0O0I.I00000oOI(Oiioi1IoIIli.I0000Il00O, new I01lOOlO0o(null, i0OIOO00l0O));
                    }
                }

                @Override
                public final void I011Ill() {
/* 1 */             I011lOIoo0l();
                }

                @Override
                public final boolean I011Io0I1ioi(KeyEvent keyEvent) {
                    boolean z;
/* 1 */             OI0lli1 oI0lli1 = this.I010ioo;
/* 3 */             OI0lli1 oI0lli12 = this.I010l10O;
/* 5 */             long jI00000oIO = l0iloO.I00000oIO(keyEvent);
/* 11 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 12 */            if (this.I010i10l == null || oI0lli1.I0000oI00(jI00000oIO) != null) {
/* 40 */                z = false;
                    } else {
/* 35 */                oI0lli1.I000OOo1O(jI00000oIO, iOi1II01i0.I0000O(I00ooiO1I(), null, null, new IOOoIiIl(this, iOoil1iiIilo, 2), 3));
/* 38 */                z = true;
                    }
/* 77 */            return z;
                }

                @Override
                public final void I011Ol0(KeyEvent keyEvent) {
/* 1 */             long jI00000oIO = l0iloO.I00000oIO(keyEvent);
/* 5 */             OI0lli1 oI0lli1 = this.I010ioo;
/* 11 */            boolean z = false;
/* 12 */            if (oI0lli1.I0000oI00(jI00000oIO) != null) {
/* 18 */                O010OIi o010OIi = (O010OIi) oI0lli1.I0000oI00(jI00000oIO);
/* 20 */                if (o010OIi != null) {
/* 26 */                    if (o010OIi.I0000Il00O()) {
/* 29 */                        o010OIi.I000II(null);
                            } else {
/* 33 */                        z = true;
                            }
                        }
/* 34 */                oI0lli1.I000II(jI00000oIO);
                    }
/* 37 */            if (z) {
/* 77 */                return;
                    }
/* 39 */            I011iIOio();
                }

                public final void I011iiii0i(boolean z) {
/* 5 */             if (z) {
/* 7 */                 this.I0110OiO = null;
/* 9 */                 OlIl0i olIl0i = this.I0110o;
/* 11 */                if (olIl0i != null) {
/* 13 */                    olIl0i.I000II(null);
                        }
/* 16 */                this.I0110o = null;
/* 18 */                OlIl0i olIl0i2 = this.I0111i;
/* 20 */                if (olIl0i2 != null) {
/* 22 */                    olIl0i2.I000II(null);
                        }
/* 25 */                this.I0111i = null;
/* 27 */                this.I011IO1I11OI = false;
/* 29 */                this.I011IOil = false;
/* 31 */                this.I011Ill = -1L;
/* 33 */                this.I011Io0I1ioi = false;
                    } else {
/* 36 */                this.I010l1O = null;
/* 38 */                OlIl0i olIl0i3 = this.I010l1ol111;
/* 40 */                if (olIl0i3 != null) {
/* 42 */                    olIl0i3.I000II(null);
                        }
/* 45 */                this.I010l1ol111 = null;
/* 47 */                OlIl0i olIl0i4 = this.I010lI0oi;
/* 49 */                if (olIl0i4 != null) {
/* 51 */                    olIl0i4.I000II(null);
                        }
/* 54 */                this.I010lI0oi = null;
/* 56 */                this.I010o0o0oO = false;
/* 58 */                this.I010oio1OO0 = false;
/* 60 */                this.I01101IOlO = -1L;
/* 62 */                this.I01101olii = false;
                    }
/* 64 */            I0110OiO(z);
                }

                public final void I011lIilI0lo(long j, Iol1O1 iol1O1) {
/* 3 */             if (this.I00oOio10iI1 && !this.I011Io0I1ioi) {
/* 12 */                I0110o(iol1O1.I0000Il00O, true);
/* 15 */                this.I011Ill = j;
/* 19 */                if (!this.I011IOil && !this.I011IO1I11OI) {
/* 26 */                    I011iIOio();
                        }
                    }
/* 30 */            this.I0110OiO = null;
/* 33 */            this.I011Io0I1ioi = false;
/* 35 */            this.I011IO1I11OI = false;
/* 37 */            OlIl0i olIl0i = this.I0110o;
/* 39 */            if (olIl0i != null) {
/* 41 */                olIl0i.I000II(null);
                    }
/* 44 */            this.I0110o = null;
/* 46 */            this.I011IOil = false;
                }

                public final void I011lO1liO1O(long j, OO1il00lI oO1il00lI) {
/* 4 */             if (this.I00oOio10iI1 && !this.I01101olii) {
/* 12 */                I0110o(oO1il00lI.I0000Il00O, false);
/* 15 */                this.I01101IOlO = j;
/* 19 */                if (!this.I010oio1OO0 && !this.I010o0o0oO) {
/* 26 */                    I011iIOio();
                        }
                    }
/* 30 */            this.I010l1O = null;
/* 32 */            this.I01101olii = false;
/* 34 */            this.I010o0o0oO = false;
/* 36 */            OlIl0i olIl0i = this.I010l1ol111;
/* 38 */            if (olIl0i != null) {
/* 40 */                olIl0i.I000II(null);
                    }
/* 43 */            this.I010l1ol111 = null;
/* 45 */            this.I010oio1OO0 = false;
                }

                /* JADX WARN: Removed duplicated region for block: B:34:0x009d  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I011lOIoo0l() {
                    char c;
                    long j;
                    long j2;
                    char c2;
/* 3 */             OI0lli1 oI0lli1 = this.I010ioo;
/* 5 */             Object[] objArr = oI0lli1.I0000Il00O;
/* 7 */             long[] jArr = oI0lli1.I00000oIO;
                    int length = jArr.length - 2;
/* 13 */            char c3 = 7;
/* 22 */            if (length >= 0) {
/* 24 */                int i = 0;
/* 25 */                j = 128;
                        while (true) {
/* 27 */                    long j3 = jArr[i];
/* 29 */                    j2 = 255;
/* 37 */                    if ((((~j3) << c3) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 44 */                        int i2 = 8 - ((~(i - length)) >>> 31);
/* 46 */                        int i3 = 0;
/* 47 */                        while (i3 < i2) {
/* 53 */                            if ((j3 & 255) < 128) {
/* 61 */                                c2 = c3;
/* 67 */                                ((O010OIi) objArr[(i << 3) + i3]).I000II(null);
                                    } else {
/* 71 */                                c2 = c3;
                                    }
/* 73 */                            j3 >>= 8;
/* 74 */                            i3++;
/* 76 */                            c3 = c2;
                                }
/* 79 */                        c = c3;
/* 81 */                        if (i2 != 8) {
                                    break;
                                }
                            } else {
/* 84 */                        c = c3;
                            }
/* 86 */                    if (i == length) {
                                break;
                            }
/* 88 */                    i++;
/* 90 */                    c3 = c;
                        }
                    } else {
/* 93 */                c = 7;
/* 95 */                j = 128;
/* 97 */                j2 = 255;
                    }
/* 99 */            oI0lli1.I00000oIO();
/* 102 */           OI0lli1 oI0lli12 = this.I010l10O;
/* 104 */           Object[] objArr2 = oI0lli12.I0000Il00O;
/* 106 */           long[] jArr2 = oI0lli12.I00000oIO;
                    int length2 = jArr2.length - 2;
/* 111 */           if (length2 >= 0) {
/* 113 */               int i4 = 0;
                        while (true) {
/* 114 */                   long j4 = jArr2[i4];
/* 123 */                   if ((((~j4) << c) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 130 */                       int i5 = 8 - ((~(i4 - length2)) >>> 31);
/* 133 */                       for (int i6 = 0; i6 < i5; i6++) {
/* 139 */                           if ((j4 & j2) < j) {
/* 152 */                               ((IOOoIIo0oll0) objArr2[(i4 << 3) + i6]).getClass();
/* 155 */                               throw null;
                                    }
/* 141 */                           j4 >>= 8;
                                }
/* 156 */                       if (i5 != 8) {
                                    break;
                                } else if (i4 == length2) {
                                    break;
                                } else {
/* 160 */                           i4++;
                                }
                            }
                        }
                    }
/* 163 */           oI0lli12.I00000oIO();
                }
            }

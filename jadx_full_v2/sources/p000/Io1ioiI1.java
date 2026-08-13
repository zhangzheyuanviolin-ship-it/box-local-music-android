            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class Io1ioiI1 {
                public O0iOOo0Ii I00000oIO;
                public boolean I00000oOI;
                public boolean I0000Il00O;
                public boolean I0000O;
                public boolean I0000oI00;
                public OI0oiiIO0 I0001Ioi1lo;
                public OIIlloOIoOo I000II;
                public OI0lli1 I000O01llI0;

                public final void I00000oIO(long j, List list, boolean z) {
                    long[] jArr;
                    long[] jArr2;
                    int i;
                    Object obj;
/* 7 */             OI0lli1 oI0lli1 = this.I000O01llI0;
/* 9 */             OIIlloOIoOo oIIlloOIoOo = this.I000II;
/* 14 */            int size = list.size();
/* 19 */            OIIlloOIoOo oIIlloOIoOo2 = oIIlloOIoOo;
/* 20 */            boolean z2 = true;
/* 22 */            for (int i2 = 0; i2 < size; i2++) {
/* 28 */                O1ooOo o1ooOo = (O1ooOo) list.get(i2);
/* 32 */                if (o1ooOo.I00lll10) {
/* 38 */                    IO1Io1IOOOIi iO1Io1IOOOIi = new IO1Io1IOOOIi(18);
/* 41 */                    iO1Io1IOOOIi.I00iiI = this;
/* 43 */                    iO1Io1IOOOIi.I00iiO = o1ooOo;
/* 45 */                    VarHandle.storeStoreFence();
/* 48 */                    o1ooOo.I00lli11 = iO1Io1IOOOIi;
/* 50 */                    if (z2) {
/* 52 */                        OI110O0 oi110o0 = oIIlloOIoOo2.I00000oIO;
/* 54 */                        Object[] objArr = oi110o0.I00iOIl;
/* 56 */                        int i3 = oi110o0.I00iiO;
/* 58 */                        int i4 = 0;
                                while (true) {
/* 59 */                            if (i4 >= i3) {
/* 79 */                                obj = null;
                                        break;
                                    }
/* 61 */                            obj = objArr[i4];
/* 73 */                            if (O0000Ioio00.I0000O(((OIIl1OOi1) obj).I0000Il00O, o1ooOo)) {
                                        break;
                                    } else {
/* 76 */                                i4++;
                                    }
                                }
/* 83 */                        OIIl1OOi1 oIIl1OOi1 = (OIIl1OOi1) obj;
/* 85 */                        if (oIIl1OOi1 != null) {
/* 87 */                            oIIl1OOi1.I000OOo1O = true;
/* 91 */                            oIIl1OOi1.I0000O.I00000oIO(j);
/* 94 */                            if (z) {
/* 96 */                                Object objI0000oI00 = oI0lli1.I0000oI00(j);
/* 100 */                               if (objI0000oI00 == null) {
/* 104 */                                   objI0000oI00 = new OI0oiiIO0();
/* 107 */                                   oI0lli1.I000OOo1O(j, objI0000oI00);
                                        }
/* 112 */                               ((OI0oiiIO0) objI0000oI00).I00000oOI(oIIl1OOi1);
                                    }
/* 115 */                           oIIlloOIoOo2 = oIIl1OOi1;
                                } else {
/* 118 */                           z2 = false;
                                }
                            }
/* 121 */                   OIIl1OOi1 oIIl1OOi12 = new OIIl1OOi1();
/* 124 */                   oIIl1OOi12.I0000Il00O = o1ooOo;
/* 131 */                   O1I1OO o1i1oo = new O1I1OO(9, (byte) 0);
/* 137 */                   o1i1oo.I00iiO = new long[2];
/* 139 */                   oIIl1OOi12.I0000O = o1i1oo;
/* 146 */                   oIIl1OOi12.I0000oI00 = new O1IOillioo0I(2);
/* 148 */                   oIIl1OOi12.I000OOo1O = true;
/* 150 */                   oIIl1OOi12.I000OiO = true;
/* 152 */                   VarHandle.storeStoreFence();
/* 155 */                   o1i1oo.I00000oIO(j);
/* 158 */                   if (z) {
/* 160 */                       Object objI0000oI002 = oI0lli1.I0000oI00(j);
/* 164 */                       if (objI0000oI002 == null) {
/* 168 */                           objI0000oI002 = new OI0oiiIO0();
/* 171 */                           oI0lli1.I000OOo1O(j, objI0000oI002);
                                }
/* 176 */                       ((OI0oiiIO0) objI0000oI002).I00000oOI(oIIl1OOi12);
                            }
/* 181 */                   oIIlloOIoOo2.I00000oIO.I00000oOI(oIIl1OOi12);
/* 184 */                   oIIlloOIoOo2 = oIIl1OOi12;
                        }
                    }
/* 189 */           int i5 = 0;
/* 190 */           if (z) {
/* 192 */               long[] jArr3 = oI0lli1.I00000oOI;
/* 194 */               Object[] objArr2 = oI0lli1.I0000Il00O;
/* 196 */               long[] jArr4 = oI0lli1.I00000oIO;
                        int length = jArr4.length - 2;
/* 203 */               if (length >= 0) {
/* 205 */                   int i6 = 0;
                            while (true) {
/* 206 */                       long j2 = jArr4[i6];
/* 220 */                       if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 227 */                           int i7 = 8;
/* 229 */                           int i8 = 8 - ((~(i6 - length)) >>> 31);
/* 231 */                           int i9 = i5;
/* 232 */                           while (i9 < i8) {
/* 241 */                               if ((255 & j2) < 128) {
/* 245 */                                   int i10 = (i6 << 3) + i9;
/* 246 */                                   long j3 = jArr3[i10];
/* 250 */                                   OI0oiiIO0 oI0oiiIO0 = (OI0oiiIO0) objArr2[i10];
/* 252 */                                   OI110O0 oi110o02 = oIIlloOIoOo.I00000oIO;
/* 254 */                                   i = i7;
/* 256 */                                   Object[] objArr3 = oi110o02.I00iOIl;
/* 258 */                                   int i11 = oi110o02.I00iiO;
/* 260 */                                   jArr2 = jArr3;
/* 263 */                                   for (int i12 = 0; i12 < i11; i12++) {
/* 273 */                                       ((OIIl1OOi1) objArr3[i12]).I0001Ioi1lo(j3, oI0oiiIO0);
                                            }
                                        } else {
/* 279 */                                   jArr2 = jArr3;
/* 281 */                                   i = i7;
                                        }
/* 283 */                               j2 >>= i;
/* 285 */                               i9++;
/* 287 */                               i7 = i;
/* 289 */                               jArr3 = jArr2;
                                    }
/* 293 */                           jArr = jArr3;
/* 296 */                           if (i8 != i7) {
                                        break;
                                    }
                                } else {
/* 299 */                           jArr = jArr3;
                                }
/* 301 */                       if (i6 == length) {
                                    break;
                                }
/* 303 */                       i6++;
/* 305 */                       jArr3 = jArr;
/* 307 */                       i5 = 0;
                            }
                        }
                    }
/* 309 */           oI0lli1.I00000oIO();
                }

                public final boolean I00000oOI(I0oO0iO1l0lo i0oO0iO1l0lo, boolean z) {
/* 1 */             OI0oiiIO0 oI0oiiIO0 = this.I0001Ioi1lo;
/* 3 */             OIIlloOIoOo oIIlloOIoOo = this.I000II;
/* 11 */            boolean zI00000oIO = oIIlloOIoOo.I00000oIO((O1IOillioo0I) i0oO0iO1l0lo.I00iiO, this.I00000oIO, i0oO0iO1l0lo, z);
/* 15 */            OI110O0 oi110o0 = oIIlloOIoOo.I00000oIO;
/* 18 */            if (!zI00000oIO) {
/* 17 */                return false;
                    }
/* 21 */            boolean z2 = true;
/* 22 */            this.I00000oOI = true;
/* 24 */            Object[] objArr = oi110o0.I00iOIl;
/* 26 */            int i = oi110o0.I00iiO;
/* 29 */            boolean z3 = false;
/* 30 */            for (int i2 = 0; i2 < i; i2++) {
/* 47 */                z3 = ((OIIl1OOi1) objArr[i2]).I0000oI00(i0oO0iO1l0lo, z) || z3;
                    }
/* 51 */            Object[] objArr2 = oi110o0.I00iOIl;
/* 53 */            int i3 = oi110o0.I00iiO;
/* 56 */            boolean z4 = false;
/* 57 */            for (int i4 = 0; i4 < i3; i4++) {
/* 74 */                z4 = ((OIIl1OOi1) objArr2[i4]).I0000O(i0oO0iO1l0lo) || z4;
                    }
/* 78 */            oIIlloOIoOo.I00000oOI(i0oO0iO1l0lo);
/* 81 */            if (!z4 && !z3) {
/* 86 */                z2 = false;
                    }
/* 87 */            this.I00000oOI = false;
/* 91 */            if (this.I0000oI00) {
/* 93 */                this.I0000oI00 = false;
/* 95 */                int i5 = oI0oiiIO0.I00000oOI;
/* 98 */                for (int i6 = 0; i6 < i5; i6++) {
/* 106 */                   I0000O((O1ooOo) oI0oiiIO0.I000II(i6));
                        }
/* 112 */               oI0oiiIO0.I0000oI00();
                    }
/* 117 */           if (this.I0000Il00O) {
/* 119 */               this.I0000Il00O = false;
/* 121 */               I0000Il00O();
                    }
/* 126 */           if (this.I0000O) {
/* 128 */               this.I0000O = false;
/* 132 */               oIIlloOIoOo.I00000oIO.I000II();
                    }
/* 332 */           return z2;
                }

                public final void I0000Il00O() {
/* 1 */             OIIlloOIoOo oIIlloOIoOo = this.I000II;
/* 6 */             if (this.I00000oOI) {
/* 8 */                 this.I0000Il00O = true;
/* 10 */                return;
                    }
/* 11 */            OI110O0 oi110o0 = oIIlloOIoOo.I00000oIO;
/* 13 */            Object[] objArr = oi110o0.I00iOIl;
/* 15 */            int i = oi110o0.I00iiO;
/* 18 */            for (int i2 = 0; i2 < i; i2++) {
/* 24 */                ((OIIl1OOi1) objArr[i2]).I0000Il00O();
                    }
/* 32 */            if (this.I0000O) {
/* 34 */                this.I0000O = true;
                    } else {
/* 39 */                oIIlloOIoOo.I00000oIO.I000II();
                    }
                }

                public final void I0000O(O1ooOo o1ooOo) {
/* 4 */             if (this.I00000oOI) {
/* 6 */                 this.I0000oI00 = true;
/* 10 */                this.I0001Ioi1lo.I00000oOI(o1ooOo);
/* 13 */                return;
                    }
/* 14 */            OIIlloOIoOo oIIlloOIoOo = this.I000II;
/* 16 */            OI0oiiIO0 oI0oiiIO0 = oIIlloOIoOo.I00000oOI;
/* 18 */            oI0oiiIO0.I0000oI00();
/* 21 */            oI0oiiIO0.I00000oOI(oIIlloOIoOo);
/* 28 */            while (oI0oiiIO0.I000OiO()) {
/* 37 */                OIIlloOIoOo oIIlloOIoOo2 = (OIIlloOIoOo) oI0oiiIO0.I000l1(oI0oiiIO0.I00000oOI - 1);
/* 39 */                int i = 0;
                        while (true) {
/* 40 */                    OI110O0 oi110o0 = oIIlloOIoOo2.I00000oIO;
/* 44 */                    if (i < oi110o0.I00iiO) {
/* 50 */                        OIIl1OOi1 oIIl1OOi1 = (OIIl1OOi1) oi110o0.I00iOIl[i];
/* 58 */                        if (O0000Ioio00.I0000O(oIIl1OOi1.I0000Il00O, o1ooOo)) {
/* 62 */                            oIIlloOIoOo2.I00000oIO.I000iOII(oIIl1OOi1);
/* 65 */                            oIIl1OOi1.I0000Il00O();
                                } else {
/* 69 */                            oI0oiiIO0.I00000oOI(oIIl1OOi1);
/* 72 */                            i++;
                                }
                            }
                        }
                    }
                }
            }

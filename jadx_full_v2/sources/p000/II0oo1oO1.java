            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class II0oo1oO1 implements Function1 {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;

                public II0oo1oO1(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) {
                    OoiIlOl1iI ooiIlOl1iI;
                    OoiIlOl1iI ooiIlOl1iI2;
                    int i;
                    boolean z;
/* 3 */             int i2 = this.I00iOIl;
/* 6 */             OoiIlOl1iI ooiIlOl1iI3 = OoiIlOl1iI.I00000oIO;
/* 8 */             int i3 = 0;
                    switch (i2) {
                        case 0:
/* 316 */                   OO1I0001000i oO1I0001000i = (OO1I0001000i) this.I00iiO;
/* 320 */                   OO1I0001000i oO1I0001000i2 = (OO1I0001000i) this.I00iio;
/* 322 */                   int i4 = this.I00iiI;
/* 326 */                   OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 330 */                   OO11o0IO.I000OiO(oO11o0IO, oO1I0001000i, 0L);
/* 335 */                   oO11o0IO.I000O01llI0(oO1I0001000i2, i4, 0, 0.0f);
                            break;
                        case 1:
/* 133 */                   OOloioIl oOloioIl = (OOloioIl) this.I00iiO;
/* 135 */                   int i5 = this.I00iiI;
/* 139 */                   OI0o11I1 oI0o11I1 = (OI0o11I1) this.I00iio;
/* 143 */                   IOl1o0Io1o iOl1o0Io1o = (IOl1o0Io1o) obj;
/* 147 */                   if (oOloioIl.I0000oI00 == i5 && O0000Ioio00.I0000O(oI0o11I1, oOloioIl.I0001Ioi1lo) && (iOl1o0Io1o instanceof IOlIOiI0iiI1)) {
/* 161 */                       long[] jArr = oI0o11I1.I00000oIO;
                                int length = jArr.length - 2;
/* 166 */                       if (length >= 0) {
/* 168 */                           int i6 = 0;
                                    while (true) {
/* 169 */                               long j = jArr[i6];
/* 183 */                               if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 190 */                                   int i7 = 8;
/* 192 */                                   int i8 = 8 - ((~(i6 - length)) >>> 31);
/* 194 */                                   int i9 = i3;
/* 195 */                                   while (i9 < i8) {
/* 204 */                                       if ((255 & j) < 128) {
/* 208 */                                           int i10 = (i6 << 3) + i9;
/* 211 */                                           Object obj2 = oI0o11I1.I00000oOI[i10];
/* 221 */                                           boolean z2 = oI0o11I1.I0000Il00O[i10] != i5;
/* 222 */                                           if (z2) {
/* 224 */                                               i = i7;
/* 227 */                                               IOlIOiI0iiI1 iOlIOiI0iiI1 = (IOlIOiI0iiI1) iOl1o0Io1o;
/* 229 */                                               ooiIlOl1iI2 = ooiIlOl1iI3;
/* 231 */                                               OI10I1IoI0Ol oI10I1IoI0Ol = iOlIOiI0iiI1.I00io1l;
/* 233 */                                               lO0oOIoolo.I0000Il00O(oI10I1IoI0Ol, obj2, oOloioIl);
/* 236 */                                               z = z2;
/* 240 */                                               if (obj2 instanceof IiO0o1I) {
/* 243 */                                                   IiO0o1I iiO0o1I = (IiO0o1I) obj2;
/* 249 */                                                   if (!oI10I1IoI0Ol.I0000Il00O(iiO0o1I)) {
/* 253 */                                                       lO0oOIoolo.I0000O(iOlIOiI0iiI1.I00l0OO0IO, iiO0o1I);
                                                            }
/* 256 */                                                   OI10I1IoI0Ol oI10I1IoI0Ol2 = oOloioIl.I000II;
/* 258 */                                                   if (oI10I1IoI0Ol2 != null) {
/* 260 */                                                       oI10I1IoI0Ol2.I000iOII(obj2);
                                                            }
                                                        }
                                                    } else {
/* 264 */                                               ooiIlOl1iI2 = ooiIlOl1iI3;
/* 266 */                                               z = z2;
/* 268 */                                               i = i7;
                                                    }
/* 270 */                                           if (z) {
/* 272 */                                               oI0o11I1.I0001Ioi1lo(i10);
                                                    }
                                                } else {
/* 276 */                                           ooiIlOl1iI2 = ooiIlOl1iI3;
/* 278 */                                           i = i7;
                                                }
/* 280 */                                       j >>= i;
/* 282 */                                       i9++;
/* 284 */                                       i7 = i;
/* 286 */                                       ooiIlOl1iI3 = ooiIlOl1iI2;
                                            }
/* 291 */                                   ooiIlOl1iI = ooiIlOl1iI3;
/* 294 */                                   if (i8 != i7) {
                                                break;
                                            }
                                        } else {
/* 297 */                                   ooiIlOl1iI = ooiIlOl1iI3;
                                        }
/* 299 */                               if (i6 == length) {
                                            break;
                                        } else {
/* 301 */                                   i6++;
/* 303 */                                   ooiIlOl1iI3 = ooiIlOl1iI;
/* 306 */                                   i3 = 0;
                                        }
                                    }
                                }
                            }
                            break;
                        case 2:
/* 79 */                    OiOiiIo0l oiOiiIo0l = (OiOiiIo0l) this.I00iio;
/* 81 */                    int i11 = this.I00iiI;
/* 86 */                    OO1I0001000i oO1I0001000i3 = (OO1I0001000i) this.I00iiO;
/* 90 */                    OO11o0IO oO11o0IO2 = (OO11o0IO) obj;
/* 96 */                    int iI000II = oiOiiIo0l.I00o0iI0io1.I00000oIO.I000II();
/* 100 */                   if (iI000II < 0) {
/* 102 */                       iI000II = 0;
                            }
/* 103 */                   if (iI000II <= i11) {
/* 106 */                       i11 = iI000II;
                            }
/* 107 */                   int i12 = -i11;
/* 108 */                   boolean z3 = oiOiiIo0l.I00o0l1o1o0;
/* 114 */                   int i13 = z3 ? 0 : i12;
/* 119 */                   int i14 = z3 ? i12 : 0;
/* 120 */                   oO11o0IO2.I00iOIl = true;
/* 125 */                   OO11o0IO.I000l1(oO11o0IO2, oO1I0001000i3, i13, i14, null, 12);
/* 128 */                   oO11o0IO2.I00iOIl = false;
                            break;
                        default:
/* 14 */                    OooOo1 oooOo1 = (OooOo1) this.I00iio;
/* 18 */                    OO1I0001000i oO1I0001000i4 = (OO1I0001000i) this.I00iiO;
/* 20 */                    int i15 = this.I00iiI;
/* 24 */                    OO11o0IO oO11o0IO3 = (OO11o0IO) obj;
/* 26 */                    int i16 = oooOo1.I00000oOI;
/* 28 */                    Oo0I110i oo0I110i = oooOo1.I00000oIO;
/* 30 */                    OoI0llll ooI0llll = oooOo1.I0000Il00O;
/* 38 */                    Oo0il0olo1l oo0il0olo1l = (Oo0il0olo1l) oooOo1.I0000O.invoke();
/* 59 */                    oo0I110i.I00000oIO(OIilII.I00iOIl, lOl1III1il.I00000oIO(oO11o0IO3, i16, ooI0llll, oo0il0olo1l != null ? oo0il0olo1l.I00000oIO : null, false, oO1I0001000i4.I00iOIl), i15, oO1I0001000i4.I00iiI);
/* 73 */                    OO11o0IO.I000iOII(oO11o0IO3, oO1I0001000i4, 0, Math.round(-oo0I110i.I00000oIO.I000II()));
                            break;
                    }
/* 76 */            return ooiIlOl1iI3;
                }
            }

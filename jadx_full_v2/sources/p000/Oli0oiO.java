            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            import kotlin.jvm.functions.Function1;
            
            public final class Oli0oiO extends IiIioO0ol1oI implements O0iOoioOoI, Iillo1il11l, OoIOloiIii, IOlIil1, OIOilOIi1, IOlIOlli0I {
                public Oli0iol0o0 I00o101lO;
                public Oli01I0I01 I00oI0i;
                public Oi0iOio I00oII;
                public Oli100iIoOOO I00oIiI10;
                public Oli100iIoOOO I00oO101o;
                public Io10IOI I00oOio10iI1;
                public OlOi0iollo I00ol1;
                public I1ii1o0 I00olI;
                public OI10olol1i I00oli;
                public OI0lOIiOIOOo I00oliIiO01i;
                public Ol1OiIli00Ii I00oo1iO0ll;
                public long I00ooIo0;
                public O0iOOoiioO I00ooiO1I;
                public OioOIi1o0I I00oooO;
                public l1lOoiII1l I0100i;
                public OioOII0OOOI1[] I0100o111I;
                public Iolo11l0l[] I010101Oo1lO;
                public OioOII0OOOI1[] I010I0;
                public Iio0OOooilII[] I010II;
                public OlIl0i I010OIo1l;

                public static Oli100iIoOOO I01101IOlO(Oli0oiO oli0oiO, int i) {
/* 1 */             Oli100iIoOOO oli100iIoOOO = oli0oiO.I00oIiI10;
/* 3 */             Oi0iOio oi0iOio = oli0oiO.I00oII;
/* 10 */            if ((oi0iOio.I0001Ioi1lo() & i) == 0) {
/* 37 */                return oli100iIoOOO;
                    }
/* 14 */            Oli100iIoOOO oli100iIoOOO2 = new Oli100iIoOOO();
/* 17 */            oi0iOio.I000OOo1O(i, oli100iIoOOO2);
/* 37 */            return oli100iIoOOO2;
                }

                @Override
                public final O1iOIo0o0 I0000Il00O(O1iOIoOiO0 o1iOIoOiO0, O1iIo0ll o1iIo0ll, long j) {
                    int iRound;
                    int iRound2;
                    int iRound3;
                    int iRound4;
/* 5 */             Oli100iIoOOO oli100iIoOOOI01101IOlO = I01101IOlO(this, 12);
/* 20 */            float f = oli100iIoOOOI01101IOlO.I001IO000((byte) 4) ? oli100iIoOOOI01101IOlO.I000II : 0.0f;
/* 32 */            float f2 = oli100iIoOOOI01101IOlO.I001IO000((byte) 13) ? oli100iIoOOOI01101IOlO.I00100l0 : 0.0f;
/* 37 */            if (!Float.isNaN(f2)) {
/* 40 */                f += f2;
                    }
/* 51 */            float f3 = oli100iIoOOOI01101IOlO.I001IO000((byte) 5) ? oli100iIoOOOI01101IOlO.I000O01llI0 : 0.0f;
/* 63 */            float f4 = oli100iIoOOOI01101IOlO.I001IO000((byte) 15) ? oli100iIoOOOI01101IOlO.I0010I0i : 0.0f;
/* 68 */            if (!Float.isNaN(f4)) {
/* 71 */                f3 += f4;
                    }
/* 82 */            float f5 = oli100iIoOOOI01101IOlO.I001IO000((byte) 6) ? oli100iIoOOOI01101IOlO.I000OOo1O : 0.0f;
/* 94 */            float f6 = oli100iIoOOOI01101IOlO.I001IO000((byte) 14) ? oli100iIoOOOI01101IOlO.I00100o1O0lo : 0.0f;
/* 99 */            if (!Float.isNaN(f6)) {
/* 102 */               f5 += f6;
                    }
/* 113 */           float f7 = oli100iIoOOOI01101IOlO.I001IO000((byte) 7) ? oli100iIoOOOI01101IOlO.I000OiO : 0.0f;
/* 122 */           float f8 = oli100iIoOOOI01101IOlO.I001IO000((byte) 16) ? oli100iIoOOOI01101IOlO.I0010o : 0.0f;
/* 128 */           if (!Float.isNaN(f8)) {
/* 131 */               f7 += f8;
                    }
/* 134 */           int iRound5 = Math.round(f + f3);
/* 140 */           int iRound6 = Math.round(f5 + f7);
/* 148 */           int iI000l1 = IOo0oO11ll1O.I000l1(j) - iRound5;
/* 149 */           if (iI000l1 < 0) {
/* 151 */               iI000l1 = 0;
                    }
/* 152 */           int iI000OiO = IOo0oO11ll1O.I000OiO(j);
/* 159 */           if (iI000OiO != Integer.MAX_VALUE && (iI000OiO = iI000OiO + iRound5) < 0) {
/* 165 */               iI000OiO = 0;
                    }
/* 170 */           int iI000iOII = IOo0oO11ll1O.I000iOII(j) - iRound6;
/* 176 */           int i = iI000iOII < 0 ? 0 : iI000iOII;
/* 178 */           int iI000OOo1O = IOo0oO11ll1O.I000OOo1O(j);
/* 182 */           if (iI000OOo1O != Integer.MAX_VALUE && (iI000OOo1O = iI000OOo1O + iRound6) < 0) {
/* 188 */               iI000OOo1O = 0;
                    }
/* 195 */           if (oli100iIoOOOI01101IOlO.I001IO000((byte) 19)) {
/* 199 */               iRound = Math.round(oli100iIoOOOI01101IOlO.I001i1O0Ol);
/* 203 */               if (iRound < 0) {
/* 205 */                   iRound = 0;
                        }
                    } else {
/* 207 */               iRound = Integer.MAX_VALUE;
                    }
/* 214 */           if (oli100iIoOOOI01101IOlO.I001IO000((byte) 17)) {
/* 218 */               iRound2 = Math.round(oli100iIoOOOI01101IOlO.I001IO000);
/* 222 */               if (iRound2 < 0) {
/* 224 */                   iRound2 = 0;
                        }
/* 225 */               if (iRound2 > iRound) {
/* 227 */                   iRound2 = iRound;
                        }
                    } else {
/* 229 */               iRound2 = 0;
                    }
/* 236 */           if (oli100iIoOOOI01101IOlO.I001IO000((byte) 9)) {
/* 240 */               int iRound7 = Math.round(oli100iIoOOOI01101IOlO.I000l1);
/* 244 */               if (iRound7 >= iRound2) {
/* 247 */                   iRound2 = iRound7;
                        }
/* 248 */               if (iRound2 <= iRound) {
/* 251 */                   iRound = iRound2;
                        }
/* 252 */               iRound2 = iRound;
                    }
/* 253 */           if (iRound2 != 0) {
/* 256 */               if (iRound2 >= iI000l1) {
/* 259 */                   iI000l1 = iRound2;
                        }
/* 260 */               if (iI000l1 > iI000OiO) {
/* 262 */                   iI000l1 = iI000OiO;
                        }
                    }
/* 263 */           if (iRound != Integer.MAX_VALUE) {
/* 268 */               if (iRound < iI000l1) {
/* 270 */                   iRound = iI000l1;
                        }
/* 271 */               if (iRound <= iI000OiO) {
/* 274 */                   iI000OiO = iRound;
                        }
                    }
/* 280 */           if (!oli100iIoOOOI01101IOlO.I001IO000((byte) 9)) {
/* 288 */               if (oli100iIoOOOI01101IOlO.I001IO000((byte) 11) && IOo0oO11ll1O.I0001Ioi1lo(j)) {
/* 300 */                   int iRound8 = Math.round(iI000OiO * oli100iIoOOOI01101IOlO.I000o00OoI0I);
/* 304 */                   if (iRound8 >= iI000l1) {
/* 307 */                       iI000l1 = iRound8;
                            }
/* 308 */                   if (iI000l1 > iI000OiO) {
/* 310 */                       iI000l1 = iI000OiO;
                            }
/* 311 */                   iI000OiO = iI000l1;
                        } else if (oli100iIoOOOI01101IOlO.I001IO000((byte) 13) && oli100iIoOOOI01101IOlO.I001IO000((byte) 15)) {
/* 329 */                   iI000l1 = iI000OiO;
                        }
                    }
/* 336 */           if (oli100iIoOOOI01101IOlO.I001IO000((byte) 20)) {
/* 340 */               iRound3 = Math.round(oli100iIoOOOI01101IOlO.I001IIilI0O);
/* 344 */               if (iRound3 < 0) {
/* 346 */                   iRound3 = 0;
                        }
                    } else {
/* 348 */               iRound3 = Integer.MAX_VALUE;
                    }
/* 355 */           if (oli100iIoOOOI01101IOlO.I001IO000((byte) 18)) {
/* 359 */               iRound4 = Math.round(oli100iIoOOOI01101IOlO.I00111O);
/* 363 */               if (iRound4 < 0) {
/* 365 */                   iRound4 = 0;
                        }
/* 366 */               if (iRound4 > iRound3) {
/* 368 */                   iRound4 = iRound3;
                        }
                    } else {
/* 370 */               iRound4 = 0;
                    }
/* 377 */           if (oli100iIoOOOI01101IOlO.I001IO000((byte) 10)) {
/* 381 */               int iRound9 = Math.round(oli100iIoOOOI01101IOlO.I000lI);
/* 385 */               if (iRound9 >= iRound4) {
/* 388 */                   iRound4 = iRound9;
                        }
/* 389 */               if (iRound4 <= iRound3) {
/* 392 */                   iRound3 = iRound4;
                        }
/* 393 */               iRound4 = iRound3;
                    }
/* 394 */           if (iRound4 != 0) {
/* 397 */               if (iRound4 >= i) {
/* 400 */                   i = iRound4;
                        }
/* 401 */               if (i > iI000OOo1O) {
/* 403 */                   i = iI000OOo1O;
                        }
                    }
/* 404 */           if (iRound3 != Integer.MAX_VALUE) {
/* 409 */               if (iRound3 < i) {
/* 411 */                   iRound3 = i;
                        }
/* 412 */               if (iRound3 <= iI000OOo1O) {
/* 415 */                   iI000OOo1O = iRound3;
                        }
                    }
/* 421 */           if (!oli100iIoOOOI01101IOlO.I001IO000((byte) 10)) {
/* 429 */               if (oli100iIoOOOI01101IOlO.I001IO000((byte) 12) && IOo0oO11ll1O.I0000oI00(j)) {
/* 441 */                   int iRound10 = Math.round(iI000OOo1O * oli100iIoOOOI01101IOlO.I000oI1ioi);
/* 445 */                   if (iRound10 >= i) {
/* 448 */                       i = iRound10;
                            }
/* 449 */                   if (i > iI000OOo1O) {
/* 451 */                       i = iI000OOo1O;
                            }
/* 452 */                   iI000OOo1O = i;
                        } else if (oli100iIoOOOI01101IOlO.I001IO000((byte) 14) && oli100iIoOOOI01101IOlO.I001IO000((byte) 16)) {
/* 470 */                   i = iI000OOo1O;
                        }
                    }
/* 477 */           OO1I0001000i oO1I0001000iI001lllioOl = o1iIo0ll.I001lllioOl(IOo0olo.I00000oIO(iI000l1, iI000OiO, i, iI000OOo1O));
/* 483 */           int i2 = oO1I0001000iI001lllioOl.I00iOIl + iRound5;
/* 486 */           int i3 = oO1I0001000iI001lllioOl.I00iiI + iRound6;
/* 489 */           Oli0oOoI0 oli0oOoI0 = new Oli0oOoI0();
/* 492 */           oli0oOoI0.I00iOIl = this;
/* 496 */           oli0oOoI0.I00iiI = j;
/* 498 */           oli0oOoI0.I00iiO = oO1I0001000iI001lllioOl;
/* 500 */           oli0oOoI0.I00iio = f3;
/* 502 */           oli0oOoI0.I00ilI0I1 = f;
/* 504 */           oli0oOoI0.I00ilO0 = f7;
/* 506 */           oli0oOoI0.I00io1l = f5;
/* 508 */           VarHandle.storeStoreFence();
/* 515 */           return o1iOIoOiO0.I001i1lo1io(i2, i3, Il011I1OiO0I.I00iOIl, oli0oOoI0);
                }

                @Override
                public final Object I000l1() {
/* 1 */             return "StyleOuterNode";
                }

                @Override
                public final Object I00iIO(OOiIOoiOO oOiIOoiOO) {
/* 1 */             return iiliIooIliOo.I00000oIO(this, oOiIOoiOO);
                }

                @Override
                public final void I00ilO0() {
/* 2 */             I01101olii(false);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override
                public final void I00l0I0l0lO1(O0iiliOio o0iiliOio) {
                    Object obj;
                    Oli100iIoOOO oli100iIoOOO;
                    IIolilIo iIolilIo;
                    float f;
                    long j;
                    Iio0OOooilII[] iio0OOooilIIArr;
                    float f2;
                    OioOIi1o0I oioOIi1o0I;
                    Object obj2;
                    Iolo11l0l[] iolo11l0lArr;
                    I01oIoOI01l i01oIoOI01l;
/* 5 */             IIolilIo iIolilIo2 = o0iiliOio.I00iOIl;
/* 8 */             Oli100iIoOOO oli100iIoOOOI01101IOlO = I01101IOlO(this, 2);
/* 12 */            long j2 = IOOiio0i.I000o00OoI0I;
/* 25 */            long j3 = oli100iIoOOOI01101IOlO.I001IO000((byte) 34) ? oli100iIoOOOI01101IOlO.I001l0I00 : j2;
/* 37 */            III11l1I iII11l1I = oli100iIoOOOI01101IOlO.I001i1O0Ol(51) ? oli100iIoOOOI01101IOlO.I001lIiIIo1O : null;
/* 44 */            if (oli100iIoOOOI01101IOlO.I001IO000((byte) 36)) {
/* 46 */                j2 = oli100iIoOOOI01101IOlO.I001lllioOl;
                    }
/* 59 */            III11l1I iII11l1I2 = oli100iIoOOOI01101IOlO.I001i1O0Ol(52) ? oli100iIoOOOI01101IOlO.I001lloI : null;
/* 60 */            long j4 = IOOiio0i.I00000oOI;
/* 68 */            if (oli100iIoOOOI01101IOlO.I001IO000((byte) 35)) {
/* 70 */                j4 = oli100iIoOOOI01101IOlO.I001i1lo1io;
                    }
/* 83 */            III11l1I iII11l1I3 = oli100iIoOOOI01101IOlO.I001i1O0Ol(50) ? oli100iIoOOOI01101IOlO.I001iOo1i0O : null;
/* 96 */            float f3 = oli100iIoOOOI01101IOlO.I001IO000((byte) 8) ? oli100iIoOOOI01101IOlO.I000iOII : 0.0f;
/* 99 */            float f4 = f3 / 2.0f;
/* 103 */           OioOIi1o0I oioOIi1o0I2 = oli100iIoOOOI01101IOlO.I00II0oii1o;
/* 112 */           boolean z = f4 > 0.0f;
/* 126 */           boolean z2 = (j3 == 16 && iII11l1I == null) ? false : true;
/* 138 */           boolean z3 = (j2 == 16 && iII11l1I2 == null) ? false : true;
/* 142 */           boolean zI001i1O0Ol = oli100iIoOOOI01101IOlO.I001i1O0Ol(55);
/* 146 */           IOIIoiI1oi1 iOIIoiI1oi1 = iO0ioilo.I00000oIO;
/* 148 */           III11l1I iII11l1I4 = iII11l1I3;
/* 152 */           if (zI001i1O0Ol && (obj = oli100iIoOOOI01101IOlO.I00IO1) != null) {
/* 180 */               OioOIi1o0I oioOIi1o0I3 = oli100iIoOOOI01101IOlO.I001i1O0Ol(53) ? oli100iIoOOOI01101IOlO.I00II0oii1o : iOIIoiI1oi1;
/* 177 */               oli100iIoOOO = oli100iIoOOOI01101IOlO;
/* 183 */               OioOII0OOOI1[] oioOII0OOOI1Arr = this.I010I0;
/* 185 */               iIolilIo = iIolilIo2;
/* 187 */               Iio0OOooilII[] iio0OOooilIIArr2 = this.I010II;
/* 189 */               f = f3;
/* 191 */               boolean z4 = obj instanceof Object[];
/* 202 */               int length = z4 ? ((Object[]) obj).length : 1;
/* 203 */               j = j4;
/* 205 */               if (oioOII0OOOI1Arr == null || !O0000Ioio00.I0000O(this.I00oooO, oioOIi1o0I3)) {
/* 249 */                   OioOII0OOOI1[] oioOII0OOOI1Arr2 = new OioOII0OOOI1[length];
/* 252 */                   for (int i = 0; i < length; i++) {
/* 254 */                       oioOII0OOOI1Arr2[i] = null;
                            }
/* 259 */                   this.I010I0 = oioOII0OOOI1Arr2;
/* 261 */                   Iio0OOooilII[] iio0OOooilIIArr3 = new Iio0OOooilII[length];
/* 264 */                   for (int i2 = 0; i2 < length; i2++) {
/* 266 */                       iio0OOooilIIArr3[i2] = null;
                            }
/* 271 */                   this.I010II = iio0OOooilIIArr3;
                        } else if (oioOII0OOOI1Arr.length != length) {
/* 225 */                   this.I010I0 = (OioOII0OOOI1[]) Arrays.copyOf(oioOII0OOOI1Arr, length);
/* 227 */                   if (iio0OOooilIIArr2 != null) {
/* 233 */                       iio0OOooilIIArr = (Iio0OOooilII[]) Arrays.copyOf(iio0OOooilIIArr2, length);
                            } else {
/* 236 */                       iio0OOooilIIArr = new Iio0OOooilII[length];
/* 239 */                       for (int i3 = 0; i3 < length; i3++) {
/* 241 */                           iio0OOooilIIArr[i3] = null;
                                }
                            }
/* 246 */                   this.I010II = iio0OOooilIIArr;
                        }
/* 273 */               if (z4) {
/* 275 */                   Object[] objArr = (Object[]) obj;
/* 277 */                   int length2 = objArr.length;
/* 279 */                   for (int i4 = 0; i4 < length2; i4++) {
/* 281 */                       Object obj3 = objArr[i4];
/* 285 */                       if (obj3 instanceof OioOII0OOOI1) {
/* 289 */                           I010o0o0oO(o0iiliOio, i4, oioOIi1o0I3, (OioOII0OOOI1) obj3);
                                }
                            }
                        } else if (obj instanceof OioOII0OOOI1) {
/* 302 */                   I010o0o0oO(o0iiliOio, 0, oioOIi1o0I3, (OioOII0OOOI1) obj);
                        }
                    } else {
/* 154 */               iIolilIo = iIolilIo2;
/* 156 */               oli100iIoOOO = oli100iIoOOOI01101IOlO;
/* 158 */               j = j4;
/* 160 */               f = f3;
                    }
/* 305 */           long jI0000oI00 = iIolilIo.I0000oI00();
/* 340 */           l1lOoiII1l l1looiii1lI00000oIO = (Ol0i1I.I00000oOI(this.I00ooIo0, jI0000oI00) && this.I00ooiO1I == o0iiliOio.getLayoutDirection() && O0000Ioio00.I0000O(this.I00oooO, oioOIi1o0I2)) ? this.I0100i : oioOIi1o0I2.I00000oIO(jI0000oI00, o0iiliOio.getLayoutDirection(), o0iiliOio);
/* 344 */           this.I0100i = l1looiii1lI00000oIO;
/* 346 */           this.I00ooIo0 = jI0000oI00;
/* 352 */           this.I00ooiO1I = o0iiliOio.getLayoutDirection();
/* 356 */           if (!z2) {
/* 370 */               f2 = 0.0f;
                    } else if (iII11l1I != null) {
/* 360 */               f2 = 0.0f;
/* 361 */               l1li0Ill1oiO.I00000oIO(o0iiliOio, l1looiii1lI00000oIO, iII11l1I, 0.0f, 60);
                    } else {
/* 365 */               f2 = 0.0f;
/* 366 */               l1li0Ill1oiO.I00000oOI(o0iiliOio, l1looiii1lI00000oIO, j3);
                    }
/* 371 */           o0iiliOio.I00000oOI();
/* 374 */           if (z3) {
/* 376 */               if (iII11l1I2 != null) {
/* 378 */                   l1li0Ill1oiO.I00000oIO(o0iiliOio, l1looiii1lI00000oIO, iII11l1I2, f2, 60);
                        } else {
/* 382 */                   l1li0Ill1oiO.I00000oOI(o0iiliOio, l1looiii1lI00000oIO, j2);
                        }
                    }
/* 385 */           if (z) {
/* 397 */               III11l1I olI00IIlOO = iII11l1I4 == null ? new OlI00IIlOO(j) : iII11l1I4;
/* 399 */               I1ii1o0 i1ii1o0 = this.I00olI;
/* 403 */               Oli0o0o1 oli0o0o1 = new Oli0o0o1();
/* 408 */               oli0o0o1.I00iOIl = f;
/* 410 */               VarHandle.storeStoreFence();
/* 413 */               OlOi0iollo olOi0iollo = this.I00ol1;
/* 415 */               if (olOi0iollo == null) {
/* 420 */                   olOi0iollo = new OlOi0iollo(1);
/* 423 */                   olOi0iollo.I00iiI = this;
/* 425 */                   VarHandle.storeStoreFence();
/* 428 */                   this.I00ol1 = olOi0iollo;
                        }
/* 432 */               i1ii1o0.I00iiO = oli0o0o1;
/* 442 */               if (olI00IIlOO.equals((III11l1I) i1ii1o0.I00iio) && O0000Ioio00.I0000O(l1looiii1lI00000oIO, (l1lOoiII1l) i1ii1o0.I00ilI0I1) && ((Function1) i1ii1o0.I00ilO0) != null) {
/* 461 */                   oioOIi1o0I = oioOIi1o0I2;
                        } else {
/* 464 */                   i1ii1o0.I00iio = olI00IIlOO;
/* 466 */                   i1ii1o0.I00ilI0I1 = l1looiii1lI00000oIO;
/* 470 */                   if (l1looiii1lI00000oIO instanceof OIio1O0ll0I) {
/* 472 */                       OIio1O0ll0I oIio1O0ll0I = (OIio1O0ll0I) l1looiii1lI00000oIO;
/* 474 */                       I0ol0lI i0ol0lI = oIio1O0ll0I.I00000oIO;
/* 476 */                       OOo0IO oOo0IOI0000O = i0ol0lI.I0000O();
/* 480 */                       float f5 = oOo0IOI0000O.I00000oOI;
/* 482 */                       float f6 = oOo0IOI0000O.I0000O;
/* 484 */                       float f7 = oOo0IOI0000O.I00000oIO;
/* 500 */                       float fMin = Math.min(Math.abs(oOo0IOI0000O.I0000Il00O - f7), Math.abs(f6 - f5));
/* 506 */                       I0ol0lI i0ol0lII00000oIO = (I0ol0lI) i1ii1o0.I00iiI;
/* 508 */                       if (i0ol0lII00000oIO == null) {
/* 510 */                           i0ol0lII00000oIO = I0olIlI11.I00000oIO();
/* 514 */                           i1ii1o0.I00iiI = i0ol0lII00000oIO;
                                }
/* 516 */                       i0ol0lII00000oIO.I000O01llI0();
/* 519 */                       I0ol0lI.I00000oOI(i0ol0lII00000oIO, oOo0IOI0000O);
/* 523 */                       i0ol0lII00000oIO.I000II(i0ol0lII00000oIO, i0ol0lI, 0);
/* 538 */                       oioOIi1o0I = oioOIi1o0I2;
/* 561 */                       II11o0IIO iI11o0IIO = new II11o0IIO();
/* 564 */                       iI11o0IIO.I00iOIl = i1ii1o0;
/* 566 */                       iI11o0IIO.I00iiI = fMin;
/* 568 */                       iI11o0IIO.I00iiO = oIio1O0ll0I;
/* 570 */                       iI11o0IIO.I00iio = olI00IIlOO;
/* 572 */                       iI11o0IIO.I00ilI0I1 = olOi0iollo;
/* 574 */                       iI11o0IIO.I00ilO0 = oOo0IOI0000O;
/* 576 */                       iI11o0IIO.I00io1l = (((int) Math.ceil(r12 - f7)) << 32) | (((int) Math.ceil(f6 - f5)) & 4294967295L);
/* 578 */                       iI11o0IIO.I00ioIO = i0ol0lII00000oIO;
/* 580 */                       VarHandle.storeStoreFence();
                                i01oIoOI01l = iI11o0IIO;
                            } else {
/* 584 */                       oioOIi1o0I = oioOIi1o0I2;
/* 587 */                       if (l1looiii1lI00000oIO instanceof OIiolOlo1iI) {
/* 591 */                           OiI101I1oIi oiI101I1oIi = ((OIiolOlo1iI) l1looiii1lI00000oIO).I00000oIO;
/* 597 */                           if (lIooiiO1i.I0000Il00O(oiI101I1oIi)) {
/* 603 */                               I01oIoOI01l i01oIoOI01l2 = new I01oIoOI01l(9);
/* 606 */                               i01oIoOI01l2.I00iiI = i1ii1o0;
/* 608 */                               i01oIoOI01l2.I00iiO = oiI101I1oIi;
/* 610 */                               i01oIoOI01l2.I00iio = olI00IIlOO;
/* 612 */                               VarHandle.storeStoreFence();
                                        i01oIoOI01l = i01oIoOI01l2;
                                    } else {
/* 618 */                               I0ol0lI i0ol0lII00000oIO2 = (I0ol0lI) i1ii1o0.I00iiI;
/* 620 */                               if (i0ol0lII00000oIO2 == null) {
/* 622 */                                   i0ol0lII00000oIO2 = I0olIlI11.I00000oIO();
/* 626 */                                   i1ii1o0.I00iiI = i0ol0lII00000oIO2;
                                        }
/* 630 */                               OOo0lO oOo0lO = new OOo0lO();
/* 635 */                               oOo0lO.I00iOIl = Float.NaN;
/* 639 */                               OOo0ooi oOo0ooi = new OOo0ooi();
/* 645 */                               I0O0o00OlIoi i0O0o00OlIoi = new I0O0o00OlIoi(3);
/* 648 */                               i0O0o00OlIoi.I00iiO = i1ii1o0;
/* 650 */                               i0O0o00OlIoi.I00iio = oiI101I1oIi;
/* 652 */                               i0O0o00OlIoi.I00ilI0I1 = oOo0lO;
/* 654 */                               i0O0o00OlIoi.I00ilO0 = oOo0ooi;
/* 656 */                               i0O0o00OlIoi.I00iiI = i0ol0lII00000oIO2;
/* 658 */                               i0O0o00OlIoi.I00io1l = olI00IIlOO;
/* 660 */                               VarHandle.storeStoreFence();
/* 663 */                               i01oIoOI01l = i0O0o00OlIoi;
                                    }
                                } else {
/* 667 */                           if (!(l1looiii1lI00000oIO instanceof OIioiIl)) {
/* 760 */                               I000II.I00000oIO();
/* 763 */                               return;
                                    }
/* 671 */                           OOo0IO oOo0IO = ((OIioiIl) l1looiii1lI00000oIO).I00000oIO;
/* 677 */                           I01oIoOI01l i01oIoOI01l3 = new I01oIoOI01l(10);
/* 680 */                           i01oIoOI01l3.I00iiI = i1ii1o0;
/* 682 */                           i01oIoOI01l3.I00iiO = oOo0IO;
/* 684 */                           i01oIoOI01l3.I00iio = olI00IIlOO;
/* 686 */                           VarHandle.storeStoreFence();
                                    i01oIoOI01l = i01oIoOI01l3;
                                }
                            }
/* 689 */                   i1ii1o0.I00ilO0 = i01oIoOI01l;
                        }
/* 697 */               if (OIOlIiiioi.I0000O(0L, 0L)) {
/* 703 */                   ((Function1) i1ii1o0.I00ilO0).invoke(o0iiliOio);
                        } else {
/* 709 */                   float fIntBitsToFloat = Float.intBitsToFloat(0);
/* 713 */                   float fIntBitsToFloat2 = Float.intBitsToFloat(0);
/* 717 */                   IIolilIo iIolilIo3 = iIolilIo;
/* 725 */                   ((IIOOoll) iIolilIo3.I00iiI.I00iiI).I00i0oil(fIntBitsToFloat, fIntBitsToFloat2);
                            try {
/* 732 */                       ((Function1) i1ii1o0.I00ilO0).invoke(o0iiliOio);
                            } finally {
/* 756 */                       ((IIOOoll) iIolilIo3.I00iiI.I00iiI).I00i0oil(-fIntBitsToFloat, -fIntBitsToFloat2);
                            }
                        }
                    } else {
/* 764 */               oioOIi1o0I = oioOIi1o0I2;
                    }
/* 767 */           Oli100iIoOOO oli100iIoOOO2 = oli100iIoOOO;
/* 773 */           if (oli100iIoOOO2.I001i1O0Ol(56) && (obj2 = oli100iIoOOO2.I00IO1oi11O) != null) {
/* 794 */               OioOIi1o0I oioOIi1o0I4 = oli100iIoOOO2.I001i1O0Ol(53) ? oli100iIoOOO2.I00II0oii1o : iOIIoiI1oi1;
/* 796 */               OioOII0OOOI1[] oioOII0OOOI1Arr3 = this.I0100o111I;
/* 798 */               Iolo11l0l[] iolo11l0lArr2 = this.I010101Oo1lO;
/* 800 */               boolean z5 = obj2 instanceof Object[];
/* 809 */               int length3 = z5 ? ((Object[]) obj2).length : 1;
/* 810 */               if (oioOII0OOOI1Arr3 == null || !O0000Ioio00.I0000O(this.I00oooO, oioOIi1o0I4)) {
/* 854 */                   OioOII0OOOI1[] oioOII0OOOI1Arr4 = new OioOII0OOOI1[length3];
/* 857 */                   for (int i5 = 0; i5 < length3; i5++) {
/* 859 */                       oioOII0OOOI1Arr4[i5] = null;
                            }
/* 864 */                   this.I0100o111I = oioOII0OOOI1Arr4;
/* 866 */                   Iolo11l0l[] iolo11l0lArr3 = new Iolo11l0l[length3];
/* 869 */                   for (int i6 = 0; i6 < length3; i6++) {
/* 871 */                       iolo11l0lArr3[i6] = null;
                            }
/* 876 */                   this.I010101Oo1lO = iolo11l0lArr3;
                        } else if (oioOII0OOOI1Arr3.length != length3) {
/* 830 */                   this.I0100o111I = (OioOII0OOOI1[]) Arrays.copyOf(oioOII0OOOI1Arr3, length3);
/* 832 */                   if (iolo11l0lArr2 != null) {
/* 838 */                       iolo11l0lArr = (Iolo11l0l[]) Arrays.copyOf(iolo11l0lArr2, length3);
                            } else {
/* 841 */                       iolo11l0lArr = new Iolo11l0l[length3];
/* 844 */                       for (int i7 = 0; i7 < length3; i7++) {
/* 846 */                           iolo11l0lArr[i7] = null;
                                }
                            }
/* 851 */                   this.I010101Oo1lO = iolo11l0lArr;
                        }
/* 878 */               if (z5) {
/* 880 */                   Object[] objArr2 = (Object[]) obj2;
/* 882 */                   int length4 = objArr2.length;
/* 884 */                   for (int i8 = 0; i8 < length4; i8++) {
/* 886 */                       Object obj4 = objArr2[i8];
/* 890 */                       if (obj4 instanceof OioOII0OOOI1) {
/* 894 */                           I010oio1OO0(o0iiliOio, i8, oioOIi1o0I4, (OioOII0OOOI1) obj4);
                                }
                            }
                        } else if (obj2 instanceof OioOII0OOOI1) {
/* 907 */                   I010oio1OO0(o0iiliOio, 0, oioOIi1o0I4, (OioOII0OOOI1) obj2);
                        }
                    }
/* 910 */           this.I00oooO = oioOIi1o0I;
                }

                @Override
                public final boolean I00oooO() {
/* 1 */             return false;
                }

                @Override
                public final void I010I0() {
/* 1 */             Io10IOI io10IOI = this.I00oOio10iI1;
/* 4 */             if (io10IOI != null) {
/* 10 */                il0lI1i1olii.I0001Ioi1lo(this).I00000oIO(io10IOI);
/* 13 */                this.I00oOio10iI1 = null;
                    }
/* 15 */            this.I00ol1 = null;
                }

                public final void I010o0o0oO(O0iiliOio o0iiliOio, int i, OioOIi1o0I oioOIi1o0I, OioOII0OOOI1 oioOII0OOOI1) {
/* 1 */             OioOII0OOOI1[] oioOII0OOOI1Arr = this.I010I0;
/* 13 */            OioOII0OOOI1 oioOII0OOOI12 = oioOII0OOOI1Arr != null ? (OioOII0OOOI1) I1IoiO1l.I001iOo1i0O(i, oioOII0OOOI1Arr) : null;
/* 14 */            Iio0OOooilII[] iio0OOooilIIArr = this.I010II;
/* 22 */            Iio0OOooilII iio0OOooilII = iio0OOooilIIArr != null ? (Iio0OOooilII) I1IoiO1l.I001iOo1i0O(i, iio0OOooilIIArr) : null;
/* 28 */            if (!O0000Ioio00.I0000O(oioOII0OOOI12, oioOII0OOOI1) || iio0OOooilII == null) {
/* 37 */                IIlio101Io iIlio101IoI00000oOI = il0lI1i1olii.I0001Ioi1lo(this).I00000oOI();
/* 41 */                iIlio101IoI00000oOI.getClass();
/* 46 */                iio0OOooilII = new Iio0OOooilII();
/* 49 */                iio0OOooilII.I00ilI0I1 = oioOIi1o0I;
/* 51 */                iio0OOooilII.I00ilO0 = iIlio101IoI00000oOI;
/* 53 */                O0iOOoiioO o0iOOoiioO = O0iOOoiioO.I00iOIl;
/* 55 */                VarHandle.storeStoreFence();
                    }
/* 58 */            OioOII0OOOI1[] oioOII0OOOI1Arr2 = this.I010I0;
/* 60 */            if (oioOII0OOOI1Arr2 != null) {
/* 62 */                oioOII0OOOI1Arr2[i] = oioOII0OOOI1;
                    }
/* 64 */            Iio0OOooilII[] iio0OOooilIIArr2 = this.I010II;
/* 66 */            if (iio0OOooilIIArr2 != null) {
/* 68 */                iio0OOooilIIArr2[i] = iio0OOooilII;
                    }
/* 7 */             iio0OOooilII.I000II(o0iiliOio, o0iiliOio.I00iOIl.I0000oI00(), 1.0f, null);
                }

                public final void I010oio1OO0(O0iiliOio o0iiliOio, int i, OioOIi1o0I oioOIi1o0I, OioOII0OOOI1 oioOII0OOOI1) {
/* 1 */             OioOII0OOOI1[] oioOII0OOOI1Arr = this.I0100o111I;
/* 13 */            OioOII0OOOI1 oioOII0OOOI12 = oioOII0OOOI1Arr != null ? (OioOII0OOOI1) I1IoiO1l.I001iOo1i0O(i, oioOII0OOOI1Arr) : null;
/* 14 */            Iolo11l0l[] iolo11l0lArr = this.I010101Oo1lO;
/* 22 */            Iolo11l0l iolo11l0l = iolo11l0lArr != null ? (Iolo11l0l) I1IoiO1l.I001iOo1i0O(i, iolo11l0lArr) : null;
/* 28 */            if (!O0000Ioio00.I0000O(oioOII0OOOI12, oioOII0OOOI1) || iolo11l0l == null) {
/* 37 */                IIlio101Io iIlio101IoI00000oOI = il0lI1i1olii.I0001Ioi1lo(this).I00000oOI();
/* 41 */                iIlio101IoI00000oOI.getClass();
/* 46 */                iolo11l0l = new Iolo11l0l();
/* 49 */                iolo11l0l.I00ilI0I1 = oioOIi1o0I;
/* 51 */                iolo11l0l.I00ilO0 = iIlio101IoI00000oOI;
/* 55 */                iolo11l0l.I00io1l = 1.0f;
/* 57 */                O0iOOoiioO o0iOOoiioO = O0iOOoiioO.I00iOIl;
/* 59 */                VarHandle.storeStoreFence();
                    }
/* 62 */            OioOII0OOOI1[] oioOII0OOOI1Arr2 = this.I0100o111I;
/* 64 */            if (oioOII0OOOI1Arr2 != null) {
/* 66 */                oioOII0OOOI1Arr2[i] = oioOII0OOOI1;
                    }
/* 68 */            Iolo11l0l[] iolo11l0lArr2 = this.I010101Oo1lO;
/* 70 */            if (iolo11l0lArr2 != null) {
/* 72 */                iolo11l0lArr2[i] = iolo11l0l;
                    }
/* 7 */             iolo11l0l.I000II(o0iiliOio, o0iiliOio.I00iOIl.I0000oI00(), 1.0f, null);
                }

                public final void I01101olii(boolean z) {
                    Oli100iIoOOO oli100iIoOOO;
                    int iI0010I0i;
                    Oli100iIoOOO oli100iIoOOO2;
/* 5 */             if (this.I00lll10) {
/* 9 */                 IOoil1iiIilo iOoil1iiIilo = null;
/* 14 */                Oli100iIoOOO oli100iIoOOO3 = z ? null : this.I00oIiI10;
/* 16 */                if (z) {
/* 18 */                    oli100iIoOOO = this.I00oIiI10;
                        } else {
/* 21 */                    oli100iIoOOO = this.I00oO101o;
/* 23 */                    if (oli100iIoOOO == null) {
/* 27 */                        oli100iIoOOO = new Oli100iIoOOO();
/* 30 */                        this.I00oO101o = oli100iIoOOO;
                            }
                        }
/* 36 */                IiIooOOOI iiIooOOOI = il0lI1i1olii.I000O01llI0(this).I00oliIiO01i;
/* 40 */                OOo0ll111 oOo0ll111 = new OOo0ll111();
/* 43 */                Oi0iOio oi0iOio = this.I00oII;
/* 45 */                IoloOio0I ioloOio0I = oi0iOio.I00lll10;
/* 47 */                Oli100iIoOOO oli100iIoOOO4 = oi0iOio.I00iiO;
/* 51 */                if (ioloOio0I == null || oli100iIoOOO4 == null) {
/* 113 */                   oi0iOio.I00ilI0I1 = null;
                        } else {
/* 55 */                    long jI00IoO0 = ioloOio0I.I00IoO0();
/* 61 */                    if (jI00IoO0 != 0) {
/* 68 */                        long j = jI00IoO0 & 2251799813685247L;
/* 73 */                        int i = (int) (jI00IoO0 >> 50);
/* 76 */                        Oli100iIoOOO oli100iIoOOO5 = new Oli100iIoOOO();
/* 79 */                        IoloOio0I ioloOio0I2 = oi0iOio.I00lll10;
/* 81 */                        if (ioloOio0I2 != null && ((oli100iIoOOO2 = oi0iOio.I00ilO0) != null || (oli100iIoOOO2 = oi0iOio.I00iio) != null)) {
/* 93 */                            Oli100iIoOOO oli100iIoOOO6 = oli100iIoOOO2;
/* 94 */                            Oli100iIoOOO oli100iIoOOO7 = oi0iOio.I00iiO;
/* 96 */                            if (oli100iIoOOO7 != null) {
/* 103 */                               Oli1010II.I00000oIO(oli100iIoOOO6, oli100iIoOOO7, ioloOio0I2, j, i, oli100iIoOOO5);
                                    }
                                }
/* 107 */                       oi0iOio.I00ilI0I1 = oli100iIoOOO5;
                            } else {
/* 110 */                       oi0iOio.I00ilI0I1 = null;
                            }
                        }
/* 119 */               I0IoOl i0IoOl = new I0IoOl(19);
/* 122 */               i0IoOl.I00iio = this;
/* 124 */               i0IoOl.I00iiI = iiIooOOOI;
/* 126 */               i0IoOl.I00ilI0I1 = oli100iIoOOO;
/* 128 */               i0IoOl.I00ilO0 = oli100iIoOOO3;
/* 130 */               i0IoOl.I00iiO = oOo0ll111;
/* 132 */               VarHandle.storeStoreFence();
/* 135 */               l1ioloOOl00l.I00000oIO(this, i0IoOl);
/* 138 */               int i2 = oOo0ll111.I00iOIl;
/* 140 */               if (oli100iIoOOO3 != null) {
/* 149 */                   long j2 = Oli1010II.I00000oOI | Oli1010II.I0000Il00O | Oli1010II.I0000O;
/* 150 */                   long j3 = Oli1010II.I0000oI00;
/* 158 */                   long j4 = j2 | j3 | Oli1010II.I0001Ioi1lo | Oli1010II.I000II;
/* 166 */                   int i3 = Oli1010II.I000O01llI0 | Oli1010II.I000OOo1O | Oli1010II.I000OiO;
/* 167 */                   int i4 = Oli1010II.I000iOII;
/* 175 */                   int i5 = i3 | i4 | Oli1010II.I000l1 | Oli1010II.I000lI;
/* 176 */                   long jI000OOo1O = oli100iIoOOO3.I000OOo1O(oli100iIoOOO, j4);
/* 180 */                   int iI000O01llI0 = oli100iIoOOO3.I000O01llI0(i5, oli100iIoOOO);
/* 192 */                   iI0010I0i = Oli1010II.I000II(jI000OOo1O) | Oli1010II.I0000oI00(iI000O01llI0);
/* 195 */                   if ((iI000O01llI0 & 8) != 0 && ((oli100iIoOOO3.I00000oIO & j3) != 0 || (oli100iIoOOO3.I00000oOI & i4) != 0 || (oli100iIoOOO.I00000oIO & j3) != 0 || (oli100iIoOOO.I00000oOI & i4) != 0)) {
/* 223 */                       iI0010I0i |= 4;
                            }
                        } else {
/* 226 */                   iI0010I0i = oli100iIoOOO.I0010I0i();
                        }
/* 230 */               int i6 = i2 | iI0010I0i;
/* 242 */               int i7 = 3;
/* 243 */               if (!O0000Ioio00.I0000O(this.I00oli.I00000oIO, this.I00oliIiO01i)) {
/* 245 */                   OlIl0i olIl0i = this.I010OIo1l;
/* 247 */                   if (olIl0i != null) {
/* 249 */                       olIl0i.I000II(null);
                            }
/* 254 */                   OI0lOIiOIOOo oI0lOIiOIOOo = this.I00oli.I00000oIO;
/* 256 */                   this.I00oliIiO01i = oI0lOIiOIOOo;
/* 258 */                   if (oI0lOIiOIOOo != null) {
/* 274 */                       this.I010OIo1l = iOi1II01i0.I0000O(I00ooiO1I(), null, null, new Ol110ii1I(this, oI0lOIiOIOOo, iOoil1iiIilo, 6), 3);
                            }
                        }
/* 276 */               if (z) {
/* 437 */                   return;
                        }
/* 283 */               if ((i6 & 1) != 0) {
/* 285 */                   Oli0iol0o0 oli0iol0o0 = this.I00o101lO;
/* 287 */                   if (oli0iol0o0 == null) {
/* 293 */                       I000II.I001IO000("StyleOuterNode with no corresponding StyleInnerNode");
/* 296 */                       return;
                            }
/* 289 */                   l0o11Oi.I00000oOI(oli0iol0o0);
                        }
/* 299 */               if ((i6 & 8) != 0) {
/* 301 */                   l0o11Oi.I00000oOI(this);
                        }
/* 306 */               if ((i6 & 2) != 0) {
/* 308 */                   il1ollIO0I.I00000oIO(this);
/* 311 */                   Oli0iol0o0 oli0iol0o02 = this.I00o101lO;
/* 313 */                   if (oli0iol0o02 == null) {
/* 319 */                       I000II.I001IO000("StyleOuterNode with no corresponding StyleInnerNode");
/* 322 */                       return;
                            }
/* 315 */                   l0o11Oi.I00000oIO(oli0iol0o02);
                        }
/* 325 */               if ((i6 & 4) != 0) {
/* 327 */                   Ol1OiIli00Ii ol1OiIli00Ii = this.I00oo1iO0ll;
/* 329 */                   if (ol1OiIli00Ii == null) {
/* 333 */                       ol1OiIli00Ii = new Ol1OiIli00Ii(i7);
/* 336 */                       ol1OiIli00Ii.I00iiI = this;
/* 338 */                       VarHandle.storeStoreFence();
/* 341 */                       this.I00oo1iO0ll = ol1OiIli00Ii;
                            }
/* 343 */                   l0o11Oi.I0000Il00O(this, ol1OiIli00Ii);
                        }
/* 348 */               if ((i6 & 16) != 0 && this.I00iOIl.I00lll10) {
/* 360 */                   il0lI1i1olii.I000O01llI0(this).I00IO1oi11O();
                        }
/* 365 */               if ((i6 & 32) == 0 || !this.I00iOIl.I00lll10) {
/* 437 */                   return;
                        }
/* 378 */               il0lI1i1olii.I000O01llI0(this).I00II0Ol1O0l(true);
                    }
                }
            }

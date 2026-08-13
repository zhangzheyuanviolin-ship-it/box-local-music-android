            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class IiO0o1I extends OlO1IOi1lli implements OlO01l1oOil {
                public final IllOOo00lI I00iiI;
                public final Ol1lllIil I00iiO;
                public IiO0l11l0O I00iio = new IiO0l11l0O(Ol1l1lI1Ili.I000O01llI0().I000II());

                public IiO0o1I(IllOOo00lI illOOo00lI, Ol1lllIil ol1lllIil) {
/* 4 */             this.I00iiI = illOOo00lI;
/* 6 */             this.I00iiO = ol1lllIil;
                }

                @Override
                public final OlO1Ol0il0i I00000oOI() {
/* 1 */             return this.I00iio;
                }

                /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final IiO0l11l0O I000II(IiO0l11l0O iiO0l11l0O, Ol1il1o1 ol1il1o1, boolean z, IllOOo00lI illOOo00lI) {
                    OI110O0 oi110o0I00000oIO;
                    Ol1lllIil ol1lllIil;
                    int i;
/* 3 */             IiO0l11l0O iiO0l11l0O2 = iiO0l11l0O;
/* 11 */            if (iiO0l11l0O2.I0000Il00O(this, ol1il1o1)) {
/* 13 */                if (z) {
/* 15 */                    oi110o0I00000oIO = Ol1llolil.I00000oIO();
/* 19 */                    Object[] objArr = oi110o0I00000oIO.I00iOIl;
/* 21 */                    int i2 = oi110o0I00000oIO.I00iiO;
/* 24 */                    for (int i3 = 0; i3 < i2; i3++) {
/* 30 */                        ((Ilo1olo) objArr[i3]).I00000oOI();
                            }
                            try {
/* 36 */                        OI0o11I1 oI0o11I1 = iiO0l11l0O2.I0000oI00;
/* 38 */                        IOO000ilo iOO000ilo = Ol1llolil.I00000oIO;
/* 44 */                        IooOIOoo0I01 iooOIOoo0I01 = (IooOIOoo0I01) iOO000ilo.I0010I0i();
/* 46 */                        if (iooOIOoo0I01 == null) {
/* 50 */                            iooOIOoo0I01 = new IooOIOoo0I01();
/* 53 */                            iOO000ilo.I00IO1(iooOIOoo0I01);
                                }
/* 60 */                        int i4 = iooOIOoo0I01.I00000oIO;
/* 62 */                        Object[] objArr2 = oI0o11I1.I00000oOI;
/* 64 */                        int[] iArr = oI0o11I1.I0000Il00O;
/* 66 */                        long[] jArr = oI0o11I1.I00000oIO;
                                int length = jArr.length - 2;
/* 71 */                        if (length >= 0) {
/* 73 */                            int i5 = 0;
                                    while (true) {
/* 74 */                                long j = jArr[i5];
/* 88 */                                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
/* 95 */                                    int i6 = 8;
/* 97 */                                    int i7 = 8 - ((~(i5 - length)) >>> 31);
/* 99 */                                    int i8 = 0;
/* 100 */                                   while (i8 < i7) {
/* 110 */                                       if ((j & 255) < 128) {
/* 114 */                                           int i9 = (i5 << 3) + i8;
/* 122 */                                           OlO11I0O1l olO11I0O1l = (OlO11I0O1l) objArr2[i9];
/* 124 */                                           i = i6;
/* 128 */                                           iooOIOoo0I01.I00000oIO = i4 + iArr[i9];
/* 130 */                                           Function1 function1I0000oI00 = ol1il1o1.I0000oI00();
/* 134 */                                           if (function1I0000oI00 != null) {
/* 136 */                                               function1I0000oI00.invoke(olO11I0O1l);
                                                    }
                                                } else {
/* 140 */                                           i = i6;
                                                }
/* 142 */                                       j >>= i;
/* 144 */                                       i8++;
/* 146 */                                       i6 = i;
                                            }
/* 150 */                                   if (i7 != i6) {
                                                break;
                                            }
/* 152 */                                   if (i5 == length) {
                                                break;
                                            }
/* 154 */                                   i5++;
                                        }
                                    }
                                }
/* 157 */                       iooOIOoo0I01.I00000oIO = i4;
/* 159 */                       Object[] objArr3 = oi110o0I00000oIO.I00iOIl;
/* 161 */                       int i10 = oi110o0I00000oIO.I00iiO;
/* 164 */                       for (int i11 = 0; i11 < i10; i11++) {
/* 170 */                           ((Ilo1olo) objArr3[i11]).I00000oIO();
                                }
                            } catch (Throwable th) {
/* 193 */                       throw th;
                            }
                        }
/* 194 */               return iiO0l11l0O2;
                    }
/* 197 */           OI0o11I1 oI0o11I12 = new OI0o11I1();
/* 200 */           IOO000ilo iOO000ilo2 = Ol1llolil.I00000oIO;
/* 206 */           IooOIOoo0I01 iooOIOoo0I012 = (IooOIOoo0I01) iOO000ilo2.I0010I0i();
/* 208 */           if (iooOIOoo0I012 == null) {
/* 212 */               iooOIOoo0I012 = new IooOIOoo0I01();
/* 215 */               iOO000ilo2.I00IO1(iooOIOoo0I012);
                    }
/* 218 */           int i12 = iooOIOoo0I012.I00000oIO;
/* 220 */           oi110o0I00000oIO = Ol1llolil.I00000oIO();
/* 224 */           Object[] objArr4 = oi110o0I00000oIO.I00iOIl;
/* 226 */           int i13 = oi110o0I00000oIO.I00iiO;
/* 229 */           for (int i14 = 0; i14 < i13; i14++) {
/* 235 */               ((Ilo1olo) objArr4[i14]).I00000oOI();
                    }
                    try {
/* 243 */               iooOIOoo0I012.I00000oIO = i12 + 1;
/* 248 */               IOli1011IlIo iOli1011IlIo = new IOli1011IlIo(1);
/* 251 */               iOli1011IlIo.I00iiO = this;
/* 253 */               iOli1011IlIo.I00iio = iooOIOoo0I012;
/* 255 */               iOli1011IlIo.I00ilI0I1 = oI0o11I12;
/* 257 */               iOli1011IlIo.I00iiI = i12;
/* 259 */               VarHandle.storeStoreFence();
/* 264 */               Object objI000l1 = iOl0lOIi11.I000l1(iOli1011IlIo, illOOo00lI);
/* 268 */               iooOIOoo0I012.I00000oIO = i12;
/* 270 */               Object[] objArr5 = oi110o0I00000oIO.I00iOIl;
/* 272 */               int i15 = oi110o0I00000oIO.I00iiO;
/* 275 */               for (int i16 = 0; i16 < i15; i16++) {
/* 281 */                   ((Ilo1olo) objArr5[i16]).I00000oIO();
                        }
/* 287 */               Object obj = Ol1l1lI1Ili.I0000Il00O;
                        synchronized (obj) {
                            try {
/* 290 */                       Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 294 */                       Object obj2 = iiO0l11l0O2.I0001Ioi1lo;
/* 298 */                       if (obj2 == IiO0l11l0O.I000O01llI0 || (ol1lllIil = this.I00iiO) == null || !ol1lllIil.I0000O(objI000l1, obj2)) {
/* 321 */                           IiO0l11l0O iiO0l11l0O3 = this.I00iio;
                                    synchronized (obj) {
/* 324 */                               OlO1Ol0il0i olO1Ol0il0iI000iOII = Ol1l1lI1Ili.I000iOII(iiO0l11l0O3, this);
/* 328 */                               olO1Ol0il0iI000iOII.I00000oIO(iiO0l11l0O3);
/* 335 */                               olO1Ol0il0iI000iOII.I00000oIO = ol1il1o1I000O01llI0.I000II();
/* 339 */                               iiO0l11l0O2 = (IiO0l11l0O) olO1Ol0il0iI000iOII;
/* 341 */                               iiO0l11l0O2.I0000oI00 = oI0o11I12;
/* 347 */                               iiO0l11l0O2.I000II = iiO0l11l0O2.I0000O(this, ol1il1o1I000O01llI0);
/* 349 */                               iiO0l11l0O2.I0001Ioi1lo = objI000l1;
                                    }
/* 391 */                           return iiO0l11l0O2;
                                }
/* 310 */                       iiO0l11l0O2.I0000oI00 = oI0o11I12;
/* 316 */                       iiO0l11l0O2.I000II = iiO0l11l0O2.I0000O(this, ol1il1o1I000O01llI0);
                            } catch (Throwable th2) {
/* 400 */                       throw th2;
                            }
                        }
/* 358 */               IooOIOoo0I01 iooOIOoo0I013 = (IooOIOoo0I01) Ol1llolil.I00000oIO.I0010I0i();
/* 360 */               if (iooOIOoo0I013 == null || iooOIOoo0I013.I00000oIO != 0) {
/* 395 */                   return iiO0l11l0O2;
                        }
/* 370 */               Ol1l1lI1Ili.I000O01llI0().I000lI();
                        synchronized (obj) {
/* 374 */                   Ol1il1o1 ol1il1o1I000O01llI02 = Ol1l1lI1Ili.I000O01llI0();
/* 382 */                   iiO0l11l0O2.I0000Il00O = ol1il1o1I000O01llI02.I000II();
/* 388 */                   iiO0l11l0O2.I0000O = ol1il1o1I000O01llI02.I000O01llI0();
/* 391 */                   return iiO0l11l0O2;
                        }
                    } finally {
/* 402 */               Object[] objArr6 = oi110o0I00000oIO.I00iOIl;
/* 404 */               int i17 = oi110o0I00000oIO.I00iiO;
/* 407 */               for (int i18 = 0; i18 < i17; i18++) {
/* 413 */                   ((Ilo1olo) objArr6[i18]).I00000oIO();
                        }
                    }
                }

                public final IiO0l11l0O I000O01llI0() {
/* 1 */             Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 16 */            return I000II((IiO0l11l0O) Ol1l1lI1Ili.I000II(this.I00iio, ol1il1o1I000O01llI0), ol1il1o1I000O01llI0, false, this.I00iiI);
                }

                @Override
                public final void I000OOo1O(OlO1Ol0il0i olO1Ol0il0i) {
/* 3 */             this.I00iio = (IiO0l11l0O) olO1Ol0il0i;
                }

                @Override
                public final Object getValue() {
/* 5 */             Function1 function1I0000oI00 = Ol1l1lI1Ili.I000O01llI0().I0000oI00();
/* 9 */             if (function1I0000oI00 != null) {
/* 11 */                function1I0000oI00.invoke(this);
                    }
/* 14 */            Ol1il1o1 ol1il1o1I000O01llI0 = Ol1l1lI1Ili.I000O01llI0();
/* 33 */            return I000II((IiO0l11l0O) Ol1l1lI1Ili.I000II(this.I00iio, ol1il1o1I000O01llI0), ol1il1o1I000O01llI0, true, this.I00iiI).I0001Ioi1lo;
                }

                public final String toString() {
/* 15 */            IiO0l11l0O iiO0l11l0O = (IiO0l11l0O) Ol1l1lI1Ili.I0001Ioi1lo(this.I00iio);
/* 58 */            return "DerivedState(value=" + (iiO0l11l0O.I0000Il00O(this, Ol1l1lI1Ili.I000O01llI0()) ? String.valueOf(iiO0l11l0O.I0001Ioi1lo) : "<Not calculated>") + ")@" + hashCode();
                }
            }

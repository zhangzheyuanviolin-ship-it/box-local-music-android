            package p000;

            import android.text.Layout;
            import java.io.Serializable;
            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public final class II1I00o001 implements Function1 {
                public final int I00iOIl;
                public long I00iiI;
                public Object I00iiO;
                public Serializable I00iio;
                public Object I00ilI0I1;

                public II1I00o001(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke(Object obj) throws Throwable {
                    float f;
                    float f2;
                    IIolilIo iIolilIo;
                    float[] fArr;
                    OoiIlOl1iI ooiIlOl1iI;
                    long j;
                    int i;
                    int i2;
                    boolean z;
                    float fI00000oIO;
                    float fI00000oIO2;
/* 3 */             int i3 = this.I00iOIl;
/* 5 */             OoiIlOl1iI ooiIlOl1iI2 = OoiIlOl1iI.I00000oIO;
                    switch (i3) {
                        case 0:
/* 412 */                   OOo0IO oOo0IO = (OOo0IO) this.I00iiO;
/* 416 */                   OOo0ooi oOo0ooi = (OOo0ooi) this.I00iio;
/* 418 */                   long j2 = this.I00iiI;
/* 423 */                   II0oIl iI0oIl = (II0oIl) this.I00ilI0I1;
/* 427 */                   O0iiliOio o0iiliOio = (O0iiliOio) obj;
/* 429 */                   o0iiliOio.I00000oOI();
/* 432 */                   float f3 = oOo0IO.I00000oIO;
/* 434 */                   float f4 = oOo0IO.I00000oOI;
/* 436 */                   IIolilIo iIolilIo2 = o0iiliOio.I00iOIl;
/* 444 */                   ((IIOOoll) iIolilIo2.I00iiI.I00iiI).I00i0oil(f3, f4);
                            try {
/* 449 */                       I0oO00o i0oO00o = (I0oO00o) oOo0ooi.I00iOIl;
/* 464 */                       iIolilIo = iIolilIo2;
/* 465 */                       f2 = f3;
                                try {
/* 467 */                           IilloIOOO0i.I00Ol1ll1(o0iiliOio, i0oO00o, 0L, j2, 0L, 0L, 0.0f, iI0oIl, 0, 890);
/* 480 */                           ((IIOOoll) iIolilIo.I00iiI.I00iiI).I00i0oil(-f2, -f4);
/* 408 */                           return ooiIlOl1iI2;
                                } catch (Throwable th) {
/* 484 */                           th = th;
/* 485 */                           f = f4;
/* 500 */                           ((IIOOoll) iIolilIo.I00iiI.I00iiI).I00i0oil(-f2, -f);
/* 503 */                           throw th;
                                }
                            } catch (Throwable th2) {
/* 488 */                       th = th2;
/* 489 */                       f = f4;
/* 490 */                       f2 = f3;
/* 491 */                       iIolilIo = iIolilIo2;
                            }
                        default:
/* 10 */                    long j3 = this.I00iiI;
/* 14 */                    float[] fArr2 = (float[]) this.I00iiO;
/* 18 */                    OOo0ll111 oOo0ll111 = (OOo0ll111) this.I00iio;
/* 22 */                    OOo0lO oOo0lO = (OOo0lO) this.I00ilI0I1;
/* 26 */                    OIoiIo0o1O oIoiIo0o1O = (OIoiIo0o1O) obj;
/* 28 */                    int i4 = oIoiIo0o1O.I00000oOI;
/* 30 */                    I0oilIol11i i0oilIol11i = oIoiIo0o1O.I00000oIO;
/* 32 */                    int iI0001Ioi1lo = oIoiIo0o1O.I0000Il00O;
/* 43 */                    int iI000II = i4 > Oo0lI00l.I000II(j3) ? oIoiIo0o1O.I00000oOI : Oo0lI00l.I000II(j3);
/* 51 */                    if (iI0001Ioi1lo >= Oo0lI00l.I0001Ioi1lo(j3)) {
/* 54 */                        iI0001Ioi1lo = Oo0lI00l.I0001Ioi1lo(j3);
                            }
/* 66 */                    long jI00000oIO = lOliOi0Oi.I00000oIO(oIoiIo0o1O.I0000O(iI000II), oIoiIo0o1O.I0000O(iI0001Ioi1lo));
/* 70 */                    int i5 = oOo0ll111.I00iOIl;
/* 72 */                    Oo0iOioO oo0iOioO = i0oilIol11i.I0000Il00O;
/* 74 */                    int iI000II2 = Oo0lI00l.I000II(jI00000oIO);
/* 78 */                    int iI0001Ioi1lo2 = Oo0lI00l.I0001Ioi1lo(jI00000oIO);
/* 82 */                    Layout layout = oo0iOioO.I0001Ioi1lo;
/* 88 */                    int length = layout.getText().length();
/* 92 */                    if (iI000II2 < 0) {
/* 97 */                        Ioliol.I00000oIO("startOffset must be > 0");
                            }
/* 100 */                   if (iI000II2 >= length) {
/* 105 */                       Ioliol.I00000oIO("startOffset must be less than text length");
                            }
/* 108 */                   if (iI0001Ioi1lo2 <= iI000II2) {
/* 113 */                       Ioliol.I00000oIO("endOffset must be greater than startOffset");
                            }
/* 116 */                   if (iI0001Ioi1lo2 > length) {
/* 121 */                       Ioliol.I00000oIO("endOffset must be smaller or equal to text length");
                            }
/* 130 */                   if (fArr2.length - i5 < (iI0001Ioi1lo2 - iI000II2) * 4) {
/* 135 */                       Ioliol.I00000oIO("array.size - arrayStart must be greater or equal than (endOffset - startOffset) * 4");
                            }
/* 138 */                   int iI000II3 = oo0iOioO.I000II(iI000II2);
/* 144 */                   int iI000II4 = oo0iOioO.I000II(iI0001Ioi1lo2 - 1);
/* 150 */                   IoI1IiioI ioI1IiioI = new IoI1IiioI();
/* 153 */                   ioI1IiioI.I0000Il00O = oo0iOioO;
/* 156 */                   ioI1IiioI.I00000oIO = -1;
/* 158 */                   VarHandle.storeStoreFence();
/* 161 */                   if (iI000II3 <= iI000II4) {
/* 163 */                       int i6 = i5;
                                while (true) {
/* 165 */                           int lineStart = layout.getLineStart(iI000II3);
/* 169 */                           fArr = fArr2;
/* 171 */                           int iI0001Ioi1lo3 = oo0iOioO.I0001Ioi1lo(iI000II3);
/* 175 */                           int iMax = Math.max(iI000II2, lineStart);
/* 179 */                           int iMin = Math.min(iI0001Ioi1lo2, iI0001Ioi1lo3);
/* 183 */                           float fI000O01llI0 = oo0iOioO.I000O01llI0(iI000II3);
/* 187 */                           float fI0000oI00 = oo0iOioO.I0000oI00(iI000II3);
/* 191 */                           ooiIlOl1iI = ooiIlOl1iI2;
/* 197 */                           j = jI00000oIO;
/* 204 */                           boolean z2 = layout.getParagraphDirection(iI000II3) == 1;
/* 205 */                           while (iMax < iMin) {
/* 207 */                               boolean zIsRtlCharAt = layout.isRtlCharAt(iMax);
/* 211 */                               if (!z2 || zIsRtlCharAt) {
/* 233 */                                   i2 = iMin;
/* 235 */                                   if (z2 && zIsRtlCharAt) {
/* 240 */                                       float fI00000oIO3 = ioI1IiioI.I00000oIO(iMax, false, false, false);
/* 244 */                                       z = z2;
/* 248 */                                       fI00000oIO = ioI1IiioI.I00000oIO(iMax + 1, true, true, false);
/* 255 */                                       fI00000oIO2 = fI00000oIO3;
                                            } else {
/* 258 */                                       z = z2;
/* 261 */                                       if (z || !zIsRtlCharAt) {
/* 276 */                                           fI00000oIO = ioI1IiioI.I00000oIO(iMax, false, false, false);
/* 282 */                                           fI00000oIO2 = ioI1IiioI.I00000oIO(iMax + 1, true, true, false);
                                                } else {
/* 265 */                                           fI00000oIO2 = ioI1IiioI.I00000oIO(iMax, false, false, true);
/* 271 */                                           fI00000oIO = ioI1IiioI.I00000oIO(iMax + 1, true, true, true);
                                                }
                                            }
                                        } else {
/* 215 */                                   i2 = iMin;
/* 218 */                                   fI00000oIO = ioI1IiioI.I00000oIO(iMax, false, false, true);
/* 228 */                                   z = z2;
/* 224 */                                   fI00000oIO2 = ioI1IiioI.I00000oIO(iMax + 1, true, true, true);
                                        }
/* 286 */                               fArr[i6] = fI00000oIO;
/* 290 */                               fArr[i6 + 1] = fI000O01llI0;
/* 294 */                               fArr[i6 + 2] = fI00000oIO2;
/* 298 */                               fArr[i6 + 3] = fI0000oI00;
/* 300 */                               i6 += 4;
/* 302 */                               iMax++;
/* 304 */                               z2 = z;
/* 306 */                               iMin = i2;
                                    }
/* 309 */                           i = 0;
/* 310 */                           if (iI000II3 != iI000II4) {
/* 312 */                               iI000II3++;
/* 314 */                               fArr2 = fArr;
/* 316 */                               ooiIlOl1iI2 = ooiIlOl1iI;
/* 318 */                               jI00000oIO = j;
                                    }
                                }
                            } else {
/* 322 */                       fArr = fArr2;
/* 324 */                       ooiIlOl1iI = ooiIlOl1iI2;
/* 326 */                       j = jI00000oIO;
/* 328 */                       i = 0;
                            }
/* 334 */                   if (i0oilIol11i.I0001Ioi1lo != 0.0f) {
/* 337 */                       int iI0000oI00 = Oo0lI00l.I0000oI00(j);
/* 342 */                       for (int i7 = i; i7 < iI0000oI00; i7++) {
/* 346 */                           int i8 = (i7 * 4) + i5;
/* 347 */                           int i9 = i8 + 1;
/* 349 */                           float f5 = fArr[i9];
/* 351 */                           float f6 = i0oilIol11i.I0001Ioi1lo;
/* 354 */                           fArr[i9] = f5 + f6;
/* 356 */                           int i10 = i8 + 3;
/* 361 */                           fArr[i10] = fArr[i10] + f6;
                                }
                            }
/* 374 */                   int iI0000oI002 = (Oo0lI00l.I0000oI00(j) * 4) + oOo0ll111.I00iOIl;
/* 377 */                   for (int i11 = oOo0ll111.I00iOIl; i11 < iI0000oI002; i11 += 4) {
/* 379 */                       int i12 = i11 + 1;
/* 381 */                       float f7 = fArr[i12];
/* 383 */                       float f8 = oOo0lO.I00iOIl;
/* 386 */                       fArr[i12] = f7 + f8;
/* 388 */                       int i13 = i11 + 3;
/* 393 */                       fArr[i13] = fArr[i13] + f8;
                            }
/* 398 */                   oOo0ll111.I00iOIl = iI0000oI002;
                            oOo0lO.I00iOIl += i0oilIol11i.I0000oI00;
/* 407 */                   return ooiIlOl1iI;
                    }
                }
            }

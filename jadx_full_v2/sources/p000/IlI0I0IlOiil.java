            package p000;

            import android.graphics.Rect;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class IlI0I0IlOiil implements Function1 {
                public O110ooO1O I00iOIl;
                public long I00iiI;
                public long I00iiO;
                public long I00iio;
                public boolean I00ilI0I1;
                public Oo0ioO I00ilO0;

                @Override
                public final Object invoke(Object obj) throws Throwable {
                    int i;
                    IOO000ilo iOO000ilo;
                    long j;
/* 3 */             O110ooO1O o110ooO1O = this.I00iOIl;
/* 5 */             long j2 = this.I00iiI;
/* 7 */             long j3 = this.I00iiO;
/* 9 */             long j4 = this.I00iio;
/* 11 */            boolean z = this.I00ilI0I1;
/* 13 */            Oo0ioO oo0ioO = this.I00ilO0;
/* 17 */            IilloIOOO0i iilloIOOO0i = (IilloIOOO0i) obj;
/* 19 */            float f = o110ooO1O.I00000oIO;
/* 22 */            float f2 = o110ooO1O.I00000oOI;
/* 34 */            float fIntBitsToFloat = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() >> 32));
/* 50 */            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (iilloIOOO0i.I0000oI00() & 4294967295L));
/* 58 */            if (f > 0.0f && f2 > 0.0f && fIntBitsToFloat > 0.0f && fIntBitsToFloat2 > 0.0f) {
/* 87 */                float f3 = f / f2 > fIntBitsToFloat / fIntBitsToFloat2 ? fIntBitsToFloat2 / f2 : fIntBitsToFloat / f;
/* 95 */                float f4 = (f - (fIntBitsToFloat / f3)) / 2.0f;
/* 100 */               float f5 = (f2 - (fIntBitsToFloat2 / f3)) / 2.0f;
/* 106 */               Iterator it = o110ooO1O.I0000O.iterator();
                        while (true) {
/* 114 */                   i = 0;
/* 115 */                   if (!it.hasNext()) {
                                break;
                            }
/* 121 */                   float[] fArr = (float[]) it.next();
                            while (true) {
/* 123 */                       int i2 = i + 4;
/* 126 */                       if (i2 <= fArr.length) {
/* 132 */                           float f6 = (fArr[i] - f4) * f3;
/* 156 */                           long jFloatToRawIntBits = (Float.floatToRawIntBits((fArr[i + 1] - f5) * f3) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
/* 163 */                           float f7 = (fArr[i + 2] - f4) * f3;
/* 182 */                           float[] fArr2 = fArr;
/* 191 */                           long jFloatToRawIntBits2 = (Float.floatToRawIntBits((fArr[i + 3] - f5) * f3) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32);
/* 207 */                           j2 = j2;
/* 209 */                           IilloIOOO0i iilloIOOO0i2 = iilloIOOO0i;
/* 215 */                           IilloIOOO0i.I00oli(iilloIOOO0i2, j2, jFloatToRawIntBits, jFloatToRawIntBits2, 1.2f, 0, null, 496);
/* 220 */                           iilloIOOO0i = iilloIOOO0i2;
/* 222 */                           fArr = fArr2;
/* 223 */                           i = i2;
/* 225 */                           j4 = j4;
                                }
                            }
                        }
/* 228 */               long j5 = j4;
/* 230 */               IilloIOOO0i iilloIOOO0i3 = iilloIOOO0i;
/* 236 */               Iterator it2 = o110ooO1O.I0000Il00O.iterator();
/* 244 */               while (it2.hasNext()) {
/* 250 */                   O110oiIo00 o110oiIo00 = (O110oiIo00) it2.next();
/* 259 */                   long j6 = o110oiIo00.I00000oOI != null ? j3 : j5;
/* 261 */                   Rect rect = o110oiIo00.I00000oIO;
/* 268 */                   float f8 = (rect.left - f4) * f3;
/* 275 */                   float f9 = (rect.top - f5) * f3;
/* 356 */                   IilloIOOO0i.I00ilI0I1(iilloIOOO0i3, j6, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f9) & 4294967295L), (Float.floatToRawIntBits(((rect.right - f4) * f3) - f8) << 32) | (Float.floatToRawIntBits(((rect.bottom - f5) * f3) - f9) & 4294967295L), 0.0f, new OlOooI0l0011(iilloIOOO0i3.I00i0ilIl0i(3.0f), 0.0f, 0, 0, null, 30), 0, 104);
/* 359 */                   long j7 = j6;
/* 361 */                   String str = o110oiIo00.I00000oOI;
/* 363 */                   if (str == null) {
/* 365 */                       str = "Unknown";
                            }
/* 439 */                   Oo0ioO oo0ioO2 = oo0ioO;
/* 449 */                   Oo0iil0o0oI oo0iil0o0oII00000oIO = Oo0ioO.I00000oIO(oo0ioO2, new I1111OO10i(str.concat(z ? IIlIOloOOO.I00100l0("  ", (int) (o110oiIo00.I0000Il00O * 100.0f), "%") : "")), new Oo0lloOiiIOI(IOOiio0i.I0001Ioi1lo, lOlilO1lOIO.I0000O(13), null, null, 0L, 0L, 0, 0L, 16777212), IOo0olo.I00000oOI(i, i, i, i, 15), oo0ioO.I0000Il00O, oo0ioO.I00000oOI, oo0ioO.I00000oIO, 32);
/* 463 */                   float f10 = f9 - ((int) (oo0iil0o0oII00000oIO.I0000Il00O & 4294967295L));
/* 466 */                   if (f10 < 0.0f) {
/* 468 */                       f10 = 0.0f;
                            }
/* 479 */                   Iterator it3 = it2;
/* 481 */                   IilloIOOO0i iilloIOOO0i4 = iilloIOOO0i3;
/* 521 */                   IilloIOOO0i.I00ilI0I1(iilloIOOO0i4, j7, (Float.floatToRawIntBits(f8) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L), (Float.floatToRawIntBits(((int) (r10 >> 32)) + 8.0f) << 32) | (Float.floatToRawIntBits(r4) & 4294967295L), 0.0f, null, 0, 120);
/* 541 */                   long jFloatToRawIntBits3 = (Float.floatToRawIntBits(f8 + 4.0f) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
/* 542 */                   OI0OIIiOi oI0OIIiOi = oo0iil0o0oII00000oIO.I00000oOI;
/* 544 */                   long j8 = IOOiio0i.I000o00OoI0I;
/* 546 */                   Oo0iiO1 oo0iiO1 = oo0iil0o0oII00000oIO.I00000oIO;
/* 550 */                   OlIIi1oIIOlo olIIi1oIIOlo = oo0iiO1.I00000oOI.I00000oIO;
/* 552 */                   OioOII0oI oioOII0oI = olIIi1oIIOlo.I000o00OoI0I;
/* 555 */                   OlooIOI0O olooIOI0O = olIIi1oIIOlo.I000lI;
/* 557 */                   Iilloo0IOoIo iilloo0IOoIo = olIIi1oIIOlo.I00100l0;
/* 559 */                   IOO000ilo iOO000iloI00iiI = iilloIOOO0i4.I00iiI();
/* 565 */                   long jI001iOo1i0O = iOO000iloI00iiI.I001iOo1i0O();
/* 573 */                   iOO000iloI00iiI.I0010o().I000II();
                            try {
/* 582 */                       IIOOoll iIOOoll = (IIOOoll) iOO000iloI00iiI.I00iiI;
/* 602 */                       iIOOoll.I00i0oil(Float.intBitsToFloat((int) (jFloatToRawIntBits3 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits3 & 4294967295L)));
/* 605 */                       lOliOOi10l.I00000oIO(iIOOoll, oo0iil0o0oII00000oIO);
/* 608 */                       Oo0lloOiiIOI oo0lloOiiIOI = oo0iiO1.I00000oOI;
/* 611 */                       III11l1I iII11l1II0000Il00O = oo0lloOiiIOI.I0000Il00O();
/* 619 */                       if (iII11l1II0000Il00O == null || j8 != 16) {
/* 692 */                           iOO000ilo = iOO000iloI00iiI;
/* 694 */                           j = jI001iOo1i0O;
                                    try {
/* 696 */                               oI0OIIiOi.I000OOo1O(iilloIOOO0i4.I00iiI().I0010o(), lOl01i0i00.I00000oIO(Float.NaN, j8 != 16 ? j8 : oo0lloOiiIOI.I0000O()), oioOII0oI, olooIOI0O, iilloo0IOoIo, 3);
                                    } catch (Throwable th) {
/* 711 */                               th = th;
/* 712 */                               IIlIOloOOO.I001IO000(iOO000ilo, j);
/* 715 */                               throw th;
                                    }
                                } else {
/* 653 */                           iOIliilOOIIo.I00000oIO(oI0OIIiOi, iilloIOOO0i4.I00iiI().I0010o(), iII11l1II0000Il00O, Float.isNaN(Float.NaN) ? oo0lloOiiIOI.I00000oIO.I00000oIO.I0000Il00O() : Float.NaN, oioOII0oI, olooIOI0O, iilloo0IOoIo);
/* 656 */                           iOO000ilo = iOO000iloI00iiI;
/* 657 */                           j = jI001iOo1i0O;
                                }
/* 699 */                       IIlIOloOOO.I001IO000(iOO000ilo, j);
/* 702 */                       it2 = it3;
/* 704 */                       iilloIOOO0i3 = iilloIOOO0i4;
/* 706 */                       oo0ioO = oo0ioO2;
/* 708 */                       i = 0;
                            } catch (Throwable th2) {
/* 660 */                       th = th2;
/* 661 */                       iOO000ilo = iOO000iloI00iiI;
/* 662 */                       j = jI001iOo1i0O;
                            }
                        }
                    }
/* 716 */           return OoiIlOl1iI.I00000oIO;
                }
            }

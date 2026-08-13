            package p000;

            import android.graphics.Rect;
            import android.view.View;
            import com.google.ai.edge.gallery.data.RuntimeType;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
/* 16 */    public final class IOOllI0o implements Function1 {
                public final int I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public Object I00iio;
                public Object I00ilI0I1;
                public Object I00ilO0;

                public IOOllI0o(int i, Ii0110 ii0110, OI10i0Il oI10i0Il, OI10i0Il oI10i0Il2, IllOOo00lI illOOo00lI) {
/* 2 */             this.I00iOIl = 2;
/* 7 */             this.I00iiI = i;
/* 9 */             this.I00iiO = ii0110;
/* 11 */            this.I00iio = oI10i0Il;
/* 13 */            this.I00ilI0I1 = oI10i0Il2;
/* 15 */            this.I00ilO0 = illOOo00lI;
                }

                /* JADX WARN: Removed duplicated region for block: B:86:0x026e  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    int iI000II;
                    Object objI00i01iIIliI;
                    Object value;
/* 1 */             int i = this.I00iOIl;
/* 4 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
                    switch (i) {
                        case 0:
/* 635 */                   OO1I0001000i[] oO1I0001000iArr = (OO1I0001000i[]) this.I00iiO;
/* 639 */                   IOOlo1O01O iOOlo1O01O = (IOOlo1O01O) this.I00iio;
/* 641 */                   int i2 = this.I00iiI;
/* 645 */                   O1iOIoOiO0 o1iOIoOiO0 = (O1iOIoOiO0) this.I00ilI0I1;
/* 649 */                   int[] iArr = (int[]) this.I00ilO0;
/* 651 */                   OO11o0IO oO11o0IO = (OO11o0IO) obj;
/* 653 */                   int length = oO1I0001000iArr.length;
/* 654 */                   int i3 = 0;
/* 655 */                   while (i < length) {
/* 657 */                       OO1I0001000i oO1I0001000i = oO1I0001000iArr[i];
/* 659 */                       int i4 = i3 + 1;
/* 661 */                       Object objI00II0Ol1O0l = oO1I0001000i.I00II0Ol1O0l();
/* 672 */                       OiI1Olo1I oiI1Olo1I = objI00II0Ol1O0l instanceof OiI1Olo1I ? (OiI1Olo1I) objI00II0Ol1O0l : null;
/* 673 */                       O0iOOoiioO layoutDirection = o1iOIoOiO0.getLayoutDirection();
/* 682 */                       il00OIo0O il00oio0o = oiI1Olo1I != null ? oiI1Olo1I.I0000Il00O : null;
/* 2 */                         oO11o0IO.I000O01llI0(oO1I0001000i, il00oio0o != null ? il00oio0o.I00000oIO(i2, oO1I0001000i.I00iOIl, layoutDirection) : iOOlo1O01O.I00000oOI.I00000oIO(oO1I0001000i.I00iOIl, i2, layoutDirection), iArr[i3], 0.0f);
/* 705 */                       i++;
/* 707 */                       i3 = i4;
                            }
/* 709 */                   return ooiIlOl1iI;
                        case 1:
/* 509 */                   i00I1l11OlI i00i1l11oli = (i00I1l11OlI) this.I00iiO;
/* 511 */                   int i5 = this.I00iiI;
/* 515 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00iio;
/* 519 */                   OIooi1iOiOol oIooi1iOiOol = (OIooi1iOiOol) this.I00ilI0I1;
/* 523 */                   OIooi1iOiOol oIooi1iOiOol2 = (OIooi1iOiOol) this.I00ilO0;
/* 525 */                   O0iOOo0Ii o0iOOo0Ii = (O0iOOo0Ii) obj;
/* 527 */                   oI10i0Il.setValue(o0iOOo0Ii);
/* 538 */                   oIooi1iOiOol.I000O01llI0((int) (o0iOOo0Ii.I000iOII() >> 32));
/* 541 */                   View view = i00i1l11oli.I00000oIO;
/* 545 */                   Rect rect = new Rect();
/* 548 */                   view.getWindowVisibleDisplayFrame(rect);
/* 551 */                   int i6 = rect.top;
/* 553 */                   int i7 = rect.bottom;
/* 559 */                   O0iOOo0Ii o0iOOo0Ii2 = (O0iOOo0Ii) oI10i0Il.getValue();
/* 589 */                   OOo0IO oOo0IOI00000oIO = (o0iOOo0Ii2 == null || !o0iOOo0Ii2.I0010o()) ? OOo0IO.I0000oI00 : lIl0looO.I00000oIO(o0iOOo0Ii2.I0000O(0L), l000O1l.I00000oOI(o0iOOo0Ii2.I000iOII()));
/* 591 */                   int i8 = i6 + i5;
/* 593 */                   int i9 = i7 - i5;
/* 595 */                   float f = oOo0IOI00000oIO.I00000oOI;
/* 600 */                   if (f <= i7) {
/* 602 */                       float f2 = oOo0IOI00000oIO.I0000O;
/* 623 */                       iI000II = f2 < ((float) i6) ? i9 - i8 : O1OooO0IlOo.I000II(Math.max(f - i8, i9 - f2));
                            }
/* 629 */                   oIooi1iOiOol2.I000O01llI0(Math.max(iI000II, 0));
/* 632 */                   return ooiIlOl1iI;
                        case 2:
/* 389 */                   int i10 = this.I00iiI;
/* 393 */                   Ii0110 ii0110 = (Ii0110) this.I00iiO;
/* 397 */                   OlO01l1oOil olO01l1oOil = (OlO01l1oOil) this.I00iio;
/* 401 */                   OI10i0Il oI10i0Il2 = (OI10i0Il) this.I00ilI0I1;
/* 405 */                   IllOOo00lI illOOo00lI = (IllOOo00lI) this.I00ilO0;
/* 407 */                   List list = (List) obj;
/* 426 */                   boolean z = ((O1oiOloOo) olO01l1oOil.getValue()).I000II.I00100l0 == RuntimeType.AICORE;
/* 432 */                   int i11 = (z ? 1 : 10) - i10;
/* 433 */                   i = i11 >= 0 ? i11 : 0;
/* 452 */                   if (list.size() + ((List) oI10i0Il2.getValue()).size() <= i) {
/* 464 */                       objI00i01iIIliI = IOOi0Ool1i.I00O10llo((List) oI10i0Il2.getValue(), list);
                            } else {
/* 469 */                       if (z) {
/* 471 */                           IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 482 */                           iOi1II01i0.I0000O(ii0110, O1OI1l011OO1.I00000oIO, null, new Iil01I1I(illOOo00lI, null, 3), 2);
                                }
/* 499 */                       objI00i01iIIliI = IOOi0Ool1i.I00i01iIIliI(IOOi0Ool1i.I00O10llo((List) oI10i0Il2.getValue(), list), i);
                            }
/* 503 */                   oI10i0Il2.setValue(objI00i01iIIliI);
/* 506 */                   return ooiIlOl1iI;
                        case 3:
/* 219 */                   IiloOlIoIool iiloOlIoIool = (IiloOlIoIool) this.I00iiO;
/* 221 */                   int i12 = this.I00iiI;
/* 225 */                   ArrayList arrayList = (ArrayList) this.I00iio;
/* 229 */                   OI10i0Il oI10i0Il3 = (OI10i0Il) this.I00ilI0I1;
/* 233 */                   OIooO1iiliI oIooO1iiliI = (OIooO1iiliI) this.I00ilO0;
/* 235 */                   OO11o0IO oO11o0IO2 = (OO11o0IO) obj;
/* 237 */                   I0l1OOl1l10 i0l1OOl1l10 = iiloOlIoIool.I00000oOI;
/* 239 */                   Ii1loIll001 ii1loIll001I0000Il00O = i0l1OOl1l10.I0000Il00O();
/* 245 */                   IiO0o1I iiO0o1I = (IiO0o1I) i0l1OOl1l10.I000iOII;
/* 249 */                   OIooO1iiliI oIooO1iiliI2 = (OIooO1iiliI) i0l1OOl1l10.I000l1;
/* 253 */                   float fI0001Ioi1lo = ii1loIll001I0000Il00O.I0001Ioi1lo(IiloiO.I00iOIl);
/* 258 */                   float f3 = -i12;
/* 259 */                   OoIoO0I0oOI ooIoO0I0oOI = OII0IoiI.I00000oIO;
/* 271 */                   if (!((Boolean) oI10i0Il3.getValue()).booleanValue() || fI0001Ioi1lo != f3) {
/* 288 */                       if (!((Boolean) oI10i0Il3.getValue()).booleanValue()) {
/* 292 */                           oI10i0Il3.setValue(Boolean.TRUE);
                                }
/* 295 */                       oIooO1iiliI.I000O01llI0(f3);
/* 301 */                       I1i1OOi1iIo i1i1OOi1iIo = new I1i1OOi1iIo(4);
/* 304 */                       i1i1OOi1iIo.I00iiI = oIooO1iiliI;
/* 306 */                       VarHandle.storeStoreFence();
/* 309 */                       Ii1loIll001 ii1loIll001I00000oIO = I0l0lIoOIoIi.I00000oIO(i1i1OOi1iIo);
/* 321 */                       if (Float.isNaN(oIooO1iiliI2.I000II()) || (value = ii1loIll001I00000oIO.I00000oIO(oIooO1iiliI2.I000II())) == null) {
/* 333 */                           value = iiO0o1I.getValue();
                                }
/* 342 */                       i0l1OOl1l10.I000II(ii1loIll001I00000oIO, value);
                            }
/* 345 */                   float fI000II = oIooO1iiliI.I000II();
/* 366 */                   if (lIiioliIlo.I00000oOI((i0l1OOl1l10.I0001Ioi1lo() - fI000II) / (0.0f - fI000II), 0.0f, 1.0f) != 0.0f) {
/* 369 */                       int size = arrayList.size();
/* 374 */                       for (int i13 = 0; i13 < size; i13++) {
/* 382 */                           OO11o0IO.I000iOII(oO11o0IO2, (OO1I0001000i) arrayList.get(i13), 0, 0);
                                }
                            }
/* 388 */                   return ooiIlOl1iI;
                        case 4:
/* 160 */                   IliIO10oO0 iliIO10oO0 = (IliIO10oO0) this.I00iiO;
/* 164 */                   IliIO10oO0 iliIO10oO02 = (IliIO10oO0) this.I00iio;
/* 168 */                   IliIO10oO0 iliIO10oO03 = (IliIO10oO0) this.I00ilI0I1;
/* 170 */                   int i14 = this.I00iiI;
/* 174 */                   I01oIoOI01l i01oIoOI01l = (I01oIoOI01l) this.I00ilO0;
/* 176 */                   II0IOiOo iI0IOiOo = (II0IOiOo) obj;
/* 194 */                   if (iliIO10oO0 != ((Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO02)).getFocusOwner()).I000II()) {
/* 196 */                       return Boolean.TRUE;
                            }
/* 199 */                   boolean zI0001Ioi1lo = l1l0oo0l.I0001Ioi1lo(iliIO10oO02, iliIO10oO03, i14, i01oIoOI01l);
/* 203 */                   Boolean boolValueOf = Boolean.valueOf(zI0001Ioi1lo);
/* 207 */                   if (zI0001Ioi1lo || !iI0IOiOo.I00000oIO()) {
/* 215 */                       return boolValueOf;
                            }
/* 3 */                     return null;
                        case 5:
/* 71 */                    ArrayList arrayList2 = (ArrayList) this.I00iiO;
/* 75 */                    ArrayList arrayList3 = (ArrayList) this.I00iio;
/* 79 */                    ArrayList arrayList4 = (ArrayList) this.I00ilI0I1;
/* 83 */                    OOo0ll111 oOo0ll111 = (OOo0ll111) this.I00ilO0;
/* 85 */                    int i15 = this.I00iiI;
/* 87 */                    OO11o0IO oO11o0IO3 = (OO11o0IO) obj;
/* 89 */                    int size2 = arrayList2.size();
/* 94 */                    for (int i16 = 0; i16 < size2; i16++) {
/* 105 */                       OO11o0IO.I000iOII(oO11o0IO3, (OO1I0001000i) arrayList2.get(i16), oOo0ll111.I00iOIl * i16, 0);
                            }
/* 111 */                   int size3 = arrayList3.size();
/* 116 */                   for (int i17 = 0; i17 < size3; i17++) {
/* 122 */                       OO1I0001000i oO1I0001000i2 = (OO1I0001000i) arrayList3.get(i17);
/* 128 */                       OO11o0IO.I000iOII(oO11o0IO3, oO1I0001000i2, 0, i15 - oO1I0001000i2.I00iiI);
                            }
/* 134 */                   int size4 = arrayList4.size();
/* 139 */                   for (int i18 = 0; i18 < size4; i18++) {
/* 145 */                       OO1I0001000i oO1I0001000i3 = (OO1I0001000i) arrayList4.get(i18);
/* 151 */                       OO11o0IO.I000iOII(oO11o0IO3, oO1I0001000i3, 0, i15 - oO1I0001000i3.I00iiI);
                            }
/* 157 */                   return ooiIlOl1iI;
                        default:
/* 12 */                    IliIO10oO0 iliIO10oO04 = (IliIO10oO0) this.I00iiO;
/* 16 */                    IliIO10oO0 iliIO10oO05 = (IliIO10oO0) this.I00iio;
/* 20 */                    OOo0IO oOo0IO = (OOo0IO) this.I00ilI0I1;
/* 22 */                    int i19 = this.I00iiI;
/* 26 */                    I01oIoOI01l i01oIoOI01l2 = (I01oIoOI01l) this.I00ilO0;
/* 28 */                    II0IOiOo iI0IOiOo2 = (II0IOiOo) obj;
/* 46 */                    if (iliIO10oO04 != ((Ili1ioOlo0oO) ((I0lio1O01i01) il0lI1i1olii.I000OOo1O(iliIO10oO05)).getFocusOwner()).I000II()) {
/* 48 */                        return Boolean.TRUE;
                            }
/* 51 */                    boolean zI000OiO = lOoOol0.I000OiO(i19, i01oIoOI01l2, iliIO10oO05, oOo0IO);
/* 55 */                    Boolean boolValueOf2 = Boolean.valueOf(zI000OiO);
/* 59 */                    if (zI000OiO || !iI0IOiOo2.I00000oIO()) {
/* 67 */                        return boolValueOf2;
                            }
/* 3 */                     return null;
                    }
                }

/* 17 */        public IOOllI0o(int i) {
/* 18 */            this.I00iOIl = i;
                }
            }

            package p000;

            import android.graphics.Rect;
            import android.view.View;
            import android.view.WindowInsetsAnimation;
            import java.util.List;
            import java.util.WeakHashMap;
            
            public final class Ioo0oO1 extends IO0i1l1Io implements Runnable, OIOloIl1oo1, View.OnAttachStateChangeListener {
                public boolean I00iiI;
                public int I00iiO;
                public i00iooo00li I00iio;
                public OI10I1IoI0Ol I00ilI0I1;
                public OIooi1iOiOol I00ilO0;
                public OI0oiiIO0 I00io1l;
                public Ol1o0O0O0 I00ioIO;

                @Override
                public final void I00000oOI(i00O10oO1ll i00o10oo1ll) {
/* 1 */             boolean z = false;
/* 2 */             this.I00iiI = false;
/* 10 */            int typeMask = ((WindowInsetsAnimation) i00o10oo1ll.I00000oIO.I00iiI).getTypeMask();
                    this.I00iiO &= ~typeMask;
/* 21 */            this.I00iio = null;
/* 29 */            i00li00iOi i00li00ioi = (i00li00iOi) i00llOioIoi.I00000oIO.I00000oOI(typeMask);
/* 31 */            if (i00li00ioi != null) {
/* 39 */                i010O0loi1l i010o0loi1l = (i010O0loi1l) this.I00ilI0I1.I000II(i00li00ioi);
/* 44 */                i010o0loi1l.I0000Il00O.I000O01llI0(0.0f);
/* 51 */                i010o0loi1l.I0000oI00.I000O01llI0(1.0f);
/* 58 */                i010o0loi1l.I0000O.I000O01llI0(0L);
/* 63 */                i010o0loi1l.I0000Il00O.I000O01llI0(0.0f);
/* 70 */                i010o0loi1l.I00000oOI.setValue(Boolean.FALSE);
/* 75 */                i010o0loi1l.I000OiO = -1L;
/* 77 */                i010o0loi1l.I000iOII = -1L;
/* 79 */                OIooi1iOiOol oIooi1iOiOol = this.I00ilO0;
/* 87 */                oIooi1iOiOol.I000O01llI0(oIooi1iOiOol.I000II() + 1);
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 95 */                    OI10IIO oi10iio = Ol1l1lI1Ili.I000OiO.I000O01llI0;
/* 97 */                    if (oi10iio != null) {
/* 103 */                       if (oi10iio.I000O01llI0()) {
/* 105 */                           z = true;
                                }
                            }
                        }
/* 107 */               if (z) {
/* 109 */                   Ol1l1lI1Ili.I0000Il00O();
                        }
                    }
                }

                @Override
                public final void I0000Il00O(i00O10oO1ll i00o10oo1ll) {
/* 2 */             this.I00iiI = true;
                }

                @Override
                public final i00iooo00li I0000O(i00iooo00li i00iooo00liVar, List list) {
/* 4 */             int size = list.size();
/* 9 */             for (int i = 0; i < size; i++) {
/* 15 */                i00O10oO1ll i00o10oo1ll = (i00O10oO1ll) list.get(i);
/* 33 */                i00li00iOi i00li00ioi = (i00li00iOi) i00llOioIoi.I00000oIO.I00000oOI(((WindowInsetsAnimation) i00o10oo1ll.I00000oIO.I00iiI).getTypeMask());
/* 35 */                if (i00li00ioi != null) {
/* 43 */                    i010O0loi1l i010o0loi1l = (i010O0loi1l) this.I00ilI0I1.I000II(i00li00ioi);
/* 57 */                    if (((Boolean) i010o0loi1l.I00000oOI.getValue()).booleanValue()) {
/* 59 */                        IIOOoll iIOOoll = i00o10oo1ll.I00000oIO;
/* 63 */                        WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) iIOOoll.I00iiI;
/* 67 */                        WindowInsetsAnimation windowInsetsAnimation2 = (WindowInsetsAnimation) iIOOoll.I00iiI;
/* 75 */                        i010o0loi1l.I0000Il00O.I000O01llI0(windowInsetsAnimation.getInterpolatedFraction());
/* 84 */                        i010o0loi1l.I0000oI00.I000O01llI0(windowInsetsAnimation2.getAlpha());
/* 93 */                        i010o0loi1l.I0000O.I000O01llI0(windowInsetsAnimation2.getDurationMillis());
                            }
                        }
                    }
/* 99 */            I0001Ioi1lo(i00iooo00liVar);
/* 106 */           return i00iooo00liVar;
                }

                @Override
                public final OoIOol I0000oI00(i00O10oO1ll i00o10oo1ll, OoIOol ooIOol) {
/* 1 */             i00iooo00li i00iooo00liVar = this.I00iio;
/* 3 */             boolean z = false;
/* 4 */             this.I00iiI = false;
/* 7 */             this.I00iio = null;
/* 23 */            if (((WindowInsetsAnimation) i00o10oo1ll.I00000oIO.I00iiI).getDurationMillis() > 0 && i00iooo00liVar != null) {
/* 33 */                int typeMask = ((WindowInsetsAnimation) i00o10oo1ll.I00000oIO.I00iiI).getTypeMask();
                        this.I00iiO |= typeMask;
/* 48 */                i00li00iOi i00li00ioi = (i00li00iOi) i00llOioIoi.I00000oIO.I00000oOI(typeMask);
/* 50 */                if (i00li00ioi != null) {
/* 58 */                    i010O0loi1l i010o0loi1l = (i010O0loi1l) this.I00ilI0I1.I000II(i00li00ioi);
/* 62 */                    Ioo0l0I ioo0l0II000OOo1O = i00iooo00liVar.I00000oIO.I000OOo1O(typeMask);
/* 89 */                    long j = (ioo0l0II000OOo1O.I00000oIO << 48) | (ioo0l0II000OOo1O.I00000oOI << 32) | (ioo0l0II000OOo1O.I0000Il00O << 16) | ioo0l0II000OOo1O.I0000O;
/* 90 */                    long j2 = i010o0loi1l.I000O01llI0;
/* 96 */                    if (!li1OOIio1Oi.I00000oIO(j, j2)) {
/* 98 */                        i010o0loi1l.I000OiO = j2;
/* 100 */                       i010o0loi1l.I000iOII = j;
/* 106 */                       i010o0loi1l.I00000oOI.setValue(Boolean.TRUE);
/* 109 */                       IIOOoll iIOOoll = i00o10oo1ll.I00000oIO;
/* 121 */                       i010o0loi1l.I0000Il00O.I000O01llI0(((WindowInsetsAnimation) iIOOoll.I00iiI).getInterpolatedFraction());
/* 134 */                       i010o0loi1l.I0000oI00.I000O01llI0(((WindowInsetsAnimation) iIOOoll.I00iiI).getAlpha());
/* 147 */                       i010o0loi1l.I0000O.I000O01llI0(((WindowInsetsAnimation) iIOOoll.I00iiI).getDurationMillis());
/* 150 */                       OIooi1iOiOol oIooi1iOiOol = this.I00ilO0;
/* 158 */                       oIooi1iOiOol.I000O01llI0(oIooi1iOiOol.I000II() + 1);
                                synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 166 */                           OI10IIO oi10iio = Ol1l1lI1Ili.I000OiO.I000O01llI0;
/* 168 */                           if (oi10iio != null) {
/* 174 */                               if (oi10iio.I000O01llI0()) {
/* 176 */                                   z = true;
                                        }
                                    }
                                }
/* 178 */                       if (z) {
/* 180 */                           Ol1l1lI1Ili.I0000Il00O();
/* 183 */                           return ooIOol;
                                }
                            }
                        }
                    }
/* 332 */           return ooIOol;
                }

                /* JADX WARN: Removed duplicated region for block: B:74:0x0253  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void I0001Ioi1lo(i00iooo00li i00iooo00liVar) {
                    char c;
                    char c2;
                    boolean z;
                    char c3;
                    boolean z2;
                    boolean z3;
                    long j;
                    boolean z4;
                    long[] jArr;
                    int[] iArr;
                    Object[] objArr;
                    long[] jArr2;
                    int[] iArr2;
                    Object[] objArr2;
                    long j2;
                    int i;
/* 5 */             OI0l1oli1I oI0l1oli1I = i00llOioIoi.I00000oIO;
/* 7 */             int[] iArr3 = oI0l1oli1I.I00000oOI;
/* 9 */             Object[] objArr3 = oI0l1oli1I.I0000Il00O;
/* 11 */            long[] jArr3 = oI0l1oli1I.I00000oIO;
                    int length = jArr3.length - 2;
/* 16 */            if (length >= 0) {
/* 18 */                int i2 = 0;
/* 19 */                z2 = false;
/* 20 */                z3 = false;
/* 21 */                c = 16;
/* 23 */                c2 = ' ';
                        while (true) {
/* 25 */                    long j3 = jArr3[i2];
/* 27 */                    z = true;
/* 44 */                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
/* 51 */                        int i3 = 8;
/* 53 */                        int i4 = 8 - ((~(i2 - length)) >>> 31);
/* 55 */                        int i5 = 0;
/* 56 */                        c3 = '0';
/* 58 */                        while (i5 < i4) {
/* 68 */                            if ((j3 & 255) < 128) {
/* 72 */                                int i6 = (i2 << 3) + i5;
/* 74 */                                int i7 = iArr3[i6];
/* 80 */                                i00li00iOi i00li00ioi = (i00li00iOi) objArr3[i6];
/* 84 */                                Ioo0l0I ioo0l0II000OOo1O = i00iooo00liVar.I00000oIO.I000OOo1O(i7);
/* 88 */                                jArr2 = jArr3;
/* 92 */                                iArr2 = iArr3;
/* 120 */                               long j4 = (ioo0l0II000OOo1O.I00000oIO << 48) | (ioo0l0II000OOo1O.I00000oOI << 32) | (ioo0l0II000OOo1O.I0000Il00O << 16) | ioo0l0II000OOo1O.I0000O;
/* 128 */                               i010O0loi1l i010o0loi1l = (i010O0loi1l) this.I00ilI0I1.I000II(i00li00ioi);
/* 130 */                               j2 = j3;
/* 138 */                               if (!li1OOIio1Oi.I00000oIO(j4, i010o0loi1l.I000O01llI0)) {
/* 140 */                                   i010o0loi1l.I000O01llI0 = j4;
/* 148 */                                   z2 = true;
/* 150 */                                   if (!li1OOIio1Oi.I00000oIO(j4, 0L)) {
/* 152 */                                       z3 = true;
                                            }
                                        }
/* 155 */                               if (i7 != 8) {
/* 159 */                                   Ioo0l0I ioo0l0II000OiO = i00iooo00liVar.I00000oIO.I000OiO(i7);
/* 170 */                                   objArr2 = objArr3;
/* 184 */                                   long j5 = (ioo0l0II000OiO.I00000oOI << 32) | (ioo0l0II000OiO.I00000oIO << 48) | (ioo0l0II000OiO.I0000Il00O << 16) | ioo0l0II000OiO.I0000O;
/* 192 */                                   if (!li1OOIio1Oi.I00000oIO(i010o0loi1l.I000OOo1O, j5)) {
/* 194 */                                       i010o0loi1l.I000OOo1O = j5;
/* 202 */                                       z2 = true;
/* 204 */                                       if (!li1OOIio1Oi.I00000oIO(j5, 0L)) {
/* 206 */                                           z3 = true;
                                                }
                                            }
                                        } else {
/* 208 */                                   objArr2 = objArr3;
                                        }
/* 221 */                               i010o0loi1l.I00000oIO.setValue(Boolean.valueOf(i00iooo00liVar.I00000oIO.I001IIilI0O(i7)));
/* 224 */                               i = 8;
                                    } else {
/* 227 */                               jArr2 = jArr3;
/* 229 */                               iArr2 = iArr3;
/* 231 */                               objArr2 = objArr3;
/* 232 */                               j2 = j3;
/* 234 */                               i = i3;
                                    }
/* 235 */                           j3 = j2 >> i;
/* 237 */                           i5++;
/* 239 */                           i3 = i;
/* 240 */                           objArr3 = objArr2;
/* 241 */                           jArr3 = jArr2;
/* 243 */                           iArr3 = iArr2;
                                }
/* 247 */                       jArr = jArr3;
/* 249 */                       iArr = iArr3;
/* 251 */                       objArr = objArr3;
/* 253 */                       if (i4 != i3) {
                                    break;
                                }
                            } else {
/* 256 */                       jArr = jArr3;
/* 258 */                       iArr = iArr3;
/* 260 */                       objArr = objArr3;
/* 261 */                       c3 = '0';
                            }
/* 263 */                   if (i2 == length) {
                                break;
                            }
/* 265 */                   i2++;
/* 267 */                   objArr3 = objArr;
/* 268 */                   jArr3 = jArr;
/* 270 */                   iArr3 = iArr;
                        }
                    } else {
/* 274 */               c = 16;
/* 276 */               c2 = ' ';
/* 278 */               z = true;
/* 280 */               c3 = '0';
/* 282 */               z2 = false;
/* 283 */               z3 = false;
                    }
/* 286 */           IiiIlIlO iiiIlIlOI000O01llI0 = i00iooo00liVar.I00000oIO.I000O01llI0();
/* 290 */           if (iiiIlIlOI000O01llI0 == null) {
/* 292 */               j = 0;
                    } else {
/* 301 */               Ioo0l0I ioo0l0II00000oOI = Ioo0l0I.I00000oOI(iiiIlIlOI000O01llI0.I00000oIO.getWaterfallInsets());
/* 325 */               j = (ioo0l0II00000oOI.I00000oIO << c3) | (ioo0l0II00000oOI.I00000oOI << c2) | (ioo0l0II00000oOI.I0000Il00O << c) | ioo0l0II00000oOI.I0000O;
                    }
/* 327 */           OI10I1IoI0Ol oI10I1IoI0Ol = this.I00ilI0I1;
/* 331 */           i00li00iOi.I00000oIO.getClass();
/* 340 */           i010O0loi1l i010o0loi1l2 = (i010O0loi1l) oI10I1IoI0Ol.I000II(i00lO010I.I000OiO);
/* 356 */           i010o0loi1l2.I00000oIO.setValue(Boolean.valueOf(!li1OOIio1Oi.I00000oIO(j, 0L)));
/* 365 */           if (!li1OOIio1Oi.I00000oIO(i010o0loi1l2.I000O01llI0, j)) {
/* 367 */               i010o0loi1l2.I000O01llI0 = j;
/* 369 */               i010o0loi1l2.I000OOo1O = j;
/* 375 */               z2 = z;
/* 377 */               if (!li1OOIio1Oi.I00000oIO(j, 0L)) {
/* 379 */                   z3 = z2;
                        }
                    }
/* 380 */           if (iiiIlIlOI000O01llI0 == null) {
/* 382 */               OI0oiiIO0 oI0oiiIO0 = this.I00io1l;
/* 386 */               if (oI0oiiIO0.I00000oOI > 0) {
/* 388 */                   oI0oiiIO0.I0000oI00();
/* 393 */                   this.I00ioIO.clear();
/* 396 */                   z2 = z;
                        }
                    } else {
/* 402 */               List<Rect> boundingRects = iiiIlIlOI000O01llI0.I00000oIO.getBoundingRects();
/* 406 */               int size = boundingRects.size();
/* 410 */               OI0oiiIO0 oI0oiiIO02 = this.I00io1l;
/* 414 */               if (size < oI0oiiIO02.I00000oOI) {
/* 424 */                   oI0oiiIO02.I000lI(boundingRects.size(), this.I00io1l.I00000oOI);
/* 439 */                   this.I00ioIO.I000OiO(boundingRects.size(), this.I00ioIO.size());
/* 442 */                   z2 = z;
                        } else {
/* 453 */                   int size2 = boundingRects.size() - this.I00io1l.I00000oOI;
/* 454 */                   int i8 = 0;
/* 455 */                   while (i8 < size2) {
/* 457 */                       OI0oiiIO0 oI0oiiIO03 = this.I00io1l;
/* 469 */                       oI0oiiIO03.I00000oOI(lOO00IiI0li.I00000oIO(boundingRects.get(oI0oiiIO03.I00000oOI)));
/* 496 */                       this.I00ioIO.add(lIl0ooI0O1.I00000oIO("display cutout rect " + this.I00io1l.I00000oOI));
/* 499 */                       i8++;
/* 501 */                       z2 = z;
                            }
                        }
/* 505 */               List<Rect> list = boundingRects;
/* 507 */               int size3 = list.size();
/* 512 */               for (int i9 = 0; i9 < size3; i9++) {
/* 514 */                   Rect rect = boundingRects.get(i9);
/* 526 */                   OI10i0Il oI10i0Il = (OI10i0Il) this.I00io1l.I000II(i9);
/* 536 */                   if (!O0000Ioio00.I0000O(oI10i0Il.getValue(), rect)) {
/* 538 */                       oI10i0Il.setValue(rect);
/* 541 */                       z2 = z;
                            }
                        }
/* 550 */               if (!list.isEmpty()) {
/* 552 */                   z3 = z;
                        }
                    }
/* 554 */           if ((z3 || this.I00ilO0.I000II() != 0) && z2) {
/* 566 */               OIooi1iOiOol oIooi1iOiOol = this.I00ilO0;
/* 574 */               oIooi1iOiOol.I000O01llI0(oIooi1iOiOol.I000II() + 1);
                        synchronized (Ol1l1lI1Ili.I0000Il00O) {
/* 582 */                   OI10IIO oi10iio = Ol1l1lI1Ili.I000OiO.I000O01llI0;
/* 584 */                   if (oi10iio != null) {
/* 590 */                       boolean z5 = z;
/* 596 */                       z4 = oi10iio.I000O01llI0() == z5 ? z5 : false;
                            }
                        }
/* 598 */               if (z4) {
/* 600 */                   Ol1l1lI1Ili.I0000Il00O();
                        }
                    }
                }

                @Override
                public final i00iooo00li I000OOo1O(View view, i00iooo00li i00iooo00liVar) {
/* 3 */             if (this.I00iiI) {
/* 5 */                 this.I00iio = i00iooo00liVar;
/* 7 */                 return i00iooo00liVar;
                    }
/* 10 */            if (this.I00iiO == 0) {
/* 12 */                I0001Ioi1lo(i00iooo00liVar);
                    }
/* 37 */            return i00iooo00liVar;
                }

                @Override
                public final void onViewAttachedToWindow(View view) {
/* 1 */             Object parent = view.getParent();
/* 12 */            View view2 = parent instanceof View ? (View) parent : null;
/* 13 */            if (view2 != null) {
/* 16 */                view = view2;
                    }
/* 17 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 19 */            OooiIOIoi.I00000oOI(view, this);
/* 22 */            IIOOoll.I00i0ilIl0i(view, this);
                }

                @Override
                public final void onViewDetachedFromWindow(View view) {
/* 1 */             Object parent = view.getParent();
/* 13 */            View view2 = parent instanceof View ? (View) parent : null;
/* 14 */            if (view2 != null) {
/* 17 */                view = view2;
                    }
/* 18 */            WeakHashMap weakHashMap = OooiOl0ioo0i.I00000oIO;
/* 20 */            OooiIOIoi.I00000oOI(view, null);
/* 23 */            view.setWindowInsetsAnimationCallback(null);
                }

                @Override
                public final void run() {
/* 3 */             if (this.I00iiI) {
/* 6 */                 this.I00iiO = 0;
/* 8 */                 this.I00iiI = false;
/* 10 */                i00iooo00li i00iooo00liVar = this.I00iio;
/* 12 */                if (i00iooo00liVar != null) {
/* 14 */                    I0001Ioi1lo(i00iooo00liVar);
/* 18 */                    this.I00iio = null;
                        }
                    }
                }
            }

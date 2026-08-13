            package p000;
            
            public final class OIiI00lo0 extends IlO1i1lOIi {
                public static final OIiI00lo0 I0000O = new OIiI00lo0(0, 2, 1);

                @Override
                public final void I0000O(IOOOi1 iOOOi1, I1IOO010 i1ioo010, Ol11il011o0 ol11il011o0, OOoo1il oOoo1il, OIiOolI1lio oIiOolI1lio) {
                    int i;
/* 6 */             IooOIOoo0I01 iooOIOoo0I01 = (IooOIOoo0I01) iOOOi1.I0001Ioi1lo(0);
/* 15 */            int iI0000Il00O = ol11il011o0.I0000Il00O((Ilo1iIi1OI01) iOOOi1.I0001Ioi1lo(1));
/* 23 */            if (ol11il011o0.I00111O >= iI0000Il00O) {
/* 26 */                IOl1II00.I00000oIO("Check failed");
                    }
/* 29 */            l1l1l1.I00000oIO(ol11il011o0, i1ioo010, iI0000Il00O);
/* 32 */            int i2 = ol11il011o0.I00111O;
/* 34 */            int iI00IO1 = ol11il011o0.I001IO000;
/* 36 */            while (iI00IO1 >= 0 && !ol11il011o0.I001i1lo1io(iI00IO1)) {
/* 46 */                iI00IO1 = ol11il011o0.I00IO1(ol11il011o0.I00000oOI, iI00IO1);
                    }
/* 51 */            int iI00111O = iI00IO1 + 1;
/* 52 */            int iI00IoIO0lI = 0;
/* 53 */            while (iI00111O < i2) {
/* 59 */                if (ol11il011o0.I001IIilI0O(i2, iI00111O)) {
/* 65 */                    if (ol11il011o0.I001i1lo1io(iI00111O)) {
/* 67 */                        iI00IoIO0lI = 0;
                            }
/* 68 */                    iI00111O++;
                        } else {
/* 83 */                    iI00IoIO0lI += ol11il011o0.I001i1lo1io(iI00111O) ? 1 : ol11il011o0.I00II0oii1o(iI00111O);
/* 88 */                    iI00111O += ol11il011o0.I00111O(iI00111O);
                        }
                    }
                    while (true) {
/* 90 */                i = ol11il011o0.I00111O;
/* 92 */                if (i >= iI0000Il00O) {
                            break;
                        }
/* 98 */                if (ol11il011o0.I001IIilI0O(iI0000Il00O, i)) {
/* 100 */                   int i3 = ol11il011o0.I00111O;
/* 104 */                   if (i3 < ol11il011o0.I001IIilI0O && (ol11il011o0.I00000oOI[(ol11il011o0.I00100o1O0lo(i3) * 5) + 1] & 1073741824) != 0) {
/* 128 */                       i1ioo010.I0000O(ol11il011o0.I00II0Ol1O0l(ol11il011o0.I00111O));
/* 131 */                       iI00IoIO0lI = 0;
                            }
/* 132 */                   ol11il011o0.I00O0i0ii();
                        } else {
/* 140 */                   iI00IoIO0lI += ol11il011o0.I00IoIO0lI();
                        }
                    }
/* 142 */           if (i != iI0000Il00O) {
/* 145 */               IOl1II00.I00000oIO("Check failed");
                    }
/* 148 */           iooOIOoo0I01.I00000oIO = iI00IoIO0lI;
                }
            }

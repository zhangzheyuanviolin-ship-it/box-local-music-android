            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public abstract class l1OIoI1 {
                public static final void I00000oIO(IO1OO01i0 iO1OO01i0, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
                    String str;
/* 3 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 8 */             iloI0lOlll12.I00i0O(-453607403);
/* 21 */            int i3 = i | (iloI0lOlll12.I000II(iO1OO01i0) ? 4 : 2);
/* 37 */            if (!iloI0lOlll12.I00OIl(i3 & 1, (i3 & 3) != 2)) {
/* 255 */               i2 = 0;
/* 256 */               iloI0lOlll12.I00OilO00Il();
                    } else if (iO1OO01i0.I0000Il00O() >= 0.0f) {
/* 51 */                iloI0lOlll12.I00i01iIIliI(-1450954380);
/* 54 */                float fI0000Il00O = iO1OO01i0.I0000Il00O();
/* 58 */                OIo1i1 oIo1i1 = OollloolI.I00000oIO;
/* 64 */                if (fI0000Il00O < 1000.0f) {
/* 79 */                    str = fI0000Il00O + " ms";
                        } else {
/* 84 */                    float f = fI0000Il00O / 1000.0f;
/* 89 */                    if (f < 60.0f) {
/* 105 */                       str = String.format("%.1f s", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                            } else {
/* 110 */                       float f2 = f / 60.0f;
/* 149 */                       str = f2 < 60.0f ? String.format("%.1f min", Arrays.copyOf(new Object[]{Float.valueOf(f2)}, 1)) : String.format("%.1f h", Arrays.copyOf(new Object[]{Float.valueOf(f2 / 60.0f)}, 1));
                            }
                        }
/* 231 */               i2 = 0;
/* 235 */               Oo0i1oIIoOO.I00000oOI(str, iO11ilOI.I00000oIO(iOIiO1OII1.I00000oIO(O1ooIo101ll.I00000oIO, 0.5f), "latency_label"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000oI1ioi, iloI0lOlll1, 48, 0, 131068);
/* 238 */               iloI0lOlll12 = iloI0lOlll1;
/* 240 */               iloI0lOlll12.I0010I0i(false);
                    } else {
/* 244 */               i2 = 0;
/* 248 */               iloI0lOlll12.I00i01iIIliI(-1450776595);
/* 251 */               iloI0lOlll12.I0010I0i(false);
                    }
/* 259 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 263 */           if (oOloioIlI001IO000 != null) {
/* 267 */               O1lIOOlolli0 o1lIOOlolli0 = new O1lIOOlolli0(i2);
/* 272 */               o1lIOOlolli0.I00iiI = iO1OO01i0;
/* 274 */               VarHandle.storeStoreFence();
/* 277 */               oOloioIlI001IO000.I0000O = o1lIOOlolli0;
                    }
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public abstract class l1OO11li {
                public static final void I00000oIO(IO1OO01i0 iO1OO01i0, IloI0lOlll1 iloI0lOlll1, int i) {
                    IO1Oii iO1Oii;
/* 3 */             IloI0lOlll1 iloI0lOlll12 = iloI0lOlll1;
/* 8 */             iloI0lOlll12.I00i0O(-2066387659);
/* 21 */            int i2 = i | (iloI0lOlll12.I000II(iO1OO01i0) ? 4 : 2);
/* 37 */            if (iloI0lOlll12.I00OIl(i2 & 1, (i2 & 3) != 2)) {
/* 41 */                Float f = null;
/* 48 */                IO1iI1i iO1iI1i = iO1OO01i0 instanceof IO1iI1i ? (IO1iI1i) iO1OO01i0 : null;
/* 49 */                if (iO1iI1i != null && (iO1Oii = iO1iI1i.I000iOII) != null) {
/* 64 */                    f = (Float) iO1Oii.I000O01llI0.get("tps");
                        }
/* 66 */                if (f != null) {
/* 71 */                    iloI0lOlll12.I00i01iIIliI(11685775);
/* 177 */                   Oo0i1oIIoOO.I00000oOI(String.format("%.1f tok/s", Arrays.copyOf(new Object[]{f}, 1)), iO11ilOI.I00000oIO(iOIiO1OII1.I00000oIO(O1ooIo101ll.I00000oIO, 0.5f), "tokens_per_second_label"), 0L, null, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((O1OoiOIi1ooi) iloI0lOlll12.I000iOII(O1OoilIO.I00000oOI)).I00000oOI.I000oI1ioi, iloI0lOlll1, 48, 0, 131068);
/* 180 */                   iloI0lOlll12 = iloI0lOlll1;
/* 182 */                   iloI0lOlll12.I0010I0i(false);
                        } else {
/* 190 */                   iloI0lOlll12.I00i01iIIliI(11868365);
/* 193 */                   iloI0lOlll12.I0010I0i(false);
                        }
                    } else {
/* 197 */               iloI0lOlll12.I00OilO00Il();
                    }
/* 200 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll12.I001IO000();
/* 204 */           if (oOloioIlI001IO000 != null) {
/* 209 */               O1lIOOlolli0 o1lIOOlolli0 = new O1lIOOlolli0(1);
/* 214 */               o1lIOOlolli0.I00iiI = iO1OO01i0;
/* 216 */               VarHandle.storeStoreFence();
/* 219 */               oOloioIlI001IO000.I0000O = o1lIOOlolli0;
                    }
                }
            }

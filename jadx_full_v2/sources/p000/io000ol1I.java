            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.LinkedHashMap;
            import java.util.Map;
            
            public abstract class io000ol1I {
                /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final void I00000oIO(Oi1O00I1 oi1O00I1, String str, IloI0lOlll1 iloI0lOlll1, int i) {
/* 4 */             iloI0lOlll1.I00i0O(-166034923);
/* 30 */            int i2 = (iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2) | i | (iloI0lOlll1.I000II(str) ? 32 : 16);
/* 35 */            if ((i2 & 19) == 18 && iloI0lOlll1.I00IO1()) {
/* 44 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 51 */                iloI0lOlll1.I00i01iIIliI(115231289);
/* 61 */                boolean z = (i2 & 112) == 32;
/* 62 */                Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 66 */                if (!z) {
                            Object obj = objI00O0i0ii;
/* 70 */                    if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 74 */                        I11110OIl i11110OIl = new I11110OIl(16);
/* 79 */                        LinkedHashMap linkedHashMap = new LinkedHashMap();
/* 86 */                        I0ioO0Oio0ll i0ioO0Oio0ll = new I0ioO0Oio0ll(17);
/* 89 */                        i0ioO0Oio0ll.I00iiI = str;
/* 91 */                        VarHandle.storeStoreFence();
/* 94 */                        i0ioO0Oio0ll.invoke(i11110OIl);
/* 99 */                        I1111OO10i i1111OO10iI000OiO = i11110OIl.I000OiO();
/* 103 */                       Map mapI000iOII = O1Oii0O0loo.I000iOII(linkedHashMap);
/* 107 */                       Oi1Oi0 oi1Oi0 = new Oi1Oi0();
/* 110 */                       oi1Oi0.I00000oIO = i1111OO10iI000OiO;
/* 112 */                       oi1Oi0.I00000oOI = mapI000iOII;
/* 114 */                       VarHandle.storeStoreFence();
/* 117 */                       iloI0lOlll1.I00iio(oi1Oi0);
                                obj = oi1Oi0;
                            }
/* 122 */                   iloI0lOlll1.I0010I0i(false);
/* 137 */                   lOlOlI.I00000oIO(oi1O00I1, (Oi1Oi0) obj, null, null, false, 0, 0, iloI0lOlll1, i2 & 14, 62);
                        }
                    }
/* 140 */           OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 144 */           if (oOloioIlI001IO000 != null) {
/* 150 */               Ilo0lI ilo0lI = new Ilo0lI(8);
/* 153 */               ilo0lI.I00iiI = oi1O00I1;
/* 155 */               ilo0lI.I00iiO = str;
/* 157 */               VarHandle.storeStoreFence();
/* 160 */               oOloioIlI001IO000.I0000O = ilo0lI;
                    }
                }
            }

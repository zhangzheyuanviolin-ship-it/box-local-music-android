            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class OiI0ol0i implements IlliOIilI {
                public List I00iOIl;
                public float I00iiI;
                public float I00iiO;
                public float I00iio;
                public float I00ilI0I1;

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
/* 5 */             O0l0IioO o0l0IioO = (O0l0IioO) obj;
/* 11 */            int iIntValue = ((Number) obj2).intValue();
/* 17 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 23 */            int iIntValue2 = ((Number) obj4).intValue();
/* 27 */            float f = this.I00ilI0I1;
/* 29 */            float f2 = this.I00iio;
/* 31 */            float f3 = this.I00iiI;
/* 36 */            if ((iIntValue2 & 6) == 0) {
/* 47 */                i = (iloI0lOlll1.I000II(o0l0IioO) ? 4 : 2) | iIntValue2;
                    } else {
/* 49 */                i = iIntValue2;
                    }
/* 52 */            if ((iIntValue2 & 48) == 0) {
/* 65 */                i |= iloI0lOlll1.I0000oI00(iIntValue) ? 32 : 16;
                    }
/* 82 */            if (iloI0lOlll1.I00OIl(i & 1, (i & 147) != 146)) {
/* 92 */                int iIntValue3 = ((Number) this.I00iOIl.get(iIntValue)).intValue();
/* 99 */                iloI0lOlll1.I00i01iIIliI(-686584605);
/* 108 */               float f4 = (f3 - this.I00iiO) / 2.0f;
/* 109 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 111 */               O1ooiI111i o1ooiI111iI000lI = Ol0iOOO0.I000lI(o1ooIo101ll, f4);
/* 138 */               O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? iIntValue != 3 ? i1O01oOIoI0I.I00io1l : i1O01oOIoI0I.I00iiO : i1O01oOIoI0I.I00ilI0I1 : i1O01oOIoI0I.I00l0I0l0lO1 : i1O01oOIoI0I.I00li1OI, false);
/* 144 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 148 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 152 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI000lI);
/* 158 */               IOl0oi0lOl1.I000lI.getClass();
/* 161 */               iloI0lOlll1.I00i0oil();
/* 166 */               if (iloI0lOlll1.I00O10llo) {
/* 170 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 174 */                   iloI0lOlll1.I00io1l();
                        }
/* 179 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 184 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 193 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 196 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 201 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 243 */               O0oo1oi0oil o0oo1oi0oil = new O0oo1oi0oil((List) ((Ii0iOlI) iloI0lOlll1.I000iOII(Oo0oi1olI.I00000oOI)).I0000oI00.get(iIntValue != 0 ? iIntValue != 1 ? iIntValue != 2 ? 3 : 0 : 1 : 2), null, 0L, 9187343241974906880L);
/* 246 */               OIoOo11 oIoOo11I00000oIO = l1o1loI0I0o.I00000oIO(iIntValue3, iloI0lOlll1);
/* 254 */               O1ooiI111i o1ooiI111iI000lI2 = Ol0iOOO0.I000lI(o1ooIo101ll, f3 * 0.3f);
/* 266 */               boolean zI0000O = iloI0lOlll1.I0000O(f2) | iloI0lOlll1.I0000O(f);
/* 267 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 271 */               IOO0o0I1l iOO0o0I1l = IOl11li.I00000oIO;
                        Object obj5 = objI00O0i0ii;
/* 273 */               if (zI0000O || objI00O0i0ii == iOO0o0I1l) {
/* 279 */                   OiI0l10IO oiI0l10IO = new OiI0l10IO();
/* 282 */                   oiI0l10IO.I00iOIl = f2;
/* 284 */                   oiI0l10IO.I00iiI = f;
/* 286 */                   VarHandle.storeStoreFence();
/* 289 */                   iloI0lOlll1.I00iio(oiI0l10IO);
                            obj5 = oiI0l10IO;
                        }
/* 294 */               O1ooiI111i o1ooiI111iI00000oIO = iIlll1lo.I00000oIO(o1ooiI111iI000lI2, (Function1) obj5);
/* 298 */               boolean zI000II = iloI0lOlll1.I000II(o0oo1oi0oil);
/* 302 */               Object objI00O0i0ii2 = iloI0lOlll1.I00O0i0ii();
                        Object obj6 = objI00O0i0ii2;
/* 306 */               if (zI000II || objI00O0i0ii2 == iOO0o0I1l) {
/* 312 */                   OiI0lII1i oiI0lII1i = new OiI0lII1i(0);
/* 315 */                   oiI0lII1i.I00iiI = o0oo1oi0oil;
/* 317 */                   VarHandle.storeStoreFence();
/* 320 */                   iloI0lOlll1.I00iio(oiI0lII1i);
                            obj6 = oiI0lII1i;
                        }
/* 339 */               ioO0II.I00000oIO(oIoOo11I00000oIO, null, iIO01l11OlO.I0000Il00O(o1ooiI111iI00000oIO, (Function1) obj6), null, IOoOIiOl1llI.I00000oOI, 0.0f, iloI0lOlll1, 24632, 104);
/* 342 */               iloI0lOlll1.I0010I0i(true);
/* 345 */               iloI0lOlll1.I0010I0i(false);
                    } else {
/* 349 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 352 */           return OoiIlOl1iI.I00000oIO;
                }
            }

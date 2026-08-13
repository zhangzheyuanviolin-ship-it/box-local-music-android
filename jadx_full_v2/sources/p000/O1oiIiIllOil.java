            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class O1oiIiIllOil implements IlliOIilI {
                public List I00iOIl;
                public OloIl1l1oOii I00iiI;
                public O1ol100o0O I00iiO;
                public Function1 I00iio;
                public Function1 I00ilI0I1;
                public float I00ilO0;

                /* JADX WARN: Removed duplicated region for block: B:31:0x00ba  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
/* 5 */             O0l11l1iOO o0l11l1iOO = (O0l11l1iOO) obj;
/* 11 */            int iIntValue = ((Number) obj2).intValue();
/* 17 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 23 */            int iIntValue2 = ((Number) obj4).intValue();
/* 27 */            float f = this.I00ilO0;
/* 31 */            if ((iIntValue2 & 6) == 0) {
/* 42 */                i = (iloI0lOlll1.I000II(o0l11l1iOO) ? 4 : 2) | iIntValue2;
                    } else {
/* 44 */                i = iIntValue2;
                    }
/* 47 */            if ((iIntValue2 & 48) == 0) {
/* 60 */                i |= iloI0lOlll1.I0000oI00(iIntValue) ? 32 : 16;
                    }
/* 77 */            if (iloI0lOlll1.I00OIl(i & 1, (i & 147) != 146)) {
/* 86 */                O1oIOiI11o0 o1oIOiI11o0 = (O1oIOiI11o0) this.I00iOIl.get(iIntValue);
/* 91 */                iloI0lOlll1.I00i01iIIliI(-446536701);
/* 96 */                O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 102 */               int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 106 */               OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 110 */               O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 112 */               O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooIo101ll);
/* 118 */               IOl0oi0lOl1.I000lI.getClass();
/* 121 */               iloI0lOlll1.I00i0oil();
/* 126 */               if (iloI0lOlll1.I00O10llo) {
/* 130 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 134 */                   iloI0lOlll1.I00io1l();
                        }
/* 139 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 144 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 153 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ioIO, iloI0lOlll1, Integer.valueOf(iHashCode));
/* 156 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 161 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 164 */               OloIl1l1oOii oloIl1l1oOii = this.I00iiI;
/* 166 */               O1ol100o0O o1ol100o0O = this.I00iiO;
/* 169 */               Function1 function1 = this.I00iio;
/* 171 */               Function1 function12 = this.I00ilI0I1;
/* 173 */               boolean zI0000O = iloI0lOlll1.I0000O(f);
/* 177 */               Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 181 */               if (!zI0000O) {
                            Object obj5 = objI00O0i0ii;
/* 185 */                   if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 189 */                       O1oi1IOIii o1oi1IOIii = new O1oi1IOIii(1);
/* 192 */                       o1oi1IOIii.I00iiI = f;
/* 194 */                       VarHandle.storeStoreFence();
/* 197 */                       iloI0lOlll1.I00iio(o1oi1IOIii);
                                obj5 = o1oi1IOIii;
                            }
/* 218 */                   l1OoO11il1Ii.I00000oIO(o1oIOiI11o0, oloIl1l1oOii, o1ol100o0O, function1, function12, iIlll1lo.I00000oIO(o1ooIo101ll, (Function1) obj5), null, false, false, false, null, iloI0lOlll1, 0, 1984);
/* 221 */                   iloI0lOlll1.I0010I0i(true);
/* 224 */                   iloI0lOlll1.I0010I0i(false);
                        }
                    } else {
/* 228 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 231 */           return OoiIlOl1iI.I00000oIO;
                }
            }

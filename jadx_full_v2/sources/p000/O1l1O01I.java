            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class O1l1O01I implements IlliOIilI {
                public List I00iOIl;
                public long I00iiI;
                public Function1 I00iiO;

                /* JADX WARN: Removed duplicated region for block: B:29:0x00a4  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
                    Object obj5;
/* 1 */             O0l11l1iOO o0l11l1iOO = (O0l11l1iOO) obj;
/* 5 */             int iIntValue = ((Number) obj2).intValue();
/* 9 */             IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 13 */            int iIntValue2 = ((Number) obj4).intValue();
/* 17 */            Function1 function1 = this.I00iiO;
/* 21 */            if ((iIntValue2 & 6) == 0) {
/* 32 */                i = (iloI0lOlll1.I000II(o0l11l1iOO) ? 4 : 2) | iIntValue2;
                    } else {
/* 34 */                i = iIntValue2;
                    }
/* 38 */            if ((iIntValue2 & 48) == 0) {
/* 51 */                i |= iloI0lOlll1.I0000oI00(iIntValue) ? 32 : 16;
                    }
/* 68 */            if (!iloI0lOlll1.I00OIl(i & 1, (i & 147) != 146)) {
/* 322 */               iloI0lOlll1.I00OilO00Il();
/* 325 */               return OoiIlOl1iI.I00000oIO;
                    }
/* 77 */            if (this.I00iOIl.get(iIntValue) != null) {
/* 318 */               OIiilo1Ool0o.I00000oIO();
/* 76 */                return null;
                    }
/* 82 */            iloI0lOlll1.I00i01iIIliI(-1504407619);
/* 90 */            long jI0000Il00O = IOOiio0i.I0000Il00O(0.3f, this.I00iiI);
/* 96 */            OiI111I oiI111II00000oOI = OiI11O1i1.I00000oOI(24.0f);
/* 100 */           O1ooIo101ll o1ooIo101ll = O1ooIo101ll.I00000oIO;
/* 142 */           O1ooiI111i o1ooiI111iI00000oOI = i0I1I0.I00000oOI(lOI11ilO.I00000oIO(Ol0iOOO0.I000II(iOi0OiI.I00000oIO(o1ooIo101ll, 1.0f, jI0000Il00O, oiI111II00000oOI), 100.0f), 2.0f, OiI11O1i1.I00000oOI(24.0f), this.I00iiI, 12), ((O1OoiOIi1ooi) iloI0lOlll1.I000iOII(O1OoilIO.I00000oOI)).I00000oIO.I00100l0, iO0ioilo.I00000oIO);
/* 154 */           boolean zI000II = iloI0lOlll1.I000II(function1) | iloI0lOlll1.I000II(null);
/* 155 */           Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 159 */           if (!zI000II) {
                        obj5 = objI00O0i0ii;
/* 163 */               if (objI00O0i0ii == IOl11li.I00000oIO) {
/* 168 */                   O0l1iloO o0l1iloO = new O0l1iloO(3);
/* 171 */                   o0l1iloO.I00iiI = function1;
/* 173 */                   VarHandle.storeStoreFence();
/* 176 */                   iloI0lOlll1.I00iio(o0l1iloO);
                            obj5 = o0l1iloO;
                        }
                    }
/* 183 */           O1ooiI111i o1ooiI111iI00000oOI2 = i1Ioo1o0.I00000oOI(o1ooiI111iI00000oOI, false, null, (IllOOo00lI) obj5, 15);
/* 189 */           O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 195 */           int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 199 */           OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 203 */           O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI00000oOI2);
/* 209 */           IOl0oi0lOl1.I000lI.getClass();
/* 212 */           iloI0lOlll1.I00i0oil();
/* 215 */           boolean z = iloI0lOlll1.I00O10llo;
/* 217 */           Iloi111 iloi111 = O0iiOioolIi.I01101IOlO;
/* 219 */           if (z) {
/* 221 */               iloI0lOlll1.I000l1(iloi111);
                    } else {
/* 225 */               iloI0lOlll1.I00io1l();
                    }
/* 228 */           IOioOOi0I iOioOOi0I = lolOiIoiillI.I00io1l;
/* 230 */           li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 233 */           IOioOOi0I iOioOOi0I2 = lolOiIoiillI.I00ilO0;
/* 235 */           li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI);
/* 238 */           Integer numValueOf = Integer.valueOf(iHashCode);
/* 242 */           IOioOOi0I iOioOOi0I3 = lolOiIoiillI.I00ioIO;
/* 244 */           li01Ooiio01.I0000Il00O(iOioOOi0I3, iloI0lOlll1, numValueOf);
/* 247 */           li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 250 */           IOioOOi0I iOioOOi0I4 = lolOiIoiillI.I00ilI0I1;
/* 252 */           li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 265 */           O1ooiI111i o1ooiI111iI0000O = iO01II.I000II(o1ooIo101ll, 12.0f, 20.0f).I0000O(Ol0iOOO0.I0000Il00O);
/* 273 */           IOOlo1O01O iOOlo1O01OI00000oIO = IOOlio0Io0.I00000oIO(I1IiooiI1IlO.I0000Il00O, i1O01oOIoI0I.I00o0l1o1o0, iloI0lOlll1, 48);
/* 279 */           int iHashCode2 = Long.hashCode(iloI0lOlll1.I00OI1);
/* 283 */           OO0lO0l0 oO0lO0l0I000lI2 = iloI0lOlll1.I000lI();
/* 287 */           O1ooiI111i o1ooiI111iI0000Il00O2 = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0000O);
/* 291 */           iloI0lOlll1.I00i0oil();
/* 296 */           if (iloI0lOlll1.I00O10llo) {
/* 298 */               iloI0lOlll1.I000l1(iloi111);
                    } else {
/* 302 */               iloI0lOlll1.I00io1l();
                    }
/* 305 */           li01Ooiio01.I0000Il00O(iOioOOi0I, iloI0lOlll1, iOOlo1O01OI00000oIO);
/* 308 */           li01Ooiio01.I0000Il00O(iOioOOi0I2, iloI0lOlll1, oO0lO0l0I000lI2);
/* 311 */           IIl001iO0Io.I001IIilI0O(iHashCode2, iloI0lOlll1, iOioOOi0I3, iloI0lOlll1);
/* 314 */           li01Ooiio01.I0000Il00O(iOioOOi0I4, iloI0lOlll1, o1ooiI111iI0000Il00O2);
/* 317 */           throw null;
                }
            }

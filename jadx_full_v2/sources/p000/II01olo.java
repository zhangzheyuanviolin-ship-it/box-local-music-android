            package p000;

            import java.lang.invoke.VarHandle;
            import java.text.SimpleDateFormat;
            import java.util.Date;
            import java.util.List;
            import java.util.Locale;
            import kotlin.jvm.functions.Function1;
            
            public final class II01olo implements IlliOIilI {
                public List I00iOIl;
                public Ol1o0O0O0 I00iiI;
                public OI10i0Il I00iiO;
                public II0IOO1i I00iio;
                public OI10i0Il I00ilI0I1;
                public Ii0110 I00ilO0;
                public OI10i0Il I00io1l;
                public OI10i0Il I00ioIO;

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
                    int i2;
                    Object obj5;
                    O0l11l1iOO o0l11l1iOO;
                    Ol1o0O0O0 ol1o0O0O0;
                    O1ooIo101ll o1ooIo101ll;
                    boolean z;
/* 5 */             O0l11l1iOO o0l11l1iOO2 = (O0l11l1iOO) obj;
/* 11 */            int iIntValue = ((Number) obj2).intValue();
/* 17 */            IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 23 */            int iIntValue2 = ((Number) obj4).intValue();
/* 27 */            OI10i0Il oI10i0Il = this.I00ilI0I1;
/* 29 */            Ol1o0O0O0 ol1o0O0O02 = this.I00iiI;
/* 31 */            II0IOO1i iI0IOO1i = this.I00iio;
/* 35 */            if ((iIntValue2 & 6) == 0) {
/* 46 */                i = (iloI0lOlll1.I000II(o0l11l1iOO2) ? 4 : 2) | iIntValue2;
                    } else {
/* 48 */                i = iIntValue2;
                    }
/* 51 */            if ((iIntValue2 & 48) == 0) {
/* 64 */                i |= iloI0lOlll1.I0000oI00(iIntValue) ? 32 : 16;
                    }
/* 84 */            if (iloI0lOlll1.I00OIl(i & 1, (i & 147) != 146)) {
/* 92 */                II00Ol1Ii iI00Ol1Ii = (II00Ol1Ii) this.I00iOIl.get(iIntValue);
/* 97 */                iloI0lOlll1.I00i01iIIliI(-1858549240);
/* 102 */               OiI111I oiI111II00000oOI = OiI11O1i1.I00000oOI(20.0f);
/* 106 */               O1ooIo101ll o1ooIo101ll2 = O1ooIo101ll.I00000oIO;
/* 114 */               O1ooiI111i o1ooiI111iI0000oI00 = Ol0iOOO0.I0000oI00(ii0OOOOo0i.I00000oIO(o1ooIo101ll2, oiI111II00000oOI), 1.0f);
/* 130 */               if (((Boolean) this.I00iiO.getValue()).booleanValue()) {
/* 133 */                   o1ooiI111iI0000oI00 = O0l11l1iOO.I00000oIO(o0l11l1iOO2, o1ooiI111iI0000oI00, 7);
                        }
/* 139 */               O111Oli o111OliI0010I0i = iI00Ol1Ii.I00000oOI.I0010I0i();
/* 143 */               if (o111OliI0010I0i == null) {
/* 148 */                   iloI0lOlll1.I00i01iIIliI(-1858292500);
/* 151 */                   iloI0lOlll1.I0010I0i(false);
/* 154 */                   o0l11l1iOO = o0l11l1iOO2;
/* 156 */                   ol1o0O0O0 = ol1o0O0O02;
/* 158 */                   o1ooIo101ll = o1ooIo101ll2;
/* 159 */                   z = false;
                        } else {
/* 165 */                   iloI0lOlll1.I00i01iIIliI(-1858292499);
/* 172 */                   String strI001i1O0Ol = o111OliI0010I0i.I0010I0i().I001i1O0Ol();
/* 200 */                   String str = strI001i1O0Ol + " · " + o111OliI0010I0i.I0010I0i().I0010I0i();
/* 221 */                   O1ooiI111i o1ooiI111i = o1ooiI111iI0000oI00;
/* 232 */                   String str2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(o111OliI0010I0i.I0010I0i().I001l0I00()));
/* 236 */                   boolean z2 = iI00Ol1Ii.I0000Il00O;
/* 246 */                   boolean zI000OOo1O = iloI0lOlll1.I000OOo1O(iI0IOO1i) | iloI0lOlll1.I000II(iI00Ol1Ii);
/* 247 */                   Object objI00O0i0ii = iloI0lOlll1.I00O0i0ii();
/* 251 */                   if (zI000OOo1O || objI00O0i0ii == IOl11li.I00000oIO) {
/* 262 */                       i2 = 0;
/* 263 */                       II01i0o0oO iI01i0o0oO = new II01i0o0oO(0);
/* 266 */                       iI01i0o0oO.I00iiI = iI0IOO1i;
/* 268 */                       iI01i0o0oO.I00iiO = iI00Ol1Ii;
/* 270 */                       VarHandle.storeStoreFence();
/* 273 */                       iloI0lOlll1.I00iio(iI01i0o0oO);
                                obj5 = iI01i0o0oO;
                            } else {
/* 258 */                       i2 = 0;
                                obj5 = objI00O0i0ii;
                            }
/* 280 */                   II01il0l iI01il0l = new II01il0l(i2);
/* 283 */                   iI01il0l.I00iiI = ol1o0O0O02;
/* 285 */                   iI01il0l.I00iiO = iI00Ol1Ii;
/* 287 */                   iI01il0l.I00iio = iI0IOO1i;
/* 289 */                   iI01il0l.I00ilI0I1 = oI10i0Il;
/* 291 */                   VarHandle.storeStoreFence();
/* 297 */                   IOii1l iOii1lI00000oOI = iiioOl1O.I00000oOI(-34736102, iI01il0l, iloI0lOlll1);
/* 305 */                   Ii0110 ii0110 = this.I00ilO0;
/* 309 */                   OI10i0Il oI10i0Il2 = this.I00io1l;
/* 311 */                   OI10i0Il oI10i0Il3 = this.I00ioIO;
/* 313 */                   II01olO0oO iI01olO0oO = new II01olO0oO();
/* 316 */                   iI01olO0oO.I00iOIl = iI00Ol1Ii;
/* 318 */                   iI01olO0oO.I00iiI = iI0IOO1i;
/* 320 */                   iI01olO0oO.I00iiO = o111OliI0010I0i;
/* 322 */                   iI01olO0oO.I00iio = oI10i0Il;
/* 324 */                   iI01olO0oO.I00ilI0I1 = ii0110;
/* 326 */                   iI01olO0oO.I00ilO0 = strI001i1O0Ol;
/* 328 */                   iI01olO0oO.I00io1l = oI10i0Il2;
/* 330 */                   iI01olO0oO.I00ioIO = oI10i0Il3;
/* 332 */                   VarHandle.storeStoreFence();
/* 360 */                   o0l11l1iOO = o0l11l1iOO2;
/* 362 */                   ol1o0O0O0 = ol1o0O0O02;
/* 365 */                   o1ooIo101ll = o1ooIo101ll2;
/* 368 */                   z = false;
/* 369 */                   iOI10OoOlOl.I00000oIO(str, z2, (Function1) obj5, o1ooiI111i, str2, true, 0L, iOii1lI00000oOI, false, iiioOl1O.I00000oOI(1667791320, iI01olO0oO, iloI0lOlll1), iloI0lOlll1, 818085888, 320);
/* 372 */                   iloI0lOlll1.I0010I0i(false);
                        }
/* 381 */               if (iIntValue != ol1o0O0O0.size() - 1) {
/* 386 */                   iloI0lOlll1.I00i01iIIliI(-1841382898);
/* 402 */                   lOO1OIO00.I00000oIO(iloI0lOlll1, O0l11l1iOO.I00000oIO(o0l11l1iOO, Ol0iOOO0.I000II(o1ooIo101ll, 12.0f), 5));
/* 405 */                   iloI0lOlll1.I0010I0i(z);
                        } else {
/* 412 */                   iloI0lOlll1.I00i01iIIliI(-1841266617);
/* 415 */                   iloI0lOlll1.I0010I0i(z);
                        }
/* 418 */               iloI0lOlll1.I0010I0i(z);
                    } else {
/* 422 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 425 */           return OoiIlOl1iI.I00000oIO;
                }
            }

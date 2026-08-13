            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IOOIi1 implements IlliOIilI {
                public O1ooiI111i I00iOIl;
                public float I00iiI;
                public Oo0lloOiiIOI I00iiO;
                public IOii1l I00iio;

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
/* 1 */             Oi1O00I1 oi1O00I1 = (Oi1O00I1) obj;
/* 3 */             O1ooiI111i o1ooiI111i = (O1ooiI111i) obj2;
/* 5 */             IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 9 */             int iIntValue = ((Number) obj4).intValue();
/* 15 */            if ((iIntValue & 6) == 0) {
/* 26 */                i = (iloI0lOlll1.I000II(oi1O00I1) ? 4 : 2) | iIntValue;
                    } else {
/* 28 */                i = iIntValue;
                    }
/* 32 */            if ((iIntValue & 48) == 0) {
/* 45 */                i |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 50 */            if ((i & 147) == 146 && iloI0lOlll1.I00IO1()) {
/* 59 */                iloI0lOlll1.I00OilO00Il();
                    } else {
/* 72 */                O1ooiI111i o1ooiI111iI0001Ioi1lo = iO01II.I0001Ioi1lo(o1ooiI111i.I0000O(this.I00iOIl), this.I00iiI);
/* 76 */                Oo0lloOiiIOI oo0lloOiiIOI = this.I00iiO;
/* 78 */                IOii1l iOii1l = this.I00iio;
/* 82 */                int i2 = 0;
/* 83 */                O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 87 */                int iI00000oIO = iilI1O0il0.I00000oIO(iloI0lOlll1);
/* 91 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 95 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111iI0001Ioi1lo);
/* 101 */               IOl0oi0lOl1.I000lI.getClass();
/* 104 */               iloI0lOlll1.I00i0oil();
/* 109 */               if (iloI0lOlll1.I00O10llo) {
/* 113 */                   iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 117 */                   iloI0lOlll1.I00io1l();
                        }
/* 122 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 127 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 130 */               IOioOOi0I iOioOOi0I = lolOiIoiillI.I00ioIO;
/* 134 */               if (iloI0lOlll1.I00O10llo || !O0000Ioio00.I0000O(iloI0lOlll1.I00O0i0ii(), Integer.valueOf(iI00000oIO))) {
/* 154 */                   iloI0lOlll1.I00iio(Integer.valueOf(iI00000oIO));
/* 161 */                   iloI0lOlll1.I00000oOI(iOioOOi0I, Integer.valueOf(iI00000oIO));
                        }
/* 166 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 169 */               IlliOIilI illiOIilII00000oIO = Oi1i0loi11o0.I00000oIO(iloI0lOlll1);
/* 175 */               IOOIOo0 iOOIOo0 = new IOOIOo0(i2);
/* 178 */               iOOIOo0.I00iiI = iOii1l;
/* 180 */               iOOIOo0.I00iiO = oi1O00I1;
/* 182 */               VarHandle.storeStoreFence();
/* 196 */               illiOIilII00000oIO.I000l1(oo0lloOiiIOI, iiioOl1O.I00000oOI(-375984849, iOOIOo0, iloI0lOlll1), iloI0lOlll1, 48);
/* 200 */               iloI0lOlll1.I0010I0i(true);
                    }
/* 203 */           return OoiIlOl1iI.I00000oIO;
                }
            }

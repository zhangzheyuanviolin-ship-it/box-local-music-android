            package p000;
            
            public final class OioooII1lO1 extends O0iO10011II implements IlliOIilI {
                public final IOii1l I00iOIl;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OioooII1lO1(IOii1l iOii1l) {
/* 4 */             super(4);
/* 1 */             this.I00iOIl = iOii1l;
                }

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i;
/* 1 */             Oiool011li oiool011li = (Oiool011li) obj;
/* 3 */             O1ooiI111i o1ooiI111i = (O1ooiI111i) obj2;
/* 5 */             IloI0lOlll1 iloI0lOlll1 = (IloI0lOlll1) obj3;
/* 9 */             int iIntValue = ((Number) obj4).intValue();
/* 15 */            if ((iIntValue & 6) == 0) {
/* 26 */                i = (iloI0lOlll1.I000II(oiool011li) ? 4 : 2) | iIntValue;
                    } else {
/* 28 */                i = iIntValue;
                    }
/* 31 */            if ((iIntValue & 48) == 0) {
/* 44 */                i |= iloI0lOlll1.I000II(o1ooiI111i) ? 32 : 16;
                    }
/* 62 */            if (iloI0lOlll1.I00OIl(i & 1, (i & 147) != 146)) {
/* 66 */                O1iOIl0o10 o1iOIl0o10I0000Il00O = II1oOI10.I0000Il00O(i1O01oOIoI0I.I00iiO, false);
/* 72 */                int iHashCode = Long.hashCode(iloI0lOlll1.I00OI1);
/* 76 */                OO0lO0l0 oO0lO0l0I000lI = iloI0lOlll1.I000lI();
/* 80 */                O1ooiI111i o1ooiI111iI0000Il00O = iilOllOlO1.I0000Il00O(iloI0lOlll1, o1ooiI111i);
/* 86 */                IOl0oi0lOl1.I000lI.getClass();
/* 89 */                iloI0lOlll1.I00i0oil();
/* 94 */                if (iloI0lOlll1.I00O10llo) {
/* 98 */                    iloI0lOlll1.I000l1(O0iiOioolIi.I01101IOlO);
                        } else {
/* 102 */                   iloI0lOlll1.I00io1l();
                        }
/* 107 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00io1l, iloI0lOlll1, o1iOIl0o10I0000Il00O);
/* 112 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilO0, iloI0lOlll1, oO0lO0l0I000lI);
/* 119 */               li01Ooiio01.I00000oIO(iloI0lOlll1, Integer.valueOf(iHashCode));
/* 122 */               li01Ooiio01.I00000oOI(iloI0lOlll1);
/* 127 */               li01Ooiio01.I0000Il00O(lolOiIoiillI.I00ilI0I1, iloI0lOlll1, o1ooiI111iI0000Il00O);
/* 138 */               this.I00iOIl.invoke(oiool011li, iloI0lOlll1, Integer.valueOf(i & 14));
/* 141 */               iloI0lOlll1.I0010I0i(true);
                    } else {
/* 145 */               iloI0lOlll1.I00OilO00Il();
                    }
/* 148 */           return OoiIlOl1iI.I00000oIO;
                }
            }

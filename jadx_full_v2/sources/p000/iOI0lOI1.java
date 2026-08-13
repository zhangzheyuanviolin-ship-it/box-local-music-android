            package p000;
            
            public abstract class iOI0lOI1 {
                public static boolean I00000oIO(OoOilIO0iO00 ooOilIO0iO00, Oi1iIiI1 oi1iIiI1, Oi1iIiI1 oi1iIiI12) {
/* 10 */            if (ooOilIO0iO00.I00000oOI(oi1iIiI1) == ooOilIO0iO00.I00000oOI(oi1iIiI12) && ooOilIO0iO00.I00ioIO(oi1iIiI1) == ooOilIO0iO00.I00ioIO(oi1iIiI12) && ooOilIO0iO00.I00IO1oi11O(oi1iIiI1) == ooOilIO0iO00.I00IO1oi11O(oi1iIiI12) && ooOilIO0iO00.I00Oio(ooOilIO0iO00.I001lllioOl(oi1iIiI1), ooOilIO0iO00.I001lllioOl(oi1iIiI12))) {
/* 51 */                if (ooOilIO0iO00.I00OIo(oi1iIiI1, oi1iIiI12)) {
/* 115 */                   return true;
                        }
/* 54 */                int iI00000oOI = ooOilIO0iO00.I00000oOI(oi1iIiI1);
/* 59 */                for (int i = 0; i < iI00000oOI; i++) {
/* 61 */                    OoOI1Ooo1 ooOI1Ooo1I00ilO0 = ooOilIO0iO00.I00ilO0(oi1iIiI1, i);
/* 65 */                    OoOI1Ooo1 ooOI1Ooo1I00ilO02 = ooOilIO0iO00.I00ilO0(oi1iIiI12, i);
/* 77 */                    if (ooOilIO0iO00.I000OiO(ooOI1Ooo1I00ilO0) == ooOilIO0iO00.I000OiO(ooOI1Ooo1I00ilO02) && (ooOilIO0iO00.I000OiO(ooOI1Ooo1I00ilO0) || (ooOilIO0iO00.I000l1(ooOI1Ooo1I00ilO0) == ooOilIO0iO00.I000l1(ooOI1Ooo1I00ilO02) && I00000oOI(ooOilIO0iO00, ooOilIO0iO00.I000o00OoI0I(ooOI1Ooo1I00ilO0), ooOilIO0iO00.I000o00OoI0I(ooOI1Ooo1I00ilO02))))) {
                            }
                        }
/* 115 */               return true;
                    }
/* 9 */             return false;
                }

                public static boolean I00000oOI(OoOilIO0iO00 ooOilIO0iO00, O0iIo0i1 o0iIo0i1, O0iIo0i1 o0iIo0i12) {
/* 1 */             if (o0iIo0i1 == o0iIo0i12) {
/* 61 */                return true;
                    }
/* 4 */             Oi1iIiI1 oi1iIiI1I00i0oil = ooOilIO0iO00.I00i0oil(o0iIo0i1);
/* 8 */             Oi1iIiI1 oi1iIiI1I00i0oil2 = ooOilIO0iO00.I00i0oil(o0iIo0i12);
/* 12 */            if (oi1iIiI1I00i0oil != null && oi1iIiI1I00i0oil2 != null) {
/* 16 */                return I00000oIO(ooOilIO0iO00, oi1iIiI1I00i0oil, oi1iIiI1I00i0oil2);
                    }
/* 21 */            IlOIioiOooOO ilOIioiOooOOI00OloOo = ooOilIO0iO00.I00OloOo(o0iIo0i1);
/* 25 */            IlOIioiOooOO ilOIioiOooOOI00OloOo2 = ooOilIO0iO00.I00OloOo(o0iIo0i12);
                    return ilOIioiOooOOI00OloOo != null && ilOIioiOooOOI00OloOo2 != null && I00000oIO(ooOilIO0iO00, ooOilIO0iO00.I000O01llI0(ilOIioiOooOOI00OloOo), ooOilIO0iO00.I000O01llI0(ilOIioiOooOOI00OloOo2)) && I00000oIO(ooOilIO0iO00, ooOilIO0iO00.I000II(ilOIioiOooOOI00OloOo), ooOilIO0iO00.I000II(ilOIioiOooOOI00OloOo2));
                }
            }

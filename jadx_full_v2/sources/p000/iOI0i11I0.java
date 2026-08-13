            package p000;

            import java.util.ArrayDeque;
            import java.util.Iterator;
            
            public abstract class iOI0i11I0 {
                public static boolean I00000oIO(OoOIOIOOlo ooOIOIOOlo, Oi1iIiI1 oi1iIiI1, lOoiI0 looii0) {
/* 1 */             OoOIOIOI1Io ooOIOIOI1Io = OoOIOIOI1Io.I0000Il00O;
/* 3 */             IOIiIio iOIiIio = ooOIOIOOlo.I0000Il00O;
/* 10 */            if ((iOIiIio.I0010o(oi1iIiI1) && !iOIiIio.I00ioIO(oi1iIiI1)) || iOIiIio.I00IO1oi11O(oi1iIiI1)) {
/* 9 */                 return true;
                    }
/* 25 */            ooOIOIOOlo.I0000Il00O();
/* 28 */            ArrayDeque arrayDeque = ooOIOIOOlo.I0001Ioi1lo;
/* 30 */            Ol1OI1II0ll ol1OI1II0ll = ooOIOIOOlo.I000II;
/* 32 */            arrayDeque.push(oi1iIiI1);
/* 39 */            while (!arrayDeque.isEmpty()) {
/* 45 */                Oi1iIiI1 oi1iIiI12 = (Oi1iIiI1) arrayDeque.pop();
/* 51 */                if (ol1OI1II0ll.add(oi1iIiI12)) {
/* 61 */                    lOoiI0 looii02 = iOIiIio.I00ioIO(oi1iIiI12) ? ooOIOIOI1Io : looii0;
/* 66 */                    if (looii02.equals(ooOIOIOI1Io)) {
/* 69 */                        looii02 = null;
                            }
/* 70 */                    if (looii02 == null) {
                                continue;
                            } else {
/* 81 */                        Iterator it = iOIiIio.I001iOo1i0O(iOIiIio.I001lllioOl(oi1iIiI12)).iterator();
/* 89 */                        while (it.hasNext()) {
/* 97 */                            Oi1iIiI1 oi1iIiI1I00000oIO = looii02.I00000oIO(ooOIOIOOlo, (O0iIo0i1) it.next());
/* 105 */                           if ((iOIiIio.I0010o(oi1iIiI1I00000oIO) && !iOIiIio.I00ioIO(oi1iIiI1I00000oIO)) || iOIiIio.I00IO1oi11O(oi1iIiI1I00000oIO)) {
/* 119 */                               ooOIOIOOlo.I00000oIO();
/* 9 */                                 return true;
                                    }
/* 123 */                           arrayDeque.add(oi1iIiI1I00000oIO);
                                }
                            }
                        }
                    }
/* 127 */           ooOIOIOOlo.I00000oIO();
/* 130 */           return false;
                }

                public static boolean I00000oOI(OoOIOIOOlo ooOIOIOOlo, Oi1iIiI1 oi1iIiI1, OoOIi1lliil ooOIi1lliil) {
/* 1 */             IOIiIio iOIiIio = ooOIOIOOlo.I0000Il00O;
/* 7 */             if (iOIiIio.I0010I0i(oi1iIiI1)) {
/* 9 */                 return true;
                    }
/* 15 */            if (iOIiIio.I00ioIO(oi1iIiI1)) {
/* 17 */                return false;
                    }
/* 21 */            if (ooOIOIOOlo.I00000oOI) {
/* 23 */                iOIiIio.I00IoO0(oi1iIiI1);
                    }
/* 30 */            return iOIiIio.I00Oio(iOIiIio.I001lllioOl(oi1iIiI1), ooOIi1lliil);
                }
            }

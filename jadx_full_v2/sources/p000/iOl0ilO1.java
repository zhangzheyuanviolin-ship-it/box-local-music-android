            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
            public abstract class iOl0ilO1 {
                public static i1IoOioloO1 I00000oIO;

                public static final void I00000oIO(O1ooiI111i o1ooiI111i, Function1 function1, IloI0lOlll1 iloI0lOlll1, int i) {
                    int i2;
/* 4 */             iloI0lOlll1.I00i0O(-932836462);
/* 9 */             int i3 = 2;
/* 10 */            if ((i & 6) == 0) {
/* 21 */                i2 = (iloI0lOlll1.I000II(o1ooiI111i) ? 4 : 2) | i;
                    } else {
/* 23 */                i2 = i;
                    }
/* 26 */            if ((i & 48) == 0) {
/* 39 */                i2 |= iloI0lOlll1.I000OOo1O(function1) ? 32 : 16;
                    }
/* 55 */            if (iloI0lOlll1.I00OIl(i2 & 1, (i2 & 19) != 18)) {
/* 61 */                lOO1OIO00.I00000oIO(iloI0lOlll1, iIO01l11OlO.I00000oIO(o1ooiI111i, function1));
                    } else {
/* 65 */                iloI0lOlll1.I00OilO00Il();
                    }
/* 68 */            OOloioIl oOloioIlI001IO000 = iloI0lOlll1.I001IO000();
/* 72 */            if (oOloioIlI001IO000 != null) {
/* 76 */                I0O0llIiIlOO i0O0llIiIlOO = new I0O0llIiIlOO(i3);
/* 79 */                i0O0llIiIlOO.I00iiO = o1ooiI111i;
/* 81 */                i0O0llIiIlOO.I00iio = function1;
/* 83 */                i0O0llIiIlOO.I00iiI = i;
/* 85 */                VarHandle.storeStoreFence();
/* 88 */                oOloioIlI001IO000.I0000O = i0O0llIiIlOO;
                    }
                }

                public static synchronized iOiooiO I00000oOI() {
                    iOiooiO ioiooio;
/* 6 */             i1OII10oOIl i1oii10ooil = new i1OII10oOIl();
/* 11 */            i1oii10ooil.I00000oIO = "genai-prompt";
/* 14 */            i1oii10ooil.I00000oOI = true;
/* 19 */            byte b = (byte) (i1oii10ooil.I0000O | 1);
/* 20 */            i1oii10ooil.I0000Il00O = 1;
/* 25 */            i1oii10ooil.I0000O = (byte) (b | 2);
/* 27 */            iOilOIiI ioiloiiiI00000oOI = i1oii10ooil.I00000oOI();
                    synchronized (iOl0ilO1.class) {
                        try {
/* 32 */                    i1IoOioloO1 i1iooioloo1 = I00000oIO;
/* 34 */                    if (i1iooioloo1 == null) {
/* 39 */                        i1iooioloo1 = new i1IoOioloO1(4);
/* 42 */                        I00000oIO = i1iooioloo1;
                            }
/* 51 */                    ioiooio = (iOiooiO) i1iooioloo1.get(ioiloiiiI00000oOI);
                        } catch (Throwable th) {
/* 57 */                    throw th;
                        }
                    }
/* 55 */            return ioiooio;
/* 55 */            return ioiooio;
                }
            }

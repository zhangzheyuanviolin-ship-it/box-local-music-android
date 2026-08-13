            package p000;
            
            public abstract class lolI1l0OO {
                public static i1IoOioloO1 I00000oIO;

                public static synchronized loiI0oIOO I00000oIO() {
                    loiI0oIOO loii0oioo;
/* 6 */             i1OII10oOIl i1oii10ooil = new i1OII10oOIl();
/* 11 */            i1oii10ooil.I00000oIO = "face-mesh-detection";
/* 14 */            i1oii10ooil.I00000oOI = true;
/* 19 */            byte b = (byte) (i1oii10ooil.I0000O | 1);
/* 20 */            i1oii10ooil.I0000Il00O = 1;
/* 25 */            i1oii10ooil.I0000O = (byte) (b | 2);
/* 27 */            loO1loo1o0 loo1loo1o0I000O01llI0 = i1oii10ooil.I000O01llI0();
                    synchronized (lolI1l0OO.class) {
                        try {
/* 32 */                    i1IoOioloO1 i1iooioloo1 = I00000oIO;
/* 34 */                    if (i1iooioloo1 == null) {
/* 40 */                        i1iooioloo1 = new i1IoOioloO1(10);
/* 43 */                        I00000oIO = i1iooioloo1;
                            }
/* 52 */                    loii0oioo = (loiI0oIOO) i1iooioloo1.get(loo1loo1o0I000O01llI0);
                        } catch (Throwable th) {
/* 58 */                    throw th;
                        }
                    }
/* 56 */            return loii0oioo;
/* 56 */            return loii0oioo;
                }
            }

            package p000;
            
            public abstract class looiI0OO0 {
                public static i1IoOioloO1 I00000oIO;

                public static synchronized loloOlli1l0 I00000oIO(String str) {
                    loloOlli1l0 loloolli1l0;
                    try {
/* 6 */                 i1OII10oOIl i1oii10ooil = new i1OII10oOIl();
/* 9 */                 if (str == null) {
/* 68 */                    throw new NullPointerException("Null libraryName");
                        }
/* 11 */                i1oii10ooil.I00000oIO = str;
/* 14 */                i1oii10ooil.I00000oOI = true;
/* 19 */                byte b = (byte) (i1oii10ooil.I0000O | 1);
/* 20 */                i1oii10ooil.I0000Il00O = 1;
/* 25 */                i1oii10ooil.I0000O = (byte) (b | 2);
/* 27 */                loiloo0lI loiloo0liI000OOo1O = i1oii10ooil.I000OOo1O();
                        synchronized (looiI0OO0.class) {
                            try {
/* 32 */                        i1IoOioloO1 i1iooioloo1 = I00000oIO;
/* 34 */                        if (i1iooioloo1 == null) {
/* 40 */                            i1iooioloo1 = new i1IoOioloO1(12);
/* 43 */                            I00000oIO = i1iooioloo1;
                                }
/* 52 */                        loloolli1l0 = (loloOlli1l0) i1iooioloo1.get(loiloo0liI000OOo1O);
                            } finally {
                            }
                        }
/* 56 */                return loloolli1l0;
                    } catch (Throwable th) {
/* 77 */                throw th;
                    }
/* 56 */            return loloolli1l0;
                }
            }

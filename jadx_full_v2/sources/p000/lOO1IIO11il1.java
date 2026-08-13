            package p000;
            
            public abstract class lOO1IIO11il1 {
                public static i1IoOioloO1 I00000oIO;

                public static synchronized lOI00Ii101I0 I00000oIO() {
                    lOI00Ii101I0 loi00ii101i0;
/* 6 */             i1OII10oOIl i1oii10ooil = new i1OII10oOIl();
/* 11 */            i1oii10ooil.I00000oIO = "vision-common";
/* 14 */            i1oii10ooil.I00000oOI = true;
/* 19 */            byte b = (byte) (i1oii10ooil.I0000O | 1);
/* 20 */            i1oii10ooil.I0000Il00O = 1;
/* 25 */            i1oii10ooil.I0000O = (byte) (b | 2);
/* 27 */            lO0ioo11llOO lo0ioo11llooI0000Il00O = i1oii10ooil.I0000Il00O();
                    synchronized (lOO1IIO11il1.class) {
                        try {
/* 32 */                    i1IoOioloO1 i1iooioloo1 = I00000oIO;
/* 34 */                    if (i1iooioloo1 == null) {
/* 39 */                        i1iooioloo1 = new i1IoOioloO1(6);
/* 42 */                        I00000oIO = i1iooioloo1;
                            }
/* 51 */                    loi00ii101i0 = (lOI00Ii101I0) i1iooioloo1.get(lo0ioo11llooI0000Il00O);
                        } catch (Throwable th) {
/* 57 */                    throw th;
                        }
                    }
/* 55 */            return loi00ii101i0;
/* 55 */            return loi00ii101i0;
                }
            }

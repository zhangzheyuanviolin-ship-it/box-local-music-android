            package p000;
            
            public abstract class loiio1IIlIil {
                public static i1IoOioloO1 I00000oIO;

                public static synchronized loOiOoIi I00000oIO() {
                    loOiOoIi looiooii;
/* 6 */             i1OII10oOIl i1oii10ooil = new i1OII10oOIl();
/* 11 */            i1oii10ooil.I00000oIO = "image-labeling";
/* 14 */            i1oii10ooil.I00000oOI = true;
/* 19 */            byte b = (byte) (i1oii10ooil.I0000O | 1);
/* 20 */            i1oii10ooil.I0000Il00O = 1;
/* 25 */            i1oii10ooil.I0000O = (byte) (b | 2);
/* 27 */            loI10I loi10iI0001Ioi1lo = i1oii10ooil.I0001Ioi1lo();
                    synchronized (loiio1IIlIil.class) {
                        try {
/* 32 */                    i1IoOioloO1 i1iooioloo1 = I00000oIO;
/* 34 */                    if (i1iooioloo1 == null) {
/* 40 */                        i1iooioloo1 = new i1IoOioloO1(9);
/* 43 */                        I00000oIO = i1iooioloo1;
                            }
/* 52 */                    looiooii = (loOiOoIi) i1iooioloo1.get(loi10iI0001Ioi1lo);
                        } catch (Throwable th) {
/* 58 */                    throw th;
                        }
                    }
/* 56 */            return looiooii;
/* 56 */            return looiooii;
                }
            }

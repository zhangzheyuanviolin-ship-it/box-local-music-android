            package p000;
            
            public abstract class liIl1O0ollo {
                public static i1IoOioloO1 I00000oIO;

                public static int I00000oIO(int i) {
/* 18 */            return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
                }

                public static synchronized li10lI1 I00000oOI(String str) {
                    li10lI1 li10li1;
/* 6 */             i1OII10oOIl i1oii10ooil = new i1OII10oOIl();
/* 9 */             i1oii10ooil.I00000oIO = str;
/* 12 */            i1oii10ooil.I00000oOI = true;
/* 17 */            byte b = (byte) (i1oii10ooil.I0000O | 1);
/* 18 */            i1oii10ooil.I0000Il00O = 1;
/* 23 */            i1oii10ooil.I0000O = (byte) (b | 2);
/* 25 */            lOoI1Ol looi1olI0000O = i1oii10ooil.I0000O();
                    synchronized (liIl1O0ollo.class) {
                        try {
/* 30 */                    i1IoOioloO1 i1iooioloo1 = I00000oIO;
/* 32 */                    if (i1iooioloo1 == null) {
/* 37 */                        i1iooioloo1 = new i1IoOioloO1(7);
/* 40 */                        I00000oIO = i1iooioloo1;
                            }
/* 49 */                    li10li1 = (li10lI1) i1iooioloo1.get(looi1olI0000O);
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 53 */            return li10li1;
/* 53 */            return li10li1;
                }
            }

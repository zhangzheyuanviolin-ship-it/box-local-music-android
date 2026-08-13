            package p000;
            
            public abstract class o0i0Ill1olo {
                public static i1IoOioloO1 I00000oIO;

                public static synchronized o0OIl1o1i0Oi I00000oIO(String str) {
                    o0OIl1o1i0Oi o0oil1o1i0oi;
/* 8 */             o0IiIio1Ii1i o0iiiio1ii1iI00000oIO = o0IiIio1Ii1i.I00000oIO(str).I00000oIO();
                    synchronized (o0i0Ill1olo.class) {
                        try {
/* 13 */                    i1IoOioloO1 i1iooioloo1 = I00000oIO;
/* 15 */                    if (i1iooioloo1 == null) {
/* 21 */                        i1iooioloo1 = new i1IoOioloO1(13);
/* 24 */                        I00000oIO = i1iooioloo1;
                            }
/* 33 */                    o0oil1o1i0oi = (o0OIl1o1i0Oi) i1iooioloo1.get(o0iiiio1ii1iI00000oIO);
                        } catch (Throwable th) {
/* 39 */                    throw th;
                        }
                    }
/* 37 */            return o0oil1o1i0oi;
/* 37 */            return o0oil1o1i0oi;
                }
            }

            package p000;

            import java.io.IOException;
            import java.io.StringReader;
            
            public abstract class lii0olO {
                public static iI01OoiIlOl I00000oIO(iI1000o0ol ii1000o0ol) {
/* 5 */             int i = ii1000o0ol.I00iiI;
/* 8 */             if (i == 2) {
/* 11 */                ii1000o0ol.I00iiI = 1;
                    }
                    try {
                        try {
/* 16 */                    iI01OoiIlOl ii01ooiilolI00000oIO = lii1oI1o.I00000oIO(ii1000o0ol);
/* 20 */                    if (i == 0) {
/* 25 */                        throw null;
                            }
/* 22 */                    ii1000o0ol.I00iiI = i;
/* 24 */                    return ii01ooiilolI00000oIO;
                        } catch (OutOfMemoryError e) {
/* 53 */                    throw new IOiIIo1l("Failed parsing JSON source: " + ii1000o0ol.toString() + " to Json", e, 15);
                        } catch (StackOverflowError e2) {
/* 79 */                    throw new IOiIIo1l("Failed parsing JSON source: " + ii1000o0ol.toString() + " to Json", e2, 15);
                        }
                    } catch (Throwable th) {
/* 80 */                if (i == 0) {
/* 168 */                   throw null;
                        }
/* 82 */                ii1000o0ol.I00iiI = i;
/* 84 */                throw th;
                    }
                }

                public static iI01OoiIlOl I00000oOI(String str) {
                    try {
/* 10 */                iI1000o0ol ii1000o0ol = new iI1000o0ol(new StringReader(str));
/* 13 */                iI01OoiIlOl ii01ooiilolI00000oIO = I00000oIO(ii1000o0ol);
/* 19 */                if (!(ii01ooiilolI00000oIO instanceof iI0I1O1lOlo) && ii1000o0ol.I000O01llI0() != 10) {
/* 37 */                    throw new iI0Iol1l("Did not consume the entire document.", 15);
                        }
/* 44 */                return ii01ooiilolI00000oIO;
                    } catch (iI10l1li0li0 e) {
/* 77 */                throw new iI0Iol1l(e, 15);
                    } catch (IOException e2) {
/* 56 */                throw new iI01o1loIo(e2, 15);
                    } catch (NumberFormatException e3) {
/* 50 */                throw new iI0Iol1l(e3, 15);
                    }
                }
            }

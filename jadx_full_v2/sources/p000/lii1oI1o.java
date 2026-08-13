            package p000;

            import java.io.EOFException;
            import java.io.IOException;
            
            public abstract class lii1oI1o {
                public static iI01OoiIlOl I00000oIO(iI1000o0ol ii1000o0ol) {
                    boolean z;
                    try {
                        try {
/* 3 */                     ii1000o0ol.I000O01llI0();
                            try {
/* 6 */                         return liiI00llO1i0.I00000oIO(ii1000o0ol);
                            } catch (EOFException e) {
/* 17 */                        e = e;
/* 18 */                        z = false;
/* 40 */                        if (z) {
/* 42 */                            return iI0I1O1lOlo.I00iOIl;
                                }
/* 77 */                        throw new iI0Iol1l(e, 15);
                            }
                        } catch (EOFException e2) {
/* 38 */                    e = e2;
/* 39 */                    z = true;
                        }
                    } catch (iI10l1li0li0 e3) {
/* 37 */                throw new iI0Iol1l(e3, 15);
                    } catch (IOException e4) {
/* 31 */                throw new iI01o1loIo(e4, 15);
                    } catch (NumberFormatException e5) {
/* 25 */                throw new iI0Iol1l(e5, 15);
                    }
                }
            }

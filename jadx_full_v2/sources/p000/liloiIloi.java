            package p000;

            import java.io.EOFException;
            import java.io.IOException;
            
            public abstract class liloiIloi {
                public static il0ioI1OI I00000oIO(ilOiIllI iloiilli) {
                    boolean z;
                    try {
                        try {
/* 3 */                     iloiilli.I000O01llI0();
                            try {
/* 6 */                         return liloiiO1o.I00000oIO(iloiilli);
                            } catch (EOFException e) {
/* 17 */                        e = e;
/* 18 */                        z = false;
/* 40 */                        if (z) {
/* 42 */                            return il0o0Oo10.I00iOIl;
                                }
/* 77 */                        throw new il1ilOI0IIlo(e, 17);
                            }
                        } catch (EOFException e2) {
/* 38 */                    e = e2;
/* 39 */                    z = true;
                        }
                    } catch (ilOoOOOlll1 e3) {
/* 37 */                throw new il1ilOI0IIlo(e3, 17);
                    } catch (IOException e4) {
/* 31 */                throw new il0lIl(e4, 17);
                    } catch (NumberFormatException e5) {
/* 25 */                throw new il1ilOI0IIlo(e5, 17);
                    }
                }
            }

            package p000;

            import java.io.IOException;
            import java.io.StringReader;
            
            public abstract class lilloiiOo {
                public static il0ioI1OI I00000oIO(ilOiIllI iloiilli) {
/* 5 */             int i = iloiilli.I00iiI;
/* 8 */             if (i == 2) {
/* 11 */                iloiilli.I00iiI = 1;
                    }
                    try {
                        try {
/* 16 */                    il0ioI1OI il0ioi1oiI00000oIO = liloiIloi.I00000oIO(iloiilli);
/* 20 */                    if (i == 0) {
/* 25 */                        throw null;
                            }
/* 22 */                    iloiilli.I00iiI = i;
/* 24 */                    return il0ioi1oiI00000oIO;
                        } catch (OutOfMemoryError e) {
/* 53 */                    throw new IOiIIo1l("Failed parsing JSON source: " + iloiilli.toString() + " to Json", e, 17);
                        } catch (StackOverflowError e2) {
/* 79 */                    throw new IOiIIo1l("Failed parsing JSON source: " + iloiilli.toString() + " to Json", e2, 17);
                        }
                    } catch (Throwable th) {
/* 80 */                if (i == 0) {
/* 168 */                   throw null;
                        }
/* 82 */                iloiilli.I00iiI = i;
/* 84 */                throw th;
                    }
                }

                public static il0ioI1OI I00000oOI(String str) {
                    try {
/* 10 */                ilOiIllI iloiilli = new ilOiIllI(new StringReader(str));
/* 13 */                il0ioI1OI il0ioi1oiI00000oIO = I00000oIO(iloiilli);
/* 19 */                if (!(il0ioi1oiI00000oIO instanceof il0o0Oo10) && iloiilli.I000O01llI0() != 10) {
/* 37 */                    throw new il1ilOI0IIlo("Did not consume the entire document.", 17);
                        }
/* 44 */                return il0ioi1oiI00000oIO;
                    } catch (ilOoOOOlll1 e) {
/* 77 */                throw new il1ilOI0IIlo(e, 17);
                    } catch (IOException e2) {
/* 56 */                throw new il0lIl(e2, 17);
                    } catch (NumberFormatException e3) {
/* 50 */                throw new il1ilOI0IIlo(e3, 17);
                    }
                }
            }

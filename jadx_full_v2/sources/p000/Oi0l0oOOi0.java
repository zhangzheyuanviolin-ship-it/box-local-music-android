            package p000;

            import java.io.FileNotFoundException;
            import java.io.IOException;
            import java.util.LinkedHashSet;
            import java.util.List;
            
            public final class Oi0l0oOOi0 extends IlIiOO0ilI {
                public static final OO0IIO1Il I00iiI;

                static {
/* 1 */             String str = OO0IIO1Il.I00iiI;
/* 9 */             I00iiI = Iioi0lilII.I00lli11("/");
                }

                public static String I00Io1lO(OO0IIO1Il oO0IIO1Il) {
/* 1 */             OO0IIO1Il oO0IIO1Il2 = I00iiI;
/* 3 */             oO0IIO1Il2.getClass();
/* 17 */            return I0000oI00.I00000oIO(oO0IIO1Il2, oO0IIO1Il, true).I0000Il00O(oO0IIO1Il2).I00iOIl.I000o00OoI0I();
                }

                @Override
                public final Ol0i0olI I00000oIO(OO0IIO1Il oO0IIO1Il) throws IOException {
/* 49 */            throw new IOException(this + " is read-only");
                }

                @Override
                public final void I0000Il00O(OO0IIO1Il oO0IIO1Il, OO0IIO1Il oO0IIO1Il2) throws IOException {
/* 89 */            throw new IOException(this + " is read-only");
                }

                @Override
                public final void I000II(OO0IIO1Il oO0IIO1Il) throws IOException {
/* 49 */            throw new IOException(this + " is read-only");
                }

                @Override
                public final void I000O01llI0(OO0IIO1Il oO0IIO1Il) throws IOException {
/* 49 */            throw new IOException(this + " is read-only");
                }

                @Override
                public final List I00100l0(OO0IIO1Il oO0IIO1Il) {
/* 1 */             I00Io1lO(oO0IIO1Il);
/* 6 */             new LinkedHashSet();
/* 49 */            throw null;
                }

                @Override
                public final IlIOoOIo0l I001l0I00(OO0IIO1Il oO0IIO1Il) {
/* 6 */             if (!lIoi0i1oii1.I00000oIO(oO0IIO1Il)) {
/* 5 */                 return null;
                    }
/* 9 */             I00Io1lO(oO0IIO1Il);
/* 49 */            throw null;
                }

                @Override
                public final Ol0i0olI I00IOO(OO0IIO1Il oO0IIO1Il) throws IOException {
/* 49 */            throw new IOException(this + " is read-only");
                }

                @Override
                public final OlI1ii I00IioO0OiOi(OO0IIO1Il oO0IIO1Il) throws FileNotFoundException {
/* 5 */             if (!lIoi0i1oii1.I00000oIO(oO0IIO1Il)) {
/* 49 */                throw new FileNotFoundException("file not found: " + oO0IIO1Il);
                    }
/* 7 */             OO0IIO1Il oO0IIO1Il2 = I00iiI;
/* 9 */             oO0IIO1Il2.getClass();
/* 23 */            I0000oI00.I00000oIO(oO0IIO1Il2, oO0IIO1Il, false).I0000Il00O(oO0IIO1Il2).I00iOIl.I000o00OoI0I();
/* 27 */            throw null;
                }
            }

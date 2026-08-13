            package p000;

            import java.io.FileNotFoundException;
            import java.io.IOException;
            
            public abstract class iO1oIOlI {
                public static final void I00000oIO(IlIiOO0ilI ilIiOO0ilI, OO0IIO1Il oO0IIO1Il) throws IOException {
                    try {
/* 9 */                 IOException iOException = null;
/* 14 */                for (OO0IIO1Il oO0IIO1Il2 : ilIiOO0ilI.I00100l0(oO0IIO1Il)) {
                            try {
/* 28 */                        if (ilIiOO0ilI.I001i1lo1io(oO0IIO1Il2).I00000oOI) {
/* 30 */                            I00000oIO(ilIiOO0ilI, oO0IIO1Il2);
                                }
/* 36 */                        ilIiOO0ilI.I000O01llI0(oO0IIO1Il2);
                            } catch (IOException e) {
/* 40 */                        if (iOException == null) {
/* 42 */                            iOException = e;
                                }
                            }
                        }
/* 44 */                if (iOException != null) {
/* 47 */                    throw iOException;
                        }
                    } catch (FileNotFoundException unused) {
                    }
                }
            }

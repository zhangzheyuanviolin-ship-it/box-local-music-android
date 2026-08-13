            package p000;

            import java.io.EOFException;
            import java.io.IOException;
            
            public abstract class lOOlo0I1 {
                public static O01O10Ii I00000oIO(O01loll1loll o01loll1loll) {
                    boolean z;
                    try {
                        try {
/* 1 */                     o01loll1loll.peek();
/* 4 */                     z = false;
                            try {
/* 7 */                         O01OOOO0Oo1.I00000oIO.getClass();
/* 10 */                        return O01OOOO0Oo1.I0000O(o01loll1loll);
                            } catch (EOFException e) {
/* 15 */                        e = e;
/* 40 */                        if (z) {
/* 42 */                            return O01iIOolI.I00iOIl;
                                }
/* 186 */                       throw new O01Oo001(e);
                            }
                        } catch (EOFException e2) {
/* 38 */                    e = e2;
/* 39 */                    z = true;
                        }
                    } catch (O1OIO1Ill0 e3) {
/* 37 */                throw new O01Oo001(e3);
                    } catch (IOException e4) {
/* 30 */                throw new O01Oo001(e4);
                    } catch (NumberFormatException e5) {
/* 23 */                throw new O01Oo001(e5);
                    }
                }
            }

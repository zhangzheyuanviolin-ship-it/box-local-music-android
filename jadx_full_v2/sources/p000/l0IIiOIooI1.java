            package p000;

            import java.io.IOException;
            import java.io.StringReader;
            
            public abstract class l0IIiOIooI1 {
                public static O01O10Ii I00000oIO(O01loll1loll o01loll1loll) {
/* 3 */             int i = o01loll1loll.I00o0iI0io1;
/* 6 */             if (i == 2) {
/* 9 */                 o01loll1loll.I00o0iI0io1 = 1;
                    }
                    try {
                        try {
/* 11 */                    return lOOlo0I1.I00000oIO(o01loll1loll);
                        } catch (OutOfMemoryError | StackOverflowError e) {
/* 44 */                    throw new O01l1oO("Failed parsing JSON source: " + o01loll1loll + " to Json", e);
                        }
                    } finally {
/* 45 */                o01loll1loll.I00oliIiO01i(i);
                    }
                }

                public static O01O10Ii I00000oOI(String str) {
                    try {
/* 8 */                 O01loll1loll o01loll1loll = new O01loll1loll(new StringReader(str));
/* 11 */                O01O10Ii o01O10IiI00000oIO = I00000oIO(o01loll1loll);
/* 15 */                o01O10IiI00000oIO.getClass();
/* 20 */                if (!(o01O10IiI00000oIO instanceof O01iIOolI) && o01loll1loll.peek() != 10) {
/* 38 */                    throw new O01Oo001("Did not consume the entire document.");
                        }
/* 39 */                return o01O10IiI00000oIO;
                    } catch (O1OIO1Ill0 | NumberFormatException e) {
/* 77 */                throw new O01Oo001(e);
                    } catch (IOException e2) {
/* 46 */                throw new O01Oo001(e2);
                    }
                }
            }

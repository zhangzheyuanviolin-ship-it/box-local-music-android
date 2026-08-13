            package p000;

            import java.io.BufferedReader;
            import java.io.IOException;
            import java.io.Reader;
            import java.io.StringWriter;
            import java.lang.invoke.VarHandle;
            
            public abstract class lOliOoIi {
                public static final OilO0iOl I00000oIO(BufferedReader bufferedReader) {
/* 4 */             I1Iolliil0i i1Iolliil0i = new I1Iolliil0i(2);
/* 7 */             i1Iolliil0i.I00000oOI = bufferedReader;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            return OilO1oiooiII.I0000O(i1Iolliil0i);
                }

                public static final String I00000oOI(Reader reader) throws IOException {
/* 3 */             StringWriter stringWriter = new StringWriter();
/* 8 */             char[] cArr = new char[8192];
/* 10 */            int i = reader.read(cArr);
/* 14 */            while (i >= 0) {
/* 17 */                stringWriter.write(cArr, 0, i);
/* 20 */                i = reader.read(cArr);
                    }
/* 25 */            return stringWriter.toString();
                }
            }

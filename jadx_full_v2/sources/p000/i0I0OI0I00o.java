            package p000;

            import java.lang.invoke.VarHandle;
            import java.nio.charset.Charset;
            import java.nio.charset.StandardCharsets;
            import java.util.stream.Stream;
            
            public abstract class i0I0OI0I00o {
                public static final int I00000oIO = 0;

                static {
/* 3 */             I00000oIO(StandardCharsets.UTF_8);
                }

                public static OIIl00o10 I00000oIO(Charset charset) {
/* 3 */             int i = IO1IOO.I00000oIO;
/* 12 */            Charset charsetDefaultCharset = charset == null ? Charset.defaultCharset() : charset;
/* 13 */            if (charset == null) {
/* 15 */                charset = Charset.defaultCharset();
                    }
/* 19 */            if (charset == null) {
/* 21 */                charset = Charset.defaultCharset();
                    }
/* 33 */            return new OIIl00o10(charsetDefaultCharset, I00000oOI(charset.name()));
                }

                public static boolean I00000oOI(String str) {
/* 1 */             Charset charset = StandardCharsets.UTF_8;
/* 11 */            if (charset.name().equalsIgnoreCase(str)) {
/* 41 */                return true;
                    }
/* 17 */            Stream<String> stream = charset.aliases().stream();
/* 24 */            O1ollIl o1ollIl = new O1ollIl(2);
/* 27 */            o1ollIl.I00000oOI = str;
/* 29 */            VarHandle.storeStoreFence();
                    return stream.anyMatch(o1ollIl);
                }
            }

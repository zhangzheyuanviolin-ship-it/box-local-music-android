            package p000;

            import java.nio.charset.Charset;
            
            public abstract class IOoi00l {
                public static final int I00000oIO = 0;

                static {
/* 21 */            I1IoiO1l.I00IlilI0i0i(new String[]{"json", "ld+json", "xml", "xhtml+xml", "rss+xml", "atom+xml", "x-www-form-urlencoded", "svg+xml"});
                }

                public static final Charset I00000oIO(IOoOloI0iI iOoOloI0iI) {
/* 3 */             String strI00000oOI = iOoOloI0iI.I00000oOI("charset");
/* 7 */             if (strI00000oOI == null) {
/* 16 */                return null;
                    }
                    try {
/* 9 */                 Charset charset = IO1IOI.I00000oIO;
/* 11 */                return Charset.forName(strI00000oOI);
                    } catch (IllegalArgumentException unused) {
/* 16 */                return null;
                    }
                }
            }

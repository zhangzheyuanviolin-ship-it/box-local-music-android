            package p000;

            import java.nio.charset.Charset;
            
            public final class Oloil11oIooi extends OIio0O0iiOoi {
                public final String I00000oIO;
                public final IOoOloI0iI I00000oOI;
                public final byte[] I0000Il00O;

                public Oloil11oIooi(String str, IOoOloI0iI iOoOloI0iI) {
/* 4 */             this.I00000oIO = str;
/* 6 */             this.I00000oOI = iOoOloI0iI;
/* 8 */             Charset charsetI00000oIO = IOoi00l.I00000oIO(iOoOloI0iI);
/* 14 */            charsetI00000oIO = charsetI00000oIO == null ? IO1IOI.I00000oIO : charsetI00000oIO;
/* 16 */            Charset charset = IO1IOI.I00000oIO;
/* 42 */            this.I0000Il00O = charsetI00000oIO.equals(charset) ? str.getBytes(charset) : iOlIOO1I.I00000oIO(charsetI00000oIO.newEncoder(), str, 0, str.length());
                }

                @Override
                public final Long I00000oIO() {
/* 5 */             return Long.valueOf(this.I0000Il00O.length);
                }

                @Override
                public final IOoOloI0iI I00000oOI() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final byte[] I0000O() {
/* 1 */             return this.I0000Il00O;
                }

                public final String toString() {
/* 34 */            return "TextContent[" + this.I00000oOI + "] \"" + OlOoOIi0o.I00OIl(30, this.I00000oIO) + '\"';
                }
            }

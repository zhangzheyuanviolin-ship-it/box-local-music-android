            package p000;

            import java.io.IOException;
            
            public class O0011oo extends IOException {
                public boolean I00iOIl;

                public static O0011oo I00000oIO() {
/* 5 */             return new O0011oo("Protocol message had invalid UTF-8.");
                }

                public static O000o1i I00000oOI() {
/* 5 */             return new O000o1i("Protocol message tag had invalid wire type.");
                }

                public static O0011oo I0000Il00O() {
/* 5 */             return new O0011oo("CodedInputStream encountered a malformed varint.");
                }

                public static O0011oo I0000O() {
/* 5 */             return new O0011oo("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }

                public static O0011oo I0000oI00() {
/* 5 */             return new O0011oo("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }

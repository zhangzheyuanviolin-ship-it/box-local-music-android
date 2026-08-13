            package p000;

            import java.io.IOException;
            
            public class O0010I0o extends IOException {
                public boolean I00iOIl;

                public static O0010I0o I00000oIO() {
/* 5 */             return new O0010I0o("Protocol message had invalid UTF-8.");
                }

                public static O000lI0 I00000oOI() {
/* 5 */             return new O000lI0("Protocol message tag had invalid wire type.");
                }

                public static O0010I0o I0000Il00O() {
/* 5 */             return new O0010I0o("CodedInputStream encountered a malformed varint.");
                }

                public static O0010I0o I0000O() {
/* 5 */             return new O0010I0o("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }

                public static O0010I0o I0000oI00() {
/* 5 */             return new O0010I0o("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
            }

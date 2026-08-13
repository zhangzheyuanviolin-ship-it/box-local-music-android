            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OIlI0iOIo {
                public int I00000oIO;

                public static final OIlI0iOIo I00000oIO(int i) {
/* 3 */             OIlI0iOIo oIlI0iOIo = new OIlI0iOIo();
/* 6 */             oIlI0iOIo.I00000oIO = i;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return oIlI0iOIo;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof OIlI0iOIo) && this.I00000oIO == ((OIlI0iOIo) obj).I00000oIO;
                }

                public final int hashCode() {
/* 3 */             return Integer.hashCode(this.I00000oIO);
                }

                public final String toString() {
/* 1 */             int i = this.I00000oIO;
/* 3 */             if (i == 0) {
/* 41 */                return "PENDING";
                    }
/* 6 */             if (i == 1) {
/* 38 */                return "AVAILABLE";
                    }
/* 9 */             if (i == 2) {
/* 35 */                return "UNAVAILABLE";
                    }
                    switch (i) {
                        case 10:
/* 32 */                    return "ERROR_OUTPUT_FAILED";
                        case 11:
/* 29 */                    return "ERROR_OUTPUT_ABORTED";
                        case 12:
/* 26 */                    return "ERROR_OUTPUT_MISSING";
                        case 13:
/* 23 */                    return "ERROR_OUTPUT_DROPPED";
                        default:
/* 18 */                    return Oi010OO0.I0010I0i("OutputStatus(value=", i, ')');
                    }
                }
            }

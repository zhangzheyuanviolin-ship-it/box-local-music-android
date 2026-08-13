            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIllI0o {
                public String I00000oIO;

                public static final IIllI0o I00000oIO(String str) {
/* 3 */             IIllI0o iIllI0o = new IIllI0o();
/* 6 */             iIllI0o.I00000oIO = str;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iIllI0o;
                }

                public static void I00000oOI(String str) {
/* 5 */             if (OlOoOIi0o.I001l0I00(str)) {
/* 10 */                I000II.I000iOII("CameraId cannot be null or blank!");
                    }
                }

                public static String I0000Il00O(String str) {
/* 3 */             return IIl001iO0Io.I000o00OoI0I("CameraId-", str);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IIllI0o) && O0000Ioio00.I0000O(this.I00000oIO, ((IIllI0o) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 3 */             return I0000Il00O(this.I00000oIO);
                }
            }

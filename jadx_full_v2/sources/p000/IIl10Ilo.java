            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IIl10Ilo {
                public String I00000oIO;

                public static final IIl10Ilo I00000oIO(String str) {
/* 3 */             IIl10Ilo iIl10Ilo = new IIl10Ilo();
/* 6 */             iIl10Ilo.I00000oIO = str;
/* 8 */             VarHandle.storeStoreFence();
/* 29 */            return iIl10Ilo;
                }

                public static String I00000oOI(String str) {
/* 5 */             return IIl001iO0Io.I000iOII(')', "CameraBackendId(value=", str);
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IIl10Ilo) && O0000Ioio00.I0000O(this.I00000oIO, ((IIl10Ilo) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 3 */             return I00000oOI(this.I00000oIO);
                }
            }

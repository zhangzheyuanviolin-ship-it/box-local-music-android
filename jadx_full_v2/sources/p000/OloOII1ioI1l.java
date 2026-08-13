            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Arrays;
            
            public final class OloOII1ioI1l implements I11O1IlIl1I {
                public static final OloOII1ioI1l I0000Il00O;
                public String I00000oOI;

                static {
/* 3 */             OloOII1ioI1l oloOII1ioI1l = new OloOII1ioI1l();
/* 7 */             oloOII1ioI1l.I00000oOI = null;
/* 9 */             VarHandle.storeStoreFence();
/* 12 */            I0000Il00O = oloOII1ioI1l;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == this) {
/* 3 */                 return true;
                    }
/* 7 */             if (obj instanceof OloOII1ioI1l) {
/* 17 */                return l1ioii1I10Io.I00000oIO(this.I00000oOI, ((OloOII1ioI1l) obj).I00000oOI);
                    }
/* 9 */             return false;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.I00000oOI});
                }
            }

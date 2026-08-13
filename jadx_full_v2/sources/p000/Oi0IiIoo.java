            package p000;

            import java.lang.invoke.VarHandle;
            
            @Oili0O
            public final class Oi0IiIoo {
                public static final Oi0IOooOoiI0 Companion = new Oi0IOooOoiI0();
                public O01ioO1o0i11 I00000oIO;

                public static final Oi0IiIoo I00000oIO(O01ioO1o0i11 o01ioO1o0i11) {
/* 3 */             Oi0IiIoo oi0IiIoo = new Oi0IiIoo();
/* 6 */             oi0IiIoo.I00000oIO = o01ioO1o0i11;
/* 8 */             VarHandle.storeStoreFence();
/* 49 */            return oi0IiIoo;
                }

                public static String I00000oOI(O01ioO1o0i11 o01ioO1o0i11) {
/* 16 */            return "RequestMeta(json=" + o01ioO1o0i11 + ")";
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Oi0IiIoo) && O0000Ioio00.I0000O(this.I00000oIO, ((Oi0IiIoo) obj).I00000oIO);
                }

                public final int hashCode() {
/* 5 */             return this.I00000oIO.I00iOIl.hashCode();
                }

                public final String toString() {
/* 3 */             return I00000oOI(this.I00000oIO);
                }
            }

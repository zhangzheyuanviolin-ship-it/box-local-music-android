            package p000;

            import java.lang.invoke.VarHandle;
            
            @Oili0O
            public final class Oi0IO111o10 implements Oi0IO1ii011 {
                public static final Oi0IIo0 Companion = new Oi0IIo0();
                public String I00000oIO;

                public static final Oi0IO111o10 I00000oIO(String str) {
/* 3 */             Oi0IO111o10 oi0IO111o10 = new Oi0IO111o10();
/* 6 */             oi0IO111o10.I00000oIO = str;
/* 8 */             VarHandle.storeStoreFence();
/* 49 */            return oi0IO111o10;
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof Oi0IO111o10) && this.I00000oIO.equals(((Oi0IO111o10) obj).I00000oIO);
                }

                public final int hashCode() {
/* 3 */             return this.I00000oIO.hashCode();
                }

                public final String toString() {
/* 7 */             return IlIi0I0.I000lI("StringId(value=", this.I00000oIO, ")");
                }
            }

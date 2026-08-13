            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iIOlI1io1O1 implements OliiillO {
                public static final iIOlI1io1O1 I00iiI;
                public Oliil1oo1Io I00iOIl;

                static {
/* 3 */             iIOlI1io1O1 iioli1io1o1 = new iIOlI1io1O1();
/* 15 */            iioli1io1o1.I00iOIl = lOiIlo.I00000oOI(new iIOliiO());
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00iiI = iioli1io1o1;
                }

                @Override
                public final Object get() {
/* 5 */             return (iIOliiO) this.I00iOIl.I00iOIl;
                }
            }

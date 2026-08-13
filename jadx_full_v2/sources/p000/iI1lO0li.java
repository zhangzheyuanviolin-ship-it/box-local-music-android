            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class iI1lO0li implements OliiillO {
                public static final iI1lO0li I00iiI;
                public Oliil1oo1Io I00iOIl;

                static {
/* 3 */             iI1lO0li ii1lo0li = new iI1lO0li();
/* 15 */            ii1lo0li.I00iOIl = lOiIlo.I00000oOI(new iI1liIi1li());
/* 17 */            VarHandle.storeStoreFence();
/* 20 */            I00iiI = ii1lo0li;
                }

                @Override
                public final iI1liIi1li get() {
/* 5 */             return (iI1liIi1li) this.I00iOIl.I00iOIl;
                }
            }

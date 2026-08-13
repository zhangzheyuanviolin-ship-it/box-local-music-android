            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class io0olIOlOoI implements O0oiOi {
                public static final io0olIOlOoI I00iiI;
                public O0oiiOll0O1 I00iOIl;

                static {
/* 3 */             io0olIOlOoI io0oliolooi = new io0olIOlOoI();
/* 12 */            io0oliolooi.I00iOIl = new O0oiiOll0O1(io0oliolooi, true);
/* 14 */            VarHandle.storeStoreFence();
/* 17 */            I00iiI = io0oliolooi;
                }

                @Override
                public final I01O1lIi I000iOII() {
/* 1 */             return this.I00iOIl;
                }
            }

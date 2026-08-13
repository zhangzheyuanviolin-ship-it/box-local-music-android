            package p000;

            import android.os.Handler;
            import java.lang.invoke.VarHandle;
            
            public final class OOIliOOi010 implements O0oiOi {
                public static final OOIliOOi010 I00ioIO;
                public int I00iOIl;
                public int I00iiI;
                public boolean I00iiO;
                public boolean I00iio;
                public Handler I00ilI0I1;
                public O0oiiOll0O1 I00ilO0;
                public OOIl1i1 I00io1l;

                static {
/* 3 */             OOIliOOi010 oOIliOOi010 = new OOIliOOi010();
/* 7 */             oOIliOOi010.I00iiO = true;
/* 9 */             oOIliOOi010.I00iio = true;
/* 16 */            oOIliOOi010.I00ilO0 = new O0oiiOll0O1(oOIliOOi010, true);
/* 21 */            OOIl1i1 oOIl1i1 = new OOIl1i1(0);
/* 24 */            oOIl1i1.I00iiI = oOIliOOi010;
/* 26 */            VarHandle.storeStoreFence();
/* 29 */            oOIliOOi010.I00io1l = oOIl1i1;
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            I00ioIO = oOIliOOi010;
                }

                @Override
                public final I01O1lIi I000iOII() {
/* 1 */             return this.I00ilO0;
                }
            }

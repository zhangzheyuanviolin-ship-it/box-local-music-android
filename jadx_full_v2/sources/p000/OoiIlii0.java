            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OoiIlii0 implements O0O01001OOII {
                public static final OoiIlii0 I00000oOI;
                public OIOiIoOIOOo I00000oIO;

                static {
/* 3 */             OoiIlii0 ooiIlii0 = new OoiIlii0();
/* 8 */             OIOiIoOIOOo oIOiIoOIOOo = new OIOiIoOIOOo();
/* 11 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 17 */            IlIi0Il ilIi0Il = new IlIi0Il(29);
/* 20 */            ilIi0Il.I00iiI = oIOiIoOIOOo;
/* 22 */            VarHandle.storeStoreFence();
/* 29 */            oIOiIoOIOOo.I00000oIO = l0oi0lOi11i.I00000oIO(o0oI01I0oo, ilIi0Il);
/* 31 */            VarHandle.storeStoreFence();
/* 34 */            ooiIlii0.I00000oIO = oIOiIoOIOOo;
/* 36 */            VarHandle.storeStoreFence();
/* 39 */            I00000oOI = ooiIlii0;
                }

                @Override
                public final Object I00000oOI(Ii1iO1O ii1iO1O) {
/* 3 */             this.I00000oIO.I00000oOI(ii1iO1O);
/* 6 */             return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final void I0000Il00O(Il0I1ii il0I1ii, Object obj) {
/* 5 */             this.I00000oIO.I0000Il00O(il0I1ii, (OoiIlOl1iI) obj);
                }

                @Override
                public final OilOloI I0000O() {
/* 3 */             return this.I00000oIO.I0000O();
                }
            }

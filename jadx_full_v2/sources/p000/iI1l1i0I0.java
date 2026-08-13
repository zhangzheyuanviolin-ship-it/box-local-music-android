            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iI1l1i0I0 {
                public static final li1IIolo I00000oIO;
                public static volatile String I00000oOI;
                public static final i0OI1l1Oo I0000Il00O;

                static {
/* 1 */             iI1l0iillll1 ii1l0iillll1 = iI1l0iillll1.I00iiI;
/* 3 */             int i = Ioio0O.I00iiO;
/* 12 */            liIli0ooIlO liili0ooilo = new liIli0ooIlO(ii1l0iillll1, true, OOoliIo1ol.I00l0OO0IO);
/* 15 */            IOoi01o iOoi01o = new IOoi01o();
/* 18 */            iOoi01o.I00000oOI = liili0ooilo;
/* 22 */            i0OI1l1Oo i0oi1l1oo = new i0OI1l1Oo();
/* 25 */            i0oi1l1oo.I00iOIl = iOoi01o;
/* 27 */            VarHandle.storeStoreFence();
/* 30 */            I0000Il00O = i0oi1l1oo;
/* 40 */            I00000oIO = i0oi1l1oo.I000II("__phenotype_server_token", "");
/* 43 */            I00000oOI = null;
                }

                public static String I00000oIO() {
/* 7 */             return (String) I00000oIO.get();
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collections;
            import java.util.List;
            
            public abstract class iI1ol0i {
                public static final o000O0II11oi I00000oIO;

                static {
/* 1 */             o0oI0I o0oi0iI001i1O0Ol = o0oI0I.I001i1O0Ol();
/* 5 */             loO1iOl0O loo1iol0oI000oI1ioi = loO1iOl0O.I000oI1ioi();
/* 9 */             o0ilooOIO0 o0iloooio0 = o0ilooOIO0.I00iiO;
/* 11 */            List list = Collections.EMPTY_LIST;
/* 17 */            looolOIIo loooloiio = new looolOIIo();
/* 20 */            loooloiio.I00iOIl = o0iloooio0;
/* 22 */            VarHandle.storeStoreFence();
/* 25 */            o000O0II11oi o000o0ii11oi = new o000O0II11oi();
/* 28 */            if (o0oi0iI001i1O0Ol == null) {
/* 56 */                I000II.I000iOII("Null containingTypeDefaultInstance");
/* 110 */               return;
                    }
/* 30 */            if (loo1iol0oI000oI1ioi == null) {
/* 50 */                I000II.I000iOII("Null messageDefaultInstance");
/* 53 */                return;
                    }
/* 32 */            o000o0ii11oi.I00000oIO = o0oi0iI001i1O0Ol;
/* 36 */            o000o0ii11oi.I00000oOI = list;
/* 38 */            o000o0ii11oi.I0000Il00O = loo1iol0oI000oI1ioi;
/* 40 */            o000o0ii11oi.I0000O = loooloiio;
/* 42 */            VarHandle.storeStoreFence();
/* 45 */            I00000oIO = o000o0ii11oi;
                }
            }

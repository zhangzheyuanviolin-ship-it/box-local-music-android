            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class ll0I0liIiiI {
                public static final o00o0o1 I00000oIO;
                public static final Object I00000oOI;
                public static volatile I1ii1o0 I0000Il00O;

                static {
/* 3 */             lOoo0oiii looo0oiiiI001IIilI0O = lOoo0oiii.I001IIilI0O();
/* 7 */             o00o0o1 o00o0o1Var = new o00o0o1();
/* 10 */            o00o0o1Var.I00000oIO = looo0oiiiI001IIilI0O;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            I00000oIO = o00o0o1Var;
/* 22 */            I00000oOI = new Object();
/* 25 */            I0000Il00O = null;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O0OI0O {
                public IIOIlli0IO I00000oIO;
                public O0OI1I001l0l I00000oOI;

                public static O0OI0O I00000oIO(O0OI1I001l0l o0OI1I001l0l, IIOIlli0IO iIOIlli0IO) {
/* 3 */             O0OI0O o0oi0o = new O0OI0O();
/* 6 */             o0oi0o.I00000oOI = o0OI1I001l0l;
/* 8 */             o0oi0o.I00000oIO = iIOIlli0IO;
/* 10 */            VarHandle.storeStoreFence();
/* 89 */            return o0oi0o;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class OoI10o0iO11O implements OilO0iOl {
                public final OilO0iOl I00000oIO;
                public final Function1 I00000oOI;

                public OoI10o0iO11O(OilO0iOl oilO0iOl, Function1 function1) {
/* 4 */             this.I00000oIO = oilO0iOl;
/* 6 */             this.I00000oOI = function1;
                }

                @Override
                public final Iterator iterator() {
/* 3 */             OoI0o1II0o ooI0o1II0o = new OoI0o1II0o();
/* 6 */             ooI0o1II0o.I00iiI = this;
/* 14 */            ooI0o1II0o.I00iOIl = this.I00000oIO.iterator();
/* 16 */            VarHandle.storeStoreFence();
/* 29 */            return ooI0o1II0o;
                }
            }

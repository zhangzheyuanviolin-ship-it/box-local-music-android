            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class IlIo0o implements OilO0iOl {
                public final OilO0iOl I00000oIO;
                public final boolean I00000oOI;
                public final Function1 I0000Il00O;

                public IlIo0o(OilO0iOl oilO0iOl, boolean z, Function1 function1) {
/* 4 */             this.I00000oIO = oilO0iOl;
/* 6 */             this.I00000oOI = z;
/* 8 */             this.I0000Il00O = function1;
                }

                @Override
                public final Iterator iterator() {
/* 4 */             IlIloII10O ilIloII10O = new IlIloII10O(0);
/* 7 */             ilIloII10O.I00ilI0I1 = this;
/* 15 */            ilIloII10O.I00iiI = this.I00000oIO.iterator();
/* 18 */            ilIloII10O.I00iiO = -1;
/* 20 */            VarHandle.storeStoreFence();
/* 29 */            return ilIloII10O;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            
            public final class IlOIIioI1 implements OilO0iOl {
                public final OilO0iOl I00000oIO;
                public final Function1 I00000oOI;
                public final Function1 I0000Il00O;

                public IlOIIioI1(OilO0iOl oilO0iOl, Function1 function1, Function1 function12) {
/* 4 */             this.I00000oIO = oilO0iOl;
/* 6 */             this.I00000oOI = function1;
/* 8 */             this.I0000Il00O = function12;
                }

                @Override
                public final Iterator iterator() {
/* 4 */             IlIloII10O ilIloII10O = new IlIloII10O(1);
/* 7 */             ilIloII10O.I00ilI0I1 = this;
/* 15 */            ilIloII10O.I00iiI = this.I00000oIO.iterator();
/* 17 */            VarHandle.storeStoreFence();
/* 29 */            return ilIloII10O;
                }
            }

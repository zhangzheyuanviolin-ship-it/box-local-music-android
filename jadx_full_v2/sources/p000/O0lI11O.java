            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collection;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class O0lI11O implements OIo0loI111I1 {
                public o01l1ioOo0 I00000oIO;
                public O1I00llOi I00000oOI;

                @Override
                public final boolean I00000oIO(Ill0IO ill0IO) {
/* 3 */             Object obj = this.I00000oIO.I00iOIl;
/* 5 */             return false;
                }

                @Override
                public final void I00000oOI(Ill0IO ill0IO, ArrayList arrayList) {
/* 5 */             arrayList.add(I0000Il00O(ill0IO));
                }

                public final O0lI0O1OOi1 I0000Il00O(Ill0IO ill0IO) {
/* 3 */             Object obj = this.I00000oIO.I00iOIl;
/* 7 */             OOoIi0o1 oOoIi0o1 = new OOoIi0o1();
/* 10 */            oOoIi0o1.I00000oIO = ill0IO;
/* 12 */            VarHandle.storeStoreFence();
/* 15 */            O1I00llOi o1I00llOi = this.I00000oOI;
/* 21 */            I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(22);
/* 24 */            i01illiil1Oo.I00iiO = this;
/* 26 */            i01illiil1Oo.I00iiI = oOoIi0o1;
/* 28 */            VarHandle.storeStoreFence();
/* 35 */            return (O0lI0O1OOi1) o1I00llOi.I000II(ill0IO, i01illiil1Oo);
                }

                @Override
                public final Collection I000O01llI0(Ill0IO ill0IO, Function1 function1) {
/* 11 */            Collection collection = (List) I0000Il00O(ill0IO).I00li1OI.invoke();
/* 13 */            if (collection == null) {
/* 15 */                collection = Il01100l.I00iOIl;
                    }
/* 17 */            return collection;
                }

                public final String toString() {
/* 21 */            return "LazyJavaPackageFragmentProvider of module " + ((OI0011) ((I0l1OOl1l10) this.I00000oIO.I00iOIl).I000O01llI0);
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.AbstractCollection;
            import java.util.Collection;
            import java.util.LinkedHashSet;
            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class Iooo1o0oiOo implements OoOIOoO1I, OoOIi1lliil {
                public O0iIl1 I00iOIl;
                public final LinkedHashSet I00iiI;
                public final int I00iiO;

                public Iooo1o0oiOo(AbstractCollection abstractCollection) {
/* 4 */             abstractCollection.isEmpty();
/* 9 */             LinkedHashSet linkedHashSet = new LinkedHashSet(abstractCollection);
/* 12 */            this.I00iiI = linkedHashSet;
/* 18 */            this.I00iiO = linkedHashSet.hashCode();
                }

                public final Ol0O0iI0l0O I00000oIO() {
/* 3 */             OoOI1i1i.I00iiI.getClass();
/* 6 */             OoOI1i1i ooOI1i1i = OoOI1i1i.I00iiO;
/* 12 */            O1iil1I01o o1iil1I01oI00000oIO = lOoii1.I00000oIO("member scope for intersection type", this.I00iiI);
/* 20 */            I00iiI i00iiI = new I00iiI(17);
/* 23 */            i00iiI.I00iiI = this;
/* 25 */            VarHandle.storeStoreFence();
/* 32 */            return l0loOIIo0iOo.I0000oI00(ooOI1i1i, this, Il01100l.I00iOIl, false, o1iil1I01oI00000oIO, i00iiI);
                }

                public final String I00000oOI(Function1 function1) {
/* 4 */             II1liooilI iI1liooilI = new II1liooilI(3);
/* 7 */             iI1liooilI.I00iiI = function1;
/* 9 */             VarHandle.storeStoreFence();
/* 14 */            List listI00Ol1ll1 = IOOi0Ool1i.I00Ol1ll1(this.I00iiI, iI1liooilI);
/* 24 */            Io0IooIoI10 io0IooIoI10 = new Io0IooIoI10(1);
/* 27 */            io0IooIoI10.I00iiI = function1;
/* 29 */            VarHandle.storeStoreFence();
/* 40 */            return IOOi0Ool1i.I00IlilI0i0i(listI00Ol1ll1, " & ", "{", "}", io0IooIoI10, 24);
                }

                @Override
                public final O0i1lI0o1io I0000O() {
/* 17 */            return ((O0iIl1) this.I00iiI.iterator().next()).I00iOIl().I0000O();
                }

                @Override
                public final Collection I0000oI00() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final List I000II() {
/* 1 */             return Il01100l.I00iOIl;
                }

                @Override
                public final IOIiO1lIl0l I00100o1O0lo() {
/* 1 */             return null;
                }

                @Override
                public final boolean I0010I0i() {
/* 1 */             return false;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof Iooo1o0oiOo)) {
/* 9 */                 return false;
                    }
/* 17 */            return this.I00iiI.equals(((Iooo1o0oiOo) obj).I00iiI);
                }

                public final int hashCode() {
/* 1 */             return this.I00iiO;
                }

                public final String toString() {
/* 3 */             return I00000oOI(IiOi0I1.I00l0I0l0lO1);
                }
            }

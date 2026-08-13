            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Collection;
            import java.util.List;
            import java.util.Map;
            import kotlin.jvm.functions.Function1;
            
            public final class OI0011 extends Ii1Ooli implements OI0010oo1o {
                public final O1I0OloI I00iiO;
                public final O0i1lI0o1io I00iio;
                public final Map I00ilI0I1;
                public final OIo111 I00ilO0;
                public O1OIll00i I00io1l;
                public OIo0loI111I1 I00ioIO;
                public final boolean I00l0I0l0lO1;
                public final O1I00llOi I00l0OO0IO;
                public final OllO00oiil I00li1OI;

                public OI0011(OI1Iio0ii1 oI1Iio0ii1, O1I0OloI o1I0OloI, O0i1lI0o1io o0i1lI0o1io, int i) {
/* 3 */             super(i1i0olI.I00iiO, oI1Iio0ii1);
/* 6 */             this.I00iiO = o1I0OloI;
/* 8 */             this.I00iio = o0i1lI0o1io;
/* 12 */            if (!oI1Iio0ii1.I00iiI) {
/* 73 */                IioIoO10iOiI.I000OiO("Module name must be special: ", oI1Iio0ii1);
/* 483 */               throw null;
                    }
/* 16 */            this.I00ilI0I1 = Il011I1OiO0I.I00iOIl;
/* 24 */            OIo111 oIo111 = (OIo111) I00i0oil(liIoOiiO1Oi.I00ilI0I1);
/* 30 */            this.I00ilO0 = oIo111 == null ? OIo111.I00000oIO : oIo111;
/* 33 */            this.I00l0I0l0lO1 = true;
/* 39 */            I00iiI i00iiI = new I00iiI(25);
/* 42 */            i00iiI.I00iiI = this;
/* 44 */            VarHandle.storeStoreFence();
/* 51 */            this.I00l0OO0IO = o1I0OloI.I00000oOI(i00iiI);
/* 55 */            O0I0Ii01Ioo o0I0Ii01Ioo = new O0I0Ii01Ioo(1);
/* 58 */            o0I0Ii01Ioo.I00iiI = this;
/* 60 */            VarHandle.storeStoreFence();
/* 68 */            this.I00li1OI = new OllO00oiil(o0I0Ii01Ioo);
                }

                @Override
                public final O0i1lI0o1io I0000O() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final Collection I000O01llI0(Ill0IO ill0IO, Function1 function1) {
/* 1 */             I010i10l();
/* 4 */             I010i10l();
/* 15 */            return ((IOl1o0IioiI0) this.I00li1OI.getValue()).I000O01llI0(ill0IO, function1);
                }

                @Override
                public final Ii1Ool1 I000lI() {
/* 1 */             return null;
                }

                @Override
                public final boolean I00II0Ol1O0l(OI0010oo1o oI0010oo1o) {
/* 1 */             if (this == oI0010oo1o || IOOi0Ool1i.I001i1O0Ol(Il01llIol0.I00iOIl, oI0010oo1o)) {
/* 28 */                return true;
                    }
/* 12 */            I00i0O();
                    return oI0010oo1o.I00i0O().contains(this);
                }

                @Override
                public final Object I00IoIO0lI(Ii1i0IloI1 ii1i0IloI1, Object obj) {
/* 1 */             return ii1i0IloI1.I001i1O0Ol(this, obj);
                }

                @Override
                public final List I00i0O() {
/* 3 */             if (this.I00io1l != null) {
/* 5 */                 return Il01100l.I00iOIl;
                    }
/* 27 */            I000II.I000O01llI0(IIl001iO0Io.I00100l0(new StringBuilder("Dependencies of module "), getName().I00iOIl, " were not set"));
/* 30 */            return null;
                }

                @Override
                public final O0o0oOii I00i0ilIl0i(Ill0IO ill0IO) {
/* 1 */             I010i10l();
/* 10 */            return (O0o0oOii) this.I00l0OO0IO.invoke(ill0IO);
                }

                @Override
                public final Object I00i0oil(I0OOO1l0IoO i0OOO1l0IoO) {
/* 3 */             Object obj = this.I00ilI0I1.get(i0OOO1l0IoO);
/* 7 */             if (obj == null) {
/* 9 */                 return null;
                    }
/* 49 */            return obj;
                }

                public final void I010i10l() {
/* 3 */             if (this.I00l0I0l0lO1) {
/* 5 */                 return;
                    }
/* 12 */            if (I00i0oil(O000iO1Ol.I00000oIO) != null) {
/* 14 */                OIiilo1Ool0o.I00000oIO();
                    } else {
/* 113 */               throw new IOIoIlIlO("Accessing invalid module descriptor " + this, 4);
                    }
                }

                @Override
                public final String toString() {
/* 7 */             StringBuilder sb = new StringBuilder(Ii1Ooli.I010OIo1l(this));
/* 12 */            if (!this.I00l0I0l0lO1) {
/* 16 */                sb.append(" !isValid");
                    }
/* 21 */            sb.append(" packageFragmentProvider: ");
/* 24 */            OIo0loI111I1 oIo0loI111I1 = this.I00ioIO;
/* 38 */            sb.append(oIo0loI111I1 != null ? oIo0loI111I1.getClass().getSimpleName() : null);
/* 41 */            return sb.toString();
                }
            }

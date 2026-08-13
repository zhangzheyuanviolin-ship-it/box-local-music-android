            package p000;

            import java.util.List;
            import kotlin.jvm.functions.Function1;
            
            public final class Ol0O0lO1I extends Ol0O0iI0l0O {
                public final OoOIOoO1I I00iiI;
                public final List I00iiO;
                public final boolean I00iio;
                public final O1iil1I01o I00ilI0I1;
                public final Function1 I00ilO0;

                public Ol0O0lO1I(OoOIOoO1I ooOIOoO1I, List list, boolean z, O1iil1I01o o1iil1I01o, Function1 function1) {
/* 4 */             this.I00iiI = ooOIOoO1I;
/* 6 */             this.I00iiO = list;
/* 8 */             this.I00iio = z;
/* 10 */            this.I00ilI0I1 = o1iil1I01o;
/* 12 */            this.I00ilO0 = function1;
/* 16 */            if (!(o1iil1I01o instanceof Il0ol1) || (o1iil1I01o instanceof Oo10lIli0)) {
/* 966 */               return;
                    }
/* 50 */            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + o1iil1I01o + '\n' + ooOIOoO1I);
                }

                @Override
                public final O1iil1I01o I00IoiI() {
/* 1 */             return this.I00ilI0I1;
                }

                @Override
                public final List I00OIl() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final OoOI1i1i I00OloOo() {
/* 3 */             OoOI1i1i.I00iiI.getClass();
/* 6 */             return OoOI1i1i.I00iiO;
                }

                @Override
                public final OoOIOoO1I I00iOIl() {
/* 1 */             return this.I00iiI;
                }

                @Override
                public final boolean I00iiI() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final O0iIl1 I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) this.I00ilO0.invoke(o0iIoIOO0O0);
                    return ol0O0iI0l0O == null ? this : ol0O0iI0l0O;
                }

                @Override
                public final Ooioo0o1l0 I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 7 */             Ol0O0iI0l0O ol0O0iI0l0O = (Ol0O0iI0l0O) this.I00ilO0.invoke(o0iIoIOO0O0);
                    return ol0O0iI0l0O == null ? this : ol0O0iI0l0O;
                }

                @Override
                public final Ol0O0iI0l0O I00li1OI(boolean z) {
                    return z == this.I00iio ? this : z ? new OIO0I0ii(this, 1) : new OIO0I0ii(this, 0);
                }

                @Override
                public final Ol0O0iI0l0O I00lli11(OoOI1i1i ooOI1i1i) {
                    return ooOI1i1i.isEmpty() ? this : new Ol0O1IOl1I(this, ooOI1i1i);
                }
            }

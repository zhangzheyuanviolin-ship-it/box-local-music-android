            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function1;
            
/* 18 */    public final class IIi111 extends O1ooOo implements OIOilOIi1, IIIO0OI, Iillo1il11l {
                public final IIi11Illi1I I00o0iI0io1;
                public boolean I00o0l1o1o0;
                public Function1 I00o101lO;

                public IIi111(IIi11Illi1I iIi11Illi1I, Function1 function1) {
/* 4 */             this.I00o0iI0io1 = iIi11Illi1I;
/* 6 */             this.I00o101lO = function1;
/* 8 */             iIi11Illi1I.I00iOIl = this;
                }

                @Override
                public final IiIooOOOI I00000oIO() {
/* 5 */             return il0lI1i1olii.I000O01llI0(this).I00oliIiO01i;
                }

                @Override
                public final void I0000O() {
/* 1 */             I010l1O();
                }

                @Override
                public final long I0000oI00() {
/* 8 */             return l000O1l.I00000oOI(il0lI1i1olii.I0000oI00(this, 4).I00iiO);
                }

                @Override
                public final void I00IoO0() {
/* 1 */             I010l1O();
                }

                @Override
                public final void I00OI1() {
/* 1 */             I010l1O();
                }

                @Override
                public final void I00ilO0() {
/* 1 */             I010l1O();
                }

                @Override
                public final void I00l0I0l0lO1(O0iiliOio o0iiliOio) {
/* 1 */             boolean z = this.I00o0l1o1o0;
/* 3 */             IIi11Illi1I iIi11Illi1I = this.I00o0iI0io1;
/* 5 */             if (!z) {
/* 8 */                 iIi11Illi1I.I00iiI = null;
/* 14 */                I01ii1IIl i01ii1IIl = new I01ii1IIl(24);
/* 17 */                i01ii1IIl.I00iiI = this;
/* 19 */                i01ii1IIl.I00iiO = iIi11Illi1I;
/* 21 */                VarHandle.storeStoreFence();
/* 24 */                l1ioloOOl00l.I00000oIO(this, i01ii1IIl);
/* 29 */                if (iIi11Illi1I.I00iiI == null) {
/* 41 */                    throw IIlIOloOOO.I000OOo1O("DrawResult not defined, did you forget to call onDraw?");
                        }
/* 32 */                this.I00o0l1o1o0 = true;
                    }
/* 48 */            ((Function1) iIi11Illi1I.I00iiI.I00iOIl).invoke(o0iiliOio);
                }

                @Override
                public final void I010II() {
/* 1 */             I010l1O();
                }

                public final void I010l1O() {
/* 2 */             this.I00o0l1o1o0 = false;
/* 7 */             this.I00o0iI0io1.I00iiI = null;
/* 9 */             il1ollIO0I.I00000oIO(this);
                }

                @Override
                public final O0iOOoiioO getLayoutDirection() {
/* 5 */             return il0lI1i1olii.I000O01llI0(this).I00oo1iO0ll;
                }

                @Override
/* 19 */        public final void I010I0() {
                }
            }

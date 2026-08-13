            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class IiOI0OoIOo extends IiO1ol0i10 implements O0IooOI1, O0Iill {
                public static final O0O00I1Ili[] I00l0OO0IO = {OOoOl0i.I00000oIO.I000O01llI0(new OOOOIO0i(IiOI0OoIOo.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyGetterDescriptor;", 0))};
                public final OOoOiOo01lo I00ioIO;
                public final O0ioIllo0i1 I00l0I0l0lO1;

                public IiOI0OoIOo() {
/* 7 */             IiO1ooill iiO1ooill = new IiO1ooill(0);
/* 10 */            iiO1ooill.I00iiI = this;
/* 12 */            VarHandle.storeStoreFence();
/* 20 */            this.I00ioIO = lIlo0Oi0oOI.I00000oIO(null, iiO1ooill);
/* 22 */            O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 27 */            IiO1ooill iiO1ooill2 = new IiO1ooill(1);
/* 30 */            iiO1ooill2.I00iiI = this;
/* 32 */            VarHandle.storeStoreFence();
/* 39 */            this.I00l0I0l0lO1 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, iiO1ooill2);
                }

                @Override
                public final IIiOlII I001l0I00() {
/* 7 */             return (IIiOlII) this.I00l0I0l0lO1.getValue();
                }

                @Override
                public final IIiO00o1o I001lloI() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I00l0OO0IO[0];
/* 12 */            return (OOOOI1ioIo) this.I00ioIO.invoke();
                }

                @Override
                public final OOOIoo1o1 I00IO1oi11O() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I00l0OO0IO[0];
/* 12 */            return (OOOOI1ioIo) this.I00ioIO.invoke();
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof IiOI0OoIOo) && O0000Ioio00.I0000O(I00IOO(), ((IiOI0OoIOo) obj).I00IOO());
                }

                @Override
                public final String getName() {
/* 16 */            return IlIi0I0.I000oI1ioi(new StringBuilder("<get-"), I00IOO().I00l0I0l0lO1, '>');
                }

                public final int hashCode() {
/* 5 */             return I00IOO().hashCode();
                }

                public final String toString() {
/* 15 */            return "getter of " + I00IOO();
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.Map;
            
            public class O00io0ii0 implements OO1o0I011 {
                public static final O0O00I1Ili[] I0000oI00 = {OOoOl0i.I00000oIO.I000O01llI0(new OOOOIO0i(O00io0ii0.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0))};
                public final Ill0IO I00000oIO;
                public final OlI1o0ooI I00000oOI;
                public final O1I0II11i I0000Il00O;
                public final OOo1OIIIO I0000O;

                public O00io0ii0(o01l1ioOo0 o01l1iooo0, OOo1O1i oOo1O1i, Ill0IO ill0IO) {
/* 3 */             I0l1OOl1l10 i0l1OOl1l10 = (I0l1OOl1l10) o01l1iooo0.I00iOIl;
/* 8 */             this.I00000oIO = ill0IO;
/* 19 */            this.I00000oOI = oOo1O1i != null ? l1I0oI.I000OiO(oOo1O1i) : OlI1o0ooI.I00IO1;
/* 23 */            O1I0OloI o1I0OloI = (O1I0OloI) i0l1OOl1l10.I00000oIO;
/* 29 */            I01illiil1Oo i01illiil1Oo = new I01illiil1Oo(15);
/* 32 */            i01illiil1Oo.I00iiO = o01l1iooo0;
/* 34 */            i01illiil1Oo.I00iiI = this;
/* 36 */            VarHandle.storeStoreFence();
/* 44 */            this.I0000Il00O = new O1I0II11i(o1I0OloI, i01illiil1Oo);
/* 60 */            this.I0000O = oOo1O1i != null ? (OOo1OIIIO) IOOi0Ool1i.I001lloI(oOo1O1i.I00000oOI()) : null;
                }

                @Override
                public final OlI1o0ooI I0010I0i() {
/* 1 */             return this.I00000oOI;
                }

                @Override
                public final Ill0IO I0010o() {
/* 1 */             return this.I00000oIO;
                }

                @Override
                public Map I00111O() {
/* 1 */             return Il011I1OiO0I.I00iOIl;
                }

                @Override
                public final O0iIl1 getType() {
/* 4 */             O0O00I1Ili o0O00I1Ili = I0000oI00[0];
/* 12 */            return (Ol0O0iI0l0O) this.I0000Il00O.invoke();
                }
            }

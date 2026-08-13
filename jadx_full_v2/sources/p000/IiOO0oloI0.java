            package p000;

            import java.lang.invoke.VarHandle;
            
            public class IiOO0oloI0 extends IiOO0iilOO1 {
                public final O0ioIllo0i1 I00o0iI0io1;

                public IiOO0oloI0(O0IiOio0lo0 o0IiOio0lo0, OOOO01l oOOO01l) {
/* 1 */             super(o0IiOio0lo0, oOOO01l);
/* 4 */             O0oI01I0oo o0oI01I0oo = O0oI01I0oo.I00iOIl;
/* 10 */            I01iiIii10O i01iiIii10O = new I01iiIii10O(14);
/* 13 */            i01iiIii10O.I00iiI = this;
/* 15 */            VarHandle.storeStoreFence();
/* 22 */            this.I00o0iI0io1 = l0oi0lOi11i.I00000oIO(o0oI01I0oo, i01iiIii10O);
                }

                @Override
                public final IiOI0OoIOo I00000oOI() {
/* 7 */             return (IiOO0o01iI) this.I00o0iI0io1.getValue();
                }

                @Override
                public final IiOI0OoIOo I00IioO0OiOi() {
/* 7 */             return (IiOO0o01iI) this.I00o0iI0io1.getValue();
                }
            }

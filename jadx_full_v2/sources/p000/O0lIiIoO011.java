            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class O0lIiIoO011 implements IllOOo00lI {
                public final int I00iOIl;
                public O0lIlO1i I00iiI;
                public OOo0ooi I00iiO;

                public O0lIiIoO011(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    switch (this.I00iOIl) {
                        case 0:
/* 20 */                    O0lIlO1i o0lIlO1i = this.I00iiI;
/* 22 */                    OOo0ooi oOo0ooi = this.I00iiO;
/* 32 */                    O1I0OloI o1I0OloI = (O1I0OloI) ((I0l1OOl1l10) o0lIlO1i.I00000oOI.I00iOIl).I00000oIO;
/* 37 */                    O0lIiIoO011 o0lIiIoO011 = new O0lIiIoO011(1);
/* 40 */                    o0lIiIoO011.I00iiI = o0lIlO1i;
/* 42 */                    o0lIiIoO011.I00iiO = oOo0ooi;
/* 44 */                    VarHandle.storeStoreFence();
/* 49 */                    return new O1I01I0o(o1I0OloI, o0lIiIoO011);
                        default:
/* 6 */                     O0lIlO1i o0lIlO1i2 = this.I00iiI;
/* 8 */                     OOo0ooi oOo0ooi2 = this.I00iiO;
/* 12 */                    Object obj = o0lIlO1i2.I00000oOI.I00iOIl;
/* 18 */                    return null;
                    }
                }
            }

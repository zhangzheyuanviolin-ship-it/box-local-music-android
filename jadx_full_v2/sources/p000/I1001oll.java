            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class I1001oll implements IllOOo00lI {
                public final int I00iOIl;
                public I100OOIO0oio I00iiI;
                public Olol1IOOol0 I00iiO;

                public I1001oll(int i) {
/* 1 */             this.I00iOIl = i;
                }

                @Override
                public final Object invoke() {
                    switch (this.I00iOIl) {
                        case 0:
/* 77 */                    I100OOIO0oio i100OOIO0oio = this.I00iiI;
/* 79 */                    Olol1IOOol0 olol1IOOol0 = this.I00iiO;
/* 81 */                    I1001OoI0 i1001OoI0 = i100OOIO0oio.I0001Ioi1lo;
/* 86 */                    I0OIOO00l0O i0OIOO00l0O = new I0OIOO00l0O(4);
/* 89 */                    i0OIOO00l0O.I00iiI = olol1IOOol0;
/* 91 */                    VarHandle.storeStoreFence();
/* 100 */                   return (Olol0I1o1IO) i100OOIO0oio.I00000oOI(i0OIOO00l0O, "dataBuilder", i1001OoI0);
                        case 1:
/* 49 */                    I100OOIO0oio i100OOIO0oio2 = this.I00iiI;
/* 51 */                    Olol1IOOol0 olol1IOOol02 = this.I00iiO;
/* 53 */                    I1001OoI0 i1001OoI02 = i100OOIO0oio2.I000II;
/* 58 */                    I1001oll i1001oll = new I1001oll(2);
/* 61 */                    i1001oll.I00iiI = i100OOIO0oio2;
/* 63 */                    i1001oll.I00iiO = olol1IOOol02;
/* 65 */                    VarHandle.storeStoreFence();
/* 74 */                    return (OOo0IO) i100OOIO0oio2.I00000oOI(i1001oll, "positioner", i1001OoI02);
                        default:
/* 6 */                     I100OOIO0oio i100OOIO0oio3 = this.I00iiI;
/* 8 */                     Olol1IOOol0 olol1IOOol03 = this.I00iiO;
/* 12 */                    Object objInvoke = i100OOIO0oio3.I0000Il00O.invoke();
/* 23 */                    if (!((O0iOOo0Ii) objInvoke).I0010o()) {
/* 26 */                        objInvoke = null;
                            }
/* 27 */                    O0iOOo0Ii o0iOOo0Ii = (O0iOOo0Ii) objInvoke;
                            return o0iOOo0Ii == null ? OOo0IO.I0000oI00 : olol1IOOol03.I000OiO(o0iOOo0Ii).I000OiO(o0iOOo0Ii.I00Iooi00oi(0L));
                    }
                }
            }

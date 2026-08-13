            package p000;

            import java.lang.invoke.VarHandle;
            import java.util.List;
            
            public final class O0oI1IiI extends O0iIl1 {
                public final O1I0OloI I00iiI;
                public final IllOOo00lI I00iiO;
                public final O1I0II11i I00iio;

                public O0oI1IiI(O1I0OloI o1I0OloI, IllOOo00lI illOOo00lI) {
/* 4 */             this.I00iiI = o1I0OloI;
/* 6 */             this.I00iiO = illOOo00lI;
/* 13 */            this.I00iio = new O1I0II11i(o1I0OloI, illOOo00lI);
                }

                @Override
                public final O1iil1I01o I00IoiI() {
/* 5 */             return I00li1OI().I00IoiI();
                }

                @Override
                public final List I00OIl() {
/* 5 */             return I00li1OI().I00OIl();
                }

                @Override
                public final OoOI1i1i I00OloOo() {
/* 5 */             return I00li1OI().I00OloOo();
                }

                @Override
                public final OoOIOoO1I I00iOIl() {
/* 5 */             return I00li1OI().I00iOIl();
                }

                @Override
                public final boolean I00iiI() {
/* 5 */             return I00li1OI().I00iiI();
                }

                @Override
                public final O0iIl1 I00ll1(O0iIoIOO0O0 o0iIoIOO0O0) {
/* 6 */             O0l1iloO o0l1iloO = new O0l1iloO(2);
/* 9 */             o0l1iloO.I00iiI = this;
/* 11 */            VarHandle.storeStoreFence();
/* 16 */            return new O0oI1IiI(this.I00iiI, o0l1iloO);
                }

                @Override
                public final Ooioo0o1l0 I00l0OO0IO() {
/* 1 */             O0iIl1 o0iIl1I00li1OI = I00li1OI();
/* 7 */             while (o0iIl1I00li1OI instanceof O0oI1IiI) {
/* 11 */                o0iIl1I00li1OI = ((O0oI1IiI) o0iIl1I00li1OI).I00li1OI();
                    }
/* 16 */            return (Ooioo0o1l0) o0iIl1I00li1OI;
                }

                public final O0iIl1 I00li1OI() {
/* 7 */             return (O0iIl1) this.I00iio.invoke();
                }

                public final String toString() {
/* 1 */             O1I0II11i o1I0II11i = this.I00iio;
                    return (o1I0II11i.I00iiO == O1I0IoIO0li.I00iOIl || o1I0II11i.I00iiO == O1I0IoIO0li.I00iiI) ? "<Not computed yet>" : I00li1OI().toString();
                }
            }

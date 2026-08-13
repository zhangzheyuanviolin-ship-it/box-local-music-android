            package p000;
            
            public final class O110iIo0 extends O110ioill implements O0oiIoI0 {
                public final O0oiOi I00ilI0I1;
                public final O110lI I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O110iIo0(O110lI o110lI, O0oiOi o0oiOi, OIOilII0IlO oIOilII0IlO) {
/* 3 */             super(o110lI, oIOilII0IlO);
/* 1 */             this.I00ilO0 = o110lI;
/* 6 */             this.I00ilI0I1 = o0oiOi;
                }

                @Override
                public final void I00000oOI() {
/* 7 */             this.I00ilI0I1.I000iOII().I00ooIo0(this);
                }

                @Override
                public final boolean I0000Il00O(O0oiOi o0oiOi) {
                    return this.I00ilI0I1 == o0oiOi;
                }

                @Override
                public final boolean I0000O() {
/* 13 */            return this.I00ilI0I1.I000iOII().I00ol1().I00000oIO(O0oOi0I.I00iio);
                }

                @Override
                public final void I000II(O0oiOi o0oiOi, O0oOOiI0 o0oOOiI0) {
/* 1 */             O0oiOi o0oiOi2 = this.I00ilI0I1;
/* 7 */             O0oOi0I o0oOi0II00ol1 = o0oiOi2.I000iOII().I00ol1();
/* 13 */            if (o0oOi0II00ol1 == O0oOi0I.I00iOIl) {
/* 19 */                this.I00ilO0.I000OiO(this.I00iOIl);
/* 22 */                return;
                    }
/* 23 */            O0oOi0I o0oOi0I = null;
/* 24 */            while (o0oOi0I != o0oOi0II00ol1) {
/* 30 */                I00000oIO(I0000O());
/* 42 */                o0oOi0I = o0oOi0II00ol1;
/* 37 */                o0oOi0II00ol1 = o0oiOi2.I000iOII().I00ol1();
                    }
                }
            }

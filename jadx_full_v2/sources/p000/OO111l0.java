            package p000;
            
            public final class OO111l0 extends IOoilo {
                public Object I00iOIl;
                public int I00iiI;
                public final I10OIli10o1 I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OO111l0(I10OIli10o1 i10OIli10o1, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.I00iiO = i10OIli10o1;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiI |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiO.emit(null, this);
                }
            }

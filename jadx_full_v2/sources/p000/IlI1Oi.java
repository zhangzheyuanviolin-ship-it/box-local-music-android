            package p000;
            
            public final class IlI1Oi extends IOoilo {
                public Object I00iOIl;
                public final IlI1loI1lO1 I00iiI;
                public int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlI1Oi(IlI1loI1lO1 ilI1loI1lO1, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iiI = ilI1loI1lO1;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiO |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiI.I000OOo1O(null, this);
                }
            }

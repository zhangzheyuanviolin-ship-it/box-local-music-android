            package p000;
            
            public final class o0lIOl1IOo extends IOoilo {
                public Object I00iOIl;
                public final o0lOiOlII I00iiI;
                public int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o0lIOl1IOo(o0lOiOlII o0loiolii, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.I00iiI = o0loiolii;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiO |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiI.get(null, this);
                }
            }

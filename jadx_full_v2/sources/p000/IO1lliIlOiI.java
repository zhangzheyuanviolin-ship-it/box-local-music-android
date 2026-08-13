            package p000;
            
            public final class IO1lliIlOiI extends IOoilo {
                public Object I00iOIl;
                public final IO1loOo1o I00iiI;
                public int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1lliIlOiI(IO1loOo1o iO1loOo1o, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iiI = iO1loOo1o;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiO |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiI.I0000O(null, this);
                }
            }

            package p000;
            
            public final class IlIi1O0OiOll extends IOoilo {
                public boolean I00iOIl;
                public IlIi00o I00iiI;
                public Object I00iiO;
                public final IlIi1o0I110 I00iio;
                public int I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IlIi1O0OiOll(IlIi1o0I110 ilIi1o0I110, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iio = ilIi1o0I110;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iiO = obj;
                    this.I00ilI0I1 |= Integer.MIN_VALUE;
/* 13 */            return this.I00iio.I00000oIO(null, this);
                }
            }

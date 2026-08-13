            package p000;
            
            public final class I0o1IlIi extends IOoilo {
                public long I00iOIl;
                public Object I00iiI;
                public final I0o1iIoolIi I00iiO;
                public int I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0o1IlIi(I0o1iIoolIi i0o1iIoolIi, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iiO = i0o1iIoolIi;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iiI = obj;
                    this.I00iio |= Integer.MIN_VALUE;
/* 15 */            return this.I00iiO.I00000oOI(0L, null, this);
                }
            }

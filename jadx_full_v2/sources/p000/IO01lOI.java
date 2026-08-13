            package p000;
            
            public final class IO01lOI extends IOoilo {
                public long I00iOIl;
                public AutoCloseable I00iiI;
                public Object I00iiO;
                public final IO01o11o0lI0 I00iio;
                public int I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO01lOI(IO01o11o0lI0 iO01o11o0lI0, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iio = iO01o11o0lI0;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iiO = obj;
                    this.I00ilI0I1 |= Integer.MIN_VALUE;
/* 14 */            return this.I00iio.I0010I0i(0L, this);
                }
            }

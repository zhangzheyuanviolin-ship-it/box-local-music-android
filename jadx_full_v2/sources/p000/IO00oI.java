            package p000;
            
            public final class IO00oI extends IOoilo {
                public long I00iOIl;
                public boolean I00iiI;
                public AutoCloseable I00iiO;
                public Object I00iio;
                public final IO01o11o0lI0 I00ilI0I1;
                public int I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO00oI(IO01o11o0lI0 iO01o11o0lI0, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00ilI0I1 = iO01o11o0lI0;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iio = obj;
                    this.I00ilO0 |= Integer.MIN_VALUE;
/* 15 */            return this.I00ilI0I1.I000l1(0L, false, this);
                }
            }

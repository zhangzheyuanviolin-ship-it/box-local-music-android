            package p000;

            import android.content.Context;
            
            public final class i1Iil0iO1 extends IOoilo {
                public Object I00iOIl;
                public Context I00iiI;
                public Object I00iiO;
                public final i1Ilio0i0 I00iio;
                public int I00ilI0I1;
                public String I00ilO0;
                public i1Ii1ooOII0 I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i1Iil0iO1(i1Ilio0i0 i1ilio0i0, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iio = i1ilio0i0;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iiO = obj;
                    this.I00ilI0I1 |= Integer.MIN_VALUE;
/* 13 */            return i1Ilio0i0.I00000oOI(this.I00iio, null, null, this);
                }
            }

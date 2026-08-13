            package p000;

            import java.util.Iterator;
            
            public final class IO1llI00iI extends IOoilo {
                public Iterator I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public final IO1loOo1o I00iio;
                public int I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1llI00iI(IO1loOo1o iO1loOo1o, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iio = iO1loOo1o;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iiO = obj;
                    this.I00ilI0I1 |= Integer.MIN_VALUE;
/* 12 */            return this.I00iio.I00000oOI(this);
                }
            }

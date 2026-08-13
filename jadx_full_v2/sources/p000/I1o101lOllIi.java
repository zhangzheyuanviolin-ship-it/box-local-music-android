            package p000;
            
            public final class I1o101lOllIi extends IOoilo {
                public Object I00iOIl;
                public final I1o1Ii0I I00iiI;
                public int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I1o101lOllIi(I1o1Ii0I i1o1Ii0I, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iiI = i1o1Ii0I;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiO |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiI.I00000oIO(null, this);
                }
            }

            package p000;
            
            public final class OlI0l1O11i extends IOoilo {
                public Object I00iOIl;
                public final OlI0o1 I00iiI;
                public int I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlI0l1O11i(OlI0o1 olI0o1, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iiI = olI0o1;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiO |= Integer.MIN_VALUE;
/* 19 */            return this.I00iiI.I0000Il00O(null, 0.0f, 0L, null, null, this);
                }
            }

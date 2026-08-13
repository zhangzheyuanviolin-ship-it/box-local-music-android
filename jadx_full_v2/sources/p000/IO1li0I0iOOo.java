            package p000;

            import com.google.ai.edge.gallery.data.local.entities.Conversation;
            
            public final class IO1li0I0iOOo extends IOoilo {
                public Conversation I00iOIl;
                public Object I00iiI;
                public final IO1loOo1o I00iiO;
                public int I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IO1li0I0iOOo(IO1loOo1o iO1loOo1o, IOoilo iOoilo) {
/* 3 */             super(iOoilo);
/* 1 */             this.I00iiO = iO1loOo1o;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iiI = obj;
                    this.I00iio |= Integer.MIN_VALUE;
/* 17 */            return this.I00iiO.I00000oIO(null, null, null, null, this);
                }
            }

            package p000;

            import com.google.mlkit.genai.prompt.GenerateTypedContentRequest;
            
            public final class o11OIIoOIiI extends IOoilo {
                public Object I00iOIl;
                public final o1I0I0O I00iiI;
                public int I00iiO;
                public GenerateTypedContentRequest I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public o11OIIoOIiI(o1I0I0O o1i0i0o, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             super(iOoil1iiIilo);
/* 1 */             this.I00iiI = o1i0i0o;
                }

                @Override
                public final Object invokeSuspend(Object obj) {
/* 1 */             this.I00iOIl = obj;
                    this.I00iiO |= Integer.MIN_VALUE;
/* 13 */            return this.I00iiI.generateContent((GenerateTypedContentRequest) null, this);
                }
            }

            package p000;

            import com.google.ai.edge.gallery.stablediffusion.StableDiffusion;
            
            public final class OlIii1 extends Oll0io implements IlliIl1l11O {
                public final StableDiffusion I00iOIl;
                public final long I00iiI;
                public final OlIiOOo1O1ll I00iiO;
                public final long I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OlIii1(StableDiffusion stableDiffusion, long j, OlIiOOo1O1ll olIiOOo1O1ll, long j2, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iOIl = stableDiffusion;
/* 3 */             this.I00iiI = j;
/* 5 */             this.I00iiO = olIiOOo1O1ll;
/* 7 */             this.I00iio = j2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            return new OlIii1(this.I00iOIl, this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OlIii1) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             lIoii1l01l0i.I00000oOI(obj);
/* 6 */             OlIiOOo1O1ll olIiOOo1O1ll = this.I00iiO;
/* 1 */             return this.I00iOIl.generateImageNative(this.I00iiI, olIiOOo1O1ll.I00000oIO, olIiOOo1O1ll.I00000oOI, olIiOOo1O1ll.I0000Il00O, olIiOOo1O1ll.I0000O, olIiOOo1O1ll.I0000oI00, olIiOOo1O1ll.I0001Ioi1lo, this.I00iio);
                }
            }

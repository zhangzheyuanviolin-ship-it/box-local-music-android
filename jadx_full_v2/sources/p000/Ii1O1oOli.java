            package p000;

            import java.util.concurrent.atomic.AtomicInteger;
            
            public final class Ii1O1oOli extends Oll0io implements IlliIl1l11O {
                public OOo0ll111 I00iOIl;
                public int I00iiI;
                public Object I00iiO;
                public final OOo0ll111 I00iio;
                public final Ii1OIIlOi I00ilI0I1;
                public final Object I00ilO0;
                public final boolean I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ii1O1oOli(OOo0ll111 oOo0ll111, Ii1OIIlOi ii1OIIlOi, Object obj, boolean z, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(2, iOoil1iiIilo);
/* 1 */             this.I00iio = oOo0ll111;
/* 3 */             this.I00ilI0I1 = ii1OIIlOi;
/* 5 */             this.I00ilO0 = obj;
/* 7 */             this.I00io1l = z;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 12 */            Ii1O1oOli ii1O1oOli = new Ii1O1oOli(this.I00iio, this.I00ilI0I1, this.I00ilO0, this.I00io1l, iOoil1iiIilo);
/* 15 */            ii1O1oOli.I00iiO = obj;
/* 37 */            return ii1O1oOli;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((Ii1O1oOli) create((IlIl0oi1) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0075, code lost:
                
                    if (r10 == r0) goto L21;
                 */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invokeSuspend(Object obj) throws Throwable {
                    IlIl0oi1 ilIl0oi1;
                    OOo0ll111 oOo0ll111;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iiI;
/* 5 */             OoiIlOl1iI ooiIlOl1iI = OoiIlOl1iI.I00000oIO;
/* 7 */             Object obj2 = this.I00ilO0;
/* 9 */             Ii1OIIlOi ii1OIIlOi = this.I00ilI0I1;
/* 11 */            OOo0ll111 oOo0ll1112 = this.I00iio;
/* 16 */            if (i == 0) {
/* 42 */                lIoii1l01l0i.I00000oOI(obj);
/* 47 */                IlIl0oi1 ilIl0oi12 = (IlIl0oi1) this.I00iiO;
/* 49 */                Ol0Oiooo ol0OioooI0000Il00O = ii1OIIlOi.I0000Il00O();
/* 53 */                this.I00iiO = ilIl0oi12;
/* 55 */                this.I00iOIl = oOo0ll1112;
/* 57 */                this.I00iiI = 1;
/* 71 */                Integer num = new Integer(((AtomicInteger) ol0OioooI0000Il00O.I00000oOI.I00iiI).incrementAndGet());
/* 74 */                if (num != ii0111o) {
/* 78 */                    ilIl0oi1 = ilIl0oi12;
/* 79 */                    obj = num;
/* 80 */                    oOo0ll111 = oOo0ll1112;
                        }
/* 120 */               return ii0111o;
                    }
/* 18 */            if (i != 1) {
/* 20 */                if (i != 2) {
/* 28 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 15 */                    return null;
                        }
/* 22 */                lIoii1l01l0i.I00000oOI(obj);
/* 123 */               if (this.I00io1l) {
/* 142 */                   ii1OIIlOi.I000O01llI0.I0000Il00O(new Ii11I1iOiIo(obj2, obj2 != null ? obj2.hashCode() : 0, oOo0ll1112.I00iOIl));
                        }
/* 145 */               return ooiIlOl1iI;
                    }
/* 32 */            oOo0ll111 = this.I00iOIl;
/* 36 */            ilIl0oi1 = (IlIl0oi1) this.I00iiO;
/* 38 */            lIoii1l01l0i.I00000oOI(obj);
/* 87 */            oOo0ll111.I00iOIl = ((Number) obj).intValue();
/* 89 */            this.I00iiO = null;
/* 91 */            this.I00iOIl = null;
/* 93 */            this.I00iiI = 2;
/* 101 */           if (ilIl0oi1.I0000Il00O.get()) {
/* 148 */               I000II.I001IO000("This scope has already been closed.");
/* 15 */                return null;
                    }
/* 110 */           Object objI00000oIO = ilOIl0o0.I00000oIO(ilIl0oi1.I00000oIO, new Ii1O1I(ilIl0oi1, obj2, null), this);
/* 114 */           if (objI00000oIO != ii0111o) {
/* 117 */               objI00000oIO = ooiIlOl1iI;
                    }
                }
            }

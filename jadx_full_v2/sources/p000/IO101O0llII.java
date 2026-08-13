            package p000;

            import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
            
/* 11 */    public final class IO101O0llII extends IO101i {
                public static final AtomicIntegerFieldUpdater I00ilO0 = AtomicIntegerFieldUpdater.newUpdater(IO101O0llII.class, "consumed$volatile");
                public final OOlloO I00iio;
                public final boolean I00ilI0I1;
                private volatile int consumed$volatile;

                public IO101O0llII(OOlloO oOlloO, boolean z) {
/* 9 */             this(oOlloO, z, Il00o11.I00iOIl, -3, IIII0i.I00iOIl);
                }

                @Override
                public final Object I00000oIO(IlOil1iooOO0 ilOil1iooOO0, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             if (this.I00iiI == -3) {
/* 6 */                 boolean z = this.I00ilI0I1;
/* 8 */                 if (z && I00ilO0.getAndSet(this, 1) == 1) {
/* 22 */                    I000II.I001IO000("ReceiveChannel.consumeAsFlow can be collected just once");
/* 25 */                    return null;
                        }
/* 29 */                Object objI00000oIO = ilOl0o1O.I00000oIO(ilOil1iooOO0, this.I00iio, z, iOoil1iiIilo);
/* 35 */                if (objI00000oIO == Ii0111o.I00iOIl) {
/* 37 */                    return objI00000oIO;
                        }
                    } else {
/* 38 */                Object objI00000oIO2 = super.I00000oIO(ilOil1iooOO0, iOoil1iiIilo);
/* 44 */                if (objI00000oIO2 == Ii0111o.I00iOIl) {
/* 46 */                    return objI00000oIO2;
                        }
                    }
/* 47 */            return OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final String I0000O() {
/* 13 */            return "channel=" + this.I00iio;
                }

                @Override
                public final Object I000II(OOIoOo0O oOIoOo0O, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            Object objI00000oIO = ilOl0o1O.I00000oIO(new Oil1iii(oOIoOo0O), this.I00iio, this.I00ilI0I1, iOoil1iiIilo);
                    return objI00000oIO == Ii0111o.I00iOIl ? objI00000oIO : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public final IO101i I000O01llI0(Ii00l101O ii00l101O, int i, IIII0i iIII0i) {
/* 10 */            return new IO101O0llII(this.I00iio, this.I00ilI0I1, ii00l101O, i, iIII0i);
                }

                @Override
                public final IlOil1ii I000OOo1O() {
/* 7 */             return new IO101O0llII(this.I00iio, this.I00ilI0I1);
                }

                @Override
                public final OOlloO I000OiO(Ii0110 ii0110) {
/* 3 */             if (!this.I00ilI0I1 || I00ilO0.getAndSet(this, 1) != 1) {
                        return this.I00iiI == -3 ? this.I00iio : super.I000OiO(ii0110);
                    }
/* 17 */            I000II.I001IO000("ReceiveChannel.consumeAsFlow can be collected just once");
/* 20 */            return null;
                }

/* 12 */        public IO101O0llII(OOlloO oOlloO, boolean z, Ii00l101O ii00l101O, int i, IIII0i iIII0i) {
/* 13 */            super(ii00l101O, i, iIII0i);
/* 14 */            this.I00iio = oOlloO;
/* 15 */            this.I00ilI0I1 = z;
                }
            }

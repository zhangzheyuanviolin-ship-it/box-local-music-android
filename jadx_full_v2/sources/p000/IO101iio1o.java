            package p000;
            
            public class IO101iio1o extends IO101i {
                public final IlliIl1l11O I00iio;

                public IO101iio1o(IlliIl1l11O illiIl1l11O, Ii00l101O ii00l101O, int i, IIII0i iIII0i) {
/* 1 */             super(ii00l101O, i, iIII0i);
/* 4 */             this.I00iio = illiIl1l11O;
                }

                @Override
                public Object I000II(OOIoOo0O oOIoOo0O, IOoil1iiIilo iOoil1iiIilo) {
/* 3 */             Object objInvoke = this.I00iio.invoke(oOIoOo0O, iOoil1iiIilo);
                    return objInvoke == Ii0111o.I00iOIl ? objInvoke : OoiIlOl1iI.I00000oIO;
                }

                @Override
                public IO101i I000O01llI0(Ii00l101O ii00l101O, int i, IIII0i iIII0i) {
/* 5 */             return new IO101iio1o(this.I00iio, ii00l101O, i, iIII0i);
                }

                @Override
                public final String toString() {
/* 25 */            return "block[" + this.I00iio + "] -> " + super.toString();
                }
            }

            package p000;
            
            public final class O0iO1OIol implements OOooI0ioo1o, Ii00lil0 {
                public final Ii00l101O I00iOIl;
                public final IlliIl1l11O I00iiI;
                public final IIOlO1ii I00iiO;
                public OlIl0i I00iio;

                public O0iO1OIol(Ii00l101O ii00l101O, IlliIl1l11O illiIl1l11O) {
/* 4 */             this.I00iOIl = ii00l101O;
/* 6 */             this.I00iiI = illiIl1l11O;
/* 16 */            this.I00iiO = il001oo1.I00000oIO(ii00l101O.I00ioIO(this));
                }

                @Override
                public final void I00000oOI() {
/* 1 */             OlIl0i olIl0i = this.I00iio;
/* 3 */             if (olIl0i != null) {
/* 11 */                olIl0i.I001IIilI0O(new Ilill0000ioI(1));
                    }
/* 15 */            this.I00iio = null;
                }

                @Override
                public final void I0000O() {
/* 1 */             OlIl0i olIl0i = this.I00iio;
/* 3 */             if (olIl0i != null) {
/* 11 */                olIl0i.I001IIilI0O(new Ilill0000ioI(1));
                    }
/* 15 */            this.I00iio = null;
                }

                @Override
                public final void I0000oI00() {
/* 1 */             OlIl0i olIl0i = this.I00iio;
/* 4 */             if (olIl0i != null) {
/* 12 */                olIl0i.I000II(ilIiOIi0I.I00000oIO("Old job was still running!", null));
                    }
/* 24 */            this.I00iio = iOi1II01i0.I0000O(this.I00iiO, null, null, this.I00iiI, 3);
                }

                @Override
                public final void I00IOO(Ii00l101O ii00l101O, Throwable th) throws Throwable {
/* 7 */             IOlIO1I0OloO iOlIO1I0OloO = (IOlIO1I0OloO) ii00l101O.I00lli11(IOlIO1I0OloO.I00iiI);
/* 9 */             if (iOlIO1I0OloO != null) {
/* 11 */                iOlIO1I0OloO.I00000oIO(this, th);
                    }
/* 22 */            Ii00lil0 ii00lil0 = (Ii00lil0) this.I00iOIl.I00lli11(IIIOlol.I00iiO);
/* 24 */            if (ii00lil0 == null) {
/* 37 */                throw th;
                    }
/* 26 */            ii00lil0.I00IOO(ii00l101O, th);
                }

                @Override
                public final Object I00IoiI(IlliIl1l11O illiIl1l11O, Object obj) {
/* 1 */             return illiIl1l11O.invoke(obj, this);
                }

                @Override
                public final Ii00l101O I00OIl(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oOI(this, ii00l0i1loO);
                }

                @Override
                public final Ii00l101O I00ioIO(Ii00l101O ii00l101O) {
/* 1 */             return iiollilo0IO1.I00000oIO(this, ii00l101O);
                }

                @Override
                public final Ii00ilI1 I00lli11(Ii00l0i1loO ii00l0i1loO) {
/* 1 */             return iioloI1O1i.I00000oIO(this, ii00l0i1loO);
                }

                @Override
                public final Ii00l0i1loO getKey() {
/* 1 */             return IIIOlol.I00iiO;
                }
            }

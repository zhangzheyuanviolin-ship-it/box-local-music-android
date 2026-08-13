            package p000;
            
            public final class OI0oll extends Oi10IOIi implements IlliIl1l11O {
                public Io00llIoO1lO I00iiI;
                public OI0oo0o I00iiO;
                public long[] I00iio;
                public int I00ilI0I1;
                public int I00ilO0;
                public Object I00io1l;
                public final OI0oo0o I00ioIO;
                public final Io00llIoO1lO I00l0I0l0lO1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OI0oll(OI0oo0o oI0oo0o, Io00llIoO1lO io00llIoO1lO, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00ioIO = oI0oo0o;
/* 3 */             this.I00l0I0l0lO1 = io00llIoO1lO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             OI0oll oI0oll = new OI0oll(this.I00ioIO, this.I00l0I0l0lO1, iOoil1iiIilo);
/* 10 */            oI0oll.I00io1l = obj;
/* 37 */            return oI0oll;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OI0oll) create((OilO111) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OilO111 oilO111;
                    OI0oo0o oI0oo0o;
                    long[] jArr;
                    int i;
                    Io00llIoO1lO io00llIoO1lO;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i2 = this.I00ilO0;
/* 6 */             if (i2 == 0) {
/* 33 */                lIoii1l01l0i.I00000oOI(obj);
/* 39 */                oilO111 = (OilO111) this.I00io1l;
/* 41 */                oI0oo0o = this.I00ioIO;
/* 43 */                OI0olI1Oii0I oI0olI1Oii0I = oI0oo0o.I00iiI;
/* 45 */                jArr = oI0olI1Oii0I.I0000Il00O;
/* 47 */                i = oI0olI1Oii0I.I0000oI00;
/* 49 */                io00llIoO1lO = this.I00l0I0l0lO1;
                    } else {
/* 8 */                 if (i2 != 1) {
/* 28 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 10 */                i = this.I00ilI0I1;
/* 12 */                jArr = this.I00iio;
/* 14 */                oI0oo0o = this.I00iiO;
/* 16 */                io00llIoO1lO = this.I00iiI;
/* 20 */                oilO111 = (OilO111) this.I00io1l;
/* 22 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 54 */            if (i == Integer.MAX_VALUE) {
/* 90 */                return OoiIlOl1iI.I00000oIO;
                    }
/* 65 */            int i3 = (int) ((jArr[i] >> 31) & 2147483647L);
/* 66 */            io00llIoO1lO.I00iiI = i;
/* 72 */            Object obj2 = oI0oo0o.I00iiI.I00000oOI[i];
/* 74 */            this.I00io1l = oilO111;
/* 76 */            this.I00iiI = io00llIoO1lO;
/* 78 */            this.I00iiO = oI0oo0o;
/* 80 */            this.I00iio = jArr;
/* 82 */            this.I00ilI0I1 = i3;
/* 84 */            this.I00ilO0 = 1;
/* 86 */            oilO111.I00000oOI(this, obj2);
/* 89 */            return ii0111o;
                }
            }

            package p000;

            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
            public final class Ii1OloIoolO1 extends OO11OoloI {
                public List I00iiI;
                public Ii00l101O I00iiO;
                public Object I00iio;
                public int I00ilI0I1;

                @Override
                public final Ii00l101O I00000oIO() {
/* 1 */             return this.I00iiO;
                }

                @Override
                public final Object I00000oOI(Object obj, IOoilo iOoilo) {
/* 2 */             this.I00ilI0I1 = 0;
/* 4 */             this.I00iio = obj;
/* 6 */             return I0000O(iOoilo);
                }

                @Override
                public final Object I0000Il00O() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final Object I0000O(IOoil1iiIilo iOoil1iiIilo) {
/* 1 */             int i = this.I00ilI0I1;
/* 3 */             if (i < 0) {
/* 5 */                 return this.I00iio;
                    }
/* 14 */            if (i < this.I00iiI.size()) {
/* 22 */                return I0001Ioi1lo(iOoil1iiIilo);
                    }
/* 17 */            this.I00ilI0I1 = -1;
/* 19 */            return this.I00iio;
                }

                @Override
                public final Object I0000oI00(IOoil1iiIilo iOoil1iiIilo, Object obj) {
/* 1 */             this.I00iio = obj;
/* 3 */             return I0000O(iOoil1iiIilo);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0001Ioi1lo(IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    Ii1Olo ii1Olo;
                    Function3 function3;
                    Object obj;
/* 3 */             if (iOoil1iiIilo instanceof Ii1Olo) {
/* 6 */                 ii1Olo = (Ii1Olo) iOoil1iiIilo;
/* 8 */                 int i = ii1Olo.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii1Olo.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ii1Olo = new Ii1Olo(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj2 = ii1Olo.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ii1Olo.I00iiO;
/* 32 */            if (i2 != 0 && i2 != 1) {
/* 39 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 42 */                return null;
                    }
/* 44 */            lIoii1l01l0i.I00000oOI(obj2);
/* 84 */            do {
/* 47 */                int i3 = this.I00ilI0I1;
/* 50 */                if (i3 != -1) {
/* 53 */                    List list = this.I00iiI;
/* 59 */                    if (i3 >= list.size()) {
/* 61 */                        this.I00ilI0I1 = -1;
                            } else {
/* 70 */                        function3 = (Function3) list.get(i3);
/* 74 */                        this.I00ilI0I1 = i3 + 1;
/* 76 */                        obj = this.I00iio;
/* 78 */                        ii1Olo.I00iiO = 1;
                            }
                        }
/* 63 */                return this.I00iio;
/* 84 */            } while (function3.invoke(this, obj, ii1Olo) != ii0111o);
/* 186 */           return ii0111o;
                }
            }

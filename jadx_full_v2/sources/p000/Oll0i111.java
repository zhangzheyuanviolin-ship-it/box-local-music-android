            package p000;

            import java.util.List;
            import kotlin.jvm.functions.Function3;
            
            public final class Oll0i111 extends OO11OoloI {
                public List I00iiI;
                public Oll0OlI11 I00iiO;
                public Object I00iio;
                public IOoil1iiIilo[] I00ilI0I1;
                public int I00ilO0;
                public int I00io1l;

                @Override
                public final Ii00l101O I00000oIO() {
/* 3 */             return this.I00iiO.getContext();
                }

                @Override
                public final Object I00000oOI(Object obj, IOoilo iOoilo) {
/* 2 */             this.I00io1l = 0;
/* 10 */            if (this.I00iiI.size() == 0) {
/* 12 */                return obj;
                    }
/* 13 */            this.I00iio = obj;
/* 17 */            if (this.I00ilO0 < 0) {
/* 19 */                return I0000O(iOoilo);
                    }
/* 26 */            I000II.I001IO000("Already started");
/* 29 */            return null;
                }

                @Override
                public final Object I0000Il00O() {
/* 1 */             return this.I00iio;
                }

                @Override
                public final Object I0000O(IOoil1iiIilo iOoil1iiIilo) {
                    Object obj;
/* 1 */             IOoil1iiIilo[] iOoil1iiIiloArr = this.I00ilI0I1;
/* 11 */            if (this.I00io1l == this.I00iiI.size()) {
/* 13 */                obj = this.I00iio;
                    } else {
/* 19 */                int i = this.I00ilO0 + 1;
/* 20 */                this.I00ilO0 = i;
/* 22 */                iOoil1iiIiloArr[i] = iOoil1iiIilo;
/* 28 */                if (I0001Ioi1lo(true)) {
/* 30 */                    int i2 = this.I00ilO0;
/* 33 */                    if (i2 < 0) {
/* 46 */                        I000II.I001IO000("No more continuations to resume");
/* 32 */                        return null;
                            }
/* 37 */                    this.I00ilO0 = i2 - 1;
/* 39 */                    iOoil1iiIiloArr[i2] = null;
/* 41 */                    obj = this.I00iio;
                        } else {
/* 50 */                    obj = Ii0111o.I00iOIl;
                        }
                    }
/* 52 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 186 */           return obj;
                }

                @Override
                public final Object I0000oI00(IOoil1iiIilo iOoil1iiIilo, Object obj) {
/* 1 */             this.I00iio = obj;
/* 3 */             return I0000O(iOoil1iiIilo);
                }

                public final boolean I0001Ioi1lo(boolean z) {
                    Function3 function3;
                    Object obj;
                    Oll0OlI11 oll0OlI11;
/* 1 */             List list = this.I00iiI;
/* 46 */            do {
/* 3 */                 int i = this.I00io1l;
/* 10 */                if (i == list.size()) {
/* 12 */                    if (z) {
/* 20 */                        return true;
                            }
/* 16 */                    I000II(this.I00iio);
/* 9 */                     return false;
                        }
/* 24 */                this.I00io1l = i + 1;
/* 30 */                function3 = (Function3) list.get(i);
                        try {
/* 32 */                    obj = this.I00iio;
/* 34 */                    oll0OlI11 = this.I00iiO;
/* 37 */                    OoOOI1100oI0.I0000Il00O(3, function3);
                        } catch (Throwable th) {
/* 54 */                    I000II(lIoii1l01l0i.I00000oIO(th));
/* 9 */                     return false;
                        }
/* 46 */            } while (function3.invoke(this, obj, oll0OlI11) != Ii0111o.I00iOIl);
/* 9 */             return false;
                }

                public final void I000II(Object obj) {
/* 1 */             int i = this.I00ilO0;
/* 3 */             if (i < 0) {
/* 74 */                I000II.I001IO000("No more continuations to resume");
/* 186 */               return;
                    }
/* 5 */             IOoil1iiIilo[] iOoil1iiIiloArr = this.I00ilI0I1;
/* 7 */             IOoil1iiIilo iOoil1iiIiloI0000Il00O = iOoil1iiIiloArr[i];
/* 11 */            this.I00ilO0 = i - 1;
/* 14 */            iOoil1iiIiloArr[i] = null;
/* 26 */            Ii00lIOoi ii00lIOoi = (Ii00lIOoi) iOoil1iiIiloI0000Il00O.getContext().I00lli11(o0iOli.I00iiO);
/* 30 */            if (!(ii00lIOoi instanceof Ii00lIOoi) || ii00lIOoi.I00oo1iO0ll(iOoil1iiIiloI0000Il00O.getContext())) {
/* 42 */                iOoil1iiIiloI0000Il00O = l00iIoI.I0000Il00O(iOoil1iiIiloI0000Il00O);
                    }
/* 51 */            Throwable thI00000oOI = Oi10ii.I00000oOI(obj);
/* 55 */            if (thI00000oOI == null) {
/* 57 */                iOoil1iiIiloI0000Il00O.resumeWith(obj);
                    } else {
                        try {
/* 61 */                    thI00000oOI.getCause();
                        } catch (Throwable unused) {
                        }
/* 68 */                iOoil1iiIiloI0000Il00O.resumeWith(lIoii1l01l0i.I00000oIO(thI00000oOI));
                    }
                }
            }

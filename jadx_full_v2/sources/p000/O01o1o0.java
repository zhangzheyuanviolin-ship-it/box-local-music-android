            package p000;

            import kotlin.jvm.functions.Function3;
            
            public final class O01o1o0 extends Oi10IOIi implements Function3 {
                public int I00iiI;
                public Ii1iOlI I00iiO;
                public final I00IOO I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public O01o1o0(I00IOO i00ioo, IOoil1iiIilo iOoil1iiIilo) {
/* 4 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iio = i00ioo;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 11 */            O01o1o0 o01o1o0 = new O01o1o0(this.I00iio, (IOoil1iiIilo) obj3);
/* 14 */            o01o1o0.I00iiO = (Ii1iOlI) obj;
/* 18 */            return o01o1o0.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             I00IOO i00ioo = this.I00iio;
/* 5 */             I11l01l i11l01l = (I11l01l) i00ioo.I0000Il00O;
/* 7 */             Ii1iOlI ii1iOlI = this.I00iiO;
/* 9 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 11 */            int i = this.I00iiI;
/* 15 */            if (i == 0) {
/* 29 */                lIoii1l01l0i.I00000oOI(obj);
/* 32 */                byte bI00IO1oi11O = i11l01l.I00IO1oi11O();
/* 36 */                if (bI00IO1oi11O == 1) {
/* 38 */                    return i00ioo.I000OOo1O(true);
                        }
/* 44 */                if (bI00IO1oi11O == 0) {
/* 46 */                    return i00ioo.I000OOo1O(false);
                        }
/* 52 */                if (bI00IO1oi11O != 6) {
/* 70 */                    if (bI00IO1oi11O == 8) {
/* 72 */                        return i00ioo.I000II();
                            }
/* 79 */                    I11l01l.I001IO000(i11l01l, "Can't begin reading element, unexpected token", 0, null, 6);
/* 186 */                   throw null;
                        }
/* 54 */                this.I00iiO = null;
/* 56 */                this.I00iiI = 1;
/* 58 */                obj = i00ioo.I000O01llI0(ii1iOlI, this);
/* 62 */                if (obj == ii0111o) {
/* 64 */                    return ii0111o;
                        }
                    } else {
/* 17 */                if (i != 1) {
/* 25 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 13 */                    return null;
                        }
/* 19 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 65 */            return (O01O0o1iI) obj;
                }
            }

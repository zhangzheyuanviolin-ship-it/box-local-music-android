            package p000;

            import kotlin.jvm.functions.Function3;
            
            public final class Oo0I0O1Ii0o0 extends Oll0io implements Function3 {
                public int I00iOIl;
                public OOIII0OOoOi1 I00iiI;
                public long I00iiO;
                public final Ii0110 I00iio;
                public final OI10i0Il I00ilI0I1;
                public final OI0lOIiOIOOo I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Oo0I0O1Ii0o0(Ii0110 ii0110, OI10i0Il oI10i0Il, OI0lOIiOIOOo oI0lOIiOIOOo, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iio = ii0110;
/* 3 */             this.I00ilI0I1 = oI10i0Il;
/* 5 */             this.I00ilO0 = oI0lOIiOIOOo;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 5 */             long j = ((OIOlIiiioi) obj2).I00000oIO;
/* 11 */            OI10i0Il oI10i0Il = this.I00ilI0I1;
/* 13 */            OI0lOIiOIOOo oI0lOIiOIOOo = this.I00ilO0;
/* 17 */            Oo0I0O1Ii0o0 oo0I0O1Ii0o0 = new Oo0I0O1Ii0o0(this.I00iio, oI10i0Il, oI0lOIiOIOOo, (IOoil1iiIilo) obj3);
/* 20 */            oo0I0O1Ii0o0.I00iiI = (OOIII0OOoOi1) obj;
/* 22 */            oo0I0O1Ii0o0.I00iiO = j;
/* 26 */            return oo0I0O1Ii0o0.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             Ii0110 ii0110 = this.I00iio;
/* 10 */            if (i == 0) {
/* 24 */                lIoii1l01l0i.I00000oOI(obj);
/* 27 */                OOIII0OOoOi1 oOIII0OOoOi1 = this.I00iiI;
/* 42 */                iOi1II01i0.I0000O(ii0110, null, null, new I00oO101o(this.I00ilI0I1, this.I00iiO, this.I00ilO0, (IOoil1iiIilo) null, 7), 3);
/* 45 */                this.I00iOIl = 1;
/* 47 */                obj = oOIII0OOoOi1.I000II(this);
/* 51 */                if (obj == ii0111o) {
/* 53 */                    return ii0111o;
                        }
                    } else {
/* 12 */                if (i != 1) {
/* 20 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 8 */                     return null;
                        }
/* 14 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 69 */            iOi1II01i0.I0000O(ii0110, null, null, new I1o0o1(this.I00ilI0I1, ((Boolean) obj).booleanValue(), this.I00ilO0, (IOoil1iiIilo) null), 3);
/* 72 */            return OoiIlOl1iI.I00000oIO;
                }
            }

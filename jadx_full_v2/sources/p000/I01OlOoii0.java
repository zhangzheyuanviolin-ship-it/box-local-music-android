            package p000;
            
            public final class I01OlOoii0 extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final OiOoIO1 I00iiI;
                public final float I00iiO;
                public final float I00iio;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I01OlOoii0(OiOoIO1 oiOoIO1, float f, float f2, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = oiOoIO1;
/* 3 */             this.I00iiO = f;
/* 5 */             this.I00iio = f2;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             return new I01OlOoii0(this.I00iiI, this.I00iiO, this.I00iio, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((I01OlOoii0) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 47 */                long jFloatToRawIntBits = (Float.floatToRawIntBits(this.I00iiO) << 32) | (Float.floatToRawIntBits(this.I00iio) & 4294967295L);
/* 48 */                this.I00iOIl = 1;
/* 58 */                if (OiOlllI10.I00000oOI(this.I00iiI.I010o0o0oO, jFloatToRawIntBits, this) == ii0111o) {
/* 60 */                    return ii0111o;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 61 */            return OoiIlOl1iI.I00000oIO;
                }
            }

            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public final class Ol00oioi0oI extends Oll0io implements Function3 {
                public int I00iOIl;
                public Object I00iiI;
                public final OOo0lO I00iiO;
                public final IlOIll0o11Ii I00iio;
                public final Ol010000lo00 I00ilI0I1;
                public final float I00ilO0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ol00oioi0oI(OOo0lO oOo0lO, IlOIll0o11Ii ilOIll0o11Ii, Ol010000lo00 ol010000lo00, float f, IOoil1iiIilo iOoil1iiIilo) {
/* 10 */            super(3, iOoil1iiIilo);
/* 1 */             this.I00iiO = oOo0lO;
/* 3 */             this.I00iio = ilOIll0o11Ii;
/* 5 */             this.I00ilI0I1 = ol010000lo00;
/* 7 */             this.I00ilO0 = f;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 10 */            Ol010000lo00 ol010000lo00 = this.I00ilI0I1;
/* 12 */            float f = this.I00ilO0;
/* 18 */            Ol00oioi0oI ol00oioi0oI = new Ol00oioi0oI(this.I00iiO, this.I00iio, ol010000lo00, f, (IOoil1iiIilo) obj3);
/* 21 */            ol00oioi0oI.I00iiI = (I0l1I0I0i10I) obj;
/* 25 */            return ol00oioi0oI.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OOo0lO oOo0lO;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             if (i == 0) {
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 30 */                I0l1I0I0i10I i0l1I0I0i10I = (I0l1I0I0i10I) this.I00iiI;
/* 35 */                I0l0oI00l i0l0oI00l = new I0l0oI00l(2);
/* 40 */                i0l0oI00l.I00000oOI = this.I00ilI0I1;
/* 42 */                i0l0oI00l.I0000Il00O = i0l1I0I0i10I;
/* 44 */                VarHandle.storeStoreFence();
/* 47 */                OOo0lO oOo0lO2 = this.I00iiO;
/* 49 */                this.I00iiI = oOo0lO2;
/* 51 */                this.I00iOIl = 1;
/* 57 */                Object objI00000oIO = this.I00iio.I00000oIO(i0l0oI00l, this.I00ilO0, this);
/* 61 */                if (objI00000oIO == ii0111o) {
/* 63 */                    return ii0111o;
                        }
/* 65 */                obj = objI00000oIO;
/* 66 */                oOo0lO = oOo0lO2;
                    } else {
/* 8 */                 if (i != 1) {
/* 20 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 23 */                    return null;
                        }
/* 12 */                oOo0lO = (OOo0lO) this.I00iiI;
/* 14 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 73 */            oOo0lO.I00iOIl = ((Number) obj).floatValue();
/* 75 */            return OoiIlOl1iI.I00000oIO;
                }
            }

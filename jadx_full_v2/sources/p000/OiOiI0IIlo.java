            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class OiOiI0IIlo extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public Object I00iiI;
                public final float I00iiO;
                public final I110IiI0o1Il I00iio;
                public final OOo0lO I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public OiOiI0IIlo(float f, I110IiI0o1Il i110IiI0o1Il, OOo0lO oOo0lO, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiO = f;
/* 3 */             this.I00iio = i110IiI0o1Il;
/* 5 */             this.I00ilI0I1 = oOo0lO;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 9 */             OiOiI0IIlo oiOiI0IIlo = new OiOiI0IIlo(this.I00iiO, this.I00iio, this.I00ilI0I1, iOoil1iiIilo);
/* 12 */            oiOiI0IIlo.I00iiI = obj;
/* 37 */            return oiOiI0IIlo;
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((OiOiI0IIlo) create((OiOiliiO) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             if (i == 0) {
/* 21 */                lIoii1l01l0i.I00000oOI(obj);
/* 26 */                OiOiliiO oiOiliiO = (OiOiliiO) this.I00iiI;
/* 32 */                O1oiiIIo111o o1oiiIIo111o = new O1oiiIIo111o(11);
/* 37 */                o1oiiIIo111o.I00iiI = this.I00ilI0I1;
/* 39 */                o1oiiIIo111o.I00iiO = oiOiliiO;
/* 41 */                VarHandle.storeStoreFence();
/* 44 */                this.I00iOIl = 1;
/* 57 */                if (lOiIo0.I0000Il00O(0.0f, this.I00iiO, this.I00iio, o1oiiIIo111o, this, 4) == ii0111o) {
/* 59 */                    return ii0111o;
                        }
                    } else {
/* 8 */                 if (i != 1) {
/* 16 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 19 */                    return null;
                        }
/* 10 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 60 */            return OoiIlOl1iI.I00000oIO;
                }
            }

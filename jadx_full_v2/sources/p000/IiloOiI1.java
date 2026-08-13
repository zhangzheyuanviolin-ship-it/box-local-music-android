            package p000;

            import java.lang.invoke.VarHandle;
            
            public final class IiloOiI1 extends Oll0io implements IlliOIilI {
                public int I00iOIl;
                public I0l1I0I0i10I I00iiI;
                public Ii1loIll001 I00iiO;
                public IiloiO I00iio;
                public final IiloOlIoIool I00ilI0I1;
                public final float I00ilO0;
                public final I110IiI0o1Il I00io1l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public IiloOiI1(IiloOlIoIool iiloOlIoIool, float f, I110IiI0o1Il i110IiI0o1Il, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(4, iOoil1iiIilo);
/* 1 */             this.I00ilI0I1 = iiloOlIoIool;
/* 3 */             this.I00ilO0 = f;
/* 5 */             this.I00io1l = i110IiI0o1Il;
                }

                @Override
                public final Object I000l1(Object obj, Object obj2, Object obj3, Object obj4) {
/* 11 */            float f = this.I00ilO0;
/* 13 */            I110IiI0o1Il i110IiI0o1Il = this.I00io1l;
/* 17 */            IiloOiI1 iiloOiI1 = new IiloOiI1(this.I00ilI0I1, f, i110IiI0o1Il, (IOoil1iiIilo) obj4);
/* 20 */            iiloOiI1.I00iiI = (I0l1I0I0i10I) obj;
/* 22 */            iiloOiI1.I00iiO = (Ii1loIll001) obj2;
/* 24 */            iiloOiI1.I00iio = (IiloiO) obj3;
/* 28 */            return iiloOiI1.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
/* 3 */             I0l1OOl1l10 i0l1OOl1l10 = this.I00ilI0I1.I00000oOI;
/* 5 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 7 */             int i = this.I00iOIl;
/* 11 */            if (i == 0) {
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 28 */                I0l1I0I0i10I i0l1I0I0i10I = this.I00iiI;
/* 34 */                float fI0001Ioi1lo = this.I00iiO.I0001Ioi1lo(this.I00iio);
/* 42 */                if (!Float.isNaN(fI0001Ioi1lo)) {
/* 46 */                    OOo0lO oOo0lO = new OOo0lO();
/* 70 */                    float fI000II = Float.isNaN(((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II()) ? 0.0f : ((OIooO1iiliI) i0l1OOl1l10.I000l1).I000II();
/* 75 */                    oOo0lO.I00iOIl = fI000II;
/* 79 */                    I0l0Oo10O i0l0Oo10O = new I0l0Oo10O(1);
/* 82 */                    i0l0Oo10O.I00iiI = i0l1I0I0i10I;
/* 84 */                    i0l0Oo10O.I00iiO = oOo0lO;
/* 86 */                    VarHandle.storeStoreFence();
/* 89 */                    this.I00iiI = null;
/* 91 */                    this.I00iiO = null;
/* 93 */                    this.I00iOIl = 1;
/* 104 */                   if (lOiIo0.I00000oIO(fI000II, fI0001Ioi1lo, this.I00ilO0, this.I00io1l, i0l0Oo10O, this) == ii0111o) {
/* 106 */                       return ii0111o;
                            }
                        }
                    } else {
/* 13 */                if (i != 1) {
/* 21 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 9 */                     return null;
                        }
/* 15 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 107 */           return OoiIlOl1iI.I00000oIO;
                }
            }

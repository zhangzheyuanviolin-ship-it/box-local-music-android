            package p000;

            import java.lang.invoke.VarHandle;
            import kotlin.jvm.functions.Function3;
            
            public final class I0l0ol extends Oll0io implements Function3 {
                public int I00iOIl;
                public Object I00iiI;
                public final I0l10OiIOil I00iiO;
                public final OOo0lO I00iio;
                public final float I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public I0l0ol(I0l10OiIOil i0l10OiIOil, OOo0lO oOo0lO, float f, IOoil1iiIilo iOoil1iiIilo) {
/* 8 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iiO = i0l10OiIOil;
/* 3 */             this.I00iio = oOo0lO;
/* 5 */             this.I00ilI0I1 = f;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 9 */             OOo0lO oOo0lO = this.I00iio;
/* 11 */            float f = this.I00ilI0I1;
/* 15 */            I0l0ol i0l0ol = new I0l0ol(this.I00iiO, oOo0lO, f, (IOoil1iiIilo) obj3);
/* 18 */            i0l0ol.I00iiI = (I0l1I0I0i10I) obj;
/* 22 */            return i0l0ol.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    OOo0lO oOo0lO;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 7 */             if (i == 0) {
/* 25 */                lIoii1l01l0i.I00000oOI(obj);
/* 30 */                I0l1I0I0i10I i0l1I0I0i10I = (I0l1I0I0i10I) this.I00iiI;
/* 35 */                I0l0oI00l i0l0oI00l = new I0l0oI00l(0);
/* 38 */                I0l10OiIOil i0l10OiIOil = this.I00iiO;
/* 40 */                i0l0oI00l.I00000oOI = i0l10OiIOil;
/* 42 */                i0l0oI00l.I0000Il00O = i0l1I0I0i10I;
/* 44 */                VarHandle.storeStoreFence();
/* 47 */                IlOIll0o11Ii ilOIll0o11Ii = i0l10OiIOil.I010ioo;
/* 49 */                if (ilOIll0o11Ii == null) {
/* 80 */                    O0000Ioio00.I000OOo1O("resolvedFlingBehavior");
/* 168 */                   throw null;
                        }
/* 51 */                OOo0lO oOo0lO2 = this.I00iio;
/* 53 */                this.I00iiI = oOo0lO2;
/* 55 */                this.I00iOIl = 1;
/* 59 */                obj = ilOIll0o11Ii.I00000oIO(i0l0oI00l, this.I00ilI0I1, this);
/* 63 */                if (obj == ii0111o) {
/* 65 */                    return ii0111o;
                        }
/* 66 */                oOo0lO = oOo0lO2;
                    } else {
/* 9 */                 if (i != 1) {
/* 21 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        }
/* 13 */                oOo0lO = (OOo0lO) this.I00iiI;
/* 15 */                lIoii1l01l0i.I00000oOI(obj);
                    }
/* 73 */            oOo0lO.I00iOIl = ((Number) obj).floatValue();
/* 75 */            return OoiIlOl1iI.I00000oIO;
                }
            }

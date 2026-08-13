            package p000;

            import android.util.Log;
            import com.google.ai.edge.litert.Accelerator;
            import com.google.ai.edge.litert.CompiledModel;
            
            public final class i01oo0lIil00 extends Oll0io implements IlliIl1l11O {
                public int I00iOIl;
                public final IIOo1i I00iiI;
                public final String I00iiO;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public i01oo0lIil00(IIOo1i iIOo1i, String str, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(2, iOoil1iiIilo);
/* 1 */             this.I00iiI = iIOo1i;
/* 3 */             this.I00iiO = str;
                }

                @Override
                public final IOoil1iiIilo create(Object obj, IOoil1iiIilo iOoil1iiIilo) {
/* 7 */             return new i01oo0lIil00(this.I00iiI, this.I00iiO, iOoil1iiIilo);
                }

                @Override
                public final Object invoke(Object obj, Object obj2) {
/* 13 */            return ((i01oo0lIil00) create((Ii0110) obj, (IOoil1iiIilo) obj2)).invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    String strI001i1O0Ol;
/* 1 */             Object obj2 = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 6 */             IIOo1i iIOo1i = this.I00iiI;
/* 8 */             boolean z = true;
                    try {
/* 9 */                 if (i == 0) {
/* 23 */                    lIoii1l01l0i.I00000oOI(obj);
/* 26 */                    this.I00iOIl = 1;
/* 28 */                    iIOo1i.getClass();
/* 40 */                    Object objI0000oI00 = iOi1II01i0.I0000oI00(II1o1O1O1iIi.I00000oIO, new I1iOI0oo(iIOo1i, (IOoil1iiIilo) null, 26), this);
/* 44 */                    if (objI0000oI00 != obj2) {
/* 47 */                        objI0000oI00 = OoiIlOl1iI.I00000oIO;
                            }
/* 49 */                    if (objI0000oI00 == obj2) {
/* 51 */                        return obj2;
                            }
                        } else {
/* 11 */                    if (i != 1) {
/* 19 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                         return null;
                            }
/* 13 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 52 */                String str = this.I00iiO;
/* 54 */                iIOo1i.getClass();
/* 57 */                strI001i1O0Ol = IIOo1i.I001i1O0Ol(str);
                    } catch (Throwable th) {
/* 95 */                Log.e("BoxAssistYolox", "loadModel failed", th);
/* 98 */                z = false;
                    }
/* 61 */            if (strI001i1O0Ol == null) {
/* 63 */                return Boolean.FALSE;
                    }
/* 86 */            iIOo1i.I0000Il00O = CompiledModel.Companion.create$default(CompiledModel.INSTANCE, strI001i1O0Ol, new CompiledModel.Options(Accelerator.CPU), null, 4, null);
/* 99 */            return Boolean.valueOf(z);
                }
            }

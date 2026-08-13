            package p000;

            import kotlin.jvm.functions.Function3;
            
            public final class Ol10oiIOOi extends Oll0io implements Function3 {
                public int I00iOIl;
                public Object I00iiI;
                public long I00iiO;
                public final OI0lOIiOIOOo I00iio;
                public final Ol111o0 I00ilI0I1;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public Ol10oiIOOi(OI0lOIiOIOOo oI0lOIiOIOOo, Ol111o0 ol111o0, IOoil1iiIilo iOoil1iiIilo) {
/* 6 */             super(3, iOoil1iiIilo);
/* 1 */             this.I00iio = oI0lOIiOIOOo;
/* 3 */             this.I00ilI0I1 = ol111o0;
                }

                @Override
                public final Object invoke(Object obj, Object obj2, Object obj3) {
/* 5 */             long j = ((OIOlIiiioi) obj2).I00000oIO;
/* 15 */            Ol10oiIOOi ol10oiIOOi = new Ol10oiIOOi(this.I00iio, this.I00ilI0I1, (IOoil1iiIilo) obj3);
/* 18 */            ol10oiIOOi.I00iiI = (OOIII0OOoOi1) obj;
/* 20 */            ol10oiIOOi.I00iiO = j;
/* 24 */            return ol10oiIOOi.invokeSuspend(OoiIlOl1iI.I00000oIO);
                }

                @Override
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Throwable th;
/* 1 */             Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 3 */             int i = this.I00iOIl;
/* 5 */             OOIII1oOoolO oOIII1oOoolO = null;
/* 8 */             OI0lOIiOIOOo oI0lOIiOIOOo = this.I00iio;
                    try {
                    } catch (Throwable th2) {
/* 48 */                th = th2;
                    }
/* 10 */            if (i == 0) {
/* 51 */                lIoii1l01l0i.I00000oOI(obj);
/* 56 */                OOIII0OOoOi1 oOIII0OOoOi1 = (OOIII0OOoOi1) this.I00iiI;
/* 58 */                long j = this.I00iiO;
/* 62 */                OOIII1oOoolO oOIII1oOoolO2 = new OOIII1oOoolO(j);
                        try {
/* 65 */                    oI0lOIiOIOOo.I00000oOI(oOIII1oOoolO2);
/* 68 */                    Ol111o0 ol111o0 = this.I00ilI0I1;
/* 125 */                   ol111o0.I0010o.I000O01llI0((ol111o0.I0000Il00O() ? Float.intBitsToFloat((int) (j & 4294967295L)) : ol111o0.I000iOII ? ol111o0.I000OOo1O.I000II() - Float.intBitsToFloat((int) (j >> 32)) : Float.intBitsToFloat((int) (j >> 32))) - ol111o0.I0010I0i.I000II());
/* 128 */                   this.I00iiI = oOIII1oOoolO2;
/* 130 */                   this.I00iOIl = 1;
/* 132 */                   obj = oOIII0OOoOi1.I000II(this);
/* 136 */                   if (obj != ii0111o) {
/* 139 */                       oOIII1oOoolO = oOIII1oOoolO2;
                            }
                        } catch (Throwable th3) {
/* 165 */                   th = th3;
/* 166 */                   oOIII1oOoolO = oOIII1oOoolO2;
/* 167 */                   if (oOIII1oOoolO == null) {
/* 437 */                       throw th;
                            }
/* 171 */                   OOIII1l oOIII1l = new OOIII1l(oOIII1oOoolO);
/* 174 */                   this.I00iiI = th;
/* 176 */                   this.I00iOIl = 3;
/* 182 */                   if (oI0lOIiOIOOo.I00000oIO(oOIII1l, this) != ii0111o) {
/* 185 */                       th = th;
/* 437 */                       throw th;
                            }
/* 184 */                   return ii0111o;
                        }
/* 184 */               return ii0111o;
                    }
/* 12 */            if (i != 1) {
/* 15 */                if (i == 2) {
/* 34 */                    lIoii1l01l0i.I00000oOI(obj);
/* 162 */                   return OoiIlOl1iI.I00000oIO;
                        }
/* 17 */                if (i != 3) {
/* 21 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 5 */                     return null;
                        }
/* 27 */                th = (Throwable) this.I00iiI;
/* 29 */                lIoii1l01l0i.I00000oOI(obj);
/* 437 */               throw th;
                    }
/* 42 */            oOIII1oOoolO = (OOIII1oOoolO) this.I00iiI;
/* 44 */            lIoii1l01l0i.I00000oOI(obj);
/* 159 */           oI0lOIiOIOOo.I00000oOI(((Boolean) obj).booleanValue() ? new OOIIIiOOili(oOIII1oOoolO) : new OOIII1l(oOIII1oOoolO));
/* 162 */           return OoiIlOl1iI.I00000oIO;
                }
            }

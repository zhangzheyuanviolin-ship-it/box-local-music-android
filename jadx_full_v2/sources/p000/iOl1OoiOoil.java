            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iOl1OoiOoil {
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(Ii00l101O ii00l101O, Object obj, Object obj2, IlliIl1l11O illiIl1l11O, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IO10IlI1l011 iO10IlI1l011;
                    Object objI00000oOI;
                    Object objInvoke;
/* 3 */             if (iOoil1iiIilo instanceof IO10IlI1l011) {
/* 6 */                 iO10IlI1l011 = (IO10IlI1l011) iOoil1iiIilo;
/* 8 */                 int i = iO10IlI1l011.I00ilI0I1;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iO10IlI1l011.I00ilI0I1 = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iO10IlI1l011 = new IO10IlI1l011(iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj3 = iO10IlI1l011.I00iio;
/* 27 */            Object obj4 = Ii0111o.I00iOIl;
/* 29 */            int i2 = iO10IlI1l011.I00ilI0I1;
/* 32 */            if (i2 != 0) {
/* 34 */                if (i2 != 1) {
/* 54 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 57 */                    return null;
                        }
/* 36 */                Object obj5 = iO10IlI1l011.I00iiO;
/* 38 */                Ii00l101O ii00l101O2 = iO10IlI1l011.I00iiI;
                        try {
/* 40 */                    lIoii1l01l0i.I00000oOI(obj3);
/* 43 */                    objI00000oOI = obj5;
/* 44 */                    ii00l101O = ii00l101O2;
/* 108 */                   Oo0ooOi10I.I00000oIO(ii00l101O, objI00000oOI);
/* 111 */                   return obj3;
                        } catch (Throwable th) {
/* 48 */                    objI00000oOI = obj5;
/* 49 */                    ii00l101O = ii00l101O2;
/* 50 */                    th = th;
/* 112 */                   Oo0ooOi10I.I00000oIO(ii00l101O, objI00000oOI);
/* 966 */                   throw th;
                        }
                    }
/* 59 */            lIoii1l01l0i.I00000oOI(obj3);
/* 62 */            objI00000oOI = Oo0ooOi10I.I00000oOI(ii00l101O, obj2);
                    try {
/* 66 */                iO10IlI1l011.I00iOIl = obj;
/* 68 */                iO10IlI1l011.I00iiI = ii00l101O;
/* 70 */                iO10IlI1l011.I00iiO = objI00000oOI;
/* 72 */                iO10IlI1l011.I00ilI0I1 = 1;
/* 76 */                OlIiloIloiio olIiloIloiio = new OlIiloIloiio();
/* 79 */                olIiloIloiio.I00iOIl = iO10IlI1l011;
/* 81 */                olIiloIloiio.I00iiI = ii00l101O;
/* 83 */                VarHandle.storeStoreFence();
/* 86 */                if (illiIl1l11O == null) {
/* 88 */                    objInvoke = l00iIoI.I0000O(illiIl1l11O, obj, olIiloIloiio);
                        } else {
/* 97 */                    OoOOI1100oI0.I0000Il00O(2, illiIl1l11O);
/* 100 */                   objInvoke = illiIl1l11O.invoke(obj, olIiloIloiio);
                        }
/* 92 */                obj3 = objInvoke;
/* 105 */               if (obj3 == obj4) {
/* 107 */                   return obj4;
                        }
/* 108 */               Oo0ooOi10I.I00000oIO(ii00l101O, objI00000oOI);
/* 111 */               return obj3;
                    } catch (Throwable th2) {
/* 94 */                th = th2;
/* 112 */               Oo0ooOi10I.I00000oIO(ii00l101O, objI00000oOI);
/* 966 */               throw th;
                    }
                }
            }

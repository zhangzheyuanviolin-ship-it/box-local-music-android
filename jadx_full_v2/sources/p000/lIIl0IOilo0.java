            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class lIIl0IOilo0 {
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(OOIoOo0O oOIoOo0O, IllOOo00lI illOOo00lI, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    OOIo1o10I0o oOIo1o10I0o;
/* 3 */             if (iOoil1iiIilo instanceof OOIo1o10I0o) {
/* 6 */                 oOIo1o10I0o = (OOIo1o10I0o) iOoil1iiIilo;
/* 8 */                 int i = oOIo1o10I0o.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    oOIo1o10I0o.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    oOIo1o10I0o = new OOIo1o10I0o(iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj = oOIo1o10I0o.I00iiI;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = oOIo1o10I0o.I00iiO;
/* 32 */            int i3 = 1;
                    try {
/* 33 */                if (i2 == 0) {
/* 51 */                    lIoii1l01l0i.I00000oOI(obj);
/* 64 */                    if (oOIo1o10I0o.getContext().I00lli11(Iioi0lilII.I00iio) != oOIoOo0O) {
/* 116 */                       I000II.I001IO000("awaitClose() can only be invoked from the producer context");
/* 31 */                        return null;
                            }
/* 66 */                    oOIo1o10I0o.I00iOIl = illOOo00lI;
/* 68 */                    oOIo1o10I0o.I00iiO = 1;
/* 76 */                    IIoOoIol0Io0 iIoOoIol0Io0 = new IIoOoIol0Io0(1, l00iIoI.I0000Il00O(oOIo1o10I0o));
/* 79 */                    iIoOoIol0Io0.I00111O();
/* 84 */                    I1o1O0loII0 i1o1O0loII0 = new I1o1O0loII0(i3);
/* 87 */                    i1o1O0loII0.I00iiI = iIoOoIol0Io0;
/* 89 */                    VarHandle.storeStoreFence();
/* 94 */                    ((OOIoO0IIOO0) oOIoOo0O).I00iio(i1o1O0loII0);
/* 101 */                   if (iIoOoIol0Io0.I0010I0i() == ii0111o) {
/* 103 */                       return ii0111o;
                            }
                        } else {
/* 35 */                    if (i2 != 1) {
/* 47 */                        I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                        return null;
                            }
/* 37 */                    illOOo00lI = oOIo1o10I0o.I00iOIl;
/* 39 */                    lIoii1l01l0i.I00000oOI(obj);
                        }
/* 104 */               illOOo00lI.invoke();
/* 107 */               return OoiIlOl1iI.I00000oIO;
                    } catch (Throwable th) {
/* 110 */               illOOo00lI.invoke();
/* 113 */               throw th;
                    }
                }
            }

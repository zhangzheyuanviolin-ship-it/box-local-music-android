            package p000;

            import java.lang.invoke.VarHandle;
            
            public abstract class iiolOOio1 {
                public static IIiOiI0il I00000oIO(IOi10loi iOi10loi) {
/* 4 */             IIoIil iIoIil = new IIoIil(3);
/* 7 */             iIoIil.I00iiI = iOi10loi;
/* 11 */            iIoIil.I00iiO = "Deferred.asListenableFuture";
/* 13 */            VarHandle.storeStoreFence();
/* 16 */            return iOiiloIII0O.I00000oIO(iIoIil);
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oOI(IiIOI1ol0o iiIOI1ol0o, long j, IOoilo iOoilo) throws Throwable {
                    Ii00i1OiO ii00i1OiO;
/* 3 */             if (iOoilo instanceof Ii00i1OiO) {
/* 6 */                 ii00i1OiO = (Ii00i1OiO) iOoilo;
/* 8 */                 int i = ii00i1OiO.I00iiI;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ii00i1OiO.I00iiI = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ii00i1OiO = new Ii00i1OiO(iOoilo);
                        }
                    }
/* 25 */            Object objI0000Il00O = ii00i1OiO.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ii00i1OiO.I00iiI;
/* 31 */            IOoil1iiIilo iOoil1iiIilo = null;
/* 33 */            if (i2 == 0) {
/* 47 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
/* 54 */                I0II0OiI i0II0OiI = new I0II0OiI(iiIOI1ol0o, iOoil1iiIilo, 14);
/* 57 */                ii00i1OiO.I00iiI = 1;
/* 59 */                objI0000Il00O = lOlo0o.I0000Il00O(j, i0II0OiI, ii00i1OiO);
/* 63 */                if (objI0000Il00O == ii0111o) {
/* 65 */                    return ii0111o;
                        }
                    } else {
/* 35 */                if (i2 != 1) {
/* 43 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                    return null;
                        }
/* 37 */                lIoii1l01l0i.I00000oOI(objI0000Il00O);
                    }
/* 70 */            return Boolean.valueOf(objI0000Il00O != null);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public static final void I0000Il00O(IiIOI1ol0o iiIOI1ol0o, IOi10loi iOi10loi) {
/* 4 */             Ii00i00 ii00i00 = new Ii00i00(0);
/* 7 */             ii00i00.I00iiI = iiIOI1ol0o;
/* 9 */             ii00i00.I00iiO = iOi10loi;
/* 11 */            VarHandle.storeStoreFence();
/* 16 */            ((O011OOl11) iiIOI1ol0o).I00iiI(ii00i00);
                }
            }

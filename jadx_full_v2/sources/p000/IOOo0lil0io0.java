            package p000;
            
            public final class IOOo0lil0io0 implements IlOil1iooOO0 {
                public IIIII1OI1 I00iOIl;
                public int I00iiI;

                /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
                
                    if (p000.liIOo01oO.I00000oIO(r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IOOo0OI1o0 iOOo0OI1o0;
/* 3 */             if (iOoil1iiIilo instanceof IOOo0OI1o0) {
/* 6 */                 iOOo0OI1o0 = (IOOo0OI1o0) iOoil1iiIilo;
/* 8 */                 int i = iOOo0OI1o0.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    iOOo0OI1o0.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    iOOo0OI1o0 = new IOOo0OI1o0(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj2 = iOOo0OI1o0.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = iOOo0OI1o0.I00iiO;
/* 33 */            if (i2 == 0) {
/* 54 */                lIoii1l01l0i.I00000oOI(obj2);
/* 57 */                IIIII1OI1 iiiii1oi1 = this.I00iOIl;
/* 63 */                Iol0oIiIOI iol0oIiIOI = new Iol0oIiIOI(this.I00iiI, obj);
/* 66 */                iOOo0OI1o0.I00iiO = 1;
/* 72 */                if (iiiii1oi1.I00000oOI(iOOo0OI1o0, iol0oIiIOI) != ii0111o) {
                        }
/* 83 */                return ii0111o;
                    }
/* 35 */            if (i2 != 1) {
/* 37 */                if (i2 == 2) {
/* 39 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 84 */                    return OoiIlOl1iI.I00000oIO;
                        }
/* 45 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 48 */                return null;
                    }
/* 50 */            lIoii1l01l0i.I00000oOI(obj2);
/* 75 */            iOOo0OI1o0.I00iiO = 2;
                }
            }

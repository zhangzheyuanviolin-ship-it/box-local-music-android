            package p000;

            import kotlin.jvm.functions.Function1;
            
            public final class IlOooI implements IlOil1iooOO0 {
                public IlOil1iooOO0 I00iOIl;
                public Oi1oIiOiIi0 I00iiI;
                public boolean I00iiO;
                public Function1 I00iio;

                /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
                
                    if (r7.emit(r9, r0) == r1) goto L22;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, IOoil1iiIilo iOoil1iiIilo) throws Throwable {
                    IlOoo0I01io ilOoo0I01io;
                    IlOil1iooOO0 ilOil1iooOO0;
/* 3 */             if (iOoil1iiIilo instanceof IlOoo0I01io) {
/* 6 */                 ilOoo0I01io = (IlOoo0I01io) iOoil1iiIilo;
/* 8 */                 int i = ilOoo0I01io.I00iiI;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilOoo0I01io.I00iiI = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilOoo0I01io = new IlOoo0I01io(this, iOoil1iiIilo);
                        }
                    }
/* 25 */            Object obj2 = ilOoo0I01io.I00iOIl;
/* 27 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilOoo0I01io.I00iiI;
/* 34 */            if (i2 == 0) {
/* 56 */                lIoii1l01l0i.I00000oOI(obj2);
/* 59 */                IlOil1iooOO0 ilOil1iooOO02 = this.I00iOIl;
/* 63 */                Oi1oIiOiIi0 oi1oIiOiIi0 = this.I00iiI;
/* 65 */                boolean z = this.I00iiO;
/* 67 */                Function1 function1 = this.I00iio;
/* 69 */                ilOoo0I01io.I00iiO = ilOil1iooOO02;
/* 71 */                ilOoo0I01io.I00iiI = 1;
/* 73 */                Object objI0000Il00O = il01ioIoI.I0000Il00O(ilOoo0I01io, oi1oIiOiIi0, true, z, function1);
/* 77 */                if (objI0000Il00O != ii0111o) {
/* 81 */                    obj2 = objI0000Il00O;
/* 82 */                    ilOil1iooOO0 = ilOil1iooOO02;
                        }
/* 93 */                return ii0111o;
                    }
/* 36 */            if (i2 != 1) {
/* 38 */                if (i2 == 2) {
/* 40 */                    lIoii1l01l0i.I00000oOI(obj2);
/* 94 */                    return OoiIlOl1iI.I00000oIO;
                        }
/* 46 */                I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 31 */                return null;
                    }
/* 50 */            ilOil1iooOO0 = ilOoo0I01io.I00iiO;
/* 52 */            lIoii1l01l0i.I00000oOI(obj2);
/* 83 */            ilOoo0I01io.I00iiO = null;
/* 85 */            ilOoo0I01io.I00iiI = 2;
                }
            }

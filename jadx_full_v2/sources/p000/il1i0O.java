            package p000;
            
            public abstract class il1i0O {
                public static final void I00000oIO(IIoOoIol0Io0 iIoOoIol0Io0, IOoil1iiIilo iOoil1iiIilo, boolean z) {
/* 1 */             Object objI0010o = iIoOoIol0Io0.I0010o();
/* 5 */             Throwable thI0000oI00 = iIoOoIol0Io0.I0000oI00(objI0010o);
/* 16 */            Object objI00000oIO = thI0000oI00 != null ? lIoii1l01l0i.I00000oIO(thI0000oI00) : iIoOoIol0Io0.I0001Ioi1lo(objI0010o);
/* 20 */            if (!z) {
/* 76 */                iOoil1iiIilo.resumeWith(objI00000oIO);
/* 215 */               return;
                    }
/* 22 */            IiiI1lIo iiiI1lIo = (IiiI1lIo) iOoil1iiIilo;
/* 24 */            IOoilo iOoilo = iiiI1lIo.I00ilI0I1;
/* 26 */            Object obj = iiiI1lIo.I00io1l;
/* 28 */            Ii00l101O context = iOoilo.getContext();
/* 32 */            Object objI00000oOI = Oo0ooOi10I.I00000oOI(context, obj);
/* 45 */            OoiI00olo ooiI00oloI0000Il00O = objI00000oOI != Oo0ooOi10I.I00000oIO ? iioloOl.I0000Il00O(iOoilo, context, objI00000oOI) : null;
                    try {
/* 46 */                iOoilo.resumeWith(objI00000oIO);
/* 49 */                if (ooiI00oloI0000Il00O == null || ooiI00oloI0000Il00O.I00ilI0I1()) {
/* 59 */                    Oo0ooOi10I.I00000oIO(context, objI00000oOI);
                        }
                    } catch (Throwable th) {
/* 64 */                if (ooiI00oloI0000Il00O == null || ooiI00oloI0000Il00O.I00ilI0I1()) {
/* 72 */                    Oo0ooOi10I.I00000oIO(context, objI00000oOI);
                        }
/* 75 */                throw th;
                    }
                }
            }

            package p000;

            import java.io.File;
            import java.io.IOException;
            import kotlin.jvm.functions.Function1;
            
            public abstract class ilOIl0o0 {
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static final Object I00000oIO(File file, Function1 function1, IOoilo iOoilo) throws Throwable {
                    IlIiIOiIIlo ilIiIOiIIlo;
/* 3 */             if (iOoilo instanceof IlIiIOiIIlo) {
/* 6 */                 ilIiIOiIIlo = (IlIiIOiIIlo) iOoilo;
/* 8 */                 int i = ilIiIOiIIlo.I00iiO;
/* 14 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 17 */                    ilIiIOiIIlo.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 22 */                    ilIiIOiIIlo = new IlIiIOiIIlo(iOoilo);
                        }
                    }
/* 25 */            Object obj = ilIiIOiIIlo.I00iiI;
/* 27 */            Object obj2 = Ii0111o.I00iOIl;
/* 29 */            int i2 = ilIiIOiIIlo.I00iiO;
                    try {
/* 32 */                if (i2 == 0) {
/* 51 */                    lIoii1l01l0i.I00000oOI(obj);
/* 54 */                    ilIiIOiIIlo.I00iOIl = file;
/* 56 */                    ilIiIOiIIlo.I00iiO = 1;
/* 58 */                    Object objInvoke = function1.invoke(ilIiIOiIIlo);
                            return objInvoke == obj2 ? obj2 : objInvoke;
                        }
/* 34 */                if (i2 != 1) {
/* 46 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 49 */                    return null;
                        }
/* 36 */                File file2 = ilIiIOiIIlo.I00iOIl;
/* 38 */                lIoii1l01l0i.I00000oOI(obj);
/* 41 */                return obj;
                    } catch (IOException e) {
/* 68 */                if (e instanceof Ii01i1) {
/* 408 */                   throw e;
                        }
/* 74 */                if (!file.exists()) {
/* 162 */                   throw ilOI0oi0oi1O.I00000oOI(file, e);
                        }
/* 80 */                if (file.isFile()) {
/* 86 */                    if (file.canRead()) {
/* 92 */                        if (file.canWrite()) {
/* 162 */                           throw ilOI0oi0oi1O.I00000oOI(file, e);
                                }
/* 162 */                       throw ilOI0oi0oi1O.I00000oOI(file, e);
                            }
/* 108 */                   if (file.canWrite()) {
/* 162 */                       throw ilOI0oi0oi1O.I00000oOI(file, e);
                            }
/* 162 */                   throw ilOI0oi0oi1O.I00000oOI(file, e);
                        }
/* 124 */               if (file.canRead()) {
/* 130 */                   if (file.canWrite()) {
/* 162 */                       throw ilOI0oi0oi1O.I00000oOI(file, e);
                            }
/* 162 */                   throw ilOI0oi0oi1O.I00000oOI(file, e);
                        }
/* 146 */               if (file.canWrite()) {
/* 162 */                   throw ilOI0oi0oi1O.I00000oOI(file, e);
                        }
/* 162 */               throw ilOI0oi0oi1O.I00000oOI(file, e);
                    }
                }
            }

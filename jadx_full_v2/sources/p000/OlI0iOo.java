            package p000;

            import android.content.Context;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.TensorBuffer;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OlI0iOo {
                public CompiledModel I00000oIO;
                public CompiledModel I00000oOI;
                public CompiledModel I0000Il00O;
                public OlI1Oi I0000O;

                public static void I00000oIO(List list) {
/* 3 */             Iterator it = list.iterator();
/* 11 */            while (it.hasNext()) {
                        try {
/* 19 */                    ((TensorBuffer) it.next()).close();
                        } catch (Throwable th) {
/* 24 */                    lIoii1l01l0i.I00000oIO(th);
                        }
                    }
                }

                public final void I00000oOI() {
                    try {
/* 1 */                 CompiledModel compiledModel = this.I00000oIO;
/* 3 */                 if (compiledModel != null) {
/* 5 */                     compiledModel.close();
                        }
                    } catch (Throwable th) {
/* 10 */                lIoii1l01l0i.I00000oIO(th);
                    }
                    try {
/* 13 */                CompiledModel compiledModel2 = this.I00000oOI;
/* 15 */                if (compiledModel2 != null) {
/* 17 */                    compiledModel2.close();
                        }
                    } catch (Throwable th2) {
/* 22 */                lIoii1l01l0i.I00000oIO(th2);
                    }
                    try {
/* 25 */                CompiledModel compiledModel3 = this.I0000Il00O;
/* 27 */                if (compiledModel3 != null) {
/* 29 */                    compiledModel3.close();
                        }
                    } catch (Throwable th3) {
/* 34 */                lIoii1l01l0i.I00000oIO(th3);
                    }
/* 38 */            this.I00000oIO = null;
/* 40 */            this.I00000oOI = null;
/* 42 */            this.I0000Il00O = null;
/* 44 */            this.I0000O = null;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(String str, float f, long j, Context context, OlI1OOI1O olI1OOI1O, IOoilo iOoilo) throws Throwable {
                    OlI00oo10 olI00oo10;
/* 5 */             if (iOoilo instanceof OlI00oo10) {
/* 8 */                 olI00oo10 = (OlI00oo10) iOoilo;
/* 10 */                int i = olI00oo10.I00iiO;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    olI00oo10.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    olI00oo10 = new OlI00oo10(this, iOoilo);
                        }
                    }
/* 27 */            Object objI0000oI00 = olI00oo10.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = olI00oo10.I00iiO;
/* 34 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 52 */                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 66 */                OlI01II0 olI01II0 = new OlI01II0(this, str, f, olI1OOI1O, j, context, (IOoil1iiIilo) null);
/* 69 */                olI00oo10.I00iiO = 1;
/* 71 */                objI0000oI00 = iOi1II01i0.I0000oI00(iiI0oillOO10, olI01II0, olI00oo10);
/* 75 */                if (objI0000oI00 == ii0111o) {
/* 77 */                    return ii0111o;
                        }
                    } else {
/* 36 */                if (i2 != 1) {
/* 44 */                    I000II.I001IO000("call to 'resume' before 'invoke' with coroutine");
/* 47 */                    return null;
                        }
/* 38 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
                    }
/* 685 */           return objI0000oI00;
                }
            }

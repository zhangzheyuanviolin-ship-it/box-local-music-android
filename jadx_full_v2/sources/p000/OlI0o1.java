            package p000;

            import android.content.Context;
            import com.google.ai.edge.litert.CompiledModel;
            import com.google.ai.edge.litert.TensorBuffer;
            import com.google.mlkit.vision.barcode.common.Barcode;
            import java.util.Iterator;
            import java.util.List;
            
            public final class OlI0o1 {
                public final int I00000oIO;
                public final int I00000oOI;
                public final int I0000Il00O;
                public final int I0000O;
                public final int I0000oI00;
                public CompiledModel I0001Ioi1lo;
                public CompiledModel I000II;
                public CompiledModel I000O01llI0;
                public o00io0IiOOo0 I000OOo1O;

                public OlI0o1(int i) {
/* 4 */             this.I00000oIO = i;
/* 8 */             this.I00000oOI = i * Barcode.FORMAT_QR_CODE;
/* 12 */            this.I0000Il00O = i * 257;
/* 14 */            int i2 = i * Barcode.FORMAT_AZTEC;
/* 16 */            this.I0000O = i2;
/* 22 */            this.I0000oI00 = i2 / 44100;
                }

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
/* 1 */                 CompiledModel compiledModel = this.I0001Ioi1lo;
/* 3 */                 if (compiledModel != null) {
/* 5 */                     compiledModel.close();
                        }
                    } catch (Throwable th) {
/* 10 */                lIoii1l01l0i.I00000oIO(th);
                    }
                    try {
/* 13 */                CompiledModel compiledModel2 = this.I000II;
/* 15 */                if (compiledModel2 != null) {
/* 17 */                    compiledModel2.close();
                        }
                    } catch (Throwable th2) {
/* 22 */                lIoii1l01l0i.I00000oIO(th2);
                    }
                    try {
/* 25 */                CompiledModel compiledModel3 = this.I000O01llI0;
/* 27 */                if (compiledModel3 != null) {
/* 29 */                    compiledModel3.close();
                        }
                    } catch (Throwable th3) {
/* 34 */                lIoii1l01l0i.I00000oIO(th3);
                    }
/* 38 */            this.I0001Ioi1lo = null;
/* 40 */            this.I000II = null;
/* 42 */            this.I000O01llI0 = null;
/* 44 */            this.I000OOo1O = null;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object I0000Il00O(String str, float f, long j, Context context, OlI11I0 olI11I0, IOoilo iOoilo) throws Throwable {
                    OlI0l1O11i olI0l1O11i;
/* 5 */             if (iOoilo instanceof OlI0l1O11i) {
/* 8 */                 olI0l1O11i = (OlI0l1O11i) iOoilo;
/* 10 */                int i = olI0l1O11i.I00iiO;
/* 16 */                if ((i & Integer.MIN_VALUE) != 0) {
/* 19 */                    olI0l1O11i.I00iiO = i - Integer.MIN_VALUE;
                        } else {
/* 24 */                    olI0l1O11i = new OlI0l1O11i(this, iOoilo);
                        }
                    }
/* 27 */            Object objI0000oI00 = olI0l1O11i.I00iOIl;
/* 29 */            Ii0111o ii0111o = Ii0111o.I00iOIl;
/* 31 */            int i2 = olI0l1O11i.I00iiO;
/* 34 */            if (i2 == 0) {
/* 49 */                lIoii1l01l0i.I00000oOI(objI0000oI00);
/* 52 */                IiI0oillOO10 iiI0oillOO10 = IiiIil1lOIO.I00000oIO;
/* 66 */                OlI01II0 olI01II0 = new OlI01II0(this, str, olI11I0, j, f, context, (IOoil1iiIilo) null);
/* 69 */                olI0l1O11i.I00iiO = 1;
/* 71 */                objI0000oI00 = iOi1II01i0.I0000oI00(iiI0oillOO10, olI01II0, olI0l1O11i);
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

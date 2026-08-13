            package p000;

            import android.os.Binder;
            import android.os.Process;
            import com.google.mlkit.acceleration.internal.MiniBenchmarkWorker;
            import com.google.mlkit.vision.pose.PoseLandmark;
            import java.lang.invoke.VarHandle;
            import java.util.HashMap;
            import java.util.List;
            import java.util.concurrent.Callable;
            import java.util.concurrent.atomic.AtomicBoolean;
            
            public final class Io11llo0i implements Callable {
                public final int I00000oIO;
                public Object I00000oOI;

                public Io11llo0i(int i) {
/* 1 */             this.I00000oIO = i;
                }

                @Override
                public final Object call() {
/* 3 */             boolean z = true;
/* 3 */             char c = 1;
/* 4 */             List listI0000Il00O = null;
                    switch (this.I00000oIO) {
                        case 0:
/* 402 */                   ((Runnable) this.I00000oOI).run();
/* 4 */                     return null;
                        case 1:
/* 351 */                   I1OoI1 i1OoI1 = (I1OoI1) this.I00000oOI;
/* 353 */                   AtomicBoolean atomicBoolean = i1OoI1.I00iio;
/* 357 */                   i1OoI1.I00ilI0I1.set(true);
                            try {
/* 362 */                       Process.setThreadPriority(10);
                                try {
/* 367 */                           listI0000Il00O = i1OoI1.I00io1l.I0000Il00O();
                                } catch (OIiOolI10lO0 e) {
/* 377 */                           if (!atomicBoolean.get()) {
/* 388 */                               throw e;
                                    }
                                }
/* 379 */                       Binder.flushPendingCommands();
/* 385 */                       return listI0000Il00O;
                            } finally {
                            }
                        case 2:
/* 344 */                   return O0oO1lOOo1.I0000Il00O.I00000oIO(((i1Iio0Ol) this.I00000oOI).I000II);
                        case 3:
/* 331 */                   return O0oO1lOOo1.I0000Il00O.I00000oIO(((i1OlIi1OoI0) this.I00000oOI).I000II);
                        case 4:
/* 318 */                   return O0oO1lOOo1.I0000Il00O.I00000oIO(((iOiooiO) this.I00000oOI).I000II);
                        case 5:
/* 305 */                   return O0oO1lOOo1.I0000Il00O.I00000oIO(((iOllO10O) this.I00000oOI).I000II);
                        case 6:
/* 222 */                   iii1IIii iii1iiii = ((l0l1ol11) this.I00000oOI).I00ll1;
/* 226 */                   int i = 2;
/* 227 */                   l1oo00Iio10 l1oo00iio10 = new l1oo00Iio10("internal.logger", i);
/* 230 */                   l1oo00iio10.I00iio = iii1iiii;
/* 232 */                   HashMap map = l1oo00iio10.I00iiI;
/* 242 */                   map.put("log", new lo00lI0lOol(l1oo00iio10, false, true));
/* 252 */                   map.put("silent", new lOiIIOo("silent", c == true ? 1 : 0));
/* 266 */                   ((iIIoIiOoOoiO) map.get("silent")).I0000oI00("log", new lo00lI0lOol(l1oo00iio10, true, true));
/* 276 */                   map.put("unmonitored", new lOiIIOo("unmonitored", i));
/* 290 */                   ((iIIoIiOoOoiO) map.get("unmonitored")).I0000oI00("log", new lo00lI0lOol(l1oo00iio10, false, false));
/* 293 */                   VarHandle.storeStoreFence();
/* 296 */                   return l1oo00iio10;
                        case 7:
/* 195 */                   lilOOl0 lilool0 = ((l1Oli1l) this.I00000oOI).I000II;
/* 197 */                   lilool0.I00OI1();
/* 200 */                   l0I1IOo l0i1ioo = lilool0.I00ioIO;
/* 202 */                   lilOOl0.I00O0o1oo(l0i1ioo);
/* 205 */                   l0i1ioo.I010II();
/* 215 */                   throw new IllegalStateException("Unexpected call on client side");
                        case 8:
/* 186 */                   return O0oO1lOOo1.I0000Il00O.I00000oIO(((lOI00Ii101I0) this.I00000oOI).I000II);
                        case 9:
/* 173 */                   return O0oO1lOOo1.I0000Il00O.I00000oIO(((li10lI1) this.I00000oOI).I000II);
                        case 10:
/* 160 */                   return O0oO1lOOo1.I0000Il00O.I00000oIO(((lo0iO1OO) this.I00000oOI).I000II);
                        case 11:
/* 147 */                   return O0oO1lOOo1.I0000Il00O.I00000oIO(((lo101i) this.I00000oOI).I00000oIO);
                        case 12:
/* 134 */                   return O0oO1lOOo1.I0000Il00O.I00000oIO(((loOiOoIi) this.I00000oOI).I000II);
                        case 13:
/* 121 */                   return O0oO1lOOo1.I0000Il00O.I00000oIO(((loi1ool) this.I00000oOI).I000II);
                        case 14:
/* 108 */                   return O0oO1lOOo1.I0000Il00O.I00000oIO(((loiI0oIOO) this.I00000oOI).I000II);
                        case 15:
/* 95 */                    return O0oO1lOOo1.I0000Il00O.I00000oIO(((loloOlli1l0) this.I00000oOI).I000II);
                        case 16:
/* 82 */                    return MiniBenchmarkWorker.zza((MiniBenchmarkWorker) this.I00000oOI);
                        case 17:
/* 62 */                    OoIOol ooIOol = (OoIOol) this.I00000oOI;
                            synchronized (((loilO0l) ooIOol.I00iiO).I000II) {
/* 71 */                        ooIOol.I00iiI = null;
                            }
/* 4 */                     return null;
                        case PoseLandmark.RIGHT_PINKY:
/* 55 */                    return O0oO1lOOo1.I0000Il00O.I00000oIO(((o0OIl1o1i0Oi) this.I00000oOI).I000II);
                        case PoseLandmark.LEFT_INDEX:
/* 42 */                    return O0oO1lOOo1.I0000Il00O.I00000oIO(((o0OiOio) this.I00000oOI).I000II);
                        case PoseLandmark.RIGHT_INDEX:
/* 29 */                    return O0oO1lOOo1.I0000Il00O.I00000oIO(((i1IOoI) this.I00000oOI).I000II);
                        default:
/* 16 */                    return O0oO1lOOo1.I0000Il00O.I00000oIO(((i1IOoOl) this.I00000oOI).I000II);
                    }
                }
            }

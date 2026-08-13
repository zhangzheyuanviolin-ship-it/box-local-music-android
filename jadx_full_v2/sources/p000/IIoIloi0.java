            package p000;

            import android.app.Application;
            import android.content.ComponentCallbacks2;
            import android.content.ComponentName;
            import android.content.Context;
            import android.content.ContextWrapper;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.util.SparseArray;
            import androidx.camera.core.impl.MetadataHolderService;
            import com.google.common.util.concurrent.ListenableFuture;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.InvocationTargetException;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedHashMap;
            import java.util.Objects;
            import java.util.concurrent.CopyOnWriteArrayList;
            import java.util.concurrent.CopyOnWriteArraySet;
            import java.util.concurrent.Executor;
            import java.util.concurrent.ScheduledThreadPoolExecutor;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.atomic.AtomicBoolean;
            import java.util.concurrent.atomic.AtomicReference;
            
            public final class IIoIloi0 {
                public static final Object I0010o = new Object();
                public static final SparseArray I00111O = new SparseArray();
                public final IIo0ii1Oi I00000oIO;
                public final Object I00000oOI;
                public final IIoO11o I0000Il00O;
                public final Executor I0000O;
                public final Handler I0000oI00;
                public final HandlerThread I0001Ioi1lo;
                public IIlOoolol0ll I000II;
                public IIoI00I00I I000O01llI0;
                public IIoIi0iI I000OOo1O;
                public OlOO1i11110 I000OiO;
                public OillOo0 I000iOII;
                public final Oi110Iil1i0 I000l1;
                public final IIiOiI0il I000lI;
                public final IIo0IOlilI I000o00OoI0I;
                public final OllO00oiil I000oI1ioi;
                public int I00100l0;
                public ListenableFuture I00100o1O0lo;
                public final Integer I0010I0i;

                /* JADX WARN: Code restructure failed: missing block: B:109:0x02b1, code lost:
                
                    r6 = r10;
                    r10 = r3;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public IIoIloi0(Context context, O0oOlo1O1I o0oOlo1O1I) {
                    ComponentCallbacks2 componentCallbacks2;
                    IIoO01Olioll iIoO01Olioll;
                    String string;
                    Bundle bundle;
                    int i;
                    Oi110Iil1i0 oo11iIll;
                    IIiOiI0il iIiOiI0ilI00000oIO;
/* 6 */             IIo0ii1Oi iIo0ii1Oi = new IIo0ii1Oi();
/* 14 */            iIo0ii1Oi.I00000oIO = new Object();
/* 21 */            iIo0ii1Oi.I00000oOI = new LinkedHashMap();
/* 28 */            iIo0ii1Oi.I0000Il00O = new HashSet();
/* 30 */            VarHandle.storeStoreFence();
/* 33 */            this.I00000oIO = iIo0ii1Oi;
/* 40 */            this.I00000oOI = new Object();
/* 42 */            boolean z = true;
/* 43 */            this.I00100l0 = 1;
/* 47 */            this.I00100o1O0lo = Ioil1IIo.I00iiO;
/* 49 */            Context contextI00000oIO = IOoiioOI.I00000oIO(context);
/* 55 */            Context applicationContext = context.getApplicationContext();
                    while (true) {
/* 62 */                if (!(applicationContext instanceof ContextWrapper)) {
/* 78 */                    componentCallbacks2 = null;
                            break;
                        } else {
/* 66 */                    if (applicationContext instanceof Application) {
/* 68 */                        componentCallbacks2 = (Application) applicationContext;
                                break;
                            }
/* 73 */                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                        }
                    }
/* 83 */            if (componentCallbacks2 instanceof IIoO01Olioll) {
/* 85 */                iIoO01Olioll = (IIoO01Olioll) componentCallbacks2;
                    } else {
                        try {
/* 88 */                    Context contextI00000oIO2 = IOoiioOI.I00000oIO(context);
/* 107 */                   Bundle bundle2 = contextI00000oIO2.getPackageManager().getServiceInfo(new ComponentName(contextI00000oIO2, (Class<?>) MetadataHolderService.class), 640).metaData;
/* 120 */                   string = bundle2 != null ? bundle2.getString("androidx.camera.core.impl.MetadataHolderService.DEFAULT_CONFIG_PROVIDER") : null;
                        } catch (PackageManager.NameNotFoundException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | NullPointerException | InvocationTargetException e) {
/* 148 */                   l11I11lO.I00000oOI("CameraX", "Failed to retrieve default CameraXConfig.Provider from meta-data", e);
                        }
/* 121 */               if (string == null) {
/* 125 */                   l11I11lO.I00000oIO("CameraX", "No default CameraXConfig.Provider specified in meta-data. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
/* 128 */                   iIoO01Olioll = null;
                        } else {
/* 143 */                   iIoO01Olioll = (IIoO01Olioll) Class.forName(string).getDeclaredConstructor(null).newInstance(null);
                        }
                    }
/* 152 */           if (iIoO01Olioll == null) {
/* 700 */               I000II.I001IO000("CameraX is not configured properly. The most likely cause is you did not include a default implementation in your build such as 'camera-camera2'.");
/* 703 */               throw null;
                    }
/* 154 */           IIoO11o cameraXConfig = iIoO01Olioll.getCameraXConfig();
/* 158 */           this.I0000Il00O = cameraXConfig;
/* 168 */           OOil00Iill oOil00IillI00000oIO = (OOil00Iill) cameraXConfig.I00iOIl.I00000oOI(IIoO11o.I00li1OI, null);
/* 171 */           if (oOil00IillI00000oIO != null) {
/* 175 */               oOil00IillI00000oIO.toString();
/* 178 */               l11I11lO.I0000O(3, "CameraX");
                    } else {
                        try {
/* 199 */                   bundle = contextI00000oIO.getPackageManager().getServiceInfo(new ComponentName(contextI00000oIO, (Class<?>) OOil0l1oIili.class), 640).metaData;
                        } catch (PackageManager.NameNotFoundException unused) {
/* 215 */                   l11I11lO.I0000O(3, "QuirkSettingsLoader");
                        }
/* 201 */               if (bundle == null) {
/* 205 */                   l11I11lO.I0000oI00("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
/* 208 */                   oOil00IillI00000oIO = null;
/* 221 */                   Objects.toString(oOil00IillI00000oIO);
/* 224 */                   l11I11lO.I0000O(3, "CameraX");
                        } else {
/* 210 */                   oOil00IillI00000oIO = lIiO1o1Ol1l.I00000oIO(contextI00000oIO, bundle);
/* 221 */                   Objects.toString(oOil00IillI00000oIO);
/* 224 */                   l11I11lO.I0000O(3, "CameraX");
                        }
                    }
/* 227 */           if (oOil00IillI00000oIO == null) {
/* 229 */               oOil00IillI00000oIO = OOil0O0OoI.I00000oOI;
/* 233 */               Objects.toString(oOil00IillI00000oIO);
/* 236 */               l11I11lO.I0000O(3, "CameraX");
                    }
/* 241 */           OI10llOi oI10llOi = OOil0O0OoI.I0000Il00O.I00000oIO;
                    synchronized (oI10llOi.I00iiO) {
                        try {
/* 258 */                   i = 0;
/* 259 */                   if (!Objects.equals(((AtomicReference) oI10llOi.I00iio).getAndSet(oOil00IillI00000oIO), oOil00IillI00000oIO)) {
/* 268 */                       int i2 = oI10llOi.I00iOIl + 1;
/* 269 */                       oI10llOi.I00iOIl = i2;
/* 273 */                       if (!oI10llOi.I00iiI) {
/* 277 */                           oI10llOi.I00iiI = true;
/* 283 */                           Iterator it = ((CopyOnWriteArraySet) oI10llOi.I00ilO0).iterator();
                                    while (true) {
/* 292 */                               if (it.hasNext()) {
/* 300 */                                   ((OlO1IoO) it.next()).I00000oIO(i2);
                                        } else {
                                            synchronized (oI10llOi.I00iiO) {
/* 309 */                                       if (oI10llOi.I00iOIl == i2) {
                                                    break;
                                                }
/* 683 */                                       Iterator it2 = ((CopyOnWriteArraySet) oI10llOi.I00ilO0).iterator();
/* 687 */                                       int i3 = oI10llOi.I00iOIl;
                                            }
                                        }
                                    }
/* 311 */                           oI10llOi.I00iiI = false;
                                }
                            }
                        } finally {
                        }
                    }
/* 324 */           Executor executor = (Executor) this.I0000Il00O.I00iOIl.I00000oOI(IIoO11o.I00ilI0I1, null);
/* 336 */           Handler handlerCreateAsync = (Handler) this.I0000Il00O.I00iOIl.I00000oOI(IIoO11o.I00ilO0, null);
                    Executor executor2 = executor;
/* 338 */           if (executor == null) {
/* 342 */               IIlOool iIlOool = new IIlOool();
/* 350 */               iIlOool.I00iOIl = new Object();
/* 356 */               ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, IIlOool.I00iiO);
/* 363 */               scheduledThreadPoolExecutor.setKeepAliveTime(0L, TimeUnit.MILLISECONDS);
/* 371 */               scheduledThreadPoolExecutor.setRejectedExecutionHandler(new IIlOo0Io());
/* 374 */               iIlOool.I00iiI = scheduledThreadPoolExecutor;
/* 376 */               VarHandle.storeStoreFence();
                        executor2 = iIlOool;
                    }
/* 379 */           this.I0000O = executor2;
/* 381 */           if (handlerCreateAsync == null) {
/* 389 */               HandlerThread handlerThread = new HandlerThread("CameraX-scheduler", 10);
/* 392 */               this.I0001Ioi1lo = handlerThread;
/* 394 */               handlerThread.start();
/* 401 */               handlerCreateAsync = Handler.createAsync(handlerThread.getLooper());
/* 405 */               this.I0000oI00 = handlerCreateAsync;
                    } else {
/* 408 */               this.I0001Ioi1lo = null;
/* 410 */               this.I0000oI00 = handlerCreateAsync;
                    }
/* 420 */           Integer num = (Integer) this.I0000Il00O.I00000oOI(IIoO11o.I00io1l, null);
/* 422 */           this.I0010I0i = num;
                    synchronized (I0010o) {
                        try {
/* 427 */                   if (num != null) {
/* 441 */                       lII1OI11o1I.I0000Il00O(num.intValue(), 3, 6, "minLogLevel");
/* 444 */                       SparseArray sparseArray = I00111O;
/* 481 */                       sparseArray.put(num.intValue(), Integer.valueOf(sparseArray.get(num.intValue()) != null ? ((Integer) sparseArray.get(num.intValue())).intValue() + 1 : 1));
/* 484 */                       I00000oOI();
                            }
                        } finally {
                        }
                    }
/* 500 */           Oi110Iil1i0 oi110Iil1i0 = (Oi110Iil1i0) this.I0000Il00O.I00iOIl.I00000oOI(IIoO11o.I00l0OO0IO, Oi110Iil1i0.I00000oIO);
/* 502 */           Objects.requireNonNull(oi110Iil1i0);
/* 505 */           long jI00000oIO = oi110Iil1i0.I00000oIO();
/* 511 */           if (oi110Iil1i0 instanceof IIo0OOl) {
                        switch (((IIo0OOl) oi110Iil1i0).I00000oOI) {
                            case 0:
/* 528 */                       oo11iIll = new IIo0OOl(0, jI00000oIO);
                                break;
                            default:
/* 522 */                       oo11iIll = new IIo0OOl(1, jI00000oIO);
                                break;
                        }
                    } else {
/* 534 */               oo11iIll = new Oo11iIll(jI00000oIO, oi110Iil1i0);
                    }
/* 538 */           this.I000l1 = oo11iIll;
/* 544 */           Io11oioo io11oioo = new Io11oioo(handlerCreateAsync);
/* 547 */           IIo0IOlilI iIo0IOlilI = new IIo0IOlilI();
/* 550 */           iIo0IOlilI.I00000oIO = executor2;
/* 552 */           iIo0IOlilI.I00000oOI = io11oioo;
/* 559 */           iIo0IOlilI.I0000Il00O = new Object();
/* 566 */           iIo0IOlilI.I0000O = new Object();
/* 570 */           IIo01iOo iIo01iOo = new IIo01iOo(i);
/* 573 */           iIo01iOo.I00000oOI = iIo0IOlilI;
/* 575 */           VarHandle.storeStoreFence();
/* 578 */           iIo0IOlilI.I000OiO = iIo01iOo;
/* 582 */           iIo0IOlilI.I000iOII = Il01100l.I00iOIl;
/* 589 */           iIo0IOlilI.I000l1 = new AtomicBoolean(false);
/* 596 */           iIo0IOlilI.I000lI = new CopyOnWriteArrayList();
/* 603 */           iIo0IOlilI.I000o00OoI0I = new CopyOnWriteArrayList();
/* 610 */           iIo0IOlilI.I000oI1ioi = new LinkedHashMap();
/* 612 */           VarHandle.storeStoreFence();
/* 615 */           this.I000o00OoI0I = iIo0IOlilI;
/* 620 */           I000OOo1O i000OOo1O = new I000OOo1O(7);
/* 623 */           i000OOo1O.I00iiI = contextI00000oIO;
/* 625 */           VarHandle.storeStoreFence();
/* 633 */           this.I000oI1ioi = new OllO00oiil(i000OOo1O);
                    synchronized (this.I00000oOI) {
/* 640 */               if (this.I00100l0 != 1) {
/* 643 */                   z = false;
                        }
/* 646 */               lII1OI11o1I.I0000oI00("CameraX.initInternal() should only be called once per instance", z);
/* 650 */               this.I00100l0 = 2;
/* 654 */               IIoIil iIoIil = new IIoIil(i);
/* 657 */               iIoIil.I00iiI = this;
/* 659 */               iIoIil.I00iiO = contextI00000oIO;
/* 661 */               VarHandle.storeStoreFence();
/* 664 */               iIiOiI0ilI00000oIO = iOiiloIII0O.I00000oIO(iIoIil);
                    }
/* 669 */           this.I000lI = iIiOiI0ilI00000oIO;
                }

                public static void I00000oIO(Integer num) {
                    synchronized (I0010o) {
                        try {
/* 4 */                     if (num == null) {
/* 7 */                         return;
                            }
/* 10 */                    SparseArray sparseArray = I00111O;
                            int iIntValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
/* 28 */                    if (iIntValue == 0) {
/* 34 */                        sparseArray.remove(num.intValue());
                            } else {
/* 46 */                        sparseArray.put(num.intValue(), Integer.valueOf(iIntValue));
                            }
/* 49 */                    I00000oOI();
                        } catch (Throwable th) {
/* 77 */                    throw th;
                        }
                    }
                }

                public static void I00000oOI() {
/* 1 */             SparseArray sparseArray = I00111O;
/* 8 */             if (sparseArray.size() == 0) {
/* 10 */                l11I11lO.I00000oIO = 3;
/* 12 */                return;
                    }
/* 17 */            if (sparseArray.get(3) != null) {
/* 19 */                l11I11lO.I00000oIO = 3;
/* 21 */                return;
                    }
/* 27 */            if (sparseArray.get(4) != null) {
/* 29 */                l11I11lO.I00000oIO = 4;
                    } else if (sparseArray.get(5) != null) {
/* 39 */                l11I11lO.I00000oIO = 5;
                    } else if (sparseArray.get(6) != null) {
/* 49 */                l11I11lO.I00000oIO = 6;
                    }
                }
            }

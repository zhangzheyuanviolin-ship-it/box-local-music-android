            package p000;

            import android.app.Activity;
            import android.content.Context;
            import android.os.IBinder;
            import android.view.Window;
            import android.view.WindowManager;
            import androidx.window.layout.adapter.sidecar.DistinctElementSidecarCallback;
            import androidx.window.layout.adapter.sidecar.SidecarCompat$TranslatingCallback;
            import androidx.window.sidecar.SidecarDeviceState;
            import androidx.window.sidecar.SidecarDisplayFeature;
            import androidx.window.sidecar.SidecarInterface;
            import androidx.window.sidecar.SidecarWindowLayoutInfo;
            import java.lang.invoke.VarHandle;
            import java.lang.reflect.Method;
            import java.util.ArrayList;
            import java.util.LinkedHashMap;
            import java.util.List;
            import java.util.WeakHashMap;
            import java.util.concurrent.locks.ReentrantLock;
            
            public final class Ol0I0o1OI1i {
                public final SidecarInterface I00000oIO;
                public final Ol01ol0 I00000oOI;
                public final LinkedHashMap I0000Il00O;
                public final LinkedHashMap I0000O;
                public IoIlOo1o0IIl I0000oI00;

                public Ol0I0o1OI1i(Context context) {
/* 1 */             SidecarInterface sidecarInterfaceI00000oIO = Ol0I000O1i1.I00000oIO(context);
/* 7 */             OooO0Io1i oooO0Io1i = OooO0Io1i.I00iOIl;
/* 9 */             Ol01ol0 ol01ol0 = new Ol01ol0();
/* 12 */            ol01ol0.I00000oIO = oooO0Io1i;
/* 14 */            VarHandle.storeStoreFence();
/* 20 */            this.I00000oIO = sidecarInterfaceI00000oIO;
/* 22 */            this.I00000oOI = ol01ol0;
/* 29 */            this.I0000Il00O = new LinkedHashMap();
/* 36 */            this.I0000O = new LinkedHashMap();
                }

                public final i00lliOilOo I00000oIO(Activity activity) {
                    SidecarDeviceState sidecarDeviceState;
                    WindowManager.LayoutParams attributes;
/* 1 */             Window window = activity.getWindow();
/* 17 */            IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
/* 18 */            if (iBinder == null) {
/* 24 */                return new i00lliOilOo(Il01100l.I00iOIl);
                    }
/* 28 */            SidecarInterface sidecarInterface = this.I00000oIO;
/* 32 */            SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface != null ? sidecarInterface.getWindowLayoutInfo(iBinder) : null;
/* 36 */            SidecarInterface sidecarInterface2 = this.I00000oIO;
/* 38 */            if (sidecarInterface2 == null || (sidecarDeviceState = sidecarInterface2.getDeviceState()) == null) {
/* 48 */                sidecarDeviceState = new SidecarDeviceState();
                    }
/* 53 */            return this.I00000oOI.I0000Il00O(windowLayoutInfo, sidecarDeviceState);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I00000oOI(Activity activity) {
                    SidecarInterface sidecarInterface;
                    WindowManager.LayoutParams attributes;
/* 1 */             Window window = activity.getWindow();
/* 17 */            IBinder iBinder = (window == null || (attributes = window.getAttributes()) == null) ? null : attributes.token;
/* 18 */            if (iBinder == null) {
/* 168 */               return;
                    }
/* 21 */            SidecarInterface sidecarInterface2 = this.I00000oIO;
/* 23 */            if (sidecarInterface2 != null) {
/* 25 */                sidecarInterface2.onWindowLayoutChangeListenerRemoved(iBinder);
                    }
/* 28 */            LinkedHashMap linkedHashMap = this.I0000O;
/* 34 */            IOo1llI iOo1llI = (IOo1llI) linkedHashMap.get(activity);
/* 36 */            if (iOo1llI != null) {
/* 41 */                if (activity instanceof OIOoll110I0) {
/* 46 */                    ((OIOoll110I0) activity).I000OiO(iOo1llI);
                        }
/* 49 */                linkedHashMap.remove(activity);
                    }
/* 52 */            IoIlOo1o0IIl ioIlOo1o0IIl = this.I0000oI00;
/* 54 */            if (ioIlOo1o0IIl != null) {
/* 58 */                ReentrantLock reentrantLock = (ReentrantLock) ioIlOo1o0IIl.I00iiO;
/* 60 */                reentrantLock.lock();
                        try {
/* 67 */                    ((WeakHashMap) ioIlOo1o0IIl.I00iio).put(activity, null);
                        } finally {
/* 75 */                    reentrantLock.unlock();
                        }
                    }
/* 79 */            LinkedHashMap linkedHashMap2 = this.I0000Il00O;
/* 90 */            boolean z = linkedHashMap2.size() == 1;
/* 91 */            linkedHashMap2.remove(iBinder);
/* 94 */            if (!z || (sidecarInterface = this.I00000oIO) == null) {
/* 168 */               return;
                    }
/* 100 */           sidecarInterface.onDeviceStateListenersChanged(true);
                }

                /* JADX WARN: Multi-variable type inference failed */
                public final void I0000Il00O(IBinder iBinder, Activity activity) {
                    SidecarInterface sidecarInterface;
/* 1 */             LinkedHashMap linkedHashMap = this.I0000Il00O;
/* 3 */             linkedHashMap.put(iBinder, activity);
/* 6 */             SidecarInterface sidecarInterface2 = this.I00000oIO;
/* 8 */             if (sidecarInterface2 != null) {
/* 10 */                sidecarInterface2.onWindowLayoutChangeListenerAdded(iBinder);
                    }
/* 18 */            if (linkedHashMap.size() == 1 && (sidecarInterface = this.I00000oIO) != null) {
/* 25 */                sidecarInterface.onDeviceStateListenersChanged(false);
                    }
/* 28 */            IoIlOo1o0IIl ioIlOo1o0IIl = this.I0000oI00;
/* 30 */            if (ioIlOo1o0IIl != null) {
/* 36 */                ioIlOo1o0IIl.I00IO1oi11O(activity, I00000oIO(activity));
                    }
/* 39 */            LinkedHashMap linkedHashMap2 = this.I0000O;
/* 45 */            if (linkedHashMap2.get(activity) == null && (activity instanceof OIOoll110I0)) {
/* 54 */                IIoIIO iIoIIO = new IIoIIO(3);
/* 57 */                iIoIIO.I00000oOI = this;
/* 59 */                iIoIIO.I0000Il00O = activity;
/* 61 */                VarHandle.storeStoreFence();
/* 64 */                linkedHashMap2.put(activity, iIoIIO);
/* 69 */                ((OIOoll110I0) activity).I000OOo1O(iIoIIO);
                    }
                }

                public final void I0000O(iiOlilo0IIIl iiolilo0iiil) {
/* 6 */             IoIlOo1o0IIl ioIlOo1o0IIl = new IoIlOo1o0IIl(26, false);
/* 9 */             ioIlOo1o0IIl.I00iiI = iiolilo0iiil;
/* 16 */            ioIlOo1o0IIl.I00iiO = new ReentrantLock();
/* 23 */            ioIlOo1o0IIl.I00iio = new WeakHashMap();
/* 25 */            VarHandle.storeStoreFence();
/* 28 */            this.I0000oI00 = ioIlOo1o0IIl;
/* 30 */            SidecarInterface sidecarInterface = this.I00000oIO;
/* 32 */            if (sidecarInterface != null) {
/* 38 */                SidecarCompat$TranslatingCallback sidecarCompat$TranslatingCallback = new SidecarCompat$TranslatingCallback();
/* 41 */                sidecarCompat$TranslatingCallback.I00000oIO = this;
/* 43 */                VarHandle.storeStoreFence();
/* 48 */                DistinctElementSidecarCallback distinctElementSidecarCallback = new DistinctElementSidecarCallback();
/* 56 */                distinctElementSidecarCallback.I00000oIO = new Object();
/* 63 */                distinctElementSidecarCallback.I0000Il00O = new WeakHashMap();
/* 67 */                distinctElementSidecarCallback.I0000O = this.I00000oOI;
/* 69 */                distinctElementSidecarCallback.I0000oI00 = sidecarCompat$TranslatingCallback;
/* 71 */                VarHandle.storeStoreFence();
/* 76 */                sidecarInterface.setSidecarCallback(distinctElementSidecarCallback);
                    }
                }

                public final boolean I0000oI00() {
                    Class<?> cls;
                    Class<?> cls2;
                    Class<?> cls3;
                    Class<?> cls4;
                    try {
/* 9 */                 SidecarInterface sidecarInterface = this.I00000oIO;
/* 33 */                Method method = (sidecarInterface == null || (cls4 = sidecarInterface.getClass()) == null) ? null : cls4.getMethod("setSidecarCallback", SidecarInterface.SidecarCallback.class);
/* 41 */                Class<?> returnType = method != null ? method.getReturnType() : null;
/* 42 */                Class cls5 = Void.TYPE;
/* 48 */                if (!O0000Ioio00.I0000O(returnType, cls5)) {
/* 395 */                   throw new NoSuchMethodException("Illegal return type for 'setSidecarCallback': " + returnType);
                        }
/* 50 */                SidecarInterface sidecarInterface2 = this.I00000oIO;
/* 52 */                if (sidecarInterface2 != null) {
/* 54 */                    sidecarInterface2.getDeviceState();
                        }
/* 57 */                SidecarInterface sidecarInterface3 = this.I00000oIO;
/* 60 */                if (sidecarInterface3 != null) {
/* 62 */                    sidecarInterface3.onDeviceStateListenersChanged(true);
                        }
/* 65 */                SidecarInterface sidecarInterface4 = this.I00000oIO;
/* 88 */                Method method2 = (sidecarInterface4 == null || (cls3 = sidecarInterface4.getClass()) == null) ? null : cls3.getMethod("getWindowLayoutInfo", IBinder.class);
/* 96 */                Class<?> returnType2 = method2 != null ? method2.getReturnType() : null;
/* 103 */               if (!O0000Ioio00.I0000O(returnType2, SidecarWindowLayoutInfo.class)) {
/* 377 */                   throw new NoSuchMethodException("Illegal return type for 'getWindowLayoutInfo': " + returnType2);
                        }
/* 105 */               SidecarInterface sidecarInterface5 = this.I00000oIO;
/* 126 */               Method method3 = (sidecarInterface5 == null || (cls2 = sidecarInterface5.getClass()) == null) ? null : cls2.getMethod("onWindowLayoutChangeListenerAdded", IBinder.class);
/* 134 */               Class<?> returnType3 = method3 != null ? method3.getReturnType() : null;
/* 139 */               if (!O0000Ioio00.I0000O(returnType3, cls5)) {
/* 359 */                   throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerAdded': " + returnType3);
                        }
/* 141 */               SidecarInterface sidecarInterface6 = this.I00000oIO;
/* 162 */               Method method4 = (sidecarInterface6 == null || (cls = sidecarInterface6.getClass()) == null) ? null : cls.getMethod("onWindowLayoutChangeListenerRemoved", IBinder.class);
/* 170 */               Class<?> returnType4 = method4 != null ? method4.getReturnType() : null;
/* 175 */               if (!O0000Ioio00.I0000O(returnType4, cls5)) {
/* 341 */                   throw new NoSuchMethodException("Illegal return type for 'onWindowLayoutChangeListenerRemoved': " + returnType4);
                        }
/* 179 */               SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
                        try {
/* 183 */                   sidecarDeviceState.posture = 3;
                        } catch (NoSuchFieldError unused) {
/* 208 */                   SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, 3);
/* 229 */                   if (((Integer) SidecarDeviceState.class.getMethod("getPosture", null).invoke(sidecarDeviceState, null)).intValue() != 3) {
/* 323 */                       throw new Exception("Invalid device posture getter/setter");
                            }
                        }
/* 233 */               SidecarDisplayFeature sidecarDisplayFeature = new SidecarDisplayFeature();
/* 240 */               sidecarDisplayFeature.setRect(sidecarDisplayFeature.getRect());
/* 243 */               sidecarDisplayFeature.getType();
/* 246 */               sidecarDisplayFeature.setType(1);
/* 251 */               SidecarWindowLayoutInfo sidecarWindowLayoutInfo = new SidecarWindowLayoutInfo();
                        try {
/* 254 */                   List list = sidecarWindowLayoutInfo.displayFeatures;
/* 59 */                    return true;
                        } catch (NoSuchFieldError unused2) {
/* 260 */                   ArrayList arrayList = new ArrayList();
/* 263 */                   arrayList.add(sidecarDisplayFeature);
/* 284 */                   SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(sidecarWindowLayoutInfo, arrayList);
/* 305 */                   if (arrayList.equals((List) SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", null).invoke(sidecarWindowLayoutInfo, null))) {
/* 59 */                        return true;
                            }
/* 315 */                   throw new Exception("Invalid display feature getter/setter");
                        }
                    } catch (Throwable unused3) {
/* 396 */               return false;
                    }
                }
            }

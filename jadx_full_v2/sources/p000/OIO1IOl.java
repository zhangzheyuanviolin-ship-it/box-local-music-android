            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.Intent;
            import android.content.ServiceConnection;
            import android.content.pm.ResolveInfo;
            import android.content.pm.ServiceInfo;
            import android.os.DeadObjectException;
            import android.os.Handler;
            import android.os.HandlerThread;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Message;
            import android.os.RemoteException;
            import android.provider.Settings;
            import android.util.Log;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayDeque;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.List;
            import java.util.Map;
            import java.util.Objects;
            
            public final class OIO1IOl implements Handler.Callback, ServiceConnection {
                public final Context I00iOIl;
                public final Handler I00iiI;
                public final HashMap I00iiO = new HashMap();
                public HashSet I00iio = new HashSet();

                public OIO1IOl(Context context) {
/* 18 */            this.I00iOIl = context;
/* 24 */            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
/* 27 */            handlerThread.start();
/* 39 */            this.I00iiI = new Handler(handlerThread.getLooper(), this);
                }

                public final void I00000oIO(OIO1I11l oIO1I11l) {
                    boolean z;
/* 1 */             ArrayDeque arrayDeque = oIO1I11l.I0000O;
/* 3 */             ComponentName componentName = oIO1I11l.I00000oIO;
/* 12 */            if (Log.isLoggable("NotifManCompat", 3)) {
/* 14 */                Objects.toString(componentName);
/* 17 */                arrayDeque.size();
                    }
/* 24 */            if (arrayDeque.isEmpty()) {
/* 156 */               return;
                    }
/* 30 */            if (oIO1I11l.I00000oOI) {
/* 32 */                z = true;
                    } else {
/* 41 */                Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
/* 47 */                Context context = this.I00iOIl;
/* 49 */                boolean zBindService = context.bindService(component, this, 33);
/* 53 */                oIO1I11l.I00000oOI = zBindService;
/* 55 */                if (zBindService) {
/* 58 */                    oIO1I11l.I0000oI00 = 0;
                        } else {
/* 75 */                    Log.w("NotifManCompat", "Unable to bind to listener " + componentName);
/* 78 */                    context.unbindService(this);
                        }
/* 81 */                z = oIO1I11l.I00000oOI;
                    }
/* 83 */            if (!z || oIO1I11l.I0000Il00O == null) {
/* 157 */               I00000oOI(oIO1I11l);
/* 168 */               return;
                    }
                    while (true) {
/* 94 */                OIO11I1l oIO11I1l = (OIO11I1l) arrayDeque.peek();
/* 96 */                if (oIO11I1l == null) {
                            break;
                        }
                        try {
/* 103 */                   if (Log.isLoggable("NotifManCompat", 3)) {
/* 105 */                       oIO11I1l.toString();
                            }
/* 113 */                   oIO11I1l.I00000oIO(oIO1I11l.I0000Il00O);
/* 116 */                   arrayDeque.remove();
                        } catch (DeadObjectException unused) {
/* 142 */                   if (Log.isLoggable("NotifManCompat", 3)) {
/* 144 */                       Objects.toString(componentName);
                            }
                        } catch (RemoteException e) {
/* 134 */                   Log.w("NotifManCompat", "RemoteException communicating with " + componentName, e);
                        }
                    }
/* 151 */           if (arrayDeque.isEmpty()) {
/* 156 */               return;
                    }
/* 153 */           I00000oOI(oIO1I11l);
                }

                public final void I00000oOI(OIO1I11l oIO1I11l) {
/* 1 */             ComponentName componentName = oIO1I11l.I00000oIO;
/* 3 */             ArrayDeque arrayDeque = oIO1I11l.I0000O;
/* 5 */             Handler handler = this.I00iiI;
/* 12 */            if (handler.hasMessages(3, componentName)) {
/* 14 */                return;
                    }
/* 17 */            int i = oIO1I11l.I0000oI00 + 1;
/* 19 */            oIO1I11l.I0000oI00 = i;
/* 24 */            if (i <= 6) {
/* 78 */                Log.isLoggable("NotifManCompat", 3);
/* 86 */                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), (1 << r3) * 1000);
/* 168 */               return;
                    }
/* 67 */            Log.w("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + oIO1I11l.I0000oI00 + " retries");
/* 70 */            arrayDeque.clear();
                }

                @Override
                public final boolean handleMessage(Message message) {
                    HashSet hashSet;
/* 1 */             int i = message.what;
/* 3 */             IoOliO10o1I1 ioOliO10o1I1 = null;
/* 7 */             if (i == 0) {
/* 118 */               OIO11I1l oIO11I1l = (OIO11I1l) message.obj;
/* 128 */               String string = Settings.Secure.getString(this.I00iOIl.getContentResolver(), "enabled_notification_listeners");
                        synchronized (OIO1O1ill0.I00000oIO) {
/* 135 */                   if (string != null) {
                                try {
/* 143 */                           if (!string.equals(OIO1O1ill0.I00000oOI)) {
/* 148 */                               String[] strArrSplit = string.split(":", -1);
/* 155 */                               HashSet hashSet2 = new HashSet(strArrSplit.length);
/* 160 */                               for (String str : strArrSplit) {
/* 164 */                                   ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
/* 168 */                                   if (componentNameUnflattenFromString != null) {
/* 174 */                                       hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                            }
                                        }
/* 184 */                               OIO1O1ill0.I0000Il00O = hashSet2;
/* 186 */                               OIO1O1ill0.I00000oOI = string;
                                    }
                                } catch (Throwable th) {
/* 1261 */                          throw th;
                                }
                            }
/* 188 */                   hashSet = OIO1O1ill0.I0000Il00O;
                        }
/* 197 */               if (!hashSet.equals(this.I00iio)) {
/* 201 */                   this.I00iio = hashSet;
/* 220 */                   List<ResolveInfo> listQueryIntentServices = this.I00iOIl.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
/* 226 */                   HashSet hashSet3 = new HashSet();
/* 237 */                   for (ResolveInfo resolveInfo : listQueryIntentServices) {
/* 253 */                       if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
/* 258 */                           ServiceInfo serviceInfo = resolveInfo.serviceInfo;
/* 264 */                           ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
/* 271 */                           if (resolveInfo.serviceInfo.permission != null) {
/* 294 */                               Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                                    } else {
/* 298 */                               hashSet3.add(componentName);
                                    }
                                }
                            }
/* 302 */                   Iterator it = hashSet3.iterator();
/* 310 */                   while (it.hasNext()) {
/* 316 */                       ComponentName componentName2 = (ComponentName) it.next();
/* 324 */                       if (!this.I00iiO.containsKey(componentName2)) {
/* 332 */                           if (Log.isLoggable("NotifManCompat", 3)) {
/* 334 */                               Objects.toString(componentName2);
                                    }
/* 337 */                           HashMap map = this.I00iiO;
/* 341 */                           OIO1I11l oIO1I11l = new OIO1I11l();
/* 344 */                           oIO1I11l.I00000oOI = false;
/* 351 */                           oIO1I11l.I0000O = new ArrayDeque();
/* 353 */                           oIO1I11l.I0000oI00 = 0;
/* 355 */                           oIO1I11l.I00000oIO = componentName2;
/* 357 */                           VarHandle.storeStoreFence();
/* 360 */                           map.put(componentName2, oIO1I11l);
                                }
                            }
/* 370 */                   Iterator it2 = this.I00iiO.entrySet().iterator();
/* 378 */                   while (it2.hasNext()) {
/* 384 */                       Map.Entry entry = (Map.Entry) it2.next();
/* 394 */                       if (!hashSet3.contains(entry.getKey())) {
/* 402 */                           if (Log.isLoggable("NotifManCompat", 3)) {
/* 408 */                               Objects.toString(entry.getKey());
                                    }
/* 415 */                           OIO1I11l oIO1I11l2 = (OIO1I11l) entry.getValue();
/* 419 */                           if (oIO1I11l2.I00000oOI) {
/* 423 */                               this.I00iOIl.unbindService(this);
/* 426 */                               oIO1I11l2.I00000oOI = false;
                                    }
/* 428 */                           oIO1I11l2.I0000Il00O = null;
/* 430 */                           it2.remove();
                                }
                            }
                        }
/* 448 */               for (OIO1I11l oIO1I11l3 : this.I00iiO.values()) {
/* 458 */                   oIO1I11l3.I0000O.add(oIO11I1l);
/* 461 */                   I00000oIO(oIO1I11l3);
                        }
                    } else if (i == 1) {
/* 65 */                OIO11l0oil oIO11l0oil = (OIO11l0oil) message.obj;
/* 67 */                ComponentName componentName3 = oIO11l0oil.I00000oIO;
/* 69 */                IBinder iBinder = oIO11l0oil.I00000oOI;
/* 77 */                OIO1I11l oIO1I11l4 = (OIO1I11l) this.I00iiO.get(componentName3);
/* 79 */                if (oIO1I11l4 != null) {
/* 81 */                    int i2 = IoOli0lI.I000II;
/* 83 */                    if (iBinder != null) {
/* 88 */                        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IoOliO10o1I1.I0000O);
/* 92 */                        if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IoOliO10o1I1)) {
/* 103 */                           IoOlO0I ioOlO0I = new IoOlO0I();
/* 106 */                           ioOlO0I.I000II = iBinder;
                                    ioOliO10o1I1 = ioOlO0I;
                                } else {
/* 98 */                            ioOliO10o1I1 = (IoOliO10o1I1) iInterfaceQueryLocalInterface;
                                }
                            }
/* 108 */                   oIO1I11l4.I0000Il00O = ioOliO10o1I1;
/* 110 */                   oIO1I11l4.I0000oI00 = 0;
/* 112 */                   I00000oIO(oIO1I11l4);
/* 6 */                     return true;
                        }
                    } else if (i == 2) {
/* 45 */                OIO1I11l oIO1I11l5 = (OIO1I11l) this.I00iiO.get((ComponentName) message.obj);
/* 47 */                if (oIO1I11l5 != null) {
/* 51 */                    if (oIO1I11l5.I00000oOI) {
/* 55 */                        this.I00iOIl.unbindService(this);
/* 58 */                        oIO1I11l5.I00000oOI = false;
                            }
/* 60 */                    oIO1I11l5.I0000Il00O = null;
/* 6 */                     return true;
                        }
                    } else {
/* 14 */                if (i != 3) {
/* 5 */                     return false;
                        }
/* 27 */                OIO1I11l oIO1I11l6 = (OIO1I11l) this.I00iiO.get((ComponentName) message.obj);
/* 29 */                if (oIO1I11l6 != null) {
/* 31 */                    I00000oIO(oIO1I11l6);
/* 6 */                     return true;
                        }
                    }
/* 6 */             return true;
                }

                @Override
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 8 */             if (Log.isLoggable("NotifManCompat", 3)) {
/* 10 */                Objects.toString(componentName);
                    }
/* 15 */            OIO11l0oil oIO11l0oil = new OIO11l0oil();
/* 18 */            oIO11l0oil.I00000oIO = componentName;
/* 20 */            oIO11l0oil.I00000oOI = iBinder;
/* 22 */            VarHandle.storeStoreFence();
/* 32 */            this.I00iiI.obtainMessage(1, oIO11l0oil).sendToTarget();
                }

                @Override
                public final void onServiceDisconnected(ComponentName componentName) {
/* 8 */             if (Log.isLoggable("NotifManCompat", 3)) {
/* 10 */                Objects.toString(componentName);
                    }
/* 20 */            this.I00iiI.obtainMessage(2, componentName).sendToTarget();
                }
            }

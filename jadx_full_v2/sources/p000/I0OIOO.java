            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.os.Parcel;
            import android.os.RemoteException;
            import android.os.SystemClock;
            import android.util.Log;
            import java.io.IOException;
            import java.lang.invoke.VarHandle;
            import java.lang.ref.WeakReference;
            import java.util.HashMap;
            import java.util.concurrent.CountDownLatch;
            import java.util.concurrent.LinkedBlockingQueue;
            
            public final class I0OIOO {
                public II10OOiIOloI I00000oIO;
                public io0ooloI I00000oOI;
                public boolean I0000Il00O;
                public Object I0000O;
                public iOoO11OIlo0l I0000oI00;
                public Context I0001Ioi1lo;
                public long I000II;

                public static I0OIOIi1 I00000oIO(Context context) {
/* 3 */             I0OIOO i0oioo = new I0OIOO();
/* 11 */            i0oioo.I0000O = new Object();
/* 13 */            lII0I0I000I.I000II(context);
/* 16 */            Context applicationContext = context.getApplicationContext();
/* 20 */            if (applicationContext != null) {
/* 22 */                context = applicationContext;
                    }
/* 23 */            i0oioo.I0001Ioi1lo = context;
/* 26 */            i0oioo.I0000Il00O = false;
/* 30 */            i0oioo.I000II = -1L;
/* 32 */            VarHandle.storeStoreFence();
                    try {
/* 36 */                long jElapsedRealtime = SystemClock.elapsedRealtime();
/* 40 */                i0oioo.I0000Il00O();
/* 43 */                I0OIOIi1 i0OIOIi1I0000oI00 = i0oioo.I0000oI00();
/* 52 */                I0000O(i0OIOIi1I0000oI00, SystemClock.elapsedRealtime() - jElapsedRealtime, null);
/* 58 */                return i0OIOIi1I0000oI00;
                    } finally {
                    }
                }

                public static void I0000O(I0OIOIi1 i0OIOIi1, long j, Throwable th) {
/* 9 */             if (Math.random() <= 0.0d) {
/* 13 */                HashMap map = new HashMap();
/* 20 */                map.put("app_context", "1");
/* 23 */                if (i0OIOIi1 != null) {
/* 34 */                    map.put("limit_ad_tracking", true != i0OIOIi1.I00000oOI ? OIllioIilO.I01OO1I : "1");
/* 37 */                    String str = i0OIOIi1.I0000Il00O;
/* 39 */                    if (str != null) {
/* 51 */                        map.put("ad_id_size", Integer.toString(str.length()));
                            }
                        }
/* 54 */                if (th != null) {
/* 66 */                    map.put("error", th.getClass().getName());
                        }
/* 73 */                map.put("tag", "AdvertisingIdClient");
/* 82 */                map.put("time_spent", Long.toString(j));
/* 90 */                new i1IIil0oOOOl(map).start();
                    }
                }

                public final void I00000oOI() {
/* 3 */             lII0I0I000I.I0001Ioi1lo("Calling this from your main thread can lead to deadlock");
                    synchronized (this) {
                        try {
/* 9 */                     if (this.I0001Ioi1lo == null || this.I00000oIO == null) {
/* 53 */                        return;
                            }
                            try {
/* 18 */                        if (this.I0000Il00O) {
/* 28 */                            IOloio1Ili.I00000oOI().I0000Il00O(this.I0001Ioi1lo, this.I00000oIO);
                                }
                            } catch (Throwable th) {
/* 37 */                        Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                            }
/* 41 */                    this.I0000Il00O = false;
/* 44 */                    this.I00000oOI = null;
/* 46 */                    this.I00000oIO = null;
                        } catch (Throwable th2) {
/* 55 */                    throw th2;
                        }
                    }
                }

                public final void I0000Il00O() {
/* 3 */             lII0I0I000I.I0001Ioi1lo("Calling this from your main thread can lead to deadlock");
                    synchronized (this) {
                        try {
/* 9 */                     if (this.I0000Il00O) {
/* 11 */                        I00000oOI();
                            }
/* 18 */                    Context context = this.I0001Ioi1lo;
                            try {
/* 27 */                        context.getPackageManager().getPackageInfo("com.android.vending", 0);
/* 35 */                        int iI00000oOI = Io0iI1l01il.I00000oOI.I00000oOI(context, 12451000);
/* 39 */                        if (iI00000oOI != 0 && iI00000oOI != 2) {
/* 52 */                            throw new IOException("Google Play services not available");
                                }
/* 55 */                        II10OOiIOloI iI10OOiIOloI = new II10OOiIOloI();
/* 58 */                        iI10OOiIOloI.I00iOIl = false;
/* 65 */                        iI10OOiIOloI.I00iiI = new LinkedBlockingQueue();
/* 67 */                        VarHandle.storeStoreFence();
/* 74 */                        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
/* 79 */                        intent.setPackage("com.google.android.gms");
                                try {
/* 91 */                            if (!IOloio1Ili.I00000oOI().I00000oIO(context, intent, iI10OOiIOloI, 1)) {
/* 131 */                               throw new IOException("Connection failure");
                                    }
/* 93 */                            this.I00000oIO = iI10OOiIOloI;
                                    try {
/* 103 */                               this.I00000oOI = iliOioooi0.I00000oOI(iI10OOiIOloI.I00000oIO());
/* 105 */                               this.I0000Il00O = true;
                                    } catch (InterruptedException unused) {
/* 123 */                               throw new IOException("Interrupted exception");
                                    } catch (Throwable th) {
/* 115 */                               throw new IOException(th);
                                    }
                                } finally {
/* 135 */                           IOException iOException = new IOException(th);
                                }
                            } catch (PackageManager.NameNotFoundException unused2) {
/* 145 */                       throw new I1o1lOlooI1(3);
                            }
                        } catch (Throwable th2) {
/* 245 */                   throw th2;
                        }
                    }
                }

                public final I0OIOIi1 I0000oI00() {
                    I0OIOIi1 i0OIOIi1;
/* 3 */             lII0I0I000I.I0001Ioi1lo("Calling this from your main thread can lead to deadlock");
                    synchronized (this) {
                        try {
/* 9 */                     if (!this.I0000Il00O) {
                                synchronized (this.I0000O) {
/* 14 */                            iOoO11OIlo0l iooo11oilo0l = this.I0000oI00;
/* 16 */                            if (iooo11oilo0l == null || !iooo11oilo0l.I00iio) {
/* 60 */                                throw new IOException("AdvertisingIdClient is not connected.");
                                    }
                                }
                                try {
/* 23 */                            I0000Il00O();
/* 28 */                            if (!this.I0000Il00O) {
/* 38 */                                throw new IOException("AdvertisingIdClient cannot reconnect.");
                                    }
                                } catch (Exception e) {
/* 50 */                            throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                                }
                            }
/* 65 */                    lII0I0I000I.I000II(this.I00000oIO);
/* 70 */                    lII0I0I000I.I000II(this.I00000oOI);
                            try {
/* 77 */                        il1I0ii0 il1i0ii0 = (il1I0ii0) this.I00000oOI;
/* 79 */                        il1i0ii0.getClass();
/* 82 */                        Parcel parcelObtain = Parcel.obtain();
/* 88 */                        parcelObtain.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
/* 92 */                        Parcel parcelI00000oOI = il1i0ii0.I00000oOI(1, parcelObtain);
/* 96 */                        String string = parcelI00000oOI.readString();
/* 100 */                       parcelI00000oOI.recycle();
/* 105 */                       il1I0ii0 il1i0ii02 = (il1I0ii0) this.I00000oOI;
/* 107 */                       il1i0ii02.getClass();
/* 110 */                       Parcel parcelObtain2 = Parcel.obtain();
/* 116 */                       parcelObtain2.writeInterfaceToken("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
/* 119 */                       int i = iil1Ioi0ol0O.I00000oIO;
/* 121 */                       parcelObtain2.writeInt(1);
/* 125 */                       Parcel parcelI00000oOI2 = il1i0ii02.I00000oOI(2, parcelObtain2);
/* 138 */                       boolean z = parcelI00000oOI2.readInt() != 0;
/* 139 */                       parcelI00000oOI2.recycle();
/* 142 */                       i0OIOIi1 = new I0OIOIi1(0);
/* 145 */                       i0OIOIi1.I0000Il00O = string;
/* 147 */                       i0OIOIi1.I00000oOI = z;
/* 149 */                       VarHandle.storeStoreFence();
                            } catch (RemoteException e2) {
/* 221 */                       Log.i("AdvertisingIdClient", "GMS remote exception ", e2);
/* 231 */                       throw new IOException("Remote exception");
                            }
                        } catch (Throwable th) {
/* 245 */                   throw th;
                        }
                    }
                    synchronized (this.I0000O) {
/* 156 */               iOoO11OIlo0l iooo11oilo0l2 = this.I0000oI00;
/* 158 */               if (iooo11oilo0l2 != null) {
/* 162 */                   iooo11oilo0l2.I00iiO.countDown();
                            try {
/* 167 */                       this.I0000oI00.join();
                            } catch (InterruptedException unused) {
                            }
                        }
/* 173 */               long j = this.I000II;
/* 179 */               if (j > 0) {
/* 183 */                   iOoO11OIlo0l iooo11oilo0l3 = new iOoO11OIlo0l();
/* 191 */                   iooo11oilo0l3.I00iOIl = new WeakReference(this);
/* 193 */                   iooo11oilo0l3.I00iiI = j;
/* 200 */                   iooo11oilo0l3.I00iiO = new CountDownLatch(1);
/* 202 */                   iooo11oilo0l3.I00iio = false;
/* 204 */                   iooo11oilo0l3.start();
/* 207 */                   VarHandle.storeStoreFence();
/* 210 */                   this.I0000oI00 = iooo11oilo0l3;
                        }
                    }
/* 213 */           return i0OIOIi1;
                }

                public final void finalize() throws Throwable {
/* 1 */             I00000oOI();
/* 4 */             super.finalize();
                }
            }

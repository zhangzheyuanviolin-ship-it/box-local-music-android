            package p000;

            import android.accounts.Account;
            import android.content.AttributionSource;
            import android.content.Context;
            import android.os.Bundle;
            import android.os.DeadObjectException;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import android.util.Log;
            import com.google.android.gms.common.api.Scope;
            import java.lang.invoke.VarHandle;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicInteger;
            
            public abstract class I1oIol10O {
                public static final IlIII1l[] I001iOo1i0O = new IlIII1l[0];
                public I0OIOIi1 I00000oOI;
                public final Context I0000Il00O;
                public final ll0oOilllo I0000O;
                public final Io0iI1l01il I0000oI00;
                public final iOoO0iili I0001Ioi1lo;
                public i1IO0lo I000OOo1O;
                public I1oIloOoiO I000OiO;
                public IInterface I000iOII;
                public iliOiO1 I000lI;
                public final I1oIlIIIiOo0 I000oI1ioi;
                public final I1oIlOi11 I00100l0;
                public final int I00100o1O0lo;
                public final String I0010I0i;
                public volatile String I0010o;
                public volatile O1OIll00i I00111O;
                public volatile String I00000oIO = null;
                public final Object I000II = new Object();
                public final Object I000O01llI0 = new Object();
                public final ArrayList I000l1 = new ArrayList();
                public int I000o00OoI0I = 1;
                public IOlo10lO1iOl I001IIilI0O = null;
                public boolean I001IO000 = false;
                public volatile l1O1o0o10o I001i1O0Ol = null;
                public final AtomicInteger I001i1lo1io = new AtomicInteger(0);

                public I1oIol10O(Context context, Looper looper, ll0oOilllo ll0ooilllo, Io0iI1l01il io0iI1l01il, int i, I1oIlIIIiOo0 i1oIlIIIiOo0, I1oIlOi11 i1oIlOi11, String str) {
/* 47 */            lII0I0I000I.I000O01llI0("Context must not be null", context);
/* 50 */            this.I0000Il00O = context;
/* 54 */            lII0I0I000I.I000O01llI0("Looper must not be null", looper);
/* 59 */            lII0I0I000I.I000O01llI0("Supervisor must not be null", ll0ooilllo);
/* 62 */            this.I0000O = ll0ooilllo;
/* 66 */            lII0I0I000I.I000O01llI0("API availability must not be null", io0iI1l01il);
/* 69 */            this.I0000oI00 = io0iI1l01il;
/* 76 */            this.I0001Ioi1lo = new iOoO0iili(this, looper);
/* 78 */            this.I00100o1O0lo = i;
/* 80 */            this.I000oI1ioi = i1oIlIIIiOo0;
/* 82 */            this.I00100l0 = i1oIlOi11;
/* 84 */            this.I0010I0i = str;
                }

                public final void I00000oIO() {
/* 9 */             int iI00000oOI = this.I0000oI00.I00000oOI(this.I0000Il00O, I000OOo1O());
/* 14 */            if (iI00000oOI == 0) {
/* 48 */                iiOlilo0IIIl iiolilo0iiil = new iiOlilo0IIIl();
/* 51 */                iiolilo0iiil.I00iOIl = this;
/* 53 */                this.I000OiO = iiolilo0iiil;
/* 56 */                I001i1O0Ol(2, null);
/* 110 */               return;
                    }
/* 17 */            I001i1O0Ol(1, null);
/* 22 */            iiOlilo0IIIl iiolilo0iiil2 = new iiOlilo0IIIl();
/* 25 */            iiolilo0iiil2.I00iOIl = this;
/* 27 */            this.I000OiO = iiolilo0iiil2;
/* 31 */            int i = this.I001i1lo1io.get();
/* 36 */            iOoO0iili iooo0iili = this.I0001Ioi1lo;
/* 42 */            iooo0iili.sendMessage(iooo0iili.obtainMessage(3, i, iI00000oOI, null));
                }

                public abstract IInterface I00000oOI(IBinder iBinder);

                public final void I0000Il00O() {
/* 3 */             this.I001i1lo1io.incrementAndGet();
/* 6 */             ArrayList arrayList = this.I000l1;
                    synchronized (arrayList) {
                        try {
/* 9 */                     int size = arrayList.size();
/* 15 */                    for (int i = 0; i < size; i++) {
/* 21 */                        i1IIiIiiII i1iiiiiiii = (i1IIiIiiII) arrayList.get(i);
                                synchronized (i1iiiiiiii) {
/* 24 */                            i1iiiiiiii.I00000oIO = null;
                                }
                            }
/* 35 */                    arrayList.clear();
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
                    synchronized (this.I000O01llI0) {
/* 42 */                this.I000OOo1O = null;
                    }
/* 46 */            I001i1O0Ol(1, null);
                }

                public final void I0000O(String str) {
/* 1 */             this.I00000oIO = str;
/* 3 */             I0000Il00O();
                }

                public Account I0000oI00() {
/* 1 */             return null;
                }

                public IlIII1l[] I0001Ioi1lo() {
/* 1 */             return I001iOo1i0O;
                }

                public Executor I000II() {
/* 1 */             return null;
                }

                public Bundle I000O01llI0() {
/* 3 */             return new Bundle();
                }

                public abstract int I000OOo1O();

                /* JADX WARN: Multi-variable type inference failed */
                public final void I000OiO(IoOiO1o1oI ioOiO1o1oI, Set set) {
                    AttributionSource attributionSource;
/* 5 */             Bundle bundleI000O01llI0 = I000O01llI0();
/* 40 */            String attributionTag = (this.I00111O == null || (attributionSource = (AttributionSource) this.I00111O.I00iiI) == null || attributionSource.getAttributionTag() == null) ? this.I0010o : attributionSource.getAttributionTag();
/* 17 */            String str = attributionTag;
/* 45 */            int i = this.I00100o1O0lo;
/* 47 */            int i2 = Io0iI1l01il.I00000oIO;
/* 49 */            Scope[] scopeArr = Io0II1OlIo01.I00o0iI0io1;
/* 53 */            Bundle bundle = new Bundle();
/* 56 */            IlIII1l[] ilIII1lArr = Io0II1OlIo01.I00o0l1o1o0;
/* 67 */            Io0II1OlIo01 io0II1OlIo01 = new Io0II1OlIo01(6, i, i2, null, null, scopeArr, bundle, null, ilIII1lArr, ilIII1lArr, true, 0, false, str);
/* 76 */            io0II1OlIo01.I00iio = this.I0000Il00O.getPackageName();
/* 78 */            io0II1OlIo01.I00io1l = bundleI000O01llI0;
/* 80 */            if (set != null) {
/* 91 */                io0II1OlIo01.I00ilO0 = (Scope[]) set.toArray(new Scope[0]);
                    }
/* 97 */            if (I0010I0i()) {
/* 99 */                Account accountI0000oI00 = I0000oI00();
/* 103 */               if (accountI0000oI00 == null) {
/* 111 */                   accountI0000oI00 = new Account("<<default account>>", "com.google");
                        }
/* 114 */               io0II1OlIo01.I00ioIO = accountI0000oI00;
/* 116 */               if (ioOiO1o1oI != 0) {
/* 124 */                   io0II1OlIo01.I00ilI0I1 = ((i0I1ioiiIioI) ioOiO1o1oI).I000O01llI0;
                        }
                    }
/* 128 */           io0II1OlIo01.I00l0I0l0lO1 = I001iOo1i0O;
/* 134 */           io0II1OlIo01.I00l0OO0IO = I0001Ioi1lo();
/* 141 */           if (I0010o()) {
/* 143 */               io0II1OlIo01.I00lli11 = true;
                    }
                    try {
                        try {
                            synchronized (this.I000O01llI0) {
                                try {
/* 148 */                           i1IO0lo i1io0lo = this.I000OOo1O;
/* 150 */                           if (i1io0lo != null) {
/* 156 */                               int i3 = this.I001i1lo1io.get();
/* 164 */                               il1I00I il1i00i = new il1I00I("com.google.android.gms.common.internal.IGmsCallbacks", 9);
/* 167 */                               il1i00i.I000O01llI0 = this;
/* 169 */                               il1i00i.I000OOo1O = i3;
/* 171 */                               VarHandle.storeStoreFence();
/* 174 */                               i1io0lo.I00000oOI(il1i00i, io0II1OlIo01);
                                    } else {
/* 184 */                               Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                                    }
                                } finally {
                                }
                            }
                        } catch (RemoteException | RuntimeException e) {
/* 199 */                   Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
/* 204 */                   int i4 = this.I001i1lo1io.get();
/* 213 */                   io0ooO000l1i io0ooo000l1i = new io0ooO000l1i(this, 8, null, null);
/* 216 */                   iOoO0iili iooo0iili = this.I0001Ioi1lo;
/* 223 */                   iooo0iili.sendMessage(iooo0iili.obtainMessage(1, i4, -1, io0ooo000l1i));
                        }
                    } catch (DeadObjectException e2) {
/* 233 */               Log.w("GmsClient", "IGmsServiceBroker.getService failed", e2);
/* 238 */               int i5 = this.I001i1lo1io.get();
/* 242 */               iOoO0iili iooo0iili2 = this.I0001Ioi1lo;
/* 250 */               iooo0iili2.sendMessage(iooo0iili2.obtainMessage(6, i5, 3));
                    } catch (SecurityException e3) {
/* 228 */               throw e3;
                    }
                }

                public Set I000iOII() {
/* 1 */             return Collections.EMPTY_SET;
                }

                public final IInterface I000l1() {
                    IInterface iInterface;
                    synchronized (this.I000II) {
                        try {
/* 7 */                     if (this.I000o00OoI0I == 5) {
/* 39 */                        throw new DeadObjectException();
                            }
/* 13 */                    if (!I00100l0()) {
/* 33 */                        throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                            }
/* 15 */                    iInterface = this.I000iOII;
/* 19 */                    lII0I0I000I.I000O01llI0("Client is connected but service is null", iInterface);
                        } catch (Throwable th) {
/* 55 */                    throw th;
                        }
                    }
/* 23 */            return iInterface;
                }

                public abstract String I000lI();

                public abstract String I000o00OoI0I();

                public boolean I000oI1ioi() {
                    return I000OOo1O() >= 211700000;
                }

                public final boolean I00100l0() {
                    boolean z;
                    synchronized (this.I000II) {
/* 11 */                z = this.I000o00OoI0I == 4;
                    }
/* 13 */            return z;
                }

                public final boolean I00100o1O0lo() {
                    boolean z;
                    synchronized (this.I000II) {
/* 4 */                 int i = this.I000o00OoI0I;
/* 7 */                 z = true;
/* 8 */                 if (i != 2 && i != 3) {
/* 14 */                    z = false;
                        }
                    }
/* 16 */            return z;
                }

                public boolean I0010I0i() {
/* 1 */             return false;
                }

                public boolean I0010o() {
/* 1 */             return this instanceof i0i0iOi;
                }

                public final boolean I00111O(int i, int i2, IInterface iInterface) {
                    synchronized (this.I000II) {
                        try {
/* 6 */                     if (this.I000o00OoI0I != i) {
/* 9 */                         return false;
                            }
/* 13 */                    I001i1O0Ol(i2, iInterface);
/* 17 */                    return true;
                        } catch (Throwable th) {
/* 98 */                    throw th;
                        }
                    }
                }

                public final void I001IIilI0O() {
                    int i;
                    int i2;
                    synchronized (this.I000II) {
/* 4 */                 i = this.I000o00OoI0I;
                    }
/* 8 */             if (i == 3) {
/* 11 */                this.I001IO000 = true;
/* 13 */                i2 = 5;
                    } else {
/* 15 */                i2 = 4;
                    }
/* 16 */            iOoO0iili iooo0iili = this.I0001Ioi1lo;
/* 30 */            iooo0iili.sendMessage(iooo0iili.obtainMessage(i2, this.I001i1lo1io.get(), 16));
                }

                public final boolean I001IO000() throws ClassNotFoundException {
/* 3 */             if (this.I001IO000 || TextUtils.isEmpty(I000lI()) || TextUtils.isEmpty(null)) {
/* 34 */                return false;
                    }
                    try {
/* 29 */                Class.forName(I000lI());
/* 32 */                return true;
                    } catch (ClassNotFoundException unused) {
/* 34 */                return false;
                    }
                }

                public final void I001i1O0Ol(int i, IInterface iInterface) {
                    I0OIOIi1 i0OIOIi1;
/* 23 */            lII0I0I000I.I00000oOI((i == 4) == (iInterface != null));
                    synchronized (this.I000II) {
                        try {
/* 29 */                    this.I000o00OoI0I = i;
/* 31 */                    this.I000iOII = iInterface;
/* 33 */                    Bundle bundle = null;
/* 34 */                    if (i == 1) {
/* 361 */                       iliOiO1 ilioio1 = this.I000lI;
/* 363 */                       if (ilioio1 != null) {
/* 365 */                           ll0oOilllo ll0ooilllo = this.I0000O;
/* 369 */                           String str = this.I00000oOI.I0000Il00O;
/* 371 */                           lII0I0I000I.I000II(str);
/* 376 */                           this.I00000oOI.getClass();
/* 381 */                           if (this.I0010I0i == null) {
/* 385 */                               this.I0000Il00O.getClass();
                                    }
/* 392 */                           ll0ooilllo.I0000Il00O(str, ilioio1, this.I00000oOI.I00000oOI);
/* 395 */                           this.I000lI = null;
                                }
                            } else if (i == 2 || i == 3) {
/* 63 */                        iliOiO1 ilioio12 = this.I000lI;
/* 65 */                        if (ilioio12 != null && (i0OIOIi1 = this.I00000oOI) != null) {
/* 73 */                            String str2 = i0OIOIi1.I0000Il00O;
/* 94 */                            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
/* 97 */                            sb.append("Calling connect() while still connected, missing disconnect() for ");
/* 100 */                           sb.append(str2);
/* 103 */                           sb.append(" on com.google.android.gms");
/* 110 */                           Log.e("GmsClient", sb.toString());
/* 113 */                           ll0oOilllo ll0ooilllo2 = this.I0000O;
/* 117 */                           String str3 = this.I00000oOI.I0000Il00O;
/* 119 */                           lII0I0I000I.I000II(str3);
/* 124 */                           this.I00000oOI.getClass();
/* 129 */                           if (this.I0010I0i == null) {
/* 133 */                               this.I0000Il00O.getClass();
                                    }
/* 140 */                           ll0ooilllo2.I0000Il00O(str3, ilioio12, this.I00000oOI.I00000oOI);
/* 145 */                           this.I001i1lo1io.incrementAndGet();
                                }
/* 152 */                       int i2 = this.I001i1lo1io.get();
/* 156 */                       iliOiO1 ilioio13 = new iliOiO1();
/* 159 */                       ilioio13.I00iiI = this;
/* 161 */                       ilioio13.I00iOIl = i2;
/* 163 */                       VarHandle.storeStoreFence();
/* 166 */                       this.I000lI = ilioio13;
/* 170 */                       String strI000o00OoI0I = I000o00OoI0I();
/* 174 */                       boolean zI000oI1ioi = I000oI1ioi();
/* 178 */                       I0OIOIi1 i0OIOIi12 = new I0OIOIi1(2);
/* 181 */                       i0OIOIi12.I0000Il00O = strI000o00OoI0I;
/* 183 */                       i0OIOIi12.I00000oOI = zI000oI1ioi;
/* 185 */                       VarHandle.storeStoreFence();
/* 188 */                       this.I00000oOI = i0OIOIi12;
/* 190 */                       if (zI000oI1ioi && I000OOo1O() < 17895000) {
/* 219 */                           throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.I00000oOI.I0000Il00O)));
                                }
/* 220 */                       ll0oOilllo ll0ooilllo3 = this.I0000O;
/* 224 */                       String str4 = this.I00000oOI.I0000Il00O;
/* 226 */                       lII0I0I000I.I000II(str4);
/* 231 */                       this.I00000oOI.getClass();
/* 234 */                       String name = this.I0010I0i;
/* 236 */                       if (name == null) {
/* 244 */                           name = this.I0000Il00O.getClass().getName();
                                }
/* 261 */                       IOlo10lO1iOl iOlo10lO1iOlI00000oOI = ll0ooilllo3.I00000oOI(new lOiI1l0o(str4, this.I00000oOI.I00000oOI), ilioio13, name, I000II());
/* 270 */                       if (!(iOlo10lO1iOlI00000oOI.I00iiI == 0)) {
/* 276 */                           String str5 = this.I00000oOI.I0000Il00O;
/* 297 */                           StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
/* 300 */                           sb2.append("unable to connect to service: ");
/* 303 */                           sb2.append(str5);
/* 306 */                           sb2.append(" on com.google.android.gms");
/* 313 */                           Log.w("GmsClient", sb2.toString());
/* 316 */                           int i3 = iOlo10lO1iOlI00000oOI.I00iiI;
/* 319 */                           if (i3 == -1) {
/* 321 */                               i3 = 16;
                                    }
/* 325 */                           if (iOlo10lO1iOlI00000oOI.I00iiO != null) {
/* 329 */                               bundle = new Bundle();
/* 336 */                               bundle.putParcelable("pendingIntent", iOlo10lO1iOlI00000oOI.I00iiO);
                                    }
/* 341 */                           int i4 = this.I001i1lo1io.get();
/* 347 */                           iolOi1o1 ioloi1o1 = new iolOi1o1(this, i3, bundle);
/* 350 */                           iOoO0iili iooo0iili = this.I0001Ioi1lo;
/* 357 */                           iooo0iili.sendMessage(iooo0iili.obtainMessage(7, i4, -1, ioloi1o1));
                                }
                            } else if (i == 4) {
/* 46 */                        lII0I0I000I.I000II(iInterface);
/* 49 */                        System.currentTimeMillis();
                            }
                        } finally {
                        }
                    }
                }
            }
